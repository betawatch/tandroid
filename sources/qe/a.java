package qe;

import org.telegram.tgnet.TLObject;
import xd.k;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
