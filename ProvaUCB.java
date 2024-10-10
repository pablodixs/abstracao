public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(float av1, float av2) {
        super(av1, av2);
    }

    public boolean aprovado() {
        float media = super.calcularMedia();

        if(media < 7) {
            return false;
        } else {
            return true;
        }
    }
}
