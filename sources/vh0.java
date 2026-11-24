// default package

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class vh0 implements t74 {
    public static final sa g = new sa(7);
    public final uzb a;
    public final int b;
    public final int[] c;
    public final go4[] d;
    public final long[] e;
    public int f;

    public vh0(int i, uzb uzbVar, int[] iArr) {
        go4[] go4VarArr;
        int i2 = 0;
        jte.p(iArr.length > 0);
        uzbVar.getClass();
        this.a = uzbVar;
        int length = iArr.length;
        this.b = length;
        this.d = new go4[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            go4VarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            go4VarArr[i3] = uzbVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(go4VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = uzbVar.a(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // t74
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // t74
    public final uzb c() {
        return this.a;
    }

    @Override // t74
    public final int e(go4 go4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == go4Var) {
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
            vh0 vh0Var = (vh0) obj;
            if (this.a.equals(vh0Var.a) && Arrays.equals(this.c, vh0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // t74
    public final void f() {
        Arrays.fill(this.e, 0L);
    }

    @Override // t74
    public final boolean g(long j, ni2 ni2Var, List list) {
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

    @Override // t74
    public final go4 i(int i) {
        return this.d[i];
    }

    @Override // t74
    public final int k(int i) {
        return this.c[i];
    }

    @Override // t74
    public int l(long j, List list) {
        return list.size();
    }

    @Override // t74
    public final int length() {
        return this.c.length;
    }

    @Override // t74
    public final int n() {
        return this.c[d()];
    }

    @Override // t74
    public final go4 o() {
        return this.d[d()];
    }

    @Override // t74
    public final boolean q(int i, long j) {
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
        jArr[i] = Math.max(jArr[i], hac.a(elapsedRealtime, j));
        return true;
    }

    @Override // t74
    public final int v(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // t74
    public void j() {
    }

    @Override // t74
    public void m() {
    }

    @Override // t74
    public final void t() {
    }

    @Override // t74
    public final void u() {
    }

    @Override // t74
    public final void h(boolean z) {
    }

    @Override // t74
    public void r(float f) {
    }
}
