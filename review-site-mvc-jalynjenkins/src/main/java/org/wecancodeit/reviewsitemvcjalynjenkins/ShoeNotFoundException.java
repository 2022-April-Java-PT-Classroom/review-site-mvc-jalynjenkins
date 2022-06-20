package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Bad Request, Shoe Not Found")
public class ShoeNotFoundException extends Exception {

}
