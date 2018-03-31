import { createStore, applyMiddleware, compose } from 'redux';
import thunk from 'redux-thunk';

import rootReducers from './reducers';

const middlewares = [thunk];

const enhancer = compose(applyMiddleware(...middlewares));
const store = createStore(rootReducers, enhancer);

export default store;
