package x2;

import b2.p1;
import b2.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends m implements Comparable {
    public final int e;
    public final int f;

    public g(int i10, p1 p1Var, int i11, j jVar, int i12) {
        super(i10, p1Var, i11);
        int i13;
        this.e = i0.a.b(i12, jVar.B0) ? 1 : 0;
        x xVar = this.d;
        int i14 = xVar.z;
        int i15 = -1;
        if (i14 != -1 && (i13 = xVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f = i15;
    }

    @Override // x2.m
    public final int a() {
        return this.e;
    }

    @Override // x2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((g) obj).f);
    }
}
