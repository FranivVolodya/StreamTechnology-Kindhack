import { connect } from 'react-redux';
import { getApartment } from '../../redux/actions/sessionAction';
import { logInUser } from '../../redux/actions/sessionAction';
import { signUpUser } from '../../redux/actions/sessionAction';

const mapStateToProps = (state) => ({
  testData: state.homePage.data,
  apartments: state.homePage.apartments,
  redirect: state.homePage.redirect,
  data: state.homePage.data,
});

const mapDispatchToProps = dispatch => ({
  getApartment(jwt) {
    dispatch(getApartment(jwt))
  },
  login(email, password) {
    dispatch(logInUser(email, password))
  },
  signUp(email, password, firstName, lastName, sunny) {
    dispatch(signUpUser(email, password, firstName, lastName, sunny))
  },
});

export default HomePage => connect(mapStateToProps, mapDispatchToProps)(HomePage);
