package org.zy.anno.run;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import org.zy.anno.anno.Description;
import org.zy.anno.anno.Name;

@SuppressWarnings("unchecked")
public class Run {

	public static void main(String [] args) throws Exception {
		String CLASS_NAME = UseAnno.class.getName();
		Class<UseAnno> test = (Class<UseAnno>) Class.forName(CLASS_NAME);
		Method[] methods = test.getMethods();
		boolean flag = test.isAnnotationPresent(Description.class);
		if(flag) {
			Description des = test.getAnnotation(Description.class);
			System.out.println("√Ë ˆ£∫" + des.value());
			System.out.println("---------------------------");
		}
		
		Set<Method> set = new HashSet<Method>();
		int i = 0;
		for(Method method : methods) {
			boolean otherFlag = methods[i++].isAnnotationPresent(Name.class);
			if(otherFlag)
				set.add(method);
		}
		
		for(Method method : set) {
			Name name = method.getAnnotation(Name.class);
			System.out.println(name.originate());
			System.out.println(name.community());
		}
	}
}
