package org.application.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
@Aspect
public class WebControllerAop {
    @Pointcut("execution(* org.application.controller..*.do*(..))")
    public void executeService(){}

    @AfterReturning("executeService()")
    public void doAfterAdvice(JoinPoint joinPoint) throws IOException {
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        HttpSession session = request.getSession();
        if("n".equals(session.getAttribute("str").toString())){
            try {
                response.sendRedirect("/aop/err");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


}
