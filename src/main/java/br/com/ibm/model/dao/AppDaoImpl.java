package br.com.ibm.model.dao;

import java.util.Calendar;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AppDaoImpl implements AppDao {

	private final String DONE = "check data base information";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(AppDaoImpl.class);

	@Override
	public String doSomethingBD() {

		logger.info("[doSomethingBD] called to do something in BD.", Calendar.getInstance().getTime().getTime());

		return DONE;
	}

}
