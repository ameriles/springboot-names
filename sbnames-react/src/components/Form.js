import React, { useState } from 'react'
import { Typography, TextField, Button } from '@material-ui/core'
import axios from 'axios'

const Form = ({ onSearch }) => {
  const [myName, setMyName] = useState('')

  const submitForm = async (e) => {
    e.preventDefault()

    try {
      const newName = await axios.post(`${process.env.REACT_APP_API_URL}/names`, {
        value: myName
      })
      onSearch()
      console.log(newName)
    } catch (error) {
      console.error(error)
    }
  }

  return (
    <form onSubmit={submitForm}>
      <Typography variant='h2'>Share your name!</Typography>
      <TextField fullWidth onChange={(e) => setMyName(e.target.value)} value={myName} />
      <Button type='submit' variant='contained' color='primary'>Share!</Button>
    </form>
  )
}

export default Form
