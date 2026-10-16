package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ua1 extends s4.o {
    public int b;
    public final ma1 c;
    public final s4.b0 d;
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

    public ua1(ma1 ma1Var, s4.b0 b0Var) {
        this.c = ma1Var;
        this.d = b0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ma1 ma1Var = this.c;
        if (i12 == 13 && ma1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ma1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - ma1Var.I;
        }
        if (i10 == this.f && i11 == ma1Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == ma1Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == ma1Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == ma1Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == ma1Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == ma1Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == ma1Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == ma1Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == ma1Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == ma1Var.K) {
            return true;
        }
        if (i10 == this.s && i11 == ma1Var.L) {
            return true;
        }
        if (i10 == this.t && i11 == ma1Var.M) {
            return true;
        }
        if (i10 == this.u && i11 == ma1Var.N) {
            return true;
        }
        if (i10 == this.v && i11 == ma1Var.O) {
            return true;
        }
        if (i10 == this.w && i11 == ma1Var.P) {
            return true;
        }
        if (i10 == this.o && i11 == ma1Var.E) {
            return true;
        }
        if (i10 == this.p && i11 == ma1Var.F) {
            return true;
        }
        return i10 == this.q && i11 == ma1Var.G;
    }

    @Override // s4.o
    public final int d() {
        return this.c.c0;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ma1 ma1Var = this.c;
        this.b = ma1Var.c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, ma1Var.j(i12));
        }
        this.f = ma1Var.e;
        this.g = ma1Var.h;
        this.h = ma1Var.r;
        this.i = ma1Var.s;
        this.j = ma1Var.v;
        this.k = ma1Var.w;
        this.l = ma1Var.x;
        this.m = ma1Var.n;
        this.n = ma1Var.y;
        this.x = ma1Var.I;
        this.y = ma1Var.J;
        this.o = ma1Var.E;
        this.p = ma1Var.F;
        this.q = ma1Var.G;
        this.r = ma1Var.K;
        this.s = ma1Var.L;
        this.t = ma1Var.M;
        this.u = ma1Var.N;
        this.v = ma1Var.O;
        this.w = ma1Var.P;
        ma1Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 > N0) {
                i10 = 0;
                j10 = -1;
                break;
            } else {
                if (ma1Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = ma1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            }
        }
        s4.o.c(this, true).c(ma1Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= ma1Var.c0) {
                    i11 = -1;
                    break;
                } else if (ma1Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                b0Var.h1(i11, i10);
            }
        }
    }
}
