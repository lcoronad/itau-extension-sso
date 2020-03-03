package com.itau.redhat.sso.util;

public class Constant {

	public static final String ORIGINATOR_NAME = "SSO";
	public static final Integer ORIGINATOR_TYPE = 41;
	public static final String STATUS_CODE = System.getenv("SSO_STATUS");
	public static final String SERVER_STATUS_CODE = System.getenv("SSO_STATUS_CODE");
	public static final String SERVER_STATUS_CODE_LOGIN = System.getenv("SSO_STATUS_CODE_LOGIN");
	public static final String SERVER_SEVERITY = System.getenv("SSO_SERVER_SEVERITY");
	public static final String URL_WEB_SERVICE = "http://10.186.11.91:24200/services/security/ValidatePassword?wsdl";
	public static final String NUM_ID = "num_id";
	public static final String TYPE_ID = "type_id";
	
	private Constant() {}
}
