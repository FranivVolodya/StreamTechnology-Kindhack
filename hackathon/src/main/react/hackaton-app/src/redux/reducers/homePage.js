import {
  GET_APARTMENTS,
  LOG_IN_SUCCESS,
} from '../constants/ourconstants';
const defaultState = {
  data: {
    test: 'from state'
  },
  apartments: {

  },
  redirect: false,
};

const homePage = (state = defaultState, action) => {
  switch (action.type) {
    case GET_APARTMENTS: {
      const updateApartments = action.data;

      return { ...state, apartments: updateApartments, };
    }

    case LOG_IN_SUCCESS: {
      console.log('FROM REDUCER', action.data);
      // const updateState = action.data.data;

      const updateRedirect = action.data.status;
      return { ...state,  redirect: updateRedirect} ;
    }

    default: {
      return state;
    }
  }
};

export default homePage;
