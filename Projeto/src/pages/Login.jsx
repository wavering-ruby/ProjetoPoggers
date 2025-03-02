import React from 'react'
import { Navigate, useLocation, useNavigate } from 'react-router-dom';
import { GoogleOAuthProvider } from '@react-oauth/google';
import { GoogleLogin } from '@react-oauth/google';
import { jwtDecode } from "jwt-decode";

const Login = () => {
  const navigate = useNavigate();

  return (
    <div className='login'>
        <div className='login-container'>
            <div className='login-container__header'>
                <img className='login-container__header--logo' src='/imgs/logo.png' />
                <h1 className='login-container__header--h1'>Bem-vindo(a) de volta!</h1>
                <h2 className='login-container__header--message'>Preencha os campos abaixo com seu email e senha</h2>
            </div>
            <div className='login-container__body'>
                <h2 className='login-container__body--h2'>Email:</h2>
                <input className='login-container__body--input' type='text' placeholder='exemplo.email@eventln.com'></input>
                <h2 className='login-container__body--h2'>Senha:</h2>
                <input className='login-container__body--input' type='password' placeholder='Senha'></input>
                <a className='login-container__body--forgeted-password' href='/reset-password'>Esqueci a senha...</a>
                <button className='login-container_body--btn-login'>Fazer login</button>

                {/* Aqui serve para a parte de login com o Google */}
                <div className='login-container__body--btn-others'>
                  <GoogleOAuthProvider 
                  clientId="487262877617-ejqqpj1i4s4d7qee3eq96a97lvp6nu4i.apps.googleusercontent.com">
                    <GoogleLogin
                      onSuccess={credentialResponse => {
                        console.log(credentialResponse);
                        console.log(jwtDecode(credentialResponse.credential));

                        // Aqui deverá ter alguma maneira de navegar para outras páginas
                      }}
                      onError={() => {
                        console.log('Login Failed');
                      }}
                      width={"500px"}
                    />
                  </GoogleOAuthProvider>
                </div>
            </div>
        </div>
    </div>
  )
}

export default Login