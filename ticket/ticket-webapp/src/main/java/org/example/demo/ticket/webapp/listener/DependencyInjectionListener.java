package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.impl.manager.ManagerFactoryImpl;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class DependencyInjectionListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Création de l'instance de ManagerFactory
        ManagerFactoryImpl vManagerFactory = new ManagerFactoryImpl();
        //Injection de Dépendances
        vManagerFactory.setProjetManager(new ProjetManagerImpl());//Le seul endroit où l'on utilise l'implémentation
        vManagerFactory.setTicketManager(new TicketManagerImpl());
        // Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
