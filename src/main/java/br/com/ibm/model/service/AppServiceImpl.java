/**
 * 
 */
package br.com.ibm.model.service;

import java.util.Calendar;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ibm.model.dao.AppDao;

/**
 * @author rksc
 *
 */
@Service
public class AppServiceImpl implements AppService {

	private final String DONE = "check service data";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);

	@Autowired
	private AppDao appDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.ibm.model.service.AppService#doSomething()
	 */
	@Override
	public String doSomething() {

		logger.info("[doSomething] called to do something.", Calendar.getInstance().getTime().getTime());

		appDao.doSomethingBD();

		return DONE;
	}

}
