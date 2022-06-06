import "./Header.css";

import React from "react";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <div className="header">
      <ul>
        <li>
          {/* <a href="#">One</a> */}
          <Link to="/" className="a">
            Plus/Minus
          </Link>
        </li>
        <li>
          <Link to="/handicap" className="a">
            Handicap
          </Link>
        </li>
        <li>
          <Link to="" className="a">
            Games
          </Link>
        </li>
      </ul>
    </div>
  );
};

export default Header;
