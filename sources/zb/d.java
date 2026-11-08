package zb;

import a8.r7;
import c8.te;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ d(ia.a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final te a() {
        r7 r7Var = new r7(4, (byte) 0);
        Boolean bool = Boolean.FALSE;
        r7Var.d = bool;
        r7Var.e = Boolean.valueOf(this.a);
        r7Var.f = Boolean.valueOf(this.b);
        r7Var.b = bool;
        r7Var.c = Boolean.valueOf(this.c);
        return new te(r7Var);
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
