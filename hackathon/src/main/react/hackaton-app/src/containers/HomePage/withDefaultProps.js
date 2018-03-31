import { connect } from 'react-redux';
import { getAppartmentFromDb } from '../../redux/actions/sessionAction';

const mapStateToProps = (state) => ({
  testData: state.homePage.data,
  apartments: state.homePage.apartments,
});

const mapDispatchToProps = dispatch => ({
  getAppartment() {
    dispatch(getAppartmentFromDb())
  }
});

export default HomePage => connect(mapStateToProps, mapDispatchToProps)(HomePage);
