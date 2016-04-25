package org.spongepowered.api.data.manipulator.generator;

import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.meta.ItemEnchantment;
import org.spongepowered.api.data.value.mutable.Value;

@CustomData(values = {@DataValue(type = Integer.class, query = "myInt")})
public interface DummyManipulator extends DataManipulator<DummyManipulator, ImmutableDummyManipulator> {

    @KeyValue("myInt")
    Value<Integer> myInt();

    @KeyValue("myEnchantment")
    Value<ItemEnchantment> enchantment();

    @KeyValue("myInt")
    int myIntValue();

    @KeyValue("myInt")
    void setMyInt(int value);

    @KeyValue("myEnchantment")
    ItemEnchantment getEnchantment();

}
