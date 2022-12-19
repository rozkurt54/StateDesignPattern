package org.example.alert.concretes;

import org.example.alert.abstracts.MobileAlertState;

public class Silent implements MobileAlertState{

  @Override
  public void alert(AlertStateContext ctx) {
    System.out.println("silent...");
  }
}
