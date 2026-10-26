package x2;

import b2.q1;
import b2.x;
import c3.h0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
