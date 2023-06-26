package org.unijorge.core;

import java.util.ArrayList;

public class Arena {
    private Pokemon p1;
    private Pokemon p2;
    private ArrayList<Pokemon> arPokemon = new ArrayList<Pokemon>();

    public Arena (Pokemon p1,  Pokemon p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    //calcula internamente de quem vai ser o turno 
    //usa o metodo de determinar o atacante e o oponente
    //e coloca no array a posicao 1 sempre sera o atacante a posicao
    //2 sera do oponente
    private void turno(){
         Pokemon p = determinaAtacanteOponente();
         if (p.equals(p1)){
            arPokemon.add(p1);
            arPokemon.add(p2);
         }else{
            arPokemon.add(p2);
            arPokemon.add(p1);
         }
    }

    public void iniciativa(Pokemon p1, Pokemon p2){
        if (p1.getSpd() > p2.getSpd()){
            System.out.println("Pokemon 1 inicia primeiro");
        }else if(p1.getSpd() == p2.getSpd()){
            System.out.println("Empate");
        }else{
            System.out.println("Pokemon 2 inicia primeiro");
        }
    }
    public void iniciativa(){
        if (p1.getSpd() > p2.getSpd()){
            System.out.println("Pokemon 1 inicia primeiro");
        }else if(p1.getSpd() == p2.getSpd()){
            System.out.println("Empate");
        }else{
            System.out.println("Pokemon 2 inicia primeiro");
        }
    }

    //determina o atacante e oponente, se forem mexer no calculo mexam 
    //na iniciativa mas nao mudem o nome do metodo
    private Pokemon determinaAtacanteOponente(){
        if (p1.getIniciativa() > p2.getIniciativa()){
            return p1;
        }else{
            return p2;
        }

    }

    //calculo do acerto usando o arraylist posicao 1 atacante 2 oponente
    private int calcularAcerto(){
        return (int) arPokemon.get(0).getAtk().getpBaseAtaque() * (arPokemon.get(0).getAcuracia()/arPokemon.get(1).getEvasao());
    }

    //como vai ser o dano?
    private int calculaDano(){
        int acerto = calcularAcerto();
        if(acerto > 50){
            //int dano = 
        }
        return 0;
    }


    public void start(){
        iniciativa();

    }



}
