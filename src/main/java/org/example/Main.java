package org.example;

import org.example.alert.concretes.AlertStateContext;
import org.example.alert.concretes.Silent;
import org.example.alert.concretes.Vibration;

public class Main {
  public static void main(String[] args) {

    AlertStateContext alertStateContext = new AlertStateContext();
    alertStateContext.alert();
    alertStateContext.alert();

    alertStateContext.setAlertState(new Silent());
    alertStateContext.alert();
    alertStateContext.alert();

    alertStateContext.setAlertState(new Vibration());
    alertStateContext.alert();


  }
}