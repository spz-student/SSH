<?xml version="1.0" encoding="UTF-8"?>
<beans
	xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
	
<!-- 
      desc: sping ico transaction
      template version: 1.0
      author:  zyf
      date  :  2010-01-20
 -->
	
	<bean id="SessionFactory"
		class="org.springframework.orm.hibernate3.LocalSessionFactoryBean">
		<property name="dataSource">
			<ref bean="dataSource" />
		</property>
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">
					org.hibernate.dialect.MySQLDialect
				</prop>
			</props>
		</property>
		<property name="mappingResources">
			<list>
		<#list xmlfile as o>
			<value>${o.hbmFile}</value>
		</#list>
			</list>
		</property>
	</bean>
</beans>