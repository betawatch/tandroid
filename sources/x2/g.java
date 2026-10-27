package x2;

import b2.q1;
import b2.x;
import c3.h0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends m implements Comparable {
    public final int e;
    public final int f;

    public g(int i10, q1 q1Var, int i11, j jVar, int i12) {
        super(i10, q1Var, i11);
        int i13;
        this.e = h0.e(i12, jVar.B0) ? 1 : 0;
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
