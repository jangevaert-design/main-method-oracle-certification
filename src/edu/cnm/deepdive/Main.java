package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    System.out.println("args-size is " + args.length);

    for (int i = 0; i < args.length; i++) {
      System.out.println("\nargs[" + i + "] = " + args[i]);
    }
  }

}
