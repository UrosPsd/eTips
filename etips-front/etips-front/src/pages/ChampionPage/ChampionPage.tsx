import "./ChampionPage.css";

import React from "react";
import axios from "axios";
import { useState } from "react";

const ChampionPage = () => {
  const [result, setResult] = useState("");
  const [player, setPlayer] = useState("");
  const [outResult, setOutResult] = useState("");

  const handleClick = (event: any) => {
    event.preventDefault();

    axios
      .get("http://localhost:8080/champions/find?champions=FIND")
      .then((response) => {
        setResult(response.data.bestClub.name);
        setPlayer(
          response.data.bestPlayer.name + " " + response.data.bestPlayer.surname
        );
        setOutResult(response.data.out);
        console.log(response.data);
      });
  };

  return (
    <div>
      <div className="container container-form">
        <button className="btn" onClick={handleClick}>
          Check Champion
        </button>
      </div>
      <div className={`container answer-container-h`}>
        <span>Best club:</span>
        <h1>{result}</h1>
        <span>Best player:</span>
        <h1>{player}</h1>
        <br />
        <h1>{outResult}</h1>
      </div>
    </div>
  );
};

export default ChampionPage;
