package jung;

import java.util.ArrayList;

public class DessertRepository {
	
	private ArrayList<DessertList> ListOfDessert=new ArrayList<DessertList>();
		
	private static DessertRepository instance = new DessertRepository();
	
	public DessertRepository(){
		
	DessertList DessertList1 = new DessertList("JGD121027","휘낭시에", 3500, "디저트", 5, "계란", "국산");
	DessertList1.setDescription("아몬드의 풍미와 버터의 고소한 맛이 어우러진 달콤하지만 과하지 않은 고급스러운 맛을 느낄 수 있습니다.");
	DessertList1.setFilename("financier.jpg");
	
	DessertList DessertList2 = new DessertList("JGD121028","소금빵", 3500, "디저트", 5, "계란", "국산");
	DessertList2.setDescription("바삭하고 부드러운 식감에 소금의 약간의 짭짤한 맛이 달콤한 빵과 어우러져 특별한 맛을 느낄 수 있습니다.");
	DessertList2.setFilename("saltbread.jpg");
	
	DessertList DessertList3 = new DessertList("JGD121029","마들렌", 4000, "디저트", 5, "계란", "국산");
	DessertList3.setDescription("레몬 향이 가미된 부드러운 프랑스 전통 디저트를 정가당에서 맛 볼 수 있습니다.");
	DessertList3.setFilename("madeleine.jpg");
	
	DessertList DessertList4 = new DessertList("JGD121030","스콘", 3500, "디저트", 5, "계란", "국산");
	DessertList4.setDescription("겉은 바삭하지만 속은 부드럽고 촉촉한 담백한 맛을 느낄 수 있습니다.");
	DessertList4.setFilename("scone.jpg");

	
	DessertList DessertList5 = new DessertList("JGD121031","브라우니", 3000, "디저트", 5, "계란", "국산");
	DessertList5.setDescription("진한 초콜릿 맛과 부드러운 질감으로 전 세계적으로 많은 사람들에게 사랑을 받은 브라우니");
	DessertList5.setFilename("brownie.jpg");
	
	DessertList DessertList6 = new DessertList("#","크레이프", 4000, "디저트", 5, "계란", "국산");
	DessertList6.setDescription(null);
	DessertList6.setFilename("#");
	
	DessertList DessertList7 = new DessertList("#","파운드", 4000, "디저트", 5, "계란", "국산");
	DessertList7.setDescription(null);
	DessertList7.setFilename("#");
	
	DessertList DessertList8 = new DessertList("#","카스테라", 4000, "디저트", 5, "계란", "국산");
	DessertList8.setDescription(null);
	DessertList8.setFilename("#");
	
	ListOfDessert.add(DessertList1);
	ListOfDessert.add(DessertList2);
	ListOfDessert.add(DessertList3);
	ListOfDessert.add(DessertList4);	
	ListOfDessert.add(DessertList5);
	ListOfDessert.add(DessertList6);
	ListOfDessert.add(DessertList7);
	ListOfDessert.add(DessertList8);
	
	}
	
public static DessertRepository getInstance() {
		return instance;
}	
	

public ArrayList<DessertList> getAllSell(){
	return ListOfDessert;
}

public DessertList getSellByName(String info) {
	DessertList DsessertById=null;
	
	for (int i=0; i < ListOfDessert.size(); i++) {
		DessertList dessert = ListOfDessert.get(i);
		if(dessert != null && dessert.getName() !=null && dessert.getName().equals(info)) {
			DsessertById=dessert;
			break;
		}
	}
	
	return DsessertById;
}
public void addSell(DessertList create) {
	ListOfDessert.add(create);
}
}