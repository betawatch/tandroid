// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
