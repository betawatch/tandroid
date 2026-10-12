package x2;

import b2.x;
import e9.b0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(x xVar, int i10) {
        this.a = (xVar.e & 1) != 0;
        this.b = i2.d.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
