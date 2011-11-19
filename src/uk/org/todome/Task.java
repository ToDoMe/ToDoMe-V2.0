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

@DatabaseTable(tableName = "tasks")
public class Task implements Comparable<Task> {

	public final static String ID_FIELD_NAME = "id";
	public final static String NAME_FIELD_NAME = "name";
	public final static String NOTES_FIELD_NAME = "notes";
	public final static String TAGS_FIELD_NAME = "tags";
	public final static String COMPLETE_FIELD_NAME = "complete";

	@DatabaseField(id = true)
	private int id;
	@DatabaseField(canBeNull = false)
	private String name;
	@DatabaseField(canBeNull = true)
	private String notes;
	@DatabaseField(canBeNull = false)
	private boolean complete;

	public Task() {
	}

	public Task(int id, String name, String notes, boolean complete) {
		this.id = id;
		this.name = name;
		this.notes = notes;
		this.complete = complete;
	}

	public String toString() {
		return name;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int compareTo(Task another) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Task clone() {
		return new Task(id, name, notes, complete);
	}

}
