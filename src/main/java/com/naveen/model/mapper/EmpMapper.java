package com.naveen.model.mapper;

import com.naveen.entity.Emp;
import com.naveen.model.dto.EmpDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EmpMapper {
    EmpMapper empMapper = Mappers.getMapper(EmpMapper.class);

    EmpDto toDto(Emp emp);
    Emp toEntity(EmpDto empDto);

    List<EmpDto> toDtoList(List<Emp> emps);
    List<Emp> toEntityList(List<EmpDto> empDtos);

}
