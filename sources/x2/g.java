package x2;

import e9.z;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(b2.s sVar, int i10) {
        this.a = (sVar.e & 1) != 0;
        this.b = hg.c.d(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
