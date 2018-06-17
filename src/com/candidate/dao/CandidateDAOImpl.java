package com.candidate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.candidate.classes.Candidate;

@Repository
public class CandidateDAOImpl implements CandidateDAO {

	// Need to inject sessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public List<Candidate> getCandidates() {
	
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Candidate> theQuery =
				currentSession.createQuery("From Candidate", Candidate.class);
		
		// execute query and get result list
		List<Candidate> candidates = theQuery.getResultList();
		
		// return the results
		return candidates;
	}

	@Override
	public void saveCandidate(Candidate theCandidate) {
		
		//get current Hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Save the new candidate
		currentSession.save(theCandidate);
	}

}
