import { connect } from 'react-redux';

const mapStateToProps = (state) => ({
  testData: state.homePage.data,
});


export default HomePage => connect(mapStateToProps)(HomePage);
