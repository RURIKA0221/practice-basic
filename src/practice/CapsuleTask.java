package practice;

public class CapsuleTask {
	private String content;
	private int date;
	private String status;

	public CapsuleTask(String content, int date) {
		this.content = content;
		this.date = date;
		this.status = "未完了";
	}
	
	//getter:値を取ってくる
	public String getContent() {
		return content;
	}
	
	public int getDate() {
		return date;
	}
	
	public String getStatus() {
		return status;
		
	}
	
	//値を設定する
	public void setStatus(String status) {
		this.status = status;
	}
	
}
