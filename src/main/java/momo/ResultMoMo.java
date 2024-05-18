package momo;

import lombok.Data;

@Data
public class ResultMoMo {
	public String t;
	public String partnerCode;
	public String requestId;
	public String deeplink;
	public String deeplinkMiniApp;
	public String orderId;
	public String amount;
	public String responseTime;
	public String message;
	public String resultCode;
	public String payUrl;
	public String qrCodeUrl;
}
