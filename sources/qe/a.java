package qe;

import org.telegram.tgnet.TLObject;
import xd.k;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
