package com.candidate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidate.classes.Candidate;
import com.candidate.dao.CandidateDAO;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateDAO candidateDOA;
	
	
	@Override
	@Transactional
	public List<Candidate> getCandidates() {		
		return candidateDOA.getCandidates();
	}

	@Override
	@Transactional
	public void saveCandidate(Candidate theCandidate) {
		candidateDOA.saveCandidate(theCandidate);
		
	}

	@Override
	@Transactional
	public Candidate getCandidate(long theId) {
		// TODO Auto-generated method stub
		return candidateDOA.getCandidate(theId);
	}

	@Override
	@Transactional
	public void deleteCandidate(long theId) {
		candidateDOA.deleteCandidate(theId);
		
	}

}
