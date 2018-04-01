import {
  GET_APARTMENTS,
  LOG_IN_SUCCESS,
} from '../constants/ourconstants';
import sessionApi from '../../api/apiSide';

export const getApartments = (data) => ({
  type: GET_APARTMENTS,
  data
});

export const loginSuccess = (data) => ({
  type: LOG_IN_SUCCESS,
  data
});

export function logInUser(email, password) {
  return function(dispatch) {
    return sessionApi.login(email, password).then(response => {
      if (response.status === 200) {
        console.log('RESPONSE DATA', response.data);
        localStorage.setItem('jwt', response.data.JWT);
        dispatch(loginSuccess(response));
      }
      console.log('Login FAILED');
    }).catch(error => {
      throw(error);
    });
  };
}

export function getApartment(jwt) {
  return function(dispatch) {
    return sessionApi.getStartApartment(jwt).then(response => {
      console.log('RESPONSE', response)
      // dispatch(getApartments(response));
    }).catch(error => {
      throw(error);
    });
  };
}
