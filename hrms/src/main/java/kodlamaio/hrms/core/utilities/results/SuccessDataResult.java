package kodlamaio.hrms.core.utilities.results;





public class SuccessDataResult<T> extends DataResult<T> {


    
	public SuccessDataResult(T data,boolean success,String message) {
		super(data,true,message);
		
	}
	
	public SuccessDataResult(T data,boolean success) {
		super(data,true);
		
	}
	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	public SuccessDataResult() {
		super(null,true);
	}
}
