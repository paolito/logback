/**
 * Logback: the generic, reliable, fast and flexible logging framework.
 * 
 * Copyright (C) 1999-2006, QOS.ch
 * 
 * This library is free software, you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation.
 */
package ch.qos.logback.core.joran.action.ext;



import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;



public class BadEndAction extends Action {


  public void begin(InterpretationContext ec, String name, Attributes attributes) {
  }

  public void end(InterpretationContext ec, String name) {
    throw new IllegalStateException("bad end");
  }
}