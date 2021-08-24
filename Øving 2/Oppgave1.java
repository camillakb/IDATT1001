import javax.swing.JOptionPane;

class Oppgave1 {
    public static void main(String [] args){
        String årstallLest = JOptionPane.showInputDialog("Årstall");

        int skuddårLest = Integer.parseInt(årstallLest);

        if (skuddårLest % 4 == 0) {
            if (skuddårLest % 100 == 0) {
                if (skuddårLest % 400 == 0) {
                    System.out.println(årstallLest + " er et skuddår!");
                } else {
                    System.out.println(årstallLest + " er ikke et skuddår!");
                }
            } else {
                System.out.println(årstallLest + " er et skuddår!");
            }
        } else {
            System.out.println(årstallLest + " er ikke et skuddår!");
        }
    }
}