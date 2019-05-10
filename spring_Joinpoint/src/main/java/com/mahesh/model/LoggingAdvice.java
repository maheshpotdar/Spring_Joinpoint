package com.mahesh.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAdvice {
	// first star => void or string or int mahit nahi
	// second star => mahesh package name mahit nahi
	// third star => Traingle Class Name mahit nahi
	// fourth star => Method name. mahit nahi
	// fifth .. => parameter method madhe kiti ahe mahit nahi
	/*
	 * @Pointcut("execution(* com.*.model.*.getName(..))") public void test1() { }
	 * 
	 * @Before("test1()") public void test2(JoinPoint joinPoint) {
	 * 
	 * // method chi extra information pahije USE JOIN-POINT
	 * 
	 * System.out.println("Method Info\n"); System.out.println("Who is Target: " +
	 * joinPoint.getTarget()); System.out.println("How many args: " +
	 * joinPoint.getArgs()); System.out.println("Source Location: " +
	 * joinPoint.getSourceLocation()); System.out.println("Joinpoint Information: "
	 * + joinPoint.toString()); }
	 */

	// only setter varati operation karayache ahe.
	// args(name)

//	@Pointcut("args(name)")
//	public void test3(String name) {
//		// Empty
//	}

//	@Before("test3()")
//	public void getSetterInfo() {
//		System.out.println("Only Setter Operation start.");
//	}

//	@Before("args(name)")
//	public void test(String name) {
//		System.out.println("Name is: Before advice run."+name);
//	}

	@AfterReturning(pointcut = "args(name)", returning = "r1")
	public void test1(String name, String r1) {
		System.out.println("Name: " + name + " r1: " + r1);
	}
	
	@AfterReturning(pointcut = "args(name)",returning = "str")
	public void myInfo(String name,String str) {
		System.out.println("Pointcut Name: "+name+" Return Name: "+str);
	}
}
