package io.github.nicolasyazman.simplebank.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "beneficiaries")
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer beneficiaryId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_beneficiaries_users"))
    private User user;

    @Column(name = "beneficiary_name", length = 100, nullable = false)
    private String beneficiaryName;

    @Column(name = "beneficiary_account_number", length = 20, nullable = false)
    private String beneficiaryAccountNumber;

    @Column(name = "bank_name", length = 100, nullable = false)
    private String bankName;

    @Column(name = "added_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private LocalDateTime addedDate = LocalDateTime.now();

    // Constructors
    public Beneficiary() {}

    public Beneficiary(User user, String beneficiaryName, String beneficiaryAccountNumber, String bankName) {
        this.user = user;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
        this.bankName = bankName;
        this.addedDate = LocalDateTime.now();
    }

    // Getters and Setters
    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryAccountNumber() {
        return beneficiaryAccountNumber;
    }

    public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }
}
