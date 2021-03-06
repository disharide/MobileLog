package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name = "PHONE_LOG")
public class PhoneLog extends RootEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PHONE_NUMBER")
	public String phoneNumber;

	public String duration;

	public CommunicationType type;

	public CommunicationStatus status;

	@ManyToOne
	public ChildUser user;

	@Column(name = "TIME_IN_MILLIS")
	public Long timeInMillis;

	public static Model.Finder<Long, PhoneLog> find = new Finder<>(
			PhoneLog.class);
}
