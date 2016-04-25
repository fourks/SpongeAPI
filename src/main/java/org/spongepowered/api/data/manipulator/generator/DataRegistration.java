package org.spongepowered.api.data.manipulator.generator;

import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.DataManipulatorBuilder;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;

public class DataRegistration<T extends DataManipulator<T, I>, I extends ImmutableDataManipulator<I, T>> {

    private final Class<T> superManipulator;
    private final Class<? extends T> generatedImplClass;
    private final Class<I> superImmutable;
    private final Class<? extends I> generatedImmutable;
    private final Class<? extends DataManipulatorBuilder<T, I>> builderClass;

    DataRegistration(Class<T> superManipulator, Class<? extends T> generatedImplClass, Class<I> superImmutable, Class<? extends I> generatedImmutable, Class<? extends DataManipulatorBuilder<T, I>> builder) {
        this.superManipulator = superManipulator;
        this.generatedImplClass = generatedImplClass;
        this.superImmutable = superImmutable;
        this.generatedImmutable = generatedImmutable;
        this.builderClass = builder;
    }

    public Class<T> getSuperManipulator() {
        return this.superManipulator;
    }

    public Class<? extends T> getGeneratedImplClass() {
        return this.generatedImplClass;
    }

    public Class<I> getSuperImmutable() {
        return this.superImmutable;
    }

    public Class<? extends I> getGeneratedImmutable() {
        return this.generatedImmutable;
    }

    public Class<? extends DataManipulatorBuilder<T, I>> getBuilderClass() {
        return this.builderClass;
    }


}
