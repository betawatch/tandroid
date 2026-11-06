package qe;

import org.telegram.tgnet.TLObject;
import xd.k;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class a {
    public static final int a;

    static {
        Object b10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            b10 = k.b(property);
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (b10 instanceof gd.f) {
            b10 = null;
        }
        Integer num = (Integer) b10;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
