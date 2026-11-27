// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class rs {
    public static final int a;

    static {
        Object ge9Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            ge9Var = kdb.b(property);
        } catch (Throwable th) {
            ge9Var = new ge9(th);
        }
        if (ge9Var instanceof ge9) {
            ge9Var = null;
        }
        Integer num = (Integer) ge9Var;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
