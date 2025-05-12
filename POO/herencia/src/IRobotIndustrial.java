public class IRobotIndustrial extends IRobotBase {

    private double capacidadcarga;

    public void realizarTarea(){
        System.out.println("Levantando cosas");
    }

    @Override
    public void mover(){
        System.out.println("Mover RobotIndustrial");//Se sobreescribe el metodo "mover"
        super.mover();//Para imprimir lo que tenía el metodo "mover" originalmente
    }
}
