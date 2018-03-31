import React, {Component} from 'react';

class Apartment extends Component {
  constructor(props) {
    super(props);
  }

  componentWillMount() {
    const jwt = localStorage.getItem('jwt');
    this.props.getApartment(jwt);
  }

  render() {
  return (
    <div>
      <p>Profile Page1</p>
    </div>
  )
  }
};

export default Apartment;
