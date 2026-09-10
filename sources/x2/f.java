package x2;

import b2.l1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f extends n implements Comparable {
    public final int e;
    public final int f;

    public f(int i10, l1 l1Var, int i11, i iVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.e = hc.b.e(i12, iVar.t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.z) != -1) {
            i15 = i14 * i13;
        }
        this.f = i15;
    }

    @Override // x2.n
    public final int a() {
        return this.e;
    }

    @Override // x2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((f) obj).f);
    }
}
