package org.yarlithub.yschool.model.dao.yschoolLite.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschoolLite.StudentHasOptionalsubjectPK;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschoolLite.StudentHasOptionalsubjectPKDao;
import java.io.Serializable;
 
/**
 * DAO for table: StudentHasOptionalsubjectPK.
 * @author autogenerated
 */
@Repository
public class StudentHasOptionalsubjectPKDaoImpl extends GenericHibernateDaoImpl<StudentHasOptionalsubjectPK, Serializable> implements StudentHasOptionalsubjectPKDao {
	
	/** Constructor method. */
		public StudentHasOptionalsubjectPKDaoImpl() {
			super(StudentHasOptionalsubjectPK.class);
		}
	}

