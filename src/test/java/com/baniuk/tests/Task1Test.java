package com.baniuk.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author p.baniukiewicz
 *
 */
public class Task1Test {

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
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
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSolution1() {
    assertThat(Task1.solution(57, 153786), is(-1));
  }

  @Test
  public void testSolution2() {
    assertThat(Task1.solution(53, 1953786), is(2));
  }

  @Test
  public void testSolution3() {
    assertThat(Task1.solution(78, 195378678), is(4));
  }

  @Test
  public void testSolution4() {
    assertThat(Task1.solution(0, 0), is(0));
  }

  @Test
  public void testSolution5() {
    assertThat(Task1.solution(195378678, 195378678), is(0));
  }

  @Test
  public void testSolution6() {
    assertThat(Task1.solution(789, 78), is(-1));
  }

  @Test
  public void testSolution7() {
    assertThat(Task1.solution(99, 999999999), is(0));
  }

}
