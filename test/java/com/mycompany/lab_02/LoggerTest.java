/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1935595
 */
public class LoggerTest 
{
  @Test
  public void shouldBeIdenticals()
  {
    Logger log1 = Logger.getLog();
    Logger log2 = Logger.getLog();
    assertEquals(log1, log2);
  }

}
