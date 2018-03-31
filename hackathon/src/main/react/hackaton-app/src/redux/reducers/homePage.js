import {
  GET_APARTMENTS,
} from '../constants/ourconstants';
const defaultState = {
  data: {
    test: 'from state'
  },
  apartments: {

  }
};

const homePage = (state = defaultState, action) => {
  switch (action.type) {
    case GET_APARTMENTS: {
      const updateApartments = action.data;

      return { ...state, apartments: updateApartments, };
    }

    default: {
      return state;
    }
  }
};

export default homePage;
