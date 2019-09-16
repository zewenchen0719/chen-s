import java.util.ArrayList;


public class AddressBook {
	public ArrayList <BuddyInfo> B;

	public AddressBook(){
		B = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo x) {
		B.add(x);
	}
	
	public void removeBuddy(int x){
		B.remove(x);
	}
	
	public static void main(String[] args) {
		BuddyInfo bi = new BuddyInfo();
		AddressBook AB = new AddressBook();
		AB.addBuddy(bi);
		bi.setName("chen");
		System.out.println(bi.getName());

	}
}
