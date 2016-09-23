package fr.intech.s5.tphibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "compte")
public class Compte{
	@Id
	@Column(name="NBCPT", nullable = false)
	private long numeroCompte;
	
	@Column(name="SOLDE")
	private double solde;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_client")
	private Client client;
	
	/**
	 * @return the numeroCompte
	 */
	
	public long getNumberCompte() {
		return numeroCompte;
	}
	
}
