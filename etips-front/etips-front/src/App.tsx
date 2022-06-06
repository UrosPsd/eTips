import React from "react";
import "./App.css";

import { BrowserRouter, Route, Switch } from "react-router-dom";
import HomePage from "./pages/HomePage/HomePage";
import Header from "./Header/Header";
import HandicapPage from "./pages/HandicapPage/HandicapPage";

function App() {
  return (
    <BrowserRouter>
      <Header />

      <Switch>
        <Route exact path="/" component={HomePage} />
        <Route path="/handicap" component={HandicapPage} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
