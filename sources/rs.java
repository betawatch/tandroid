// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
