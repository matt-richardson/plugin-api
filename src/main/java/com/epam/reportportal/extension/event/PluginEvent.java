/*
 * Copyright 2020 EPAM Systems
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

package com.epam.reportportal.extension.event;

import org.springframework.context.ApplicationEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class PluginEvent extends ApplicationEvent {

	private final String pluginId;
	private final String type;
	private final Map<String, Object> params;

	public PluginEvent(String pluginId, String type) {
		super(pluginId);
		this.pluginId = pluginId;
		this.type = type;
		this.params = new HashMap<>();
	}

	public PluginEvent(String pluginId, String type, Map<String, Object> params) {
		super(pluginId);
		this.pluginId = pluginId;
		this.type = type;
		this.params = params;
	}

	public String getPluginId() {
		return pluginId;
	}

	public String getType() {
		return type;
	}

	public Map<String, Object> getParams() {
		return params;
	}
}
