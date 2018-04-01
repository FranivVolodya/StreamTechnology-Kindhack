import React from 'react';
import logo from '../../asserts/images/logo.svg';

const Footer = () => {

    return (<div className="main footer">
      <footer className="row">
        <div className="col-sm-4">
          <div className="information-wrapper">
            <ul className="information">
              <li>
                <a href="#">
                  <img src={logo} alt="" width="98" height="45"/>
                </a>
              </li>
              <li>
                <p>м. Львів, вул. Івана Франка,  34
                  тел: +38 (095) 44 55 678
                  +38 (095) 44 55 678
                </p>
              </li>
              <li>2018 All Rights Reserved</li>
            </ul>
          </div>
        </div>
        <div className="col-sm-4">
          <ul className="menu">
            <li><a href="#">Home</a></li>
            <li><a href="#">Правила</a></li>
            <li><a href="">Контакти</a></li>
          </ul>
          <ul className="social center">
            <li><a href="#"><i className="circle fab fa-facebook fa-2x"></i></a></li>
            <li><a href="#"><i className="fab fa-twitter-square fa-2x"></i></a></li>
            <li><a href="#"><i className="fab fa-google-plus-square fa-2x"></i></a></li>
            <li><a href="#"><i className="fab fa-linkedin fa-2x"></i></a></li>
          </ul>
        </div>
        <div className="col-sm-4">
          <div className="feedback-wrapper">
            <ul className="feedback">
              <li><p><b>Новини</b></p></li>
              <li>
                <p>Підпишись на новини щоб отримати їх першими!</p>
              </li>
              <li><input type="text" placeholder="Enter Email"/><a href="#"><i class="fab fa-telegram-plane"></i></a></li>
            </ul>
          </div>
        </div>
      </footer>
    </div>)

};

export default Footer;
