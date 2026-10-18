package x2;

import b2.w;
import e9.b0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(w wVar, int i10) {
        this.a = (wVar.e & 1) != 0;
        this.b = i2.d.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
