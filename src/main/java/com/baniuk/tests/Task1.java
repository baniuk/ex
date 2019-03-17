package com.baniuk.tests;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

/**
 * Hello world!
 *
 */
public class Task1 {

  static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Task1.class.getName());

  static {
    LOGGER.setLevel(Level.INFO);
  }

  /**
   * Find position at which the decimal representation of A occurs as a substring in the decimal
   * representation of B.
   * 
   * @param A integer within range <0..999999999>
   * @param B integer within range <0..999999999>
   * @return top left position of A in B or -1 if not found.
   */
  static public int solution(int A, int B) {
    // convert from primitives to objects
    Integer a = new Integer(A);
    Integer b = new Integer(B);

    // convert to String - use native String representation of the object
    String aStr = a.toString();
    String bStr = b.toString();

    // sanity checking
    if (aStr.length() > bStr.length()) {
      return -1;
    }
    // find position of substring A in B, return -1 if not found
    return bStr.indexOf(aStr, 0);
  }

}
