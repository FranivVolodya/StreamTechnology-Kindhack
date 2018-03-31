import { connect } from 'react-redux';
import { getAppartmentFromDb } from '../../redux/actions/sessionAction';
import { logInUser } from '../../redux/actions/sessionAction';

const mapStateToProps = (state) => ({
  testData: state.homePage.data,
  apartments: state.homePage.apartments,
  redirect: state.homePage.redirect,
});

const mapDispatchToProps = dispatch => ({
  getAppartment() {
    dispatch(getAppartmentFromDb())
  },
  login(email, password) {
    dispatch(logInUser(email, password))
  },
});

export default HomePage => connect(mapStateToProps, mapDispatchToProps)(HomePage);
