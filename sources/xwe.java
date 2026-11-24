// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xwe {
    public static sdb a(sdb sdbVar) {
        return !(sdbVar instanceof udb) ? sdbVar instanceof tdb ? sdbVar : sdbVar instanceof Serializable ? new tdb(sdbVar) : new udb(sdbVar) : sdbVar;
    }
}
