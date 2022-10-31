package com.driver;

public class Main {
  public static void main(String [] args) {
      RWOnly ans  = new RWOnly() ;
      ans.setName("giresh") ;   // nake variable name public or peotected....
      System.out.print(ans.getName()) ;
  }
}