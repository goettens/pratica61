
import utfpr.ct.dainf.if62c.pratica.Time;
import utfpr.ct.dainf.if62c.pratica.Jogador;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
        
        Time tabajara = new Time();
        Time pelezios = new Time();
        
        tabajara.addJogador("Meio Campo", new Jogador(2,"Jailson"));
        tabajara.addJogador("Zagueiro", new Jogador(7,"Jairson"));
        tabajara.addJogador("Atacante", new Jogador(11,"Jaisson"));
        
        pelezios.addJogador("Zagueiro", new Jogador(2,"Roberson"));
        pelezios.addJogador("Meio Campo", new Jogador(9,"Robervaldo"));
        pelezios.addJogador("Atacante", new Jogador(10,"Robernilson"));
        
        System.out.println("Posição"+"\t\t"+"tabajara"+"\t"+"pelezios");
        for (int i = 0; i < tabajara.getJogadores().keySet().size(); i++) {
            for (int j = 0; j < pelezios.getJogadores().keySet().size(); j++) {
                if(tabajara.getJogadores().keySet().toArray()[i].equals(pelezios.getJogadores().keySet().toArray()[j])){
                    String s = tabajara.getJogadores().keySet().toArray()[i].toString();
                    System.out.print(tabajara.getJogadores().keySet().toArray()[i].toString());
                    System.out.print("\t");
                    System.out.print(tabajara.getJogadores().get(s).toString());
                    System.out.print("\t");
                    System.out.println(pelezios.getJogadores().get(s).toString());
                }
            }
            
        }
    }
}
