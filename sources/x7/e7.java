package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e7 {
    public final d7 a;
    public final Integer b;

    public /* synthetic */ e7(u9.b bVar) {
        this.a = (d7) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return n6.l.k(this.a, e7Var.a) && n6.l.k(this.b, e7Var.b) && n6.l.k(null, null) && n6.l.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
