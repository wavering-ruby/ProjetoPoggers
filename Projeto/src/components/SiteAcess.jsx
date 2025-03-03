import React from 'react';
import { Navigate, useLocation, useNavigate } from 'react-router-dom';
import { GoogleOAuthProvider } from '@react-oauth/google';
import Login from "./Login.jsx";

const SiteAcess = ({ type }) => {
  const navigate = useNavigate();

  return (
    <div className='login'>
      <GoogleOAuthProvider clientId="487262877617-ejqqpj1i4s4d7qee3eq96a97lvp6nu4i.apps.googleusercontent.com">
        <Login type={type}/>
      </GoogleOAuthProvider>
    </div>
    
  )
}

export default SiteAcess