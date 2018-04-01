import {
  GET_APARTMENTS,
  LOG_IN_SUCCESS,
} from '../constants/ourconstants';
const defaultState = {
  data: [{
  region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
  description: 'Кімната з видом на оперний',
  meters: '80',
  rooms: '3',
  price: '150',
}, {region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
  description: 'Кімната з видом на оперний',
  meters: '80',
  rooms: '3',
  price: '150',},
  {region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
    description: 'Кімната з видом на оперний',
    meters: '80',
    rooms: '3',
    price: '150',},
  {region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
    description: 'Кімната з видом на оперний',
    meters: '80',
    rooms: '3',
    price: '150',},
  {region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
    description: 'Кімната з видом на оперний',
    meters: '80',
    rooms: '3',
    price: '150',},
  {region: 'ЛЬВІВ,  ГАЛИЦЬКИЙ',
    description: 'Кімната з видом на оперний',
    meters: '80',
    rooms: '3',
    price: '150',}],
  apartments: {

  },
  redirect: false,
};

const homePage = (state = defaultState, action) => {
  switch (action.type) {
    case GET_APARTMENTS: {
      console.log('ACTION DATA REDUCER', action.data)
      const updateApartments = action.data;

      return { ...state, data: updateApartments, };
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
