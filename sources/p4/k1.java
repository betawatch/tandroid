package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k1 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = h2.m0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public k1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.a == k1Var.a && Objects.equals(this.b, k1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public k1(String str, int i7, Bundle bundle) {
        boolean z9 = true;
        if (i7 >= 0 && i7 != 1) {
            z9 = false;
        }
        ia.f(z9);
        this.a = i7;
        this.b = str;
        this.c = bundle;
    }
}
