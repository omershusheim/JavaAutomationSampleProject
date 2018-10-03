package TestObjects;

import com.google.gson.Gson;

public class UserObject {

	private String name;
	private String userId;
	private String address;
	

	
	
	public UserObject(String name, String userId, String address) {
		super();
		this.name = name;
		this.userId = userId;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toJson() {
		Gson gson = new Gson();

		String json = gson.toJson(this, UserObject.class);

		return json;
	}

}
