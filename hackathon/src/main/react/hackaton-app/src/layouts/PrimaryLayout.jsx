import React, { Component } from 'react';
import HomePage from '../components/HomePage';
import { Route, Redirect, Switch } from 'react-router-dom';

class PrimaryLayout extends Component {
  render() {
    return (
      <main>
        <Switch>
          <Route path="/" exact component={HomePage}/>
          <Redirect to="/"/>
        </Switch>
      </main>
    );
  }
};

export default PrimaryLayout;
