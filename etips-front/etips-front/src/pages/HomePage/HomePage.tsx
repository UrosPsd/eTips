import "./HomePage.css";

import React from "react";
import axios from "axios";
import { useState } from "react";

const HomePage = () => {
  const [name, setName] = useState("");
  const [surname, setSurname] = useState("");
  const [opposingClub, setOpposingClub] = useState("");
  const [courtType, setCourtType] = useState("HOME_COURT");
  const [seasonPart, setSeasonPart] = useState("REGULAR");
  const [averagePointsBet, setAveragePointsBet] = useState("");
  const [result, setResult] = useState("");

  const handleSubmit = (event: any) => {
    event.preventDefault();

    if (!name || !surname || !opposingClub || !averagePointsBet) {
      return;
    }

    const queryParams = {
      name: name,
      surname: surname,
      opposingClub: opposingClub,
      courtType: courtType,
      seasonPart: seasonPart,
      averagePointsBet: averagePointsBet,
    };
    const params = new URLSearchParams(queryParams);
    axios
      .get(`http://localhost:8080/inputs/plus-minus?${params}`)
      .then((response) => {
        setResult(response.data.resultState);
      });
  };

  return (
    <div>
      <div className="container container-form">
        <form onSubmit={handleSubmit}>
          <label htmlFor="fname">First Name</label>
          <input
            className={name === "" ? "input-err" : ""}
            type="text"
            id="fname"
            name="firstname"
            onChange={(e) => setName(e.target.value)}
          />

          <label htmlFor="lname">Last Name</label>
          <input
            className={surname === "" ? "input-err" : ""}
            type="text"
            id="lname"
            name="lastname"
            placeholder=""
            onChange={(e) => setSurname(e.target.value)}
          />

          <label htmlFor="clubName">Opposing Club Name</label>
          <select
            className={opposingClub === "" ? "input-err" : ""}
            name="club"
            id="club"
            onChange={(e) => setOpposingClub(e.target.value)}
          >
            <option value="">Please select opponent club</option>
            <option value="atlanta">Atlanta Hawks</option>
            <option value="boston">Boston Celtics</option>
            <option value="brooklyn">Brooklyn Nets</option>
            <option value="audi">Charlotte Hornets</option>
            <option value="chicago">Chicago Bulls</option>
            <option value="cleveland">Cleveland Cavaliers</option>
            <option value="dallas">Dallas Mavericks</option>
            <option value="DENVER_NUGGETS">Denver Nuggets</option>
            <option value="detroit">Detroit Pistons</option>
            <option value="golden-state">Golden State Warriors</option>
            <option value="houston">Houston Rockets</option>
            <option value="indiana">Indiana Pacers</option>
            <option value="">Los Angeles Clippers</option>
            <option value="">Los Angeles Lakers</option>
            <option value="">Memphis Grizzlies</option>
            <option value="">Miami Heat</option>
            <option value="">Milwaukee Bucks</option>
            <option value="">Minnesota Timberwolves</option>
            <option value="">New Orleans Pelicans</option>
            <option value="">New York Knicks</option>
            <option value="">Oklahoma City Thunder</option>
            <option value="">Orlando Magic</option>
            <option value="">Philadelphia 76ers</option>
            <option value="">Phoenix Suns</option>
            <option value="">Portland Trail Blazers</option>
            <option value="">Sacramento Kings</option>
            <option value="">San Antonio Spurs</option>
            <option value="">Toronto Raptors</option>
            <option value="">Utah Jazz</option>
            <option value="">Washington Wizards</option>
          </select>

          <label htmlFor="court">Court type</label>
          <select
            name="court"
            id="court"
            onChange={(e) => setCourtType(e.target.value)}
          >
            <option value="HOME_COURT">Home Court</option>
            <option value="AWAY_COURT">Away Court</option>
          </select>

          <label htmlFor="season-part">Season part</label>
          <select
            name="season-part"
            id="season-part"
            onChange={(e) => setSeasonPart(e.target.value)}
          >
            <option value="REGULAR">Regular Part</option>
            <option value="PLAYOFF">Play off</option>
          </select>

          <label htmlFor="ppg">PPG</label>
          <input
            className={averagePointsBet === "" ? "input-err" : ""}
            type="text"
            id="ppg"
            name="ppg"
            placeholder=""
            onChange={(e) => setAveragePointsBet(e.target.value)}
          />

          <input type="submit" value="Submit" />
        </form>
      </div>
      <div
        className={`container answer-container ${
          result === "PLUS" ? "bg-green" : ""
        } ${result === "MINUS" ? "bg-red" : ""}`}
      >
        <h1>{result}</h1>
      </div>
    </div>
  );
};

export default HomePage;
