package entities;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer months;

//	public Financing() {
//
//	}

	public Financing(Double totalAmount, Double income, Integer months) {
		financingVerification(totalAmount, income, months);

		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		financingVerification(totalAmount, income, months);
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		financingVerification(totalAmount, income, months);
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		financingVerification(totalAmount, income, months);
		this.months = months;
	}

	public double entry() {
		return this.totalAmount * 0.2;
	}

	public double quota() {
		return (this.totalAmount - entry()) / months;
	}

	public void financingVerification(Double totalAmount, Double income, Integer months) {
		if ((totalAmount * 0.2) / months > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
	}

}
