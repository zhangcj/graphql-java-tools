package graphql.kickstart.tools;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.language.FieldDefinition;

public interface PerFieldObjectMapperProvider {

    ObjectMapper provide(FieldDefinition fieldDefinition);
}
