// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v74 {
    public static volatile v74 a;
    public static final v74 b;

    static {
        v74 v74Var = new v74();
        Map map = Collections.EMPTY_MAP;
        b = v74Var;
    }

    public static v74 a() {
        v74 v74Var;
        ow8 ow8Var = ow8.c;
        v74 v74Var2 = a;
        if (v74Var2 != null) {
            return v74Var2;
        }
        synchronized (v74.class) {
            v74Var = a;
            if (v74Var == null) {
                Class cls = u74.a;
                v74 v74Var3 = null;
                if (cls != null) {
                    try {
                        v74Var3 = (v74) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                v74Var = v74Var3 != null ? v74Var3 : b;
                a = v74Var;
            }
        }
        return v74Var;
    }
}
