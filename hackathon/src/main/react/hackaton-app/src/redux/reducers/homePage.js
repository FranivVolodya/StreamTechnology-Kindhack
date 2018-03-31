const defaultState = {
  data: {
    test: 'from state'
  },
};

const homePage = (state = defaultState, action) => {
  switch (action.type) {

    default: {
      return state;
    }
  }
};

export default homePage;
