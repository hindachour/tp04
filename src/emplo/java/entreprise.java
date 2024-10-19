package emplo.java;

public class entreprise {
    public static void main(String[] args) {
        salaire[] tabSalarie = new salaire[5];

        tabSalarie[0] = new employe(12345, 2002, "Walid", 15, 4);
        tabSalarie[1] = new vendeur(23445, 2007, "Yessine", 1000, 0.1);
        tabSalarie[2] = new vendeur(65478, 2000, "Nassime", 700, 0.1);
        tabSalarie[3] = new employe(87698, 2003, "Aymen", 19, 5);
        tabSalarie[4] = new employe(12345, 2008, "Khaled", 7, 4);

        // 3.1 Display Employees
        System.out.println("******************************** Liste des Employés *****************************");
        for (salaire salarie : tabSalarie) {
            if (salarie instanceof employe) {
                employe employe = (employe) salarie;
                employe.affiche();
            }
        }
        System.out.println("****************************************************************************");

        // 3.2 Display Vendeurs
        System.out.println("********************************** Liste des Vendeurs ***************************");
        for (salaire salarie : tabSalarie) {
            if (salarie instanceof vendeur) {
                vendeur vendeur = (vendeur) salarie;
                vendeur.affiche();
            }
        }
        System.out.println("****************************************************************************");

        // 3.3 Oldest Employee
        salaire ancien= tabSalarie[0];
        for (salaire salarie : tabSalarie) {
            if (salarie.getRecrutement() < ancien.getRecrutement()) {
                ancien = salarie;
            }
        }
        System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");
        System.out.println("Nom: " +ancien.getNom() + " recruté en l’an " +ancien.getRecrutement());
        System.out.println("****************************************************************************");

       
               
            
        }
    }
                    
