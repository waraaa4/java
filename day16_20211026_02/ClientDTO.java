package day16_20211026_02;

// 고객정보
public class ClientDTO {
	private int clientNumber;	// 고객번호
	private String clientName;	// 고객이름
	private String clientPhone;	// 전화번호
	
	public ClientDTO(int clientNumber, String clientName, String clientPhone) {
		super();
		this.clientNumber = clientNumber;
		this.clientName = clientName;
		this.clientPhone = clientPhone;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientNumber=" + clientNumber + ", clientName=" + clientName + ", clientPhone=" + clientPhone
				+ "]";
	}
	
	
}
