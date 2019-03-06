/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.epam.reportportal.extension.bugtracking;

import com.epam.ta.reportportal.entity.log.Log;
import com.google.common.collect.Multimap;

import java.util.List;
import java.util.Map;

/**
 * @author Andrei Varabyeu
 */
public class InternalTicket {

	private String summary;

	private String comments;

	private Multimap<String, String> fields;

	private List<LogEntry> logs;

	/**
	 * Item --> Item URL map
	 */
	private Map<Long, String> backLinks;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String value) {
		this.comments = value;
	}

	public Multimap<String, String> getFields() {
		return fields;
	}

	public void setFields(Multimap<String, String> fields) {
		this.fields = fields;
	}

	public List<LogEntry> getLogs() {
		return logs;
	}

	public void setLogs(List<LogEntry> logs) {
		this.logs = logs;
	}

	public Map<Long, String> getBackLinks() {
		return backLinks;
	}

	public void setBackLinks(Map<Long, String> backLinks) {
		this.backLinks = backLinks;
	}

	public static class LogEntry {
		private Long logId;
		private String message;
		private String fileId;
		private boolean hasAttachment;
		private boolean isIncludeLogs;

		public LogEntry(Long logId, boolean includeLogs) {
			this.logId = logId;
			this.isIncludeLogs = includeLogs;
		}

		public LogEntry(Long logId, boolean hasAttachment, boolean includeLogs) {
			this.logId = logId;
			this.hasAttachment = hasAttachment;
			this.isIncludeLogs = includeLogs;
		}

		public LogEntry(Long logId, String message, String fileId, boolean hasAttachment, boolean isIncludeLogs) {
			this.logId = logId;
			this.message = message;
			this.fileId = fileId;
			this.hasAttachment = hasAttachment;
			this.isIncludeLogs = isIncludeLogs;
		}

		public Long getLogId() {
			return logId;
		}

		public void setLogId(Long logId) {
			this.logId = logId;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getFileId() {
			return fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public boolean isHasAttachment() {
			return hasAttachment;
		}

		public void setHasAttachment(boolean hasAttachment) {
			this.hasAttachment = hasAttachment;
		}

		public boolean isIncludeLogs() {
			return isIncludeLogs;
		}

		public void setIncludeLogs(boolean includeLogs) {
			isIncludeLogs = includeLogs;
		}
	}
}