package com.javaEdu.myapp.sendingmail.dto;

public class MailSenderDto {

	// 메일설정관리 탭
	private String mailInfo; // 신청구분
	private String mailFormUseYn;// 사용여부
	private String accountId; // 계정아이디
	private String accountMail;// 계정 메일
	private String accountPw; // 계정비밀번호

	private String smtpHost;
	private String smtpPort;

	private String fallBackYn; //fallback 여부
	private String mailSubject; //메일 제목
	private String mailContent; //메일 내용

	
	public String getMailInfo() {
		return mailInfo;
	}

	public void setMailInfo(String mailInfo) {
		this.mailInfo = mailInfo;
	}

	public String getMailFormUseYn() {
		return mailFormUseYn;
	}

	public void setMailFormUseYn(String mailFormUseYn) {
		this.mailFormUseYn = mailFormUseYn;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountMail() {
		return accountMail;
	}

	public void setAccountMail(String accountMail) {
		this.accountMail = accountMail;
	}

	public String getAccountPw() {
		return accountPw;
	}

	public void setAccountPw(String accountPw) {
		this.accountPw = accountPw;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getFallBackYn() {
		return fallBackYn;
	}

	public void setFallBackYn(String fallBackYn) {
		this.fallBackYn = fallBackYn;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	@Override
	public String toString() {
		return "MailSenderDto [mailInfo=" + mailInfo + ", mailFormUseYn=" + mailFormUseYn + ", accountId=" + accountId
				+ ", accountMail=" + accountMail + ", accountPw=" + accountPw + ", smtpHost=" + smtpHost + ", smtpPort="
				+ smtpPort + ", fallBackYn=" + fallBackYn + ", mailSubject=" + mailSubject + ", mailContent="
				+ mailContent + "]";
	}
	
	

}
