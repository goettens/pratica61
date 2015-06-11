
import utfpr.dainf.if62c.pratica.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(2,"Jailson");
        Jogador j2 = new Jogador(7,"Jairson");
        Jogador j3 = new Jogador(11,"Jaisson");
        
        Jogador j4 = new Jogador(2,"Roberson");
        Jogador j5 = new Jogador(9,"Robervaldo");
        Jogador j6 = new Jogador(10,"Robernilson");
        
        Time tabajara = new Time();
        Time pelezios = new Time();
        
        tabajara.addJogador("Meio Campo", j1);
        tabajara.addJogador("Zagueiro", j2);
        tabajara.addJogador("Atacante", j3);
        
        pelezios.addJogador("Zagueiro", j4);
        pelezios.addJogador("Meio Campo", j5);
        pelezios.addJogador("Atacante", j6);
        
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
