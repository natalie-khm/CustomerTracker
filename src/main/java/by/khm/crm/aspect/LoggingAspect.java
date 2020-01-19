package by.khm.crm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public void saveCustomer(*))")
    public void beforeSaveCustomerAdvice(JoinPoint joinPoint) {

        System.out.println("Executing: " + joinPoint.getSignature().getName());
    }

    @Before("execution(* by.khm.crm.dao.*.get*(..))")
    public void beforeAnyGetter(JoinPoint joinPoint) {

        System.out.println("GET: " + joinPoint.getSignature().getName());
    }
}
