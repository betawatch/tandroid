package z2;

import d2.v;
import g9.w;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(v vVar, int i3) {
        this.a = (vVar.e & 1) != 0;
        this.b = p1.b(i3, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return w.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
