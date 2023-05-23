package org.Filpkart;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Withoutknowfailure implements IAnnotationTransformer{
@Override
public void transform(ITestAnnotation N, Class testClass, Constructor testConstructor, Method testMethod) {
	
	N.setRetryAnalyzer(withknowfailur.class);
}
}
