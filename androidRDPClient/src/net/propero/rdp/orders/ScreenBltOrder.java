/* ScreenBltOrder.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision: 12 $
 * Author: $Author: miha_vitorovic $
 * Date: $Date: 2007-05-11 19:49:09 +0800 (五, 2007-05-11) $
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: 
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 * 
 * (See gpl.txt for details of the GNU General Public License.)
 * 
 */
package net.propero.rdp.orders;

public class ScreenBltOrder extends DestBltOrder {

	private int srcx = 0;

	private int srcy = 0;

	public ScreenBltOrder() {
		super();
	}

	public int getSrcX() {
		return this.srcx;
	}

	public int getSrcY() {
		return this.srcy;
	}

	public void setSrcX(int srcx) {
		this.srcx = srcx;
	}

	public void setSrcY(int srcy) {
		this.srcy = srcy;
	}

	public void reset() {
		super.reset();
		srcx = 0;
		srcy = 0;
	}
}
