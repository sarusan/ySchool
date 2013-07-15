package org.yarlithub.yschool.model.obj.yschoolLite;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.model.obj.yschoolLite.Marks;
import org.yarlithub.yschool.model.obj.yschoolLite.iface.IExam;


/** 
 * Object mapping for hibernate-handled table: Exam.
 * @author autogenerated
 */

@Entity
@Table(name = "Exam", catalog = "yschool_lite", schema = "public")
public class Exam implements Cloneable, Serializable, IPojoGenEntity, IExam {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559009392L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private ClassSubject classSubjectIdclassSubject;
	/** Field mapping. */
	private Date date;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private Set<Marks> markss = new HashSet<Marks>();

	/** Field mapping. */
	private Integer term;
	/** Field mapping. */
	private Integer type;
	/** Field mapping. */
	private Date year;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Exam() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Exam(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param classSubjectIdclassSubject ClassSubject object;
	 * @param date Date object;
	 * @param id Integer object;
	 * @param term Integer object;
	 * @param type Integer object;
	 * @param year Date object;
	 */
	public Exam(ClassSubject classSubjectIdclassSubject, Date date, Integer id, 					
			Integer term, Integer type, Date year) {

		this.classSubjectIdclassSubject = classSubjectIdclassSubject;
		this.date = date;
		this.id = id;
		this.term = term;
		this.type = type;
		this.year = year;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Exam.class;
	}
 

    /**
     * Return the value associated with the column: classSubjectIdclassSubject.
	 * @return A ClassSubject object (this.classSubjectIdclassSubject)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Class_Subject_idClass_Subject", nullable = false )
	public ClassSubject getClassSubjectIdclassSubject() {
		return this.classSubjectIdclassSubject;
		
	}
	

  
    /**  
     * Set the value related to the column: classSubjectIdclassSubject.
	 * @param classSubjectIdclassSubject the classSubjectIdclassSubject value you wish to set
	 */
	public void setClassSubjectIdclassSubject(final ClassSubject classSubjectIdclassSubject) {
		this.classSubjectIdclassSubject = classSubjectIdclassSubject;
	}

    /**
     * Return the value associated with the column: date.
	 * @return A Date object (this.date)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Date getDate() {
		return this.date;
		
	}
	

  
    /**  
     * Set the value related to the column: date.
	 * @param date the date value you wish to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@Basic( optional = false )
	@Column( name = "idexam", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: marks.
	 * @return A Set&lt;Marks&gt; object (this.marks)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "examIdexam"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Marks> getMarkss() {
		return this.markss;
		
	}
	
	/**
	 * Adds a bi-directional link of type Marks to the markss set.
	 * @param marks item to add
	 */
	public void addMarks(Marks marks) {
		marks.setExamIdexam(this);
		this.markss.add(marks);
	}

  
    /**  
     * Set the value related to the column: marks.
	 * @param marks the marks value you wish to set
	 */
	public void setMarkss(final Set<Marks> marks) {
		this.markss = marks;
	}

    /**
     * Return the value associated with the column: term.
	 * @return A Integer object (this.term)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getTerm() {
		return this.term;
		
	}
	

  
    /**  
     * Set the value related to the column: term.
	 * @param term the term value you wish to set
	 */
	public void setTerm(final Integer term) {
		this.term = term;
	}

    /**
     * Return the value associated with the column: type.
	 * @return A Integer object (this.type)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getType() {
		return this.type;
		
	}
	

  
    /**  
     * Set the value related to the column: type.
	 * @param type the type value you wish to set
	 */
	public void setType(final Integer type) {
		this.type = type;
	}

    /**
     * Return the value associated with the column: year.
	 * @return A Date object (this.year)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Date getYear() {
		return this.year;
		
	}
	

  
    /**  
     * Set the value related to the column: year.
	 * @param year the year value you wish to set
	 */
	public void setYear(final Date year) {
		this.year = year;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Exam clone() throws CloneNotSupportedException {
		
        final Exam copy = (Exam)super.clone();

		copy.setClassSubjectIdclassSubject(this.getClassSubjectIdclassSubject());
		copy.setDate(this.getDate());
		copy.setId(this.getId());
		if (this.getMarkss() != null) {
			copy.getMarkss().addAll(this.getMarkss());
		}
		copy.setTerm(this.getTerm());
		copy.setType(this.getType());
		copy.setYear(this.getYear());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("date: " + this.getDate() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("term: " + this.getTerm() + ", ");
		sb.append("type: " + this.getType() + ", ");
		sb.append("year: " + this.getYear());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Exam that; 
		try {
			that = (Exam) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getClassSubjectIdclassSubject() == null) && (that.getClassSubjectIdclassSubject() == null)) || (getClassSubjectIdclassSubject() != null && getClassSubjectIdclassSubject().getId().equals(that.getClassSubjectIdclassSubject().getId())));	
		result = result && (((getDate() == null) && (that.getDate() == null)) || (getDate() != null && getDate().equals(that.getDate())));
		result = result && (((getTerm() == null) && (that.getTerm() == null)) || (getTerm() != null && getTerm().equals(that.getTerm())));
		result = result && (((getType() == null) && (that.getType() == null)) || (getType() != null && getType().equals(that.getType())));
		result = result && (((getYear() == null) && (that.getYear() == null)) || (getYear() != null && getYear().equals(that.getYear())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
