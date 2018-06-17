package com.candidate.service;

import java.util.List;

import com.candidate.classes.Candidate;

public interface CandidateService {

	public List<Candidate> getCandidates();

	public void saveCandidate(Candidate theCandidate);
	
}
