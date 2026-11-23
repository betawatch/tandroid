package p4;

import a8.ma;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class n1 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final l1 d;

    static {
        String str = h2.l0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public n1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static n1 a(Bundle bundle) {
        l1 l1Var;
        int i7 = bundle.getInt(e, -1);
        Bundle o4 = h2.l0.o(bundle.getBundle(f));
        long j3 = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(l1.d, 1000);
            String string = bundle2.getString(l1.e, "");
            Bundle o10 = h2.l0.o(bundle2.getBundle(l1.f));
            if (o10 == null) {
                o10 = Bundle.EMPTY;
            }
            l1Var = new l1(string, i10, o10);
        } else {
            l1Var = i7 != 0 ? new l1(i7) : null;
        }
        l1 l1Var2 = l1Var;
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        return new n1(i7, o4, j3, l1Var2);
    }

    public n1(int i7, Bundle bundle, long j3, l1 l1Var) {
        ma.f(l1Var == null || i7 < 0);
        this.a = i7;
        this.b = new Bundle(bundle);
        this.c = j3;
        if (l1Var == null && i7 < 0) {
            l1Var = new l1(i7);
        }
        this.d = l1Var;
    }
}
