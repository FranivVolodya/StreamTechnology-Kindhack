import React, {Component} from 'react';
import ApartmentBody from './ApartmentBody';
import './Apartment';
import apartImage from '../../asserts/images/flat1.png';
import './Apartment.scss';
import Footer from '../Footer/Footer';

class Apartment extends Component {
  constructor(props) {
    super(props);
  }

  componentWillMount() {
    const jwt = localStorage.getItem('jwt');
    this.props.getApartment(jwt);
  }

  render() {
    const {data} = this.props;
    console.log('DATA FROM COMPONETS', data)
  return (
    <div>
      <div className="apartment-image">
        <div className="flex-centered">
          <div className="container">
            <div className="row">
              <div className="col-md-6 col-md-offset-3">
                <h1 className="title">
                  КВАРТИРИ
                </h1>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container">
        <div className="row">
          <div className="main-wrapper">
            {Object.keys(data).map(key => (
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
        </div>
      </div>
      <Footer />
    </div>
  )
  }
};

export default Apartment;
