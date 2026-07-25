import { useState } from 'react'
import ListOfPlayers from "./Components/ListOfPlayers";
import IndianPlayers from "./Components/IndianPlayers";
import './App.css'

function App() {
  const flag = true;
  if(flag){
    return <ListOfPlayers />
  }else{
    return <IndianPlayers />
  }
  
}

export default App
