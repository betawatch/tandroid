package x2;

import b2.x;
import e9.b0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
