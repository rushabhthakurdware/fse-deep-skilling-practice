function Guest(){


const flights=[

{
id:1,
name:"Air India",
from:"Mumbai",
to:"Delhi"
},

{
id:2,
name:"Indigo",
from:"Pune",
to:"Bangalore"
},

{
id:3,
name:"Vistara",
from:"Delhi",
to:"Goa"
}

];


return(

<div>


<h2>
Welcome Guest
</h2>


<h3>
Available Flights
</h3>


{
flights.map((flight)=>(

<div key={flight.id}>

<p>
Flight : {flight.name}
</p>

<p>
Route : {flight.from} → {flight.to}
</p>


</div>

))

}


</div>

)

}


export default Guest;