public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(float av1, float av2) {
        super(av1, av2);
    }

    public boolean aprovado() {
        float media = super.calcularMedia();

        if(media < 6) {
            return false;
        } else {
            return true;
        }
    }
}
