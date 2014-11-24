/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2012 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.io.flv.impl;

import java.io.File;
import java.io.IOException;

import org.red5.io.BaseStreamableFileService;
import org.red5.io.IStreamableFile;
import org.red5.io.flv.IFLVService;
import org.red5.io.object.Deserializer;
import org.red5.io.object.Serializer;

/**
 * A FLVServiceImpl sets up the service and hands out FLV objects to 
 * its callers.
 * 
 * @author The Red5 Project (red5@osflash.org)
 * @author Dominick Accattato (daccattato@gmail.com)
 * @author Luke Hubbard, Codegent Ltd (luke@codegent.com)
 * @author Paul Gregoire (mondain@gmail.com)
 */
public class FLVService extends BaseStreamableFileService implements IFLVService {

	/**
	 * Serializer
	 */
	private Serializer serializer;

	/**
	 * Deserializer
	 */
	private Deserializer deserializer;

	/**
	 * Generate FLV metadata?
	 */
	private boolean generateMetadata;

	/** {@inheritDoc} */
	@Override
	public String getPrefix() {
		return "flv";
	}

	/** {@inheritDoc} */
	@Override
	public String getExtension() {
		return ".flv";
	}

	/** 
	 * {@inheritDoc}
	 */
	public void setSerializer(Serializer serializer) {
		this.serializer = serializer;

	}

	/** {@inheritDoc}
	 */
	public void setDeserializer(Deserializer deserializer) {
		this.deserializer = deserializer;

	}

	/** {@inheritDoc}
	 */
	@Override
	public IStreamableFile getStreamableFile(File file) throws IOException {
		return new FLV(file, generateMetadata);
	}

	/**
	 * Generate metadata or not
	 *
	 * @param generate  <code>true</code> if there's need to generate metadata, <code>false</code> otherwise
	 */
	public void setGenerateMetadata(boolean generate) {
		generateMetadata = generate;
	}

	/**
	 * Getter for serializer
	 *
	 * @return  Serializer
	 */
	public Serializer getSerializer() {
		return serializer;
	}

	/**
	 * Getter for deserializer
	 *
	 * @return  Deserializer
	 */
	public Deserializer getDeserializer() {
		return deserializer;
	}
}
