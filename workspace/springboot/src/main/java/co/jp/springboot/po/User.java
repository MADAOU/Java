package co.jp.springboot.po;

public class User {

	private String userId;
	private String password;
	private String name = null;
	private int delFlg = 0;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the delFlg
	 */
	public int getDelFlg() {
		return delFlg;
	}
	/**
	 * @param delFlg the delFlg to set
	 */
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	
	
}
