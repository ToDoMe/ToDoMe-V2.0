/*
 * Copyright (C) 2011  Chris Baines
 * Copyright (C) 2011  Rebecca Brannum
 * Copyright (C) 2011  Harry Cutts
 * Copyright (C) 2011  John Preston
 * Copyright (C) 2011  James Robinson
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package uk.org.todome;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "tasksTagLinks")
public class TaskTagLink {

	public final static String TASK_ID_FIELD_NAME = "task_id";
	public final static String TAG_ID_FIELD_NAME = "tag_id";

	@DatabaseField(generatedId = true)
	int id;

	@DatabaseField(foreign = true, columnName = TASK_ID_FIELD_NAME)
	Task task;

	@DatabaseField(foreign = true, columnName = TAG_ID_FIELD_NAME)
	Tag tag;

	TaskTagLink() {
	}

	public TaskTagLink(Task task, Tag tag) {
		this.task = task;
		this.tag = tag;
	}
}
