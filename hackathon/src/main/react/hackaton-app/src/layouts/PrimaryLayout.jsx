import React, { Component } from 'react';
import HomePage from '../containers/HomePage/HomePage';
import Apartment from '../containers/Apartment/Apartment';
import { Route, Redirect, Switch } from 'react-router-dom';

class PrimaryLayout extends Component {
  render() {
    return (
      <main>
        <Switch>
          <Route path="/" exact component={HomePage}/>
          <Route path="/profile" exact component={Apartment}/>
          <Redirect to="/"/>
        </Switch>
      </main>
    );
  }
};

export default PrimaryLayout;
