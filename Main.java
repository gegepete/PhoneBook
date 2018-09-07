import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr);
        ){
            String cmd;
            while(true) {
                System.out.println("Comanda dvs: ");
                cmd = cons.readLine();
                String[] v = cmd.split("\\s+");
                
                switch(v[0]) {
                    case "exit":
                        System.out.println("Se inchide aplicatia..");
                        return;
                    case "adauga":
                        Agenda.getInstance().adaugaContact(new Contact(v[1], v[2], v[3], v[4]));
                        System.out.println("Contactul a fost adaugat!");
                        break;
                    case "afiseaza":
                        Agenda.getInstance().afiseazaContacte();
                        break;
                    case "sterge":
                        Agenda.getInstance().stergeContact(Integer.parseInt(v[1]));
                        break;
                    default :
                        System.out.println("Nu exista aceasta comanda!");
                        break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}