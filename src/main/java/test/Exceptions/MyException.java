package test.Exceptions;

public class MyException extends Exception {

	private String errordetail;

	public MyException(String reason, String errordetail) {
		super(reason);
		this.errordetail = errordetail;
	}

	public String getErrorDetail() {
		return errordetail;
	}
}
