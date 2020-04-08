/**
 * 
 */
package co.kr.lim.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YoungBoss
 * @since  2020. 4. 8.
 * 
 */
@RestController
public class WebRestController {

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
}
