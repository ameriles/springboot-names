import React from 'react'
import { makeStyles } from '@material-ui/core/styles'
import { Paper, Table, TableHead, TableRow, TableCell, TableBody } from '@material-ui/core'

const useStyles = makeStyles({
  root: {
    width: '100%',
    overflowX: 'auto'
  },
  table: {
    minWidth: 650
  }
})

const Results = ({ names }) => {
  const classes = useStyles()
  return (
    <Paper className={classes.root}>
      <Table className={classes.table} aria-label='simple table'>
        <TableHead>
          <TableRow>
            <TableCell>Id</TableCell>
            <TableCell align='left'>Value</TableCell>
            <TableCell align='right'>Created At</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {names.map(name => (
            <TableRow key={name.id}>
              <TableCell component='th' scope='row'>
                {name.id}
              </TableCell>
              <TableCell align='left'>{name.value}</TableCell>
              <TableCell align='right'>{name.createdAt}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </Paper>
  )
}

export default Results
