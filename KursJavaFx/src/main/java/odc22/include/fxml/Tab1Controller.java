package odc22.include.fxml;

import javafx.fxml.FXML;

public class Tab1Controller {

	private String messageTab1 = "Tak, to jest Tab1 Controller!";

	@FXML
	private void writeMessage() {
		System.out.println(messageTab1);
	}

	public String getMessageTab1() {
		return messageTab1;
	}

	public void setMessageTab1(String messageTab1) {
		this.messageTab1 = messageTab1;
	}

}
