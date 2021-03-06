/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package edu.fst.m2.ipii.carpooling.domaine.bo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="PointEmbarquement")
public class PointEmbarquement implements Serializable {
	public PointEmbarquement() {
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EDU_FST_M2_IPII_CARPOOLING_DOMAINE_BO_POINTEMBARQUEMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EDU_FST_M2_IPII_CARPOOLING_DOMAINE_BO_POINTEMBARQUEMENT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=Reservation.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ReservationID", nullable=false) })	
	private Reservation reservation;
	
	@Column(name="Latitude", nullable=true)	
	private Double latitude;
	
	@Column(name="Longitude", nullable=true)	
	private Double longitude;

	@Column(name="Libelle", nullable=true)
	private String libelle;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setLatitude(double value) {
		setLatitude(new Double(value));
	}
	
	public void setLatitude(Double value) {
		this.latitude = value;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double value) {
		setLongitude(new Double(value));
	}
	
	public void setLongitude(Double value) {
		this.longitude = value;
	}
	
	public Double getLongitude() {
		return longitude;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setReservation(Reservation value) {
		this.reservation = value;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
