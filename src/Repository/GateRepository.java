package Repository;

import Modules.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    // we Are not using actual DB we use mock database by map.

    private Map<Long, Gate> gates = new HashMap<>();
    public Optional<Gate> FindGateById(Long id){

        if(gates.containsKey(id)){
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
