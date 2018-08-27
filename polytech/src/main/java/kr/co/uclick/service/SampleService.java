package kr.co.uclick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.uclick.entity.Sample;
import kr.co.uclick.repository.SampleRepository;

@Service
@Transactional
public class SampleService {

	@Autowired
	private SampleRepository sampleRepository;

	public List<Sample> findAll() {
		return sampleRepository.findAll();
	}

}
