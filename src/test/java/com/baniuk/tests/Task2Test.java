package com.baniuk.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

/**
 * @author p.baniukiewicz
 *
 */
public class Task2Test {

  static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Task2Test.class.getName());

  private Task2 ob;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LOGGER.setLevel(Level.INFO);
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    ob = new Task2();
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSolution_1() {
    int A[] = { 40, 40, 100, 80, 20 };
    int B[] = { 3, 3, 2, 2, 3 };
    int M = 3;
    int X = 5;
    int Y = 200;

    assertThat(Task2.solution(A, B, M, X, Y), is(6));

  }

  @Test
  public void testSolution_2() {
    int A[] = { 60, 80, 40 };
    int B[] = { 2, 3, 5 };
    int M = 5;
    int X = 2;
    int Y = 200;

    assertThat(Task2.solution(A, B, M, X, Y), is(5));

  }

}
