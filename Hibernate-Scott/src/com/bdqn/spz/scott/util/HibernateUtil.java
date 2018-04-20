package com.bdqn.spz.scott.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
    private static Configuration configuration;
    private final static SessionFactory sessionFactory;
    
    static {
        try {
        	//��ȡ�����������ļ���ӳ���ļ�,Configuration�������Hibernate��������Ϣ
            configuration = new Configuration().configure();
            //����SessionFactory����
            sessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException e) {
        	e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    private HibernateUtil() {}

    //��Session
    public static Session currentSession() {
    	//��ʽһ
        return sessionFactory.getCurrentSession();
        //��ʽ��,����������Ҫsession.close�ر�
        //return sessionFactory.openSession(); 
    }
}