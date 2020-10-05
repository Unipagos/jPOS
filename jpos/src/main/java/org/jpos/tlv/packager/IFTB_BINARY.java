package org.jpos.tlv.packager;

import org.jpos.iso.IFB_BINARY;
import org.jpos.iso.ISOFieldPackager;

public class IFTB_BINARY extends IFB_BINARY implements TaggedFieldPackager {

    private String token;

    public void setToken(String token) { this.token = token; }
    public String getToken() { return token; }

    public ISOFieldPackager getDelegate() { return (ISOFieldPackager)this; }
}
