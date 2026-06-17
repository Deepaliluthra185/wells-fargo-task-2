package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    // This connects the portfolio to its unique owner client (One-to-One)
    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    // Default constructor required by JPA
    public Portfolio() {
    }

    // Constructor to initialize the client
    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters and Setters
    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;

    }

}