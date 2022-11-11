package metier;

public class Porte implements IPorte{

    @Override
    public void ouvrir() {
        System.out.println("La porte est ouverte");
    }

    @Override
    public void fermer() {
        System.out.println("La porte est fermée");
    }
}
