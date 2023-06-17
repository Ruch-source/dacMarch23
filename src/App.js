import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import RegisterComp from "./RegisterComp";
import SigninComp from "./SigninComp";
import Home from "./Home";
import Catelog from "./Catelog";
import About from "./Components/about/About"
import Service from "./Components/Service/Service"
import Price from "./Components/Price/Price"
import Home2 from "./Components/Home2/Home2"
import HomeHeader from "./Components/HomeHeader/HomeHeader";
import Sidebar from "./Components/Sidebar/Sidebar";
function App() {
  return (
    <div>
    
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<SigninComp />} />
          <Route exact path="/register" element={<RegisterComp />} />
          <Route exact path="/home" element={<Home />} />
          <Route exact path="/home2" element={<Home2 />} />
          <Route exact path="/catelog" element={<Catelog />} />
          <Route exact path="/aboutus" element={<About />} />
          <Route exact path="/service" element={<Service />} />
          <Route exact path="/price" element={<Price />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;