package com.candidate.dao;

import java.util.List;

import com.candidate.classes.Candidate;

public interface CandidateDAO {

		public List<Candidate> getCandidates();

		public void saveCandidate(Candidate theCandidate);

		public Candidate getCandidate(long theId);
	
}
