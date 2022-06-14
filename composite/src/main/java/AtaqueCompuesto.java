import java.util.ArrayList;
import java.util.List;

public class AtaqueCompuesto extends Ataque {

    private final List<Ataque> ataqueList;

    public AtaqueCompuesto() {
        this.ataqueList = new ArrayList<>();
    }

    @Override
    public void execute() {
        this.ataqueList.forEach(Ataque::execute);
    }

    @Override
    public void add(Ataque ataque) {
        this.ataqueList.add(ataque);
    }

    @Override
    public void remove(Ataque ataque) {
        this.ataqueList.remove(ataque);
    }
}
