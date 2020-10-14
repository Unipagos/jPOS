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

package org.jpos.tlv.packager;

import org.jpos.iso.IFE_NUMERIC;
import org.jpos.iso.ISOFieldPackager;

/**
 * @author Vishnu Pillai
 */
public class IFTE_NUMERIC extends IFE_NUMERIC implements TaggedFieldPackager {
    private String token;

    public void setToken(String token) { this.token = token; }
    public String getToken() { return token; }

    public ISOFieldPackager getDelegate() { return (ISOFieldPackager)this; }
}
