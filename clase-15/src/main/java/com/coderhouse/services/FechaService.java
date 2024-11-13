package com.coderhouse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.dtos.TimeResponseDTO;

@Service
public class FechaService {

	@Autowired
	private RestTemplate restTemplate;
	
	public TimeResponseDTO obtenerFechaActual() {
		try {
			final String URL = "https://timeapi.io/api/Time/current/zone?timeZone=America/Argentina/Buenos_Aires";
			return restTemplate.getForObject(URL, TimeResponseDTO.class);
		}catch(RestClientException error) {
			System.err.println("Error, No se pudo conectar a la API Externa: " + error.getMessage());
			return null;
		}
		
	}
}
