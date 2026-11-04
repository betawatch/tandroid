package wb;

import b8.cf;
import b8.ke;
import java.util.Arrays;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ d(ha.a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final cf a() {
        ke keVar = new ke(1);
        Boolean bool = Boolean.FALSE;
        keVar.b = bool;
        keVar.c = Boolean.valueOf(this.a);
        keVar.d = Boolean.valueOf(this.b);
        keVar.e = bool;
        keVar.f = Boolean.valueOf(this.c);
        return new cf(keVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && m.k(null, null);
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
