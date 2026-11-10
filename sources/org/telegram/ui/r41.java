package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r41 extends v4.o {
    public int b;
    public final i41 c;
    public final v4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;

    public r41(i41 i41Var, v4.b0 b0Var) {
        this.c = i41Var;
        this.d = b0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return this.e.get(i7) == this.c.d(i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        int i11 = sparseIntArray.get(i7);
        i41 i41Var = this.c;
        if (i11 == 13 && i41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && i41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.x;
        if (i7 >= i12 && i7 <= this.y) {
            return i7 - i12 == i10 - i41Var.I;
        }
        if (i7 == this.f && i10 == i41Var.e) {
            return true;
        }
        if (i7 == this.g && i10 == i41Var.h) {
            return true;
        }
        if (i7 == this.h && i10 == i41Var.r) {
            return true;
        }
        if (i7 == this.i && i10 == i41Var.s) {
            return true;
        }
        if (i7 == this.j && i10 == i41Var.w) {
            return true;
        }
        if (i7 == this.k && i10 == i41Var.x) {
            return true;
        }
        if (i7 == this.l && i10 == i41Var.y) {
            return true;
        }
        if (i7 == this.m && i10 == i41Var.n) {
            return true;
        }
        if (i7 == this.n && i10 == i41Var.D) {
            return true;
        }
        if (i7 == this.r && i10 == i41Var.K) {
            return true;
        }
        if (i7 == this.s && i10 == i41Var.L) {
            return true;
        }
        if (i7 == this.t && i10 == i41Var.M) {
            return true;
        }
        if (i7 == this.u && i10 == i41Var.N) {
            return true;
        }
        if (i7 == this.v && i10 == i41Var.O) {
            return true;
        }
        if (i7 == this.w && i10 == i41Var.P) {
            return true;
        }
        if (i7 == this.o && i10 == i41Var.E) {
            return true;
        }
        if (i7 == this.p && i10 == i41Var.F) {
            return true;
        }
        return i7 == this.q && i10 == i41Var.G;
    }

    @Override // v4.o
    public final int d() {
        return this.c.c0;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        i41 i41Var = this.c;
        this.b = i41Var.c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            sparseIntArray.put(i11, i41Var.d(i11));
        }
        this.f = i41Var.e;
        this.g = i41Var.h;
        this.h = i41Var.r;
        this.i = i41Var.s;
        this.j = i41Var.w;
        this.k = i41Var.x;
        this.l = i41Var.y;
        this.m = i41Var.n;
        this.n = i41Var.D;
        this.x = i41Var.I;
        this.y = i41Var.J;
        this.o = i41Var.E;
        this.p = i41Var.F;
        this.q = i41Var.G;
        this.r = i41Var.K;
        this.s = i41Var.L;
        this.t = i41Var.M;
        this.u = i41Var.N;
        this.v = i41Var.O;
        this.w = i41Var.P;
        i41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i7 = 0;
                j3 = -1;
                break;
            } else {
                if (i41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = i41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        v4.o.c(this, true).c(i41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 >= i41Var.c0) {
                    i10 = -1;
                    break;
                } else if (i41Var.c(i10) == j3) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
