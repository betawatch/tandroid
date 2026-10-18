package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e7 {
    public final d7 a;
    public final Integer b;

    public /* synthetic */ e7(mi.q qVar) {
        this.a = (d7) qVar.b;
        this.b = (Integer) qVar.c;
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
