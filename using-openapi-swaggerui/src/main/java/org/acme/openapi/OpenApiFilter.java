package org.acme.openapi;

import org.eclipse.microprofile.openapi.OASFilter;
import org.eclipse.microprofile.openapi.models.media.Schema;

public class OpenApiFilter implements OASFilter {

	@Override
	public Schema filterSchema(Schema schema) {
		schema.setDescription("test");
		return schema;
	}
	
}
