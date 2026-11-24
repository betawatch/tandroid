// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qs {
    public static final int a;

    static {
        Object sa9Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            sa9Var = m9b.b(property);
        } catch (Throwable th) {
            sa9Var = new sa9(th);
        }
        if (sa9Var instanceof sa9) {
            sa9Var = null;
        }
        Integer num = (Integer) sa9Var;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
