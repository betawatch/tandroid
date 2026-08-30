package va;

import java.sql.Date;
import java.sql.Timestamp;
import va.a;
import va.b;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class f {
    public static final boolean a;
    public static final a.a b;
    public static final b.a c;
    public static final c d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        a = z4;
        if (!z4) {
            b = null;
            c = null;
            d = null;
        } else {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            b = a.b;
            c = b.b;
            d = d.b;
        }
    }
}
