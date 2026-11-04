package z2;

import android.os.SystemClock;
import b8.zb;
import d2.o1;
import d2.v;
import g2.n0;
import java.util.Arrays;
import java.util.List;
import vg.i1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c implements p {
    public final o1 a;
    public final int b;
    public final int[] c;
    public final v[] d;
    public final long[] e;
    public int f;

    public c(o1 o1Var, int[] iArr) {
        int i3 = 0;
        zb.p(iArr.length > 0);
        o1Var.getClass();
        this.a = o1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new v[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = o1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new i1(2));
        this.c = new int[this.b];
        while (true) {
            int i11 = this.b;
            if (i3 >= i11) {
                this.e = new long[i11];
                return;
            } else {
                this.c[i3] = o1Var.a(this.d[i3]);
                i3++;
            }
        }
    }

    @Override // z2.p
    public final boolean a(int i3, long j10) {
        return this.e[i3] > j10;
    }

    @Override // z2.p
    public final o1 b() {
        return this.a;
    }

    @Override // z2.p
    public final int e(v vVar) {
        for (int i3 = 0; i3 < this.b; i3++) {
            if (this.d[i3] == vVar) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && Arrays.equals(this.c, cVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // z2.p
    public final v g(int i3) {
        return this.d[i3];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // z2.p
    public final int i(int i3) {
        return this.c[i3];
    }

    @Override // z2.p
    public int j(long j10, List list) {
        return list.size();
    }

    @Override // z2.p
    public final int l() {
        return this.c[c()];
    }

    @Override // z2.p
    public final int length() {
        return this.c.length;
    }

    @Override // z2.p
    public final /* synthetic */ boolean m(long j10, x2.f fVar, List list) {
        return false;
    }

    @Override // z2.p
    public final v n() {
        return this.d[c()];
    }

    @Override // z2.p
    public final boolean p(int i3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i3, elapsedRealtime);
        int i10 = 0;
        while (i10 < this.b && !a10) {
            a10 = (i10 == i3 || a(i10, elapsedRealtime)) ? false : true;
            i10++;
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i3] = Math.max(jArr[i3], n0.a(elapsedRealtime, j10));
        return true;
    }

    @Override // z2.p
    public final int u(int i3) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.c[i10] == i3) {
                return i10;
            }
        }
        return -1;
    }

    @Override // z2.p
    public void h() {
    }

    @Override // z2.p
    public void k() {
    }

    @Override // z2.p
    public final /* synthetic */ void s() {
    }

    @Override // z2.p
    public final /* synthetic */ void t() {
    }

    @Override // z2.p
    public final void f(boolean z10) {
    }

    @Override // z2.p
    public void q(float f10) {
    }
}
