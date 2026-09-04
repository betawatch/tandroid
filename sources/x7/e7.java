package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e7 {
    public final d7 a;
    public final Integer b;

    public /* synthetic */ e7(o0.a aVar) {
        this.a = (d7) aVar.b;
        this.b = (Integer) aVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return n6.l.l(this.a, e7Var.a) && n6.l.l(this.b, e7Var.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
