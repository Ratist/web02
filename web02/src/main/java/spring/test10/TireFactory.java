package spring.test10;

import java.util.Date;
import java.util.Properties;

//인스턴스 팩토리 메서드 
public class TireFactory {
	public Tire createTire(int prodId){
	  Tire tire = null;
		Properties spec = new Properties();
		
		if(prodId == 100){ //한국 타이어-승용차-일반
			tire = new Tire("한국타이어");
			tire.setCreateDate(new Date());
			spec.put("width", 215);
			spec.put("ratio", 65);
			spec.put("rim.diameter", 12);
			tire.setSpec(spec);
			
		}else if (prodId == 101) {//한국타이어-승용차-스포티
			tire = new Tire("한국타이어");
			tire.setCreateDate(new Date());
			spec.put("width", 215);
			spec.put("ratio", 55);
			spec.put("rim.diameter", 12);
			tire.setSpec(spec);
		}else if (prodId == 200) { // 금호 타이어-승용차-일반
			tire = new Tire("금호타이어");
			tire.setCreateDate(new Date());
			spec.put("width", 235);
			spec.put("ratio", 45);
			spec.put("rim.diameter", 17);
			tire.setSpec(spec);
		}else if (prodId ==201){ //금호타이어-승용차-스노우
			tire = new Tire("금호타이어");
			tire.setCreateDate(new Date());
			spec.put("width", 235);
			spec.put("ratio", 45);
			spec.put("rim.diameter", 17);
			tire.setSpec(spec);
		}else{ //일반 막 타이어 
			tire = new Tire("재생타이어");
			tire.setCreateDate(new Date());
			spec.put("width", 205);
			spec.put("ratio", 65);
			spec.put("rim.diameter", 15);
			tire.setSpec(spec);
		}
		
		return tire;
	}
}
