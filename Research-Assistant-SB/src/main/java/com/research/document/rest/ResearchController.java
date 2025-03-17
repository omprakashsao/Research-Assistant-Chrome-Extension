package com.research.document.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.document.bean.ResearchRequest;
import com.research.document.service.ResearchService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/api/research")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {
	
	private final ResearchService researchService;

	@PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
