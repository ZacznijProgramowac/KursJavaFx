package odc22.include.fxml;

import javafx.fxml.FXML;

public class Tab2Controller {

	private String messageTab2 = "Tak, to jest Tab2 Controller!";

	@FXML
	private void writeMessage() {
		System.out.println(messageTab2);
	}

	public String getMessageTab2() {
		return messageTab2;
	}

	public void setMessageTab2(String messageTab2) {
		this.messageTab2 = messageTab2;
	}

}
