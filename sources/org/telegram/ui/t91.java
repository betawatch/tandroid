package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t91 extends f2.q {
    public int b;
    public final l91 c;
    public final f2.i0 d;
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

    public t91(l91 l91Var, f2.i0 i0Var) {
        this.c = l91Var;
        this.d = i0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        l91 l91Var = this.c;
        if (i12 == 13 && l91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && l91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - l91Var.F;
        }
        if (i10 == this.f && i11 == l91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == l91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == l91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == l91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == l91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == l91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == l91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == l91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == l91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == l91Var.H) {
            return true;
        }
        if (i10 == this.s && i11 == l91Var.I) {
            return true;
        }
        if (i10 == this.t && i11 == l91Var.J) {
            return true;
        }
        if (i10 == this.u && i11 == l91Var.K) {
            return true;
        }
        if (i10 == this.v && i11 == l91Var.L) {
            return true;
        }
        if (i10 == this.w && i11 == l91Var.M) {
            return true;
        }
        if (i10 == this.o && i11 == l91Var.B) {
            return true;
        }
        if (i10 == this.p && i11 == l91Var.C) {
            return true;
        }
        return i10 == this.q && i11 == l91Var.D;
    }

    @Override // f2.q
    public final int d() {
        return this.c.Z;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        l91 l91Var = this.c;
        this.b = l91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, l91Var.j(i12));
        }
        this.f = l91Var.e;
        this.g = l91Var.h;
        this.h = l91Var.r;
        this.i = l91Var.s;
        this.j = l91Var.v;
        this.k = l91Var.w;
        this.l = l91Var.x;
        this.m = l91Var.n;
        this.n = l91Var.y;
        this.x = l91Var.F;
        this.y = l91Var.G;
        this.o = l91Var.B;
        this.p = l91Var.C;
        this.q = l91Var.D;
        this.r = l91Var.H;
        this.s = l91Var.I;
        this.t = l91Var.J;
        this.u = l91Var.K;
        this.v = l91Var.L;
        this.w = l91Var.M;
        l91Var.E();
        f2.i0 i0Var = this.d;
        int L0 = i0Var.L0();
        int N0 = i0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (l91Var.i(L0) != -1 && (m9 = i0Var.m(L0)) != null) {
                    j10 = l91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(l91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= l91Var.Z) {
                    i11 = -1;
                    break;
                } else if (l91Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                i0Var.h1(i11, i10);
            }
        }
    }
}
