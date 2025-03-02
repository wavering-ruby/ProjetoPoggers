import React from 'react'

const Login = () => {
  return (
    <div className='login'>
        <div className='login-container'>
            <div className='login-container__header'>
                <img className='login-container__header--logo' src='/imgs/logo.png' />
                <h1 className='login-container__header--welcome'>Bem-vindo de volta</h1>
                <h2 className='login-container__header--message'>Preencha os campos abaixo para fazer login com sua conta já existente.</h2>
            </div>
            <div className='login-container__body'>
                <h1>Restante do login aqui</h1>
            </div>
        </div>
    </div>
  )
}

export default Login