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

package org.red5.server.api.stream;

import java.util.Map;
import org.red5.server.api.statistics.IClientBroadcastStreamStatistics;

/**
 * A broadcast stream that comes from client.
 * 
 * @author The Red5 Project (red5@osflash.org)
 * @author Steven Gong (steven.gong@gmail.com)
 * @author Paul Gregoire (mondain@gmail.com)
 */
public interface IClientBroadcastStream extends IClientStream, IBroadcastStream {

	/**
	 * Notify client that stream is ready for publishing.
	 */
	public void startPublishing();
	
	/**
	 * Return statistics about the stream.
	 * 
	 * @return statistics
	 */
	public IClientBroadcastStreamStatistics getStatistics();

	/**
	 * Sets streaming parameters as supplied by the publishing application.
	 * 
	 * @param params
	 */
	public void setParameters(Map<String, String> params);
	
	/**
	 * Returns streaming parameters.
	 * 
	 * @return parameters
	 */
	public Map<String, String> getParameters();
	
}
