package x2;

import b2.l1;
import hg.k0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
