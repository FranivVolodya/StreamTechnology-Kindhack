import React, { Component } from 'react';
import logo from '../../asserts/images/logo.svg';
import quote from '../../asserts/images/quote.png';
import girl from '../../asserts/images/people-2.png';
import partnersOne from '../../asserts/images/Bitmap.png';
import partnersTwo from '../../asserts/images/Bitmap2.png';
import partnersThree from '../../asserts/images/Bitmap3.png';
import profil from '../../asserts/images/profil.svg';
import owner from '../../asserts/images/owner.svg';
import enjoyCompany from '../../asserts/images/enjoy-company.svg';
import benefitOne from '../../asserts/images/benefitOne.png';
import benefitTwo from '../../asserts/images/benefitTwo.png';
import benefitThree from '../../asserts/images/benefitThree.png';

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
      <section className="partners">
        <div className="row">
          <div className="parents-list">
            <div><img src={partnersOne} alt=""/></div>
            <div><img src={partnersTwo} alt=""/></div>
            <div><img src={partnersThree} alt=""/></div>
            <div><img src={partnersOne} alt=""/></div>
          </div>
        </div>
      </section>
      <section className="all-simple">
        <div className="container">
          <div className="row">
            <p className="main-title">Все просто</p>
            <p className="subtitle">Як це працює?</p>
          </div>
          <div className="row">
            <div className="all-simple-images">
              <div className="col-md-4">
                <div><img src={profil} alt=""/>
                <p className="description">
                  Створи<br />
                  профіль
                </p></div>
              </div>
              <div className="col-md-4">
                <div><img src={owner} alt=""/>
                  <p className="description">
                    Зв’яжись<br />
                    із власником
                  </p>
                </div>
              </div>
              <div className="col-md-4">
                <div><img src={enjoyCompany} alt=""/>
                  <p className="description">
                    Насолоджуйтесь
                    компанією
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section className="all-simple">
        <div className="container">
          <div className="row">
            <p className="main-title">ЛИШЕ НАЙКРАЩЕ</p>
            <p className="subtitle">ПЕРЕВАГИ</p>
          </div>
          <div className="row">
            <div className="all-simple-images">
              <div className="col-md-4">
                <div><img src={benefitOne} alt=""/>
                  <p className="description">
                    ПРОСТОТА<br />
                    У КОРИСТУВАННІ
                  </p></div>
              </div>
              <div className="col-md-4">
                <div><img src={benefitTwo} alt=""/>
                  <p className="description">
                    ЮРИДИЧНИЙ<br />
                    ЗАХИСТ
                  </p>
                </div>
              </div>
              <div className="col-md-4">
                <div><img src={benefitThree} alt=""/>
                  <p className="description">
                    БЮДЖЕТНІСТЬ
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section className="few-appartments">
        <div className="container">
          <div className="row">
            <p className="main-title">ГАРЯЧІ ПРОПОЗИЦІЇ</p>
            <p className="subtitle"> КВАРТИРИ ПО  УСЬОМУ ЛЬВОВУ</p>
          </div>
        </div>
      </section>

      <section className="all-simple">
        <div className="container">
          <div className="row">
            <p className="main-title">НАМ ДОВІРЯЮТЬ</p>
          <p className="subtitle">УСПІШНІ ІСТОРІЇ</p>
          </div>
          <div className="row">
            <div className="col-md-4">
              <div className="face-icon">
                <img className="img-circle" src={girl} alt=""/>
                <p><span className="student-name">АННА ВЕЛЮС</span></p>
                <p><span className="student">Студент</span></p>
              </div>
            </div>
            <div className="col-md-8">
              <div className="quote">
                <div className="row">
                  <div className="quote-icon pull-left">
                    <img src={quote} alt=""/>
                  </div>
                </div>
                <div className="quote-text">
                  <p>Цей сервіс був порятунком у пошуку житла, так як у наданні гуртожитка мені відмовили.
                    До сих пір спілкуюся із власницею навіть після того, як стала на ноги фінансово й живу окремо.</p>
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
