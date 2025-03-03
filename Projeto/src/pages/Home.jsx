import React from 'react'
import users from '../templateDatabase/database'

const Home = (userImg, userFname) => {
  return (
    <>
      <div>{users.first_name}</div>
      <img src={users.img}></img>
    </>
  )
}

export default Home