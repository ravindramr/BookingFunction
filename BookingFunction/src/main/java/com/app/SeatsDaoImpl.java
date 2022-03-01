package com.app;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.context.AppContext;
import com.entity.Seats;

//@Transactional
@Repository
@Service
public class SeatsDaoImpl implements SeatsDao {
	@Autowired

	private SessionFactory sessionFactory;
	private AppContext con;
	@Override
	public boolean insert(Seats seat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public  List<Seats> getAllSeats() {
		
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Seats> cq = cb.createQuery(Seats.class);
		Root<Seats> root = cq.from(Seats.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
		//return null;
	}

	@Override
	public boolean update(Seats seat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Seats getSeat_No(int seat_no) {
		// TODO Auto-generated method stub
		return null;
	}

	public Seats getUpdate(int  seat_no) {
		// TODO Auto-generated method stub
		Session session = (Session) con.sessionFactory();
		Transaction t = session.beginTransaction();

		session.save(seat_no);

		t.commit();

		session.close();
		return null;

		
		//return null;
	}
	
	
}