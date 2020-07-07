package dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import dao.UserDao;
import domain.Users;

public class UserDaoIpml implements UserDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Users get(String name) {
		// TODO Auto-generated method stub
		return (Users) getSessionFactory().getCurrentSession().get("Users", name);
	}

	public Serializable save(Users user) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().contains(user);
	}

	public void update(Users user) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().saveOrUpdate(user);
	}

	public void delete(Users user) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().delete(user);
	}

	public void delete(Serializable name) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().createQuery("delete Users en where en.id= ?0").setParameter("0", name)
				.executeUpdate();
	}

	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return find("select en from users en");
	}

	public long findCount() {
		// TODO Auto-generated method stub
		List<?> l=find("select count(*) form users");
		if(l!=null&&l.size()==1) {
			return (Long)l.get(0);
		}
		return 0;
	}
	// 根据HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<Users> find(String hql){
		return (List<Users>)getSessionFactory().getCurrentSession().createQuery(hql).getResultList();
	}
	//根据带占位符参数的HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<Users> find(String hql,Object...params){
		Query query=getSessionFactory().getCurrentSession().createQuery(hql);
		for(int i=0,len=params.length;i<len;i++) {
			query.setParameter(i+"", params[i]);
		}
		return (List<Users>)query.getResultList();
	}
	/*
	 * 使用hql语句进行分页查询操作
	 * @param hql 需要查询的hql语句
	 * @param pageNo 查询第pageNo页的记录
	 * @param pageSize 每页需要显示的记录数
	 * @return 当前页的所有记录
	 */
	@SuppressWarnings("unchecked")
	protected List<Users> findByPage(String hql,int pageNo,int pageSize){
		return getSessionFactory().getCurrentSession().createQuery(hql).setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).getResultList();
	}
	/*
	 * 使用hql语句进行分页查询操作
	 * @param hql 需要查询的hql语句
	 * @param params 如果hql带占位符参数，params用于传入占位符参数
	 * @param pageNo 查询第pageNo页的记录
	 * @param pageSize 每页需要显示的记录数
	 * @return 当前页的所有记录
	 */
	@SuppressWarnings("unchecked")
	protected List<Users> findByPage(String hql,int pageNo,int pageSize,Object...params){
		Query query=getSessionFactory().getCurrentSession().createQuery("hql");
		for(int i=0,len=params.length;i<len;i++) {
			query.setParameter(i+"", params[i]);
		}
		return query.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).getResultList();
	}

}
