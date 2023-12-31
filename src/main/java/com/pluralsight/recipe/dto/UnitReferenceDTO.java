package com.pluralsight.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitReferenceDTO {

	private Long id;
	private String lang;
	private String name;
	private String symbol;
	private String description;

}
