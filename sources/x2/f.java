package x2;

import b2.l1;
import hg.k0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f extends o implements Comparable {
    public final int e;
    public final int f;

    public f(int i10, l1 l1Var, int i11, j jVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.e = k0.d(i12, jVar.t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.z) != -1) {
            i15 = i14 * i13;
        }
        this.f = i15;
    }

    @Override // x2.o
    public final int a() {
        return this.e;
    }

    @Override // x2.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((f) obj).f);
    }
}
