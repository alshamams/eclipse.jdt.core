package org.eclipse.jdt.internal.core;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved.
 */
import org.eclipse.core.resources.*;

/** 
 *Element info for IMember elements. 
 */
/* package */ abstract class MemberElementInfo extends SourceRefElementInfo {
	/**
	 * The modifiers associated with this member.
	 *
	 * @see IConstants
	 */
	protected int flags;

	/**
	 * The start position of this member's name in the its
	 * openable's buffer.
	 */
	protected int nameStart= -1;

	/**
	 * The last position of this member's name in the its
	 * openable's buffer.
	 */
	protected int nameEnd= -1;

	/**
	 * This member's name
	 */
	protected char[] name;
	/**
	 * @see org.eclipse.jdt.internal.compiler.env.IGenericType#getModifiers()
	 * @see org.eclipse.jdt.internal.compiler.env.IGenericMethod#getModifiers()
	 * @see org.eclipse.jdt.internal.compiler.env.IGenericField#getModifiers()
	 */
	public int getModifiers() {
		return this.flags;
	}
	/**
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceType#getName()
	 */
	public char[] getName() {
		return this.name;
	}
	/**
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceType#getNameSourceEnd()
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceMethod#getNameSourceEnd()
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceField#getNameSourceEnd()
	 */
	public int getNameSourceEnd() {
		return this.nameEnd;
	}
	/**
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceType#getNameSourceStart()
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceMethod#getNameSourceStart()
	 * @see org.eclipse.jdt.internal.compiler.env.ISourceField#getNameSourceStart()
	 */
	public int getNameSourceStart() {
		return this.nameStart;
	}
	protected void setFlags(int flags) {
		this.flags = flags;
	}
	/**
	 * Sets this member's name
	 */
	protected void setName(char[] name) {
		this.name= name;
	}
	/**
	 * Sets the last position of this member's name, relative
	 * to its openable's source buffer.
	 */
	protected void setNameSourceEnd(int end) {
		this.nameEnd= end;
	}
	/**
	 * Sets the start position of this member's name, relative
	 * to its openable's source buffer.
	 */
	protected void setNameSourceStart(int start) {
		this.nameStart= start;
	}
}
