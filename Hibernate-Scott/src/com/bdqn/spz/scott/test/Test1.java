/**
 * 
 */
package com.bdqn.spz.scott.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import com.bdqn.spz.scott.entity.Dept;
import com.bdqn.spz.scott.entity.Emp;
import com.bdqn.spz.scott.entity.Pro;
import com.bdqn.spz.scott.util.HibernateSessionFactory_5;

/**
 * @author 施鹏振
 * date 2017年12月11日
 * time 下午2:55:11
 */
public class Test1 {

	private Session session=HibernateSessionFactory_5.getSession();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Test1().one_to_one_load();
	}
	
	@Test
	public void one_to_one(){
		Transaction transaction=session.beginTransaction();
		session.delete(session.load(Emp.class,12));
		transaction.commit();
	}
	
	public void one_to_one_load(){
		Transaction transaction=session.beginTransaction();
		Dept dept=session.load(Dept.class,5);
		//dept.getEmp().setEmpName("施鹏振");
		session.delete(dept);
		transaction.commit();
	}
	
	@SuppressWarnings("unchecked")
	public void many_to_one(){
		String hql="from Emp";
		Query<Emp> query=session.createQuery(hql);
		List<Emp> emps=query.getResultList();
		for (Emp emp : emps) {
			System.out.println("员工名-->"+emp.getEmpName());
			System.out.println("员工部门名称-->"+emp.getDept().getDeptName());
		}
	}
	
	@SuppressWarnings("unchecked")
	public void one_to_many(){
		String hql="from Dept";
		Query<Dept> query=session.createQuery(hql);
		List<Dept> depts =query.getResultList();
		for (Dept dept: depts) {
			System.out.println("部门名称-->"+dept.getDeptName());
			for (Emp emp : dept.getEmps()) {
				System.out.println("员工名称-->"+emp.getEmpName());
			}
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void many_to_many(){
		String hql="from Emp";
		Query<Emp> query=session.createQuery(hql);
		List<Emp> emps=query.getResultList();
		for (Emp emp : emps) {
			System.out.println("员工名-->"+emp.getEmpName());
			System.out.println("员工部门名称-->"+emp.getDept().getDeptName());
			for (Pro pro : emp.getPros()) {
				System.out.println("项目名称-->"+pro.getProName());
				for (Emp emp2 : pro.getEmps()) {
					System.out.println("员工名2-->"+emp2.getEmpName());
				}
			}
			System.out.println("--------------------------------------");
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void addPro(){
		Pro pro=new Pro();
		pro.setProId(2);
		pro.setProName("SpringBoot");
		Pro pro2=new Pro();
		pro2.setProId(3);
		pro2.setProName("SpringMVC");
		
		String hql="from Emp";
		Query<Emp> query=session.createQuery(hql);
		List<Emp> emps=query.getResultList();
		pro.setEmps(emps);
		pro2.setEmps(emps);
		Transaction transaction=session.beginTransaction(); // 开启事务
		
		session.save(pro);
		session.save(pro2);
//		session.delete(pro);
//		session.delete(pro2);
		transaction.commit();
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void findPro(){
		String hql="from Pro";
		Query<Pro> query=session.createQuery(hql);
		List<Pro> pros=query.getResultList();
		for (Pro pro : pros) {
			System.out.println("项目名称-->"+pro.getProName());
			System.out.println("-----------------------------------");
		}
	}
}
