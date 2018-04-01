import React, { Component } from 'react';
import Modal from 'react-modal';
import { Redirect } from 'react-router';
import ApartmentBody from '../Apartment/ApartmentBody';
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
import apartImage from '../../asserts/images/flat1.png';
import Footer from '../Footer/Footer';

const customStyles = {
  content : {
    top                   : '50%',
    left                  : '50%',
    right                 : 'auto',
    bottom                : 'auto',
    marginRight           : '-50%',
    transform             : 'translate(-50%, -50%)'
  }
};

class HomePage extends Component {
  constructor(props) {
    super(props);

    this.state = {
      modalIsOpen: false,
      email: '',
      password: '',
      firstName: '',
      lastName:'',
      modalSecondIsOpen: false,
      sunny: '',
      granny: '',
      redirect: false,
      secondRedirect: false,
  };

    this.openModal = this.openModal.bind(this);
    this.openModalSecond = this.openModalSecond.bind(this);
    this.closeModal = this.closeModal.bind(this);
    this.closeModalSecond = this.closeModalSecond.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmitSignUp = this.handleSubmitSignUp.bind(this);
    this.handleChangeSingUp = this.handleChangeSingUp.bind(this);

    this.onStudentChanged = this.onStudentChanged.bind(this);
    this.onGrannyChanged = this.onGrannyChanged.bind(this);
  }
  componentWillMount() {
    this.props.getApartment();
  }

  handleChange(e) {
    const {name, value} = e.target;
    this.setState({[name]: value});
  }

  onStudentChanged(e) {
    const name = e.target.name;
    this.setState(prevState => ({
      sunny: name
    }));
  };

  onGrannyChanged(e) {
    const granny = e.target.name;
    this.setState({
      granny: granny
    });
  };



  handleChangeSingUp(e) {
    const {name, value} = e.target;
    this.setState({[name]: value});
    const {email, password, firstName, lastName, sunny}  = this.state;

  }

  handleSubmit(e) {
    e.preventDefault();
    const {email, password} = this.state;
    // this.setState({redirectSecond: true});
    this.props.login(email, password);
  }

  handleSubmitSignUp(e) {
    e.preventDefault();
    const {email, password, firstName, lastName, sunny, granny} = this.state;
    // this.props.signUp(email, password, firstName, lastName, sunny);
    this.setState({redirect: true});
    console.log('ALLL I NEED_________', email, password, firstName, lastName, sunny, granny);

  }

  openModal() {
    this.setState({modalIsOpen: true});
  }

  openModalSecond() {
    this.setState({modalSecondIsOpen: true});
  }

  closeModal() {
    this.setState({modalIsOpen: false});
  }

  closeModalSecond() {
    this.setState({modalSecondIsOpen: false});
  }

