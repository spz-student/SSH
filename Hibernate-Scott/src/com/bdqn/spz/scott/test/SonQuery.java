package com.bdqn.spz.scott.test;

import java.util.List;
import org.hibernate.*;
import org.junit.Test;

import com.bdqn.spz.scott.entity.Dept;
import com.bdqn.spz.scott.entity.Emp;
import com.bdqn.spz.scott.util.HibernateUtil;

public class SonQuery {

	/**
	 * ��ѯ���ʸ���ƽ�����ʵ�Ա����
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void egEmp() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Emp> list = HibernateUtil.currentSession()
					.createQuery("from Emp e where e.salary > (select avg(salary) from Emp)").list();
			for (Emp emp : list) {
				System.out.println(emp.getEmpName() + ", " + emp.getSalary());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯ����Ա�����ʶ�С��5000�Ĳ��ţ�����û��Ա���Ĳ��š�
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg8() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 > all(select e.salary from d.emps e)").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯ����Ա�����ʶ�С��5000�Ĳ��ţ�������û��Ա���Ĳ��š�
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg8_1() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 > all(select e.salary from d.emps e)" + " and d.emps.size > 0")
					.list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯ������һλԱ�����ʵ���5000�Ĳ��š�
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg9() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 > any(select e.salary from d.emps e)").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ����ѯԱ������������5000Ԫ�Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg10() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 = any(select e.salary from d.emps e)").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯԱ������������5000Ԫ�Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg10_1() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 = some(select e.salary from d.emps e)").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯԱ������������5000Ԫ�Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg10_2() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession()
					.createQuery("from Dept d where 5000 in (select e.salary from d.emps e)").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯ������һλԱ���Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg11() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession().createQuery("from Dept d where exists (from d.emps)")
					.list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯָ��Ա�����ڲ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg12() {
		// ������ѯ����
		Emp emp = new Emp();
		emp.setEmpNo(7934);

		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession().createQuery("from Dept d where ? in elements(d.emps)")
					.setParameter(0, emp).list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯָ��Ա�����ڲ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg12_1() {
		// ������ѯ����
		Emp emp = new Emp();
		emp.setEmpNo(7934);

		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession().createQuery("from Dept d where ? in (from d.emps)")
					.setParameter(0, emp).list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯԱ����������5�Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg13() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession().createQuery("from Dept d where d.emps.size > 5").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

	/**
	 * ��ѯԱ����������5�Ĳ���
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void eg13_1() {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			List<Dept> list = HibernateUtil.currentSession().createQuery("from Dept d where size(d.emps) > 5").list();
			for (Dept dept : list) {
				System.out.println(dept.getDeptName());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}