package org.zy.anno.run;

import org.zy.anno.anno.Description;
import org.zy.anno.anno.Name;

@Description("������UseAnno��Description��Ϣ")
public class UseAnno {

	@Name(originate="������UseAnno��getName��originate", community="������UseAnno��getName��community")
	public String getName() {
		return null;
	}
	
	@Name(originate="������UseAnno��getInfo��originate", community="������UseAnno��getInfo��community")
	public String getInfo() {
		return "������getInfo()�ķ�����Ϣ";
	}
}
