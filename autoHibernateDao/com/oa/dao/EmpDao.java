package com.oa.dao;


import java.util.*;
import java.sql.*;

public interface EmpDao{
       /**
	    * Constructer of this class ;
	    * ���ߣ�zyf
	    * ��дʱ�䣺2010.1.16
	    * ģ�����ͣ�DAOģ�壬1.0��
	    */

    public abstract void insert(Emp vo) throws Exception;
    public abstract void modify(Emp vo) throws Exception;
    public abstract void remove(Emp vo) throws Exception;
    public List queryForPage(final String hql,final int offset,final int length,boolean is)throws Exception;
    public List query(Emp vo)throws Exception;
//------------------------------------------------------------
}
