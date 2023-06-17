import React from 'react'
import HomeHeader from  "../HomeHeader/HomeHeader";
import "./Home2.css";
import Sidebar from '../Sidebar/Sidebar';
import carousel1 from '../../Assets/carousel-3.jpg';
import carousel2 from '../../Assets/carousel-5.jpeg';
export default function Home2() {
  return (
    <>
    <HomeHeader />
     <Sidebar />
     
     {/* <div className="container-fluid p-0"> */}
     <div
        className="home-container"
        style={{ height: "85vh", marginLeft: "4vw" }}
      >
      <div id="header-carousel" className="carousel slide" data-ride="carousel">
        <div className="carousel-inner">
          <div className="carousel-item active">
            <img className="w-100" src={carousel1} alt="Image"  />
            <div className="carousel-caption d-flex flex-column align-items-center justify-content-center">
              <div className="p-3" style={{ maxWidth: '900px' }}>
                <h4 className="text-uppercase mb-md-3">Laundry & Dry Cleaning</h4>
                <h1 className="display-3 mb-md-4">Best For Laundry Services</h1>
              </div>
            </div>
          </div>
          <div className="carousel-item">
            <img className="w-100" src={carousel2} alt="Image" />
            <div className="carousel-caption d-flex flex-column align-items-center justify-content-center">
              <div className="p-3" style={{ maxWidth: '900px' }}>
                <h4 className="text-uppercase mb-md-3">Laundry & Dry Cleaning</h4>
                <h1 className="display-3 mb-md-4">Highly Professional Staff</h1>
              </div>
            </div>
          </div>
        </div>
        <a className="carousel-control-prev" href="#header-carousel" data-slide="prev">
          <div className="btn btn-secondary" style={{ width: '45px', height: '45px' }}>
            <span className="carousel-control-prev-icon mb-n2"></span>
          </div>
        </a>
        <a className="carousel-control-next" href="#header-carousel" data-slide="next">
          <div className="btn btn-secondary" style={{ width: '45px', height: '45px' }}>
            <span className="carousel-control-next-icon mb-n2"></span>
          </div>
        </a>
      </div>
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
    {/* </div> */}
    </div>
    </>
  )
}
