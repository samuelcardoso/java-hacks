package br.puc.springhandson.aspect

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggerAfterReturnAspect {
    @Around("@annotation(br.puc.springhandson.aspect.Log)")
    open fun log(joinPoint: ProceedingJoinPoint): Any? {
        println("passed here!")
        return joinPoint.proceed()
    }
}