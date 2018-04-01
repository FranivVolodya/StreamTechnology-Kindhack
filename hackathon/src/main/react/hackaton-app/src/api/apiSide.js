import axios from 'axios';

var SERVER_URL = 'http://localhost:8090';
class SessionApi {
  getStartApartment(jwt) {
    const url = 'http://192.168.4.236:8090/granny/all';


    return axios.get(url)
      .then(this.handleResponse.bind(this))
      .catch(errors => console.log('FUCK THIS SHIT', errors));
  }

  login(email, password) {
    const data = {
      "email": email,
      "password": password
    };
    const url = 'http://192.168.5.137:8090/login';
    const config = { headers: { 'Content-Type': 'application/json' }};

    return axios.post(url, data, config)
      .then(this.handleResponseStatus.bind(this))
      .catch(errors => console.log('EROOOR SHIOT', errors));

  }

  signUp(email, password, firstName, lastName, sunny) {
    const data = {
      "email": email,
      "password": password,
      "firstName": firstName,
      "lastName": lastName,
      "sunny": sunny,
    };
    const url = SERVER_URL + '/login';
    const config = { headers: { 'Content-Type': 'application/json' }};

    return axios.post(url, data, config)
      .then(this.handleResponseStatus.bind(this))
      .catch(errors => console.log('EROOOR SHIOT', errors));

  }

  handleResponse(response) {
    return response.data;
  }
  handleResponseStatus(response) {
    console.log('RESPONSE ------------', response);
    return response;
  }
}

const servise = new SessionApi();

export default servise;
