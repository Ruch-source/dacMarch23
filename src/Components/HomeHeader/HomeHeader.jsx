import React, { useState } from "react";
import "./HomeHeader.css";
import { useNavigate } from "react-router-dom";
import { getToken } from "../../authOperations";
import { Link } from 'react-router-dom';
const SigninHeader = () => {
  const navigate = useNavigate();
  const [showLogout, setShowLogout] = useState(false);
  const changeHandler = () => {
    setShowLogout(!showLogout);
  };
  const logoutHandler = () => {
    localStorage.clear();
    navigate("/");
  };
  return (
    <div className="header">
      <h1 className="header_title">LAUNDRY HUB</h1>
      <nav>
        <ul className="nav_lists">
          {/* <li className="nav_lists__links" onClick={() => navigate("/home")}>Home</li> */}
          <li className="nav_lists__links"><Link className="nav-link" to="/home2">Home</Link></li>
          <li className="nav_lists__links"><Link className="nav-link" to="/price">Price</Link></li>
          <li className="nav_lists__links"><Link className="nav-link" to="/service">Services</Link></li>
          <li className="nav_lists__links"><Link className="nav-link" to="/aboutus">About</Link></li>
          <li className="nav_lists__links">Contact Us</li>
          <li className="nav_lists__links color" onClick={changeHandler}>
            <span className="home_pic"><img src="/icons/avatar.png" alt="Profile" width="40px"/></span>
            {getToken("Username")}
          </li>
        </ul>
      </nav>
      {showLogout && (
        <div onClick={logoutHandler} className="logout">
          Logout
        </div>
      )}
    </div>
  );
};

export default SigninHeader;
