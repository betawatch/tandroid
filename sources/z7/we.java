package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class we {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ we(bh.d dVar) {
        this.a = (Boolean) dVar.a;
        this.b = (Boolean) dVar.b;
        this.c = (Boolean) dVar.c;
        this.d = (Boolean) dVar.d;
        this.e = (Boolean) dVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return n6.l.k(this.a, weVar.a) && n6.l.k(this.b, weVar.b) && n6.l.k(this.c, weVar.c) && n6.l.k(this.d, weVar.d) && n6.l.k(this.e, weVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
