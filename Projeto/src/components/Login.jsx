import React, { useState } from 'react'
import { Navigate, useLocation, useNavigate } from 'react-router-dom';
import { GoogleLogin } from '@react-oauth/google';
import { jwtDecode } from "jwt-decode";

const Login = ({ type }) => {
  const navigate = useNavigate();

  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    const user = {
      usr_nome: "Power da Silva",
      usr_email: email,
      usr_senha: password,
      usr_tipo: "Genérico"
    };

    try {
      const response = await fetch("http://localhost:8080/usuario", {
        method: 'POST',
        headers: {
          "Accept": "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify(user),
      });

      if(response.ok){
        alert("Usuário cadastrado com sucesso!");
      } else {
        alert('Erro ao cadastrar usuáruio.');
      }
    } catch (error){
      console.error('Erro:', error);
    }
  };

  return (
    <form className='login' onSubmit={handleSubmit}>
        <div className='login-container'>
            <div className='login-container__header'>
                <img className='login-container__header--logo' src='/imgs/logo.png' />
                <h1 className='login-container__header--h1'>{type}</h1>
                <h2 className='login-container__header--message'>Preencha os campos abaixo com seu email e senha</h2>
            </div>
            <div className='login-container__body'>
                <h2 className='login-container__body--h2'>Email:</h2>
                <input className='login-container__body--input' required type='text' value={email} placeholder='exemplo.email@eventln.com' onChange={(e) => setEmail(e.target.value)}></input>
                <h2 className='login-container__body--h2'>Senha:</h2>
                <input className='login-container__body--input' required type='password' value={password} placeholder='Senha' onChange={(e) => setPassword(e.target.value)}></input>
                {
                  type === "Sign-In" ? (
                    <a className='login-container__body--forgeted-password' href='/reset-password'>Esqueci a senha...</a>
                  ) : ( "" )
                }
                
                <button className='login-container_body--btn-login' type="submit">{type}</button>

                {/* Aqui serve para a parte de login com o Google */}
                <div className='login-container__body--btn-others'>
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
                </div>
            </div>
        </div>
    </form>
  )
}

export default Login;