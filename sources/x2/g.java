package x2;

import e9.z;
import hg.k0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(b2.s sVar, int i10) {
        this.a = (sVar.e & 1) != 0;
        this.b = k0.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
