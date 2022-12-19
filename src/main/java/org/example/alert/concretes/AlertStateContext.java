package org.example.alert.concretes;

import org.example.alert.abstracts.MobileAlertState;

public class AlertStateContext {

  private MobileAlertState currentState;

  public AlertStateContext(){
    currentState = new Vibration();
  }

  public void setAlertState(MobileAlertState state) {
    currentState = state;
  }

  public void  alert() {
    currentState.alert(this);
  }


}
