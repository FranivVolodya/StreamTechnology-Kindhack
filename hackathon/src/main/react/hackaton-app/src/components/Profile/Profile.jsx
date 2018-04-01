import React, {Component} from 'react';
import { Button, Form, FormGroup, FormControl, ControlLabel, Radio, InputGroup } from 'react-bootstrap';
import './Profile';

class Profile extends Component {
  render() {
    return (<div>
      <div className="container">
        <div className="row">
          <div className="col-md-4">
            <Form className="form">
              <FormGroup>
                <ControlLabel>Name</ControlLabel>
                <FormControl
                  type="text"
                  placeholder="Name"
                />
              <ControlLabel>LastName</ControlLabel>
                <FormControl
                  type="text"
                  placeholder="LastName"
                />
              </FormGroup>
              <FormGroup>
                <InputGroup>
                  <InputGroup.Addon><i className="fas fa-phone"></i></InputGroup.Addon>
                  <FormControl type="text" />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <InputGroup>
                  <InputGroup.Addon><i class="fas fa-birthday-cake"></i></InputGroup.Addon>
                  <FormControl type="text" />
                </InputGroup>
              </FormGroup>
              <FormGroup>
                <ControlLabel>Gender</ControlLabel>
                <FormGroup>
                  <Radio name="radioGroup" inline>
                    Man
                  </Radio>{' '}
                  <Radio name="radioGroup" inline>
                    Woman
                  </Radio>{' '}
                </FormGroup>
                <FormGroup>
                  <ControlLabel>Pets ?</ControlLabel>
                  <FormGroup>
                    <Radio name="radioGroup" inline>
                      Yes
                    </Radio>{' '}
                    <Radio name="radioGroup" inline>
                      No
                    </Radio>{' '}
                  </FormGroup>
                </FormGroup>
              </FormGroup>
              <FormGroup>
                <ControlLabel>Bad habits</ControlLabel>
                <FormControl
                  type="text"
                  placeholder="Habits"
                />
              </FormGroup>
              <FormGroup controlId="formControlsTextarea">
                <ControlLabel>About me</ControlLabel>
                <FormControl componentClass="textarea" placeholder="tell about yourself" />
              </FormGroup>
              <FormGroup controlId="formControlsTextarea">
                <ControlLabel>Why use this service?</ControlLabel>
                <FormControl componentClass="textarea" placeholder="I would like.." />
              </FormGroup>
              <Button className="form-btn" type="submit">Submit</Button>
            </Form>
          </div>
        </div>
      </div>
    </div>)
  }
}

export default Profile;
