package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.dto.Editorial;
import com.credibanco.assessment.library.model.EditorialEntity;

public interface EditorialService {
	
	public Editorial registrarEditorial(Editorial editorialDto);

	public EditorialEntity buscarEditorial(Long id_editorial);

	public List<Editorial> listarEditoriales();

}
