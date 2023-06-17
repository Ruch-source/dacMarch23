import React from 'react'
import service2 from '../../Assets/service2.jpg';
import service3 from '../../Assets/service3.jpg';
import service4 from '../../Assets/service4.jpg';
import service5 from '../../Assets/service5.jpg';
import service6 from '../../Assets/service6.png';
import service7 from '../../Assets/service7.jpg';
import HomeHeader from  "../HomeHeader/HomeHeader";
import "./Service.css";
import Sidebar from '../Sidebar/Sidebar';
export default function Service() {
  return (
    <div>
        <HomeHeader />
     <Sidebar/>
     <section class="services-section">
     
        <div class="row">
          <div class="col-md-12">
            <h2 class="">Our Services</h2>
            <p>
              We offer a wide range of laundry services to meet your needs.
              Trust us with your laundry and experience the difference.
            </p>
          </div>
        </div>
    </section>
        <div class="row">
          <div class="col-md-3">
            <div class="service-card">
              <img src={service2} alt="Image 1" />
              <h4>Commercial Laundry</h4>
              <p>
                we offer a commercial laundry service. Our team of laundry experts is equipped to handle
                any size order, from a small office to a large hotel and
                restaurant.
              </p>
            </div>
          </div>
          <div class="col-md-3">
            <div class="service-card">
              <img src={service3} alt="Image 2" />
              <h4>Dry Cleaning</h4>
              <p>
                we offer a convenient and affordable residential laundry service
                to individuals and families. Our team of laundry experts is here
                to take the hassle and stress of laundry.
              </p>
            </div>
          </div>
          <div class="col-md-3">
            <div class="service-card">
              <img src={service4} alt="Image 3" />
              <h4>Ironing</h4>
              <p>
                Get wrinkle-free clothes with our professional ironing service.
                We take care of  the most stubborn wrinkles. Ironing your
                clothes is the second most hated chore in  every
                household.
              </p>
            </div>
          </div>
          <div class="col-md-3">
            <div class="service-card">
              <img src={service5} alt="Image 1" />
              <h4>Eco-Friendly Laundry</h4>
              <p>
                we are committed to provide eco-friendly laundry services. We understand the importance of
                protecting the environment, we provide high-quality laundry
                services.
              </p>
            </div>
          </div>
        </div>
        
      
   
    
    </div>
  )
}
