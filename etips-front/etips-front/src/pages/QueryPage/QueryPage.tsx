import "./QueryPage.css";

import React from "react";
import axios from "axios";
import { useState } from "react";

const QueryPage = () => {
  const [result, setResult] = useState([]);

  const handleClick = (event: any) => {
    event.preventDefault();

    axios.get("http://localhost:8080/items/classify-item").then((response) => {
      // setResult(response.data.bestClub.name);
      setResult(response.data.results);
      //   console.log(response.data.results[0]);
    });
  };

  return (
    <div>
      <div className="container container-form">
        <button className="btn" onClick={handleClick}>
          Check list
        </button>
      </div>
      <div className={`container answer-container-h`}>
        <ul className="lista">
          {result.map((e) => (
            <li>{e}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default QueryPage;
