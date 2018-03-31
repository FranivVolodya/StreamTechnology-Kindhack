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
              <li><a className="sign-in" href="/signin">Sign in</a></li>
            </ul>
          </div>
        </div>
      </nav>
      <section className="hero-section">
        <div className="liner">
          <div className="container-fluid home-background">
            <div className="container">
              <div className="row">
                <div className="col-md-6 col-md-offset-3">
                  <h1 className="title"> <span>Два покоління під одними дахом</span> </h1>
                  <p className="description">Орендувати квартиру стало простіше!</p>
                  <div className="button-wrapper">
                    <a href="/sign-up" className="button--header blue">
                      Create account
                    </a>
                    <div className="welcome--header--contact">
                      <a href="/contact" className="button--header white-transparent">
                        Contact Us
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <div>
      </div>
  </div>

  )
  }
};

export default HomePage;
