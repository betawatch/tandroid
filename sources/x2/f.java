package x2;

import b2.q1;
import b2.x;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f extends l implements Comparable {
    public final int e;
    public final int f;

    public f(int i10, q1 q1Var, int i11, i iVar, int i12) {
        super(i10, q1Var, i11);
        int i13;
        this.e = i2.d.e(i12, iVar.B0) ? 1 : 0;
        x xVar = this.d;
        int i14 = xVar.z;
        int i15 = -1;
        if (i14 != -1 && (i13 = xVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f = i15;
    }

    @Override // x2.l
    public final int a() {
        return this.e;
    }

    @Override // x2.l
    public final /* bridge */ /* synthetic */ boolean b(l lVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((f) obj).f);
    }
}
