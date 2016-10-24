package org.bukharov.procurementDepartment.model;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("spring-config.xml");
    ctx.refresh();
  }
}
