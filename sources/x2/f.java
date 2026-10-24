package x2;

import b2.p1;
import b2.w;
import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f extends l implements Comparable {
    public final int e;
    public final int f;

    public f(int i10, p1 p1Var, int i11, i iVar, int i12) {
        super(i10, p1Var, i11);
        int i13;
        this.e = o1.e(i12, iVar.B0) ? 1 : 0;
        w wVar = this.d;
        int i14 = wVar.z;
        int i15 = -1;
        if (i14 != -1 && (i13 = wVar.A) != -1) {
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
