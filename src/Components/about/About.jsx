import React from 'react'
import HomeHeader from  "../HomeHeader/HomeHeader";
import "./About.css";
import Sidebar from '../Sidebar/Sidebar';
import aboutimg from '../../Assets/about.jpg';
export default function About() {
  return (
    <>
    <HomeHeader />
     <Sidebar />
      <div
        className="home-container"
        style={{ height: "85vh", marginLeft: "4vw" }}
      >
        <section class="about-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <h2>About Us</h2>
          <p>
            We are a professional laundry shop dedicated to providing
            high-quality laundry services to our customers. With years of
            experience, we understand the importance of clean and fresh
            laundry in your daily life.
          </p>
          <p>
            Our team of skilled professionals ensures that your clothes are
            treated with utmost care and attention. We use the latest
            technology and eco-friendly products to deliver outstanding
            results. Your satisfaction is our top priority.
          </p>
        </div>
      </div>
    </div>
  </section>

  <section class="tagline-section">
  <h3>Why Choose Us?</h3>
    <div class="container">
      
      <div class="row">

        <div class="col-md-4">
          <h3 class="tagline">Eco-Friendly Solutions</h3>
          <p>
            We use environmentally friendly products and methods to minimize
            our impact on the environment. Your clothes are in safe hands.
          </p>
        </div>
        <div class="col-md-4">
       
        <img src={aboutimg} alt="My Image" class="h-100" />
        </div>
        <div class="col-md-4">
          <h3 class="tagline">Fast and Efficient</h3>
          <p>
            Our dedicated team ensures quick turnaround time without
            compromising on quality. We understand the value of your time.
          </p>
         
        </div>
        <div class="col-md-4 mt-5">
        <img src={aboutimg} alt="My Image" class="h-100" />
        </div>
        <div class="col-md-4 mt-5">
          <h3 class="tagline">Professional Staff</h3>
          <p>
            Our highly trained and professional staff pays attention to every
            detail, ensuring that your clothes are handled with care and
            precision.
          </p>
        </div>
        <div class="col-md-4 mt-5">
        <img src={aboutimg} alt="My Image" class="h-100" />
        </div>

      </div>
    </div>
        </section>
      </div>
      {/* <Footer /> */}
    </>
  )
}
