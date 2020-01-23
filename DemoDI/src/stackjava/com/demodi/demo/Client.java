package stackjava.com.demodi.demo;

import stackjava.com.demodi.dao.AbstractDAO;
import stackjava.com.demodi.dao.FactoryDAO;

public class Client {
	AbstractDAO dao;

	public Client() {
		dao = FactoryDAO.getDAO();
	}

	public AbstractDAO getDao() {
		return dao;
	}

	public void setDao(AbstractDAO dao) {
		this.dao = dao;
	}
	
	public void execute() {
		dao.insert();
		dao.update();
		dao.delete();
	}

}
