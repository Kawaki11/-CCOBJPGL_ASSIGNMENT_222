package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("dito na ako Mercury");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("dito na ako Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("dito na ako Earth");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("dito na ako Mars");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("dito na ako Jupiter");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("dito na ako Saturn");
    }
    @Override
    public void visit(Uranus uranus) {
        System.out.println("dito na ako Uranus");
    }
    @Override
    public void visit(Neptune neptune) {
        System.out.println("dito na ako Neptune");
    }
    @Override
    public void visit(Pluto pluto) {
        System.out.println("dito na ako Pluto");

}

}
