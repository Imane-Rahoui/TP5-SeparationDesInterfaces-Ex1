package metier;

public class PorteSécurisé implements IPorte,IPorteSecurisé{
    @Override
    public void ouvrir() {
        System.out.println("La porte Séc est ouverte");
    }

    @Override
    public void fermer() {
        System.out.println("La porte Séc est fermée");
    }

    @Override
    public void alert() {
        System.out.println("Veuillez fermer la porte");
        int beepCount=10;
        for (int i=0;i<beepCount;i++)
        {
            java.awt.Toolkit.getDefaultToolkit().beep();
            {
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException ex)
                {
                    System.out.println("waaaa");
                }
            }
        }
    }
}
