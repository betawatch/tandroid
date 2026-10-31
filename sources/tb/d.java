package tb;

import java.util.Arrays;
import n6.l;
import z7.we;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ d(ea.b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }

    public final we a() {
        bh.d dVar = new bh.d();
        Boolean bool = Boolean.FALSE;
        dVar.a = bool;
        dVar.b = Boolean.valueOf(this.a);
        dVar.c = Boolean.valueOf(this.b);
        dVar.d = bool;
        dVar.e = Boolean.valueOf(this.c);
        return new we(dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && l.k(null, null);
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
