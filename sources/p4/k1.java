package p4;

import a8.la;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class k1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        e = h9.i0.o(7, objArr);
        String str = h2.l0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public k1(int i7) {
        la.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.a = i7;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.a == k1Var.a && TextUtils.equals(this.b, k1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public k1(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
