package z2;

import d2.o1;
import d2.v;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends l implements Comparable {
    public final int e;
    public final int f;

    public f(int i3, o1 o1Var, int i10, i iVar, int i11) {
        super(i3, o1Var, i10);
        int i12;
        this.e = p1.b(i11, iVar.B0) ? 1 : 0;
        v vVar = this.d;
        int i13 = vVar.z;
        int i14 = -1;
        if (i13 != -1 && (i12 = vVar.A) != -1) {
            i14 = i13 * i12;
        }
        this.f = i14;
    }

    @Override // z2.l
    public final int a() {
        return this.e;
    }

    @Override // z2.l
    public final /* bridge */ /* synthetic */ boolean b(l lVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((f) obj).f);
    }
}
