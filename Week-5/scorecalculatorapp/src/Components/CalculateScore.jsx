import  React from 'react'
import '../Stylesheets/mystyle.css'
function CalculateScore(props) {
    let average = props.totalMarks / props.goal;
    return(
        <div className="scorecard">

        <h2>Student Score Calculator</h2>
        <p>Name :{props.name}</p>
        <p>School :{props.school}</p>
        <p>Total Marks :{props.totalMarks}</p>
        <p>Average :{average}</p>

        </div>
    );
}
export default CalculateScore;