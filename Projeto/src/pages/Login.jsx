import React from 'react'
import { useLocation } from 'react-router-dom';
import { GoogleOAuthProvider } from '@react-oauth/google';
import { GoogleLogin } from '@react-oauth/google';

const Login = () => {
  // const location = useLocation();
  // let message;
  // const userFname = "Mateus";

  // if (location.pathname === '/') {
  //   message = `Bem-vindo(a) de volta!`;
  // } else {
  //   message = `Fazer Login`
  // }

  let inputType = 'password';

  const responseGoogle = (response) => {
    console.log(response);
  }

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
                <input className='login-container__body--input' type={inputType} placeholder='Senha'></input>
                <a className='login-container__body--forgeted-password' href='/reset-password'>Esqueci a senha...</a>

                <GoogleOAuthProvider 
                clientId="487262877617-k7mgphb14r908m13soujjbai2btaqmp8.apps.googleusercontent.com">
                  <GoogleLogin
                    onSuccess={credentialResponse => {
                      console.log(credentialResponse);
                    }}
                    onError={() => {
                      console.log('Login Failed');
                    }}
                  />
                </GoogleOAuthProvider>
            </div>
        </div>
    </div>
  )
}

export default Login