package com.x.cms.assemble.control.jaxrs.templateform;

import com.x.base.core.project.exception.PromptException;

class ExceptionEmptyName extends PromptException {

	private static final long serialVersionUID = 6984800093761853101L;

	ExceptionEmptyName() {
		super("name can not be empty.");
	}

}
