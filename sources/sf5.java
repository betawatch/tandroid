// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sf5 extends g19 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public sf5() {
        this.b = false;
        this.c = false;
    }

    @Override // g19
    public final boolean b() {
        return this.b;
    }

    @Override // g19
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g19.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sf5)) {
            return false;
        }
        sf5 sf5Var = (sf5) obj;
        return this.c == sf5Var.c && this.b == sf5Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public sf5(boolean z) {
        this.b = true;
        this.c = z;
    }
}
