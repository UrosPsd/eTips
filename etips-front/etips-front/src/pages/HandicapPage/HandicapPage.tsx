import "./HandicapPage.css";

import React from "react";
import axios from "axios";
import { useState } from "react";

const HandicapPage = () => {
  const [firstClubName, setFirstClubName] = useState("");
  const [secondClubName, setSecondClubName] = useState("");
  const [handicap, setHandicap] = useState("");
  const [result, setResult] = useState("");

  const handleSubmit = (event: any) => {
    event.preventDefault();

    if (!firstClubName || !secondClubName || !handicap) {
      return;
    }

    const queryParams = {
      club1: firstClubName,
      club2: secondClubName,
      handicap: handicap,
    };
    const params = new URLSearchParams(queryParams);
    axios
      .get(`http://localhost:8080/inputs/handicap?${params}`)
      .then((response) => {
        setResult(response.data.handicapValue);
        console.log(response.data);
      });
  };

  return (
    <div>
      <div className="container container-form">
        <form onSubmit={handleSubmit}>
          <label htmlFor="fclub">First Club</label>
          <select
            className={firstClubName === "" ? "input-err" : ""}
            name="club1"
            id="club1"
            onChange={(e) => setFirstClubName(e.target.value)}
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
            <option value="MIAMI_HEAT">Miami Heat</option>
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

          <label htmlFor="sclub">Second Club</label>
          <select
            className={secondClubName === "" ? "input-err" : ""}
            name="club2"
            id="club2"
            onChange={(e) => setSecondClubName(e.target.value)}
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
            <option value="MIAMI_HEAT">Miami Heat</option>
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

          <label htmlFor="handicap">Handicap</label>
          <input
            className={handicap === "" ? "input-err" : ""}
            type="text"
            id="handicap"
            name="handicap"
            placeholder=""
            onChange={(e) => setHandicap(e.target.value)}
          />

          <input type="submit" value="Submit" />
        </form>
      </div>
      <div className={`container answer-container-h`}>
        <h1>{result}</h1>
      </div>
    </div>
  );
};

export default HandicapPage;
