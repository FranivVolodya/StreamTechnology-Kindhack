import { connect } from 'react-redux';
import { getApartment } from '../../redux/actions/sessionAction';

const mapStateToProps = (state) => ({
  testData: state.homePage.data,
});

const mapDispatchToProps = dispatch => ({
  getApartment(jwt) {
    dispatch(getApartment(jwt))
  },

});

export default Apartment => connect(mapStateToProps, mapDispatchToProps)(Apartment);
