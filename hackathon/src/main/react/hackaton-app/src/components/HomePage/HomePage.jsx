import React from 'react';

const HomePage = (props) => {
  console.log('PROPS FROM COMPONENTS', props);
  return (
    <div>
      <p>START PAGE</p>
      <button type="button" className="btn btn-success">Success</button>
    </div>
  )
};

export default HomePage;
