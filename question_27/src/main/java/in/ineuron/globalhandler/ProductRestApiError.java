package in.ineuron.globalhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.exception.ProductNotFoundException;

@RestControllerAdvice
public class ProductRestApiError {
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(ProductNotFoundException se) {
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