  render() {
    const {data} = this.props;
    console.log('DATA ON HOME PAGE', data);
    console.log('PROPS IN HOME PAGE', this.props);
    const {email, password, firstName, lastName, sunny, granny } = this.state;

    if (this.state.redirect) {
      return <Redirect to="/profile" />;
    }

    // if (this.state.redirectSecond === true) {
    //   return <Redirect to="/profile" />;
    // }

    if (this.props.redirect === 200) {
      return <Redirect to="/profile" />;
    }

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
                <li><a className="nav-button" onClick={this.openModal}>Login</a></li>
                <li><a className="nav-button" onClick={this.openModalSecond}>Sign in</a></li>
              </ul>
            </div>
          </div>
        </nav>
        <Modal
          isOpen={this.state.modalIsOpen}
          onRequestClose={this.closeModal}
          style={customStyles}
          contentLabel="Example Modal"
        >

          <div className="modal-logo">
            <img className="logo-image" src={logo} alt="" />
          </div>
          {/*<button onClick={this.closeModal}>close</button>*/}
          <form id="login-form" name="form" onSubmit={e => this.handleSubmit(e)}>
            <fieldset>
              <div className="form-group">
                <div className="row">
                  <div className="col-md-12">
                    <input type="email" className="form-control" name="email"
                           value={email} id="email" onChange={this.handleChange} required/>
                    <label htmlFor="email" className="labels">Email</label>
                  </div>
                </div>
              </div>
              <div className="form-group">
                <div className="row">
                  <div className="col-md-12">
                    <input type="password" className="form-control" id="password"
                           name="password" value={password} onChange={this.handleChange} required/>
                    <label htmlFor="password" className="labels">Password</label>
                    <a className="show-hide-button">
                      <i className="fa fa-eye" aria-hidden="true"/>
                    </a>

                  </div>
                </div>
              </div>
            </fieldset>
            <div className="text-center">
              <button type="submit" value="Submit" className="login-button">
                Login
              </button>
            </div>
          </form>
        </Modal>
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
            <div><a href="#"><img src={partnersOne} alt=""/></a></div>
            <div><a href="#"><img src={partnersTwo} alt=""/></a></div>
            <div><a href="#"><img src={partnersThree} alt=""/></a></div>
            <div><a href="#"><img src={partnersOne} alt=""/></a></div>
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
          <div className="row">
            <div className="main-wrapper">
              {Object.keys(data).slice(0, 3).map(key => (
                <div className="col-md-4">
                  <ApartmentBody
                    key={key}
                    src={apartImage}
                    district={data[key].region}
                    description={data[key].description}
                    metrs={data[key].meters}
                    rooms={data[key].rooms}
                    price={data[key].price}
                  />
                </div>
              ))}
            </div>
            <div>
              <a className="see-more" onClick={this.openModal} >Показати все</a>
            </div>
          </div>
        </div>
      </section>

      <section className="all-simple">
        <div className="container">
          <div className="row">
            <p className="main-title">НАМ ДОВІРЯЮТЬ</p>
          <p className="subtitle">УСПІШНІ ІСТОРІЇ</p>
          </div>
          <div className="row sussecc-story">
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
      <Footer />
      <Modal
        isOpen={this.state.modalSecondIsOpen}
        onRequestClose={this.closeModalSecond}
        style={customStyles}
        contentLabel="Example Modal"
      >

        <div className="modal-logo">
          <img className="logo-image" src={logo} alt="" />
        </div>
        <h2>SIGN UP</h2>
        <form id="login-form" name="form" onSubmit={e => this.handleSubmitSignUp(e)}>
          <fieldset>
            <div className="form-group">
              <div className="row">
                <div className="col-md-12">
                  <input type="text" className="form-control" name="firstName"
                         value={firstName} id="firstName" onChange={this.handleChangeSingUp} required/>
                  <label htmlFor="firstName" className="labels">FirstName</label>
                </div>
              </div>
            </div>
            <div className="form-group">
              <div className="row">
                <div className="col-md-12">
                  <input type="text" className="form-control" name="lastName"
                         value={lastName} id="lastName" onChange={this.handleChangeSingUp} required/>
                  <label htmlFor="lastName" className="labels">LastName</label>
                </div>
              </div>
            </div>
            <div className="form-group">
              <div className="row">
                <div className="col-md-12">
                  <input type="email" className="form-control" name="email"
                         value={email} id="email" onChange={this.handleChangeSingUp} required/>
                  <label htmlFor="email" className="labels">Email</label>
                </div>
              </div>
            </div>
            <div className="form-group">
              <div className="row">
                <div className="col-md-12">
                  <input type="password" className="form-control" id="password"
                         name="password" value={password} onChange={this.handleChangeSingUp} required/>
                  <label htmlFor="password" className="labels">Password</label>
                  <a className="show-hide-button">
                    <i className="fa fa-eye" aria-hidden="true"/>
                  </a>

                </div>
              </div>
            </div>

            <div className="form-group">
              <div className="row">
                <input type="radio" name="SUNNY" value={sunny} onChange={this.onStudentChanged}/>
                <label htmlFor="SUNNY">Student</label>
              </div>
              <div className="row">
                <input type="radio" name="GRANNY" value={granny} onChange={this.onGrannyChanged}/>
                <label htmlFor="GRANNY">GrandParent</label>
              </div>
            </div>

          </fieldset>

          <div className="text-center">
            <button type="submit" value="Submit" className="login-button">
              Sign Up
            </button>
          </div>
        </form>
      </Modal>
    </div>

  )
  }
};

export default HomePage;
