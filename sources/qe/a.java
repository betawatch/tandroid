package qe;

import org.telegram.tgnet.TLObject;
import xd.k;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class a {
    public static final int a;

    static {
        Object a10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            a10 = k.b(property);
        } catch (Throwable th2) {
            a10 = b7.h.a(th2);
        }
        if (a10 instanceof gd.f) {
            a10 = null;
        }
        Integer num = (Integer) a10;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
