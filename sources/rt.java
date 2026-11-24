// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rt {
    public static final int a;

    static {
        Object sc9Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            sc9Var = obb.b(property);
        } catch (Throwable th) {
            sc9Var = new sc9(th);
        }
        if (sc9Var instanceof sc9) {
            sc9Var = null;
        }
        Integer num = (Integer) sc9Var;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
