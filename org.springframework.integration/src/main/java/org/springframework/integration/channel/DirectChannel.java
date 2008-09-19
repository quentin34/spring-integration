/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.channel;

import org.springframework.integration.dispatcher.SimpleDispatcher;
import org.springframework.integration.endpoint.MessageEndpoint;

/**
 * A channel that invokes the subscribed {@link MessageEndpoint endpoint(s)}
 * in the sender's thread (returning after at most one accepts the message).
 * 
 * @author Dave Syer
 * @author Mark Fisher
 */
public class DirectChannel extends AbstractSubscribableChannel<SimpleDispatcher> {

	public DirectChannel() {
		super(new SimpleDispatcher());
	}

}
