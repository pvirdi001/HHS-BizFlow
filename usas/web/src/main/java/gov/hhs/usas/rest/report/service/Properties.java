package gov.hhs.usas.rest.report.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {
	
	@Value("${xml.data.property}")
	private String xmlDataProperty;
	@Value("${xml.data.login.template}")
	private String xmlDataLoginTemplate;
	@Value("${xml.data.report.template}")
	private String xmlDataReportTemplate;	
	@Value("${path.logon}")
	private String logonPath;
	@Value("${path.logoff}")
	private String logoffPath;
	@Value("${path.reportdata}")
	private String reportDataPath;

	//Report Properties
	@Value("${report.id.recruitment}")
	private String recruitmentReportID;
	@Value("${report.id.appointment}")
	private String appointmentReportID;
	@Value("${report.id.applicant-roster}")
	private String applicantRosterReportID;
	@Value("${report.id.applicant-notification}")
	private String applicantNotificationReportID;
	@Value("${report.name.recruitment}")
	private String recruitmentReportName;
	@Value("${report.name.appointment}")
	private String appointmentReportName;
	@Value("${report.name.applicant-roster}")
	private String applicantRosterReportName;
	@Value("${report.name.applicant-notification}")
	private String applicantNotificationReportName;
	@Value("${report.format.property}")
	private String reportFormatProperty;	
	@Value("${report.format.dataset}")
	private String reportFormatDataSet;	
	@Value("${report.format.html}")
	private String reportFormatHTML;

	//Authentication properties
	@Value("${credentials.namespace}")
	private String NameSpace;
	@Value("${credentials.username}")
	private String UserName;
	@Value("${credentials.password}")
	private String Password;

	@Value("${server.url}")
	private String serverURL;
	@Value("${request.user.agent.property}")
	private String userAgentProperty;
	@Value("${request.user.agent}")
	private String userAgent;
	@Value("${request.accept.language.property}")
	private String acceptLanguageProperty;
	@Value("${request.accept.language}")
	private String acceptLanguage;
	@Value("${request.content.type.property}")
	private String contentTypeProperty;
	@Value("${request.content.type}")
	private String contentType;
	@Value("${request.cookie.property}")
	private String cookieProperty;
	
	//Package names
	@Value("${package.recruitment}")
	private String recruitmentPackage;
	@Value("${package.appointment}")
	private String appointmentPackage;

	//Response Success Failure Message Properties
	@Value("${response.code.success}")
	private String responseCodeSuccess;
	@Value("${response.code.connection-error}")
	private String responseCodeConnectionError;
	@Value("${response.code.report-error}")
	private String responseCodeReportError;
	@Value("${response.code.no-data-error}")
	private String responseCodeNoDataError;
	@Value("${response.code.parse-error}")
	private String responseCodeParseError;
	@Value("${response.code.file-error}")
	private String responseCodeFileError;

	@Value("${exception.connection}")
	private String connectionException;
	@Value("${exception.reportdata}")
	private String reportDataException;
	@Value("${exception.nodata}")
	private String noDataException;
	@Value("${exception.parse}")
	private String parseException;	
	@Value("${exception.nofile}")
	private String noFileException;
	@Value("${exception}")
	private String exception;

	//HTTP Status Codes
	@Value("${http.success.ok}")
	private int httpStatusOk;
	@Value("${http.success.no-content}")
	private int httpSuccessNoContent;
	@Value("${http.client-error.bad-request}")
	private int httpClientErrorBadRequest;
	
	//Program mode - test or production
	@Value("${mode.test}")
	private String testMode;
	@Value("${mode.production}")
	private String productionMode;
	@Value("${program.mode}")
	private String programMode;
	
	//Default location for pre-downloaded report data files
	@Value("${location.recruitment}")
	private String recruitmentFileLocation;
	@Value("${location.appointment}")
	private String appointmentFileLocation;
	@Value("${location.applicant-notification}")
	private String applicantNotificationFileLocation;
	@Value("${location.applicant-roster}")
	private String applicantRosterFileLocation;

	public String getXmlDataProperty() {
		return xmlDataProperty;
	}
	public void setXmlDataProperty(String xmlDataProperty) {
		this.xmlDataProperty = xmlDataProperty;
	}
	public String getXmlDataLoginTemplate() {
		return xmlDataLoginTemplate;
	}
	public void setXmlDataLoginTemplate(String xmlDataLoginTemplate) {
		this.xmlDataLoginTemplate = xmlDataLoginTemplate;
	}
	public String getXmlDataReportTemplate() {
		return xmlDataReportTemplate;
	}
	public void setXmlDataReportTemplate(String xmlDataReportTemplate) {
		this.xmlDataReportTemplate = xmlDataReportTemplate;
	}
	public String getLogonPath() {
		return logonPath;
	}
	public void setLogonPath(String logonPath) {
		this.logonPath = logonPath;
	}
	public String getLogoffPath() {
		return logoffPath;
	}
	public void setLogoffPath(String logoffPath) {
		this.logoffPath = logoffPath;
	}
	public String getReportDataPath() {
		return reportDataPath;
	}
	public void setReportDataPath(String reportDataPath) {
		this.reportDataPath = reportDataPath;
	}
	public String getRecruitmentReportID() {
		return recruitmentReportID;
	}
	public void setRecruitmentReportID(String recruitmentReportID) {
		this.recruitmentReportID = recruitmentReportID;
	}
	public String getAppointmentReportID() {
		return appointmentReportID;
	}
	public void setAppointmentReportID(String appointmentReportID) {
		this.appointmentReportID = appointmentReportID;
	}
	public String getApplicantRosterReportID() {
		return applicantRosterReportID;
	}
	public void setApplicantRosterReportID(String applicantRosterReportID) {
		this.applicantRosterReportID = applicantRosterReportID;
	}
	public String getApplicantNotificationReportID() {
		return applicantNotificationReportID;
	}
	public void setApplicantNotificationReportID(String applicantNotificationReportID) {
		this.applicantNotificationReportID = applicantNotificationReportID;
	}
	public String getRecruitmentReportName() {
		return recruitmentReportName;
	}
	public void setRecruitmentReportName(String recruitmentReportName) {
		this.recruitmentReportName = recruitmentReportName;
	}
	public String getAppointmentReportName() {
		return appointmentReportName;
	}
	public void setAppointmentReportName(String appointmentReportName) {
		this.appointmentReportName = appointmentReportName;
	}
	public String getApplicantRosterReportName() {
		return applicantRosterReportName;
	}
	public void setApplicantRosterReportName(String applicantRosterReportName) {
		this.applicantRosterReportName = applicantRosterReportName;
	}
	public String getApplicantNotificationReportName() {
		return applicantNotificationReportName;
	}
	public void setApplicantNotificationReportName(String applicantNotificationReportName) {
		this.applicantNotificationReportName = applicantNotificationReportName;
	}
	public String getReportFormatProperty() {
		return reportFormatProperty;
	}
	public void setReportFormatProperty(String reportFormatProperty) {
		this.reportFormatProperty = reportFormatProperty;
	}
	public String getReportFormatDataSet() {
		return reportFormatDataSet;
	}
	public void setReportFormatDataSet(String reportFormat) {
		this.reportFormatDataSet = reportFormat;
	}
	public String getReportFormatHTML() {
		return reportFormatHTML;
	}
	public void setReportFormatHTML(String reportFormatHTML) {
		this.reportFormatHTML = reportFormatHTML;
	}
	public String getNameSpace() {
		return NameSpace;
	}
	public void setNameSpace(String nameSpace) {
		NameSpace = nameSpace;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getServerURL() {
		return serverURL;
	}
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}
	public String getUserAgentProperty() {
		return userAgentProperty;
	}
	public void setUserAgentProperty(String userAgentProperty) {
		this.userAgentProperty = userAgentProperty;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getAcceptLanguageProperty() {
		return acceptLanguageProperty;
	}
	public void setAcceptLanguageProperty(String acceptLanguageProperty) {
		this.acceptLanguageProperty = acceptLanguageProperty;
	}
	public String getAcceptLanguage() {
		return acceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}
	public String getContentTypeProperty() {
		return contentTypeProperty;
	}
	public void setContentTypeProperty(String contentTypeProperty) {
		this.contentTypeProperty = contentTypeProperty;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getCookieProperty() {
		return cookieProperty;
	}
	public void setCookieProperty(String cookieProperty) {
		this.cookieProperty = cookieProperty;
	}
	public String getRecruitmentPackage() {
		return recruitmentPackage;
	}
	public void setRecruitmentPackage(String recruitmentPackage) {
		this.recruitmentPackage = recruitmentPackage;
	}
	public String getAppointmentPackage() {
		return appointmentPackage;
	}
	public void setAppointmentPackage(String appointmentPackage) {
		this.appointmentPackage = appointmentPackage;
	}
	public String getResponseCodeSuccess() {
		return responseCodeSuccess;
	}
	public void setResponseCodeSuccess(String responseCodeSuccess) {
		this.responseCodeSuccess = responseCodeSuccess;
	}
	public String getResponseCodeConnectionError() {
		return responseCodeConnectionError;
	}
	public void setResponseCodeConnectionError(String responseCodeConnectionError) {
		this.responseCodeConnectionError = responseCodeConnectionError;
	}
	public String getResponseCodeReportError() {
		return responseCodeReportError;
	}
	public void setResponseCodeReportError(String responseCodeReportError) {
		this.responseCodeReportError = responseCodeReportError;
	}
	public String getResponseCodeNoDataError() {
		return responseCodeNoDataError;
	}
	public void setResponseCodeNoDataError(String responseCodeNoDataError) {
		this.responseCodeNoDataError = responseCodeNoDataError;
	}
	public String getResponseCodeParseError() {
		return responseCodeParseError;
	}
	public void setResponseCodeParseError(String responseCodeParseError) {
		this.responseCodeParseError = responseCodeParseError;
	}
	public String getResponseCodeFileError() {
		return responseCodeFileError;
	}
	public void setResponseCodeFileError(String responseCodeFileError) {
		this.responseCodeFileError = responseCodeFileError;
	}
	public String getConnectionException() {
		return connectionException;
	}
	public void setConnectionException(String connectionException) {
		this.connectionException = connectionException;
	}
	public String getReportDataException() {
		return reportDataException;
	}
	public void setReportDataException(String reportDataException) {
		this.reportDataException = reportDataException;
	}
	public String getNoDataException() {
		return noDataException;
	}
	public void setNoDataException(String noDataException) {
		this.noDataException = noDataException;
	}
	public String getParseException() {
		return parseException;
	}
	public void setParseException(String parseException) {
		this.parseException = parseException;
	}
	public String getNoFileException() {
		return noFileException;
	}
	public void setNoFileException(String noFileException) {
		this.noFileException = noFileException;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public int getHttpStatusOk() {
		return httpStatusOk;
	}
	public void setHttpStatusOk(int httpStatusOk) {
		this.httpStatusOk = httpStatusOk;
	}
	public int getHttpSuccessNoContent() {
		return httpSuccessNoContent;
	}
	public void setHttpSuccessNoContent(int httpSuccessNoContent) {
		this.httpSuccessNoContent = httpSuccessNoContent;
	}
	public int getHttpClientErrorBadRequest() {
		return httpClientErrorBadRequest;
	}
	public void setHttpClientErrorBadRequest(int httpClientErrorBadRequest) {
		this.httpClientErrorBadRequest = httpClientErrorBadRequest;
	}
	public String getTestMode() {
		return testMode;
	}
	public void setTestMode(String testMode) {
		this.testMode = testMode;
	}
	public String getProductionMode() {
		return productionMode;
	}
	public void setProductionMode(String productionMode) {
		this.productionMode = productionMode;
	}
	public String getProgramMode() {
		return programMode;
	}
	public void setProgramMode(String programMode) {
		this.programMode = programMode;
	}
	public String getRecruitmentFileLocation() {
		return recruitmentFileLocation;
	}
	public void setRecruitmentFileLocation(String recruitmentFileLocation) {
		this.recruitmentFileLocation = recruitmentFileLocation;
	}
	public String getAppointmentFileLocation() {
		return appointmentFileLocation;
	}
	public void setAppointmentFileLocation(String appointmentFileLocation) {
		this.appointmentFileLocation = appointmentFileLocation;
	}
	public String getApplicantNotificationFileLocation() {
		return applicantNotificationFileLocation;
	}
	public void setApplicantNotificationFileLocation(String applicantNotificationFileLocation) {
		this.applicantNotificationFileLocation = applicantNotificationFileLocation;
	}
	public String getApplicantRosterFileLocation() {
		return applicantRosterFileLocation;
	}
	public void setApplicantRosterFileLocation(String applicantRosterFileLocation) {
		this.applicantRosterFileLocation = applicantRosterFileLocation;
	}


	/*	@PostConstruct
	public void writeConfigurationToLog() {
		log.info("Starting application by using configuration: {}", this);
	}*/


}