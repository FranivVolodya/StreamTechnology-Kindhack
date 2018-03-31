import axios from 'axios';

class SessionApi {
  getStartApartment() {
    const url = 'http://192.168.4.229:8090/granny';


    return axios.get(url)
      .then(this.handleResponse.bind(this))
      .catch(errors => console.log(errors));
  }

  handleResponse(response) {
    return response.data;
  }
}

const servise = new SessionApi();

export default servise;
