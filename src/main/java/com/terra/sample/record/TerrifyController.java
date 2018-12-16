/**
 * 
 */
package com.terra.sample.record;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mardubudi
 *
 */
@RestController
public class TerrifyController {
	
	private Logger _logger = Logger.getLogger(TerrifyController.class.getName());
	
	@Value(value = "{msg}") 
	
	@RequestMapping(value="/sample/{msg}",method = RequestMethod.GET)
	public String getMsg(@PathVariable("msg") String msg)  {
		_logger.info("::::::  getMsg ::::::  ");
		return msg;
	}

}
