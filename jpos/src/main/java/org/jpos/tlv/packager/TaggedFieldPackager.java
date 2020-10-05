package org.jpos.tlv.packager;

import org.jpos.iso.ISOFieldPackager;

public interface TaggedFieldPackager extends org.jpos.iso.TaggedFieldPackager {

    ISOFieldPackager getDelegate();
}
