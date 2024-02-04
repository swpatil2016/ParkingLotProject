package Stratorgies;

import Modules.SlotAllotmentStrategyType;

public class FactoryForSpotAssignment {
    public static SlotAssignmentStrategy getSlotForType(SlotAllotmentStrategyType slotAllotmentStrategyType) {
        return new RandomSpotAssign();
    }
}
