package org.example.demo.ticket.business.contract.manager;

public interface ManagerFactory {
    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager projetManager);

    TicketManager getTicketManager();

    void setTicketManager(TicketManager ticketManager);
}
