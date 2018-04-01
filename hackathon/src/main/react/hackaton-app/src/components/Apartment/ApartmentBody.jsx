import React, {Component} from 'react';
import './ApartmentBody';

class ApartmentBody extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    const {district, description, metrs, rooms, price, src} = this.props;
    return (<div>
      <div className="apart-wrapper">
        <div className="image">
          <img src={src} alt="" />
        </div>
        <div className="main-info-wrapper">
          <p className="description">{district}</p>
          <p className="title">{description}</p>
          <div className="parents">
            <div className="meters">
              <p>m<sup>2</sup></p>
            <p className="item">{metrs}</p>
            </div>
            <div className="meters">
              <p>КІМНАТ</p>
            <p className="item">{rooms}</p>
            </div>
            <div className="meters">
              <p>ЦІНА,₴</p>
            <p className="item">{price}</p>
            </div>
          </div>
        </div>
      </div>
    </div>)
  }
};

export default ApartmentBody;
