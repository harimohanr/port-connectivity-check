package org.techtale.check.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ConnectivityController {

	@Operation(summary = "Check port connectivity")
	@GetMapping("/check")
	public String checkConnectivity() {
		return "Connected";
	}
}
