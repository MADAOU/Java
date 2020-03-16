package Invoke;

import java.lang.reflect.Method;

public class InvokeTest {

	public void executeInvoke(String className) throws Exception {
		Class<?> clazz = ClassLoader.getSystemClassLoader()
				.loadClass(className);
		Object newInstance = clazz.newInstance();
		Method setMethod = clazz.getMethod("setValue", String.class);
		Method getMethod = clazz.getMethod("getValue");
		setMethod.invoke(newInstance, "这个setter方法");
		Object invoke = getMethod.invoke(newInstance);
		System.out.println(invoke.toString());
	}

	public static void main(String[] args) throws Exception {
		InvokeTest invoke = new InvokeTest();
		invoke.executeInvoke("Invoke.Test");

	}
}
