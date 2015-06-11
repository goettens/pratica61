
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
        
        Time time1 = new Time();
        Time time2 = new Time();
        
        time1.addJogador("Meio Campo", new Jogador(2,"Jailson"));
        time1.addJogador("Zagueiro", new Jogador(7,"Jairson"));
        time1.addJogador("Atacante", new Jogador(11,"Jaisson"));
        
        time2.addJogador("Zagueiro", new Jogador(2,"Roberson"));
        time2.addJogador("Meio Campo", new Jogador(9,"Robervaldo"));
        time2.addJogador("Atacante", new Jogador(10,"Robernilson"));
        
        System.out.println("Posição"+"\t\t"+"Time 1"+"\t\t"+"Time 2");
        for (int i = 0; i < time1.getJogadores().keySet().size(); i++) {
            for (int j = 0; j < time2.getJogadores().keySet().size(); j++) {
                if(time1.getJogadores().keySet().toArray()[i].equals(time2.getJogadores().keySet().toArray()[j])){
                    String s = time1.getJogadores().keySet().toArray()[i].toString();
                    System.out.print(time1.getJogadores().keySet().toArray()[i].toString());
                    System.out.print("\t");
                    System.out.print(time1.getJogadores().get(s).toString());
                    System.out.print("\t");
                    System.out.println(time2.getJogadores().get(s).toString());
                }
            }
            
        }
    }
}
