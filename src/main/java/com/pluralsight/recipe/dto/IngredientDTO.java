package com.pluralsight.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDTO {

	private Long id;
	private String lang;
	private Double quantity;
	private Long recipeId;
	private UnitReferenceDTO unitRef;
	private IngredientReferenceDTO ingredientRef;
}
