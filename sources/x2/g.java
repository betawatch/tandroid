package x2;

import e9.z;
import hg.k0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(b2.s sVar, int i10) {
        this.a = (sVar.e & 1) != 0;
        this.b = k0.d(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
