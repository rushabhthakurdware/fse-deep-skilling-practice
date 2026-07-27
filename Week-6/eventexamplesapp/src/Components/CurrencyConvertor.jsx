import {useState} from "react";

function CurrencyConvertor(){


const [rupees,setRupees] = useState("");

const [euro,setEuro] = useState(0);



function handleSubmit(){


let result = rupees / 90;


setEuro(result.toFixed(2));


}

return(

<div>


<h2>Currency Converter</h2>


<input

type="number"

value={rupees}

onChange={(e)=>setRupees(e.target.value)}

/>



<button onClick={handleSubmit}>

Convert

</button>


<h3>

Euro : {euro}

</h3>


</div>

)
}

export default CurrencyConvertor;