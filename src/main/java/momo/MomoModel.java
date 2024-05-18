package momo;

import lombok.Data;

@Data
public class MomoModel {
 public String partnerCode;
 public String orderId ;
 public String storeId ;
 public String redirectUrl ;
 public String ipnUrl ;
 public String requestId ;
 public String requestType ;
 public String amount;
 public String partnerUserId;
 public String orderType;
 public String transId;
 public String resultCode;
 public String message;
 public String payType;
 public String responseTime; 
 public String orderInfo;
 public String extraData;
 public String signature;
}
