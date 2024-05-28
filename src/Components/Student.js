import * as React from 'react';
import react, { useState , useEffect} from 'react';
import axios from 'axios';


function Studentdetails() {
const[Id, setId] = useState('')
const[name, setName] = useState('')
const[number, setNumber] = useState('')
const [allDetails, setAllDetails] = useState([]);
const handleClick=(e) =>{
    const S1 = { id: parseInt(Id), name, number: parseInt(number) }
    console.log(S1)
    axios.post("http://localhost:8080/sai/post", S1, {
      headers: {
        "Content-Type": "application/json"
      }
      }).then( ()=>{
        console.log("New Data Added")
    })
}

    const handleGetAll = () => {
        axios.get("http://localhost:8080/sai/get", {
          headers: {
            "Content-Type": "application/json"
          }
        }).then(response => {
            console.log("All Details:", response.data);
            setAllDetails(response.data);
           
    })}
      

return (
    <div>
      <label>
        Id:
        <input type="Id" value={Id} onChange={(e) => setId(e.target.value)} />
      </label>
       <br></br>
      <label>
        Name:
        <input type="Name" value={name} onChange={(e) => setName(e.target.value)} />
      </label>
      <br />
      <label>
        Number:
        <input type="Number" value={number} onChange={(e) => setNumber(e.target.value)} />
      </label>
      <br />
      <ul>
        {allDetails.map((detail, index) => (
          <li key={index}>ID: {detail.id}, Name: {detail.name}, Number: {detail.number}</li>
        ))}
      </ul>
      <button onClick={handleClick}>Submit</button>
      <button onClick={handleGetAll}>Get All Details</button>
    </div>
  );
}

export default Studentdetails