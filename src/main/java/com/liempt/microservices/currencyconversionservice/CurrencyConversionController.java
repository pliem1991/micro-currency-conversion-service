package com.liempt.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.liempt.microservices.currencyconversionservice.bean.CurrencyConversionBean;

/**
 * @author Liem.pt - 2019/03/18 11:01:32
 *
 */
@RestController
public class CurrencyConversionController {

	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConverter(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		return new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 8100);

	}
}
