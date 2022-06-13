import React from "react";
import "./App.css";

import { BrowserRouter, Route, Switch } from "react-router-dom";
import HomePage from "./pages/HomePage/HomePage";
import Header from "./Header/Header";
import HandicapPage from "./pages/HandicapPage/HandicapPage";
import ChampionPage from "./pages/ChampionPage/ChampionPage";
import QueryPage from "./pages/QueryPage/QueryPage";

function App() {
  return (
    <BrowserRouter>
      <Header />

      <Switch>
        <Route exact path="/" component={HomePage} />
        <Route path="/handicap" component={HandicapPage} />
        <Route path="/champion" component={ChampionPage} />
        <Route path="/query" component={QueryPage} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
