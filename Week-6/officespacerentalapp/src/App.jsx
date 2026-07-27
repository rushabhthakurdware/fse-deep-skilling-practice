import { useState } from 'react'
import Office1 from './assets/Office1.webp';
import Office2 from './assets/Office2.webp';
function App() {
  
  const heading = "Office Space Rental App";

  const offices = [
    {
      id: 1,
      name: "Tech Park",
      rent: 45000,
      address: "Pune",
      image: Office1
    },
    {
      id: 2,
      name: "Cyber Hub",
      rent: 80000,
      address: "Mumbai",
      image: Office2
    },
    {
      id: 3,
      name: "Business Center",
      rent: 60000,
      address: "Nagpur",
      image: Office1
    }
  ];

  return (

    <div style={{ padding: "20px" }}>

      <h1>{heading}</h1>

      {
        offices.map((office) => (

          <div
            key={office.id}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "20px",
              width: "350px"
            }}
          >

            <img
              src={office.image}
              alt={office.name}
              width="300"
              height="200"
            />

            <h2>{office.name}</h2>

            <h3
              style={{
                color:
                  office.rent < 60000
                    ? "red"
                    : "green"
              }}
            >
              Rent : ₹{office.rent}
            </h3>

            <p>
              Address : {office.address}
            </p>

          </div>

        ))
      }

    </div>

  );

}

export default App
