/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso;

/**
 * ISOFieldPackager Binary LL BCD NUM
 * Almost the same as IFB_LLBCD but len is encoded as a binary
 * value. A len of 16 is encoded as 0x10 instead of 0x16
 *
 * @author apr@cs.com.uy
 * @version $Id$
 * @see ISOComponent
 */
public class IFB_LLBCD extends ISOStringFieldPackager {
    public IFB_LLBCD() {
        super(NullPadder.INSTANCE, BCDInterpreter.RIGHT_PADDED, BinaryBCDPrefixer.B);
    }
    /**
     * @param len - field len
     * @param description symbolic descrption
     */
    public IFB_LLBCD(int len, String description, boolean pad) {
        super(len, description, NullPadder.INSTANCE,
                pad ? BCDInterpreter.LEFT_PADDED : BCDInterpreter.RIGHT_PADDED,
                BinaryBCDPrefixer.B);
        this.pad = pad;
        checkLength(len, 255);
    }

    public void setLength(int len)
    {
        checkLength(len, 255);
        super.setLength(len);
    }

    public void setPad(boolean pad) {
        this.pad = pad;
        setInterpreter(pad ? BCDInterpreter.LEFT_PADDED : BCDInterpreter.RIGHT_PADDED);
    }
}
