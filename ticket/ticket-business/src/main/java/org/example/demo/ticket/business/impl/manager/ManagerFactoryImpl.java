package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactoryImpl implements ManagerFactory {

    private ProjetManager projetManager;
    @Override
    public ProjetManager getProjetManager() {
        return this.projetManager;
    }
    @Override
    public void setProjetManager(ProjetManager projetManager){
        this.projetManager = projetManager;
    }


    private TicketManager ticketManager;
    @Override
    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
    @Override
    public void setTicketManager(TicketManager ticketManager){
        this.ticketManager = ticketManager;
    }
}
