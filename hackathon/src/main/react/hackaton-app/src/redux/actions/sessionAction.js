import {
  GET_APARTMENTS,
} from '../constants/ourconstants';
import sessionApi from '../../api/apiSide';

export const getApartments = (data) => ({
  type: GET_APARTMENTS,
  data
});

export function getAppartmentFromDb() {
  return function(dispatch) {
    return sessionApi.getStartApartment().then(response => {
      dispatch(getApartments(response));
    }).catch(error => {
      throw(error);
    });
  };
}

