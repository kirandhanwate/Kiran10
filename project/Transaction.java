package bancking.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Transaction {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int Trans_no;

	private Double Debited_Amount;
	private Double Withdraw_Amount;
	@OneToOne
	private Account account;
}
