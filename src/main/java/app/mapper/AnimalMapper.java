package app.mapper;

import app.dto.Animal;
import app.entities.AnimalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalMapper {
    AnimalEntity AnimalToAnimalEntity(Animal amimal);
}
