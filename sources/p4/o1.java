package p4;

import a8.la;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class o1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final m1 d;

    static {
        String str = h2.l0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public o1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static o1 a(Bundle bundle) {
        m1 m1Var;
        int i7 = bundle.getInt(e, -1);
        Bundle o4 = h2.l0.o(bundle.getBundle(f));
        long j3 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(m1.d, 1000);
            String string = bundle2.getString(m1.e, "");
            Bundle o10 = h2.l0.o(bundle2.getBundle(m1.f));
            if (o10 == null) {
                o10 = Bundle.EMPTY;
            }
            m1Var = new m1(string, i10, o10);
        } else {
            m1Var = i7 != 0 ? new m1(i7) : null;
        }
        m1 m1Var2 = m1Var;
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        return new o1(i7, o4, j3, m1Var2);
    }

    public o1(int i7, Bundle bundle, long j3, m1 m1Var) {
        la.f(m1Var == null || i7 < 0);
        this.a = i7;
        this.b = new Bundle(bundle);
        this.c = j3;
        if (m1Var == null && i7 < 0) {
            m1Var = new m1(i7);
        }
        this.d = m1Var;
    }
}
