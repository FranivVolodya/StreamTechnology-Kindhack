import axios from 'axios';

var SERVER_URL = 'http://localhost:8090';
class SessionApi {
  getStartApartment(jwt) {
    const url = SERVER_URL + '/granny/all';


    return axios.get(url)
      .then(this.handleResponse.bind(this))
      .catch(errors => console.log('FUCK THIS SHIT', errors));
  }

  login(email, password) {
    const data = {
      'email': email,
      'password':password
    };
    const url = SERVER_URL + '/login';
    const config = { headers: { 'Content-Type': 'application/json' }};

    return axios.post(url, data, config)
      .then(this.handleResponseStatus.bind(this))
      .catch(errors => console.log(errors));

  }

  handleResponse(response) {
    return response.data;
  }
  handleResponseStatus(response) {
    console.log(response);
    return response;
  }
}

const servise = new SessionApi();

export default servise;
