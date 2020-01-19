package by.khm.crm.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public void saveCustomer(*))")
    public void beforeSaveCustomerAdvice() {
        System.out.println("Executing @Before advice saveCustomer");
    }

}
