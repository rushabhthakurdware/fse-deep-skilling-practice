import { useState } from 'react'
import CalculatorScore from './Components/CalculateScore.jsx'
function App() {

  return (
    <>
      <CalculatorScore name = "Rushabh" school = "Somalwar" totalMarks = {100} goal = {200} />
    </>
  )
}

export default App
