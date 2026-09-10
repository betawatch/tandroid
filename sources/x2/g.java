package x2;

import e9.z;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(b2.s sVar, int i10) {
        this.a = (sVar.e & 1) != 0;
        this.b = hc.b.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
