import React, { useState, useEffect } from 'react'
import Form from '../components/Form'
import Results from '../components/Results'
import axios from 'axios'
import { Typography } from '@material-ui/core'

const Home = () => {
  const [names, setNames] = useState([])

  useEffect(() => {
    onSearch()
  }, [])

  const onSearch = async () => {
    const res = await axios.get(`${process.env.REACT_APP_API_URL}/names`)
    setNames(res.data)
  }

  return (
    <>
      <Form onSearch={onSearch} />
      <div>
        <hr />
        <Typography variant='h4'>Last 5 Names</Typography>
        <Results names={names} />
      </div>

    </>
  )
}

export default Home
