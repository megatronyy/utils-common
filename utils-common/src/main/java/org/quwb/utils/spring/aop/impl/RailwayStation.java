package org.quwb.utils.spring.aop.impl;

import org.quwb.utils.spring.aop.inter.TicketService;

public class RailwayStation implements TicketService {
    @Override
    public void sellTicket() {
        System.out.println("售票............");
    }

    @Override
    public void inquire() {
        System.out.println("问询............");
    }

    @Override
    public void withdraw() {
        System.out.println("退票............");
    }
}
