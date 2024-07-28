package com.eduelite.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduelite.api.repository.ApiTemplateRepository;
import com.eduelite.api.repository.ComputingChannelRepository;
import com.eduelite.api.schema.ApiAnyconnect;
import com.eduelite.api.schema.ApiTemplate;
import com.eduelite.common.service.EducationObjectService;

@Service
public class ApiTemplateService extends EducationObjectService<ApiTemplate>{
	
	
	public List<ApiTemplate> getApisOfAnyConnects(String anyConnectId){
		return ((ApiTemplateRepository)this.documentRepository).getApisOfAnyConnects(anyConnectId);
	}
	
}