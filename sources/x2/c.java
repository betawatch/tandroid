package x2;

import android.os.SystemClock;
import b2.l1;
import e2.d0;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c implements r {
    public final l1 a;
    public final int b;
    public final int[] c;
    public final b2.s[] d;
    public final long[] e;
    public int f;

    public c(l1 l1Var, int[] iArr) {
        int i10 = 0;
        e2.d.g(iArr.length > 0);
        l1Var.getClass();
        this.a = l1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new b2.s[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = l1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new f11(12));
        this.c = new int[this.b];
        while (true) {
            int i12 = this.b;
            if (i10 >= i12) {
                this.e = new long[i12];
                return;
            } else {
                this.c[i10] = l1Var.a(this.d[i10]);
                i10++;
            }
        }
    }

    @Override // x2.r
    public final boolean a(int i10, long j3) {
        return this.e[i10] > j3;
    }

    @Override // x2.r
    public final l1 b() {
        return this.a;
    }

    @Override // x2.r
    public final /* synthetic */ boolean d(long j3, v2.e eVar, List list) {
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

    @Override // x2.r
    public final b2.s f(int i10) {
        return this.d[i10];
    }

    @Override // x2.r
    public final int h(int i10) {
        return this.c[i10];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // x2.r
    public int i(long j3, List list) {
        return list.size();
    }

    @Override // x2.r
    public final int l() {
        return this.c[c()];
    }

    @Override // x2.r
    public final int length() {
        return this.c.length;
    }

    @Override // x2.r
    public final b2.s m() {
        return this.d[c()];
    }

    @Override // x2.r
    public final boolean o(int i10, long j3) {
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
        long j10 = jArr[i10];
        String str = d0.a;
        long j11 = elapsedRealtime + j3;
        if (((j3 ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j10, j11);
        return true;
    }

    @Override // x2.r
    public final int s(b2.s sVar) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.d[i10] == sVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // x2.r
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.b; i11++) {
            if (this.c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // x2.r
    public void g() {
    }

    @Override // x2.r
    public void j() {
    }

    @Override // x2.r
    public final /* synthetic */ void r() {
    }

    @Override // x2.r
    public final /* synthetic */ void t() {
    }

    @Override // x2.r
    public final void e(boolean z10) {
    }

    @Override // x2.r
    public void p(float f7) {
    }
}
