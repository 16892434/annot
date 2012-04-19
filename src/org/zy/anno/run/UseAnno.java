package org.zy.anno.run;

import org.zy.anno.anno.Description;
import org.zy.anno.anno.Name;

@Description("这里是UseAnno的Description信息")
public class UseAnno {

	@Name(originate="这里是UseAnno的getName的originate", community="这里是UseAnno的getName的community")
	public String getName() {
		return null;
	}
	
	@Name(originate="这里是UseAnno的getInfo的originate", community="这里是UseAnno的getInfo的community")
	public String getInfo() {
		return "这里是getInfo()的返回信息";
	}
}
