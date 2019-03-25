package com.baniuk.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

/**
 * @author p.baniukiewicz
 *
 */
public class Task2 {

  static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Task2.class.getName());

  static {
    LOGGER.setLevel(Level.INFO);
  }

  static public int solution(int[] A, int[] B, int M, int X, int Y) {
    // create list of passengers
    List<Passenger> queue = IntStream.range(0, A.length).boxed().map(i -> new Passenger(A[i], B[i]))
            .collect(Collectors.toList());

    int stops = 0; // counts elevator stops
    while (!queue.isEmpty()) { // iterate over queue of passengers
      int numOfPeople = 0; // count number of people in elevator
      int weightOfPeople = 0; // count weight of people in elevator
      // store number of unique floors on elevator run
      HashSet<Integer> floors = new HashSet<>();
      // fill elevator
      for (Iterator<Passenger> it = queue.iterator(); it.hasNext();) {
        Passenger passenger = it.next();
        LOGGER.info(passenger.toString());
        if (passenger.weight > Y) { // overweighted passenger block queue
          return stops;
        }
        // check if there are spaces and weight limit
        if (numOfPeople < X && weightOfPeople + passenger.weight <= Y) {
          // passenger in elevator
          numOfPeople++;
          weightOfPeople += passenger.weight;
          floors.add(passenger.floor);
          it.remove(); // remove him from queue
        } else {
          break; // stop people from getting in, no queue shuffling
        }
      }
      // run elevator
      stops += floors.size(); // unique floors
      stops++; // back to ground
      LOGGER.info(queue.toString());
    }
    return stops;
  }

}

/**
 * Represent passenger.
 * 
 * @author p.baniukiewicz
 *
 */
class Passenger {

  /**
   * Create passenger
   * 
   * @param weight his/her weight
   * @param floor selected floor
   */
  public Passenger(int weight, int floor) {
    this.weight = weight;
    this.floor = floor;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Passenger [weight=" + weight + ", floor=" + floor + "]";
  }

  Integer weight;
  Integer floor;
}