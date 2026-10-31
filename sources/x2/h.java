package x2;

import b2.x;
import e9.b0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean a;
    public final boolean b;

    public h(x xVar, int i10) {
        this.a = (xVar.e & 1) != 0;
        this.b = i0.a.b(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return b0.a.c(this.b, hVar.b).c(this.a, hVar.a).e();
    }
}
