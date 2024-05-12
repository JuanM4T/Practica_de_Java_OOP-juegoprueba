package Code;

public class Monstruo extends Entidad {

    //lista de posibles nombres para el monstruo
    private String[] listaNombresMonstruo = {"Limo", "Rana", "Trol", "Zombi", "Duende"};
    //no hay diferencia entre enemigos, simplemente el nombre se elegirá aleatoriamente
    private final String nombreMonstruo;
    private int monedasSoltadas;
    private int experienciaSoltada;

    public String nombreMonstruoAleatorio(String[] listaNombresMonstruo){
        //escogemos de manera aleatoria un nombre para el Monstruo
        return listaNombresMonstruo[(int) (Math.random() * listaNombresMonstruo.length)];
    }

    public Monstruo (int vidaBase, int dano, int velocidad){
        super(vidaBase, dano, velocidad);

        this.nombreMonstruo = nombreMonstruoAleatorio(listaNombresMonstruo);
        this.monedasSoltadas = actualizarMonedasSoltadas();
        this.experienciaSoltada = actualizarMonedasSoltadas();
    }

    public String getNombreMonstruo() {
        return nombreMonstruo;
    }

    public int getMonedasSoltadas() {
        return this.monedasSoltadas;
    }

    public void setMonedasSoltadas(int monedasSoltadas){
        this.monedasSoltadas = monedasSoltadas;
    }

    public int getExperienciaSoltada(){
        return this.experienciaSoltada;
    }

    public void setExperienciaSoltada(int experienciaSoltada){
        this.experienciaSoltada = experienciaSoltada;
    }

    public int actualizarMonedasSoltadas(){
        return getMonedasSoltadas() + (int) (getNivel() * 1.1);
    }

    public int actualizarExperienciaSoltada(){
        return getMonedasSoltadas() + (int) (getNivel() * 2) + 10;
    }

    public void incrementoEstadisticas(){
        setDano(getDano() + (int) (getNivel() * 1.1));
        setVidaBase(getVidaBase() + (int) (getNivel() * 0.9) + 1);
        setVelocidad(getVelocidad() + (float) (getNivel() * 0.1));
    }

    public void subirNivel(){
        //actualizar monedas y exp soltadas + todo lo otro

    }

    public void atacar(Entidad objetivo){

    }
}