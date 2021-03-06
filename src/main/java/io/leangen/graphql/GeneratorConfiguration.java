package io.leangen.graphql;

import io.leangen.graphql.generator.mapping.strategy.InterfaceMappingStrategy;
import io.leangen.graphql.metadata.strategy.type.TypeTransformer;
import io.leangen.graphql.metadata.strategy.value.ScalarDeserializationStrategy;

@SuppressWarnings("WeakerAccess")
public class GeneratorConfiguration {
    public final InterfaceMappingStrategy interfaceMappingStrategy;
    public final ScalarDeserializationStrategy scalarDeserializationStrategy;
    public final TypeTransformer typeTransformer;
    public final String[] basePackages;

    GeneratorConfiguration(InterfaceMappingStrategy interfaceMappingStrategy, ScalarDeserializationStrategy scalarDeserializationStrategy, TypeTransformer typeTransformer, String[] basePackages) {
        this.interfaceMappingStrategy = interfaceMappingStrategy;
        this.scalarDeserializationStrategy = scalarDeserializationStrategy;
        this.typeTransformer = typeTransformer;
        this.basePackages = basePackages;
    }
}
