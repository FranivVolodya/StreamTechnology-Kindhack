import React, { Component } from 'react';
import logo from '../../asserts/images/logo.svg';

class HomePage extends Component {
  constructor(props) {
    super(props)
  }
  componentWillMount() {
    this.props.getAppartment();
  }
  render() {
    console.log('PROPS IN HOME PAGE', this.props);
  return (
    <div>

      <section className="hero-section">
        <nav className="navbar">
          <div className="container">
            <div className="navbar-header">
              <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span className="sr-only">Toggle navigation</span>
                <span className="icon-bar"></span>
                <span className="icon-bar"></span>
                <span className="icon-bar"></span>
              </button>
              <a className="navbar-brand" href="#">
                <img className="logo-image" src={logo} alt="" />
              </a>
            </div>
            <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul className="nav navbar-nav navbar-right">
                <li><a className="nav-button">Login</a></li>
                <li><a className="nav-button" href="/signin">Sign in</a></li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="liner">
          <div className="container-fluid home-background">
            <div className="container">
              <div className="row nav-description">
                <div className="col-md-12">
                  <h1 className="title"> <span>Два покоління під одними дахом</span> </h1>
                  <h2 className="description">Орендувати квартиру стало простіше!</h2>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-md-offset-3">
                  <h2 className="nav-phone">Зателефонуйте нам: +38(093)755 44 32</h2>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <div className="main">
        <footer className="row">
            <div className="col-sm-4">
              <div className="information-wrapper">
                <ul className="information">
                  <li>
                    <a href="#">
                      <img src="../assets/images/logo_footer.svg" alt="" width="42" height="42"/>image
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
                <li><a href="#"><i class="fab fa-facebook"></i></a></li>
                <li><a href="#"><i class="fab fa-facebook"></i></a></li>
                <li><a href="#"><i class="fab fa-facebook"></i></a></li>
                <li><a href="#"><i class="fab fa-facebook"></i></a></li>
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
      </div>
    </div>

  )
  }
};

export default HomePage;
