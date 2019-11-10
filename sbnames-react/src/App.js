import React from 'react'
import { MuiThemeProvider, createMuiTheme } from '@material-ui/core'
import Home from './pages/Home'

const theme = createMuiTheme({
  typography: {
    useNextVariants: true
  },
  palette: {
    success: {
      light: '62fe4b',
      main: '#00ca00',
      dark: '#009800'
    }
  }
})

const App = () => (
  <MuiThemeProvider theme={theme}>
    <Home />
  </MuiThemeProvider>
)
export default App
