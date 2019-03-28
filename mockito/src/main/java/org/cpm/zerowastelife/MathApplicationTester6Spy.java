package org.cpm.zerowastelife;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.inOrder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester6Spy {

    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
       mathApplication = new MathApplication();
       Calculator calculator = new Calculator();
       calcService = spy(calculator);
       mathApplication.setCalculatorService(calcService);         
    }

    @Test
    public void testAdd(){

       //perform operation on real object
       //test the add functionality
       Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
    }

    class Calculator implements CalculatorService {
       public double add(double input1, double input2) {
          return input1 + input2;
       }

       public double subtract(double input1, double input2) {
          throw new UnsupportedOperationException("Method not implemented yet!");
       }

       public double multiply(double input1, double input2) {
          throw new UnsupportedOperationException("Method not implemented yet!");
       }

       public double divide(double input1, double input2) {
          throw new UnsupportedOperationException("Method not implemented yet!");
       }
    }
}