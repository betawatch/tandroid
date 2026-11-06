package p4;

import android.os.Bundle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = h2.m0.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        q qVar = new q();
        new Bundle(o4);
        return qVar;
    }
}
