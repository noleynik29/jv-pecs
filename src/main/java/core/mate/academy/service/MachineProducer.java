package core.mate.academy.service;

import core.mate.academy.model.Machine;

import javax.crypto.Mac;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<T> get();
}
