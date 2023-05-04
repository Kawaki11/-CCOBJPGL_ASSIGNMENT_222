package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("otw Mercury");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("otw Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("otw Earth");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("otw Mars");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("otw Jupiter");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("otw Saturn");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("otw Uranus");
    }

    @Override
    public void visit(Neptune neptuneuranus) {
        System.out.println("otw Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("otw Pluto");
     }
}