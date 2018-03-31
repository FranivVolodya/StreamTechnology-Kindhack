import React, { Component } from 'react';
import PrimaryLayout from "./layouts/PrimaryLayout";
import { HashRouter } from 'react-router-dom';
import logo from './logo.svg';

class App extends Component {
  render() {
    return (
      <HashRouter>
        <PrimaryLayout />
      </HashRouter>
    );
  }
}

export default App;
