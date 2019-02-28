package problem02;

public class MyService extends BaseService {

	public void service(String state) {
		 String result =" ";
		if(state.equals("오후")) {
			result = afternoon();
			System.out.println(result+"서비스 시작");
		} else {		
		result = state.equals("낮") ? day() : night() ;
		System.out.println(result+"서비스 시작");
		}
	}
	public String afternoon() {	
		return "오후";
	}
	
}
