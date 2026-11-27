// default package

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class wg0 implements e74 {
    public static final ta g = new ta(7);
    public final t1c a;
    public final int b;
    public final int[] c;
    public final ko4[] d;
    public final long[] e;
    public int f;

    public wg0(int i, t1c t1cVar, int[] iArr) {
        ko4[] ko4VarArr;
        int i2 = 0;
        yve.p(iArr.length > 0);
        t1cVar.getClass();
        this.a = t1cVar;
        int length = iArr.length;
        this.b = length;
        this.d = new ko4[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            ko4VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            ko4VarArr[i3] = t1cVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(ko4VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = t1cVar.a(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // e74
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // e74
    public final t1c c() {
        return this.a;
    }

    @Override // e74
    public final int e(ko4 ko4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == ko4Var) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wg0 wg0Var = (wg0) obj;
            if (this.a.equals(wg0Var.a) && Arrays.equals(this.c, wg0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // e74
    public final void f() {
        Arrays.fill(this.e, 0L);
    }

    @Override // e74
    public final boolean g(long j, rh2 rh2Var, List list) {
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.f = hashCode;
        return hashCode;
    }

    @Override // e74
    public final ko4 i(int i) {
        return this.d[i];
    }

    @Override // e74
    public final int j(int i) {
        return this.c[i];
    }

    @Override // e74
    public int k(long j, List list) {
        return list.size();
    }

    @Override // e74
    public final int length() {
        return this.c.length;
    }

    @Override // e74
    public final int m() {
        return this.c[d()];
    }

    @Override // e74
    public final ko4 n() {
        return this.d[d()];
    }

    @Override // e74
    public final boolean p(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], gcc.a(elapsedRealtime, j));
        return true;
    }

    @Override // e74
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e74
    public void enable() {
    }

    @Override // e74
    public void l() {
    }

    @Override // e74
    public final void s() {
    }

    @Override // e74
    public final void t() {
    }

    @Override // e74
    public final void h(boolean z) {
    }

    @Override // e74
    public void q(float f) {
    }
}
