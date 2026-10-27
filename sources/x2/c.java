package x2;

import a8.yb;
import android.os.SystemClock;
import b2.q1;
import b2.x;
import e2.n0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.dv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c implements q {
    public final q1 a;
    public final int b;
    public final int[] c;
    public final x[] d;
    public final long[] e;
    public int f;

    public c(q1 q1Var, int[] iArr) {
        int i10 = 0;
        yb.p(iArr.length > 0);
        q1Var.getClass();
        this.a = q1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new x[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = q1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new dv(21));
        this.c = new int[this.b];
        while (true) {
            int i12 = this.b;
            if (i10 >= i12) {
                this.e = new long[i12];
                return;
            } else {
                this.c[i10] = q1Var.a(this.d[i10]);
                i10++;
            }
        }
    }

    @Override // x2.q
    public final boolean a(int i10, long j10) {
        return this.e[i10] > j10;
    }

    @Override // x2.q
    public final q1 b() {
        return this.a;
    }

    @Override // x2.q
    public final /* synthetic */ boolean d(long j10, v2.f fVar, List list) {
        return false;
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

    @Override // x2.q
    public final x f(int i10) {
        return this.d[i10];
    }

    @Override // x2.q
    public final int h(int i10) {
        return this.c[i10];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // x2.q
    public int i(long j10, List list) {
        return list.size();
    }

    @Override // x2.q
    public final int l() {
        return this.c[c()];
    }

    @Override // x2.q
    public final int length() {
        return this.c.length;
    }

    @Override // x2.q
    public final x m() {
        return this.d[c()];
    }

    @Override // x2.q
    public final boolean o(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.b && !a2) {
            a2 = (i11 == i10 || a(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!a2) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i10] = Math.max(jArr[i10], n0.a(elapsedRealtime, j10));
        return true;
    }

    @Override // x2.q
    public final int s(x xVar) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.d[i10] == xVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // x2.q
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.b; i11++) {
            if (this.c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // x2.q
    public void g() {
    }

    @Override // x2.q
    public void j() {
    }

    @Override // x2.q
    public final /* synthetic */ void r() {
    }

    @Override // x2.q
    public final /* synthetic */ void t() {
    }

    @Override // x2.q
    public final void e(boolean z10) {
    }

    @Override // x2.q
    public void p(float f7) {
    }
}
