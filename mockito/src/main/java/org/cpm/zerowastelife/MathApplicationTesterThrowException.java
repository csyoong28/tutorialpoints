package org.cpm.zerowastelife;

import static org.mockito.Mockito.doThrow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterThrowException {

    // @TestSubject annotation is used to identify class which is going to use the mock object. @TestSubject is used by EasyMock
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    // @Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test(expected = RuntimeException.class)
    public void testAdd() {
        // add the behavior to throw exception, does not happen at my side, not sure why
        doThrow(new RuntimeException("Add operation not implemented")).when(calcService).add(10.0, 20.0);

        // test the add functionality
        Assert.assertEquals(calcService.add(10.0, 20.0), 40.0, 0);
    }

}