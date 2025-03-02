import React from 'react'
import { useLocation } from 'react-router-dom';

const Login = () => {
  // const location = useLocation();
  // let message;
  // const userFname = "Mateus";

  // if (location.pathname === '/') {
  //   message = `Bem-vindo(a) de volta!`;
  // } else {
  //   message = `Fazer Login`
  // }

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
                <input className='login-container__body--input' type='text' placeholder='Senha'></input>
            </div>
        </div>
    </div>
  )
}

export default Login