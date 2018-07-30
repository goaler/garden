package org.goaler.garden.event;

import java.lang.annotation.Annotation;

import org.goaler.garden.annotation.AnnotationHandler;
import org.goaler.garden.annotation.AnnotationHandlerFactory;

public class GardenAnnHandler {

	private AnnotationHandlerFactory handlerFactory;
	
	public void handle(Annotation ann, Object bean) {
		AnnotationHandler handler = handlerFactory.getAnnotationHandler(ann);
		handler.handle(ann, bean);
	}
	
}
