package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u91 extends f2.q {
    public int b;
    public final m91 c;
    public final f2.j0 d;
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

    public u91(m91 m91Var, f2.j0 j0Var) {
        this.c = m91Var;
        this.d = j0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return this.e.get(i10) == this.c.j(i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        m91 m91Var = this.c;
        if (i12 == 13 && m91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && m91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.x;
        if (i10 >= i13 && i10 <= this.y) {
            return i10 - i13 == i11 - m91Var.F;
        }
        if (i10 == this.f && i11 == m91Var.e) {
            return true;
        }
        if (i10 == this.g && i11 == m91Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == m91Var.r) {
            return true;
        }
        if (i10 == this.i && i11 == m91Var.s) {
            return true;
        }
        if (i10 == this.j && i11 == m91Var.v) {
            return true;
        }
        if (i10 == this.k && i11 == m91Var.w) {
            return true;
        }
        if (i10 == this.l && i11 == m91Var.x) {
            return true;
        }
        if (i10 == this.m && i11 == m91Var.n) {
            return true;
        }
        if (i10 == this.n && i11 == m91Var.y) {
            return true;
        }
        if (i10 == this.r && i11 == m91Var.H) {
            return true;
        }
        if (i10 == this.s && i11 == m91Var.I) {
            return true;
        }
        if (i10 == this.t && i11 == m91Var.J) {
            return true;
        }
        if (i10 == this.u && i11 == m91Var.K) {
            return true;
        }
        if (i10 == this.v && i11 == m91Var.L) {
            return true;
        }
        if (i10 == this.w && i11 == m91Var.M) {
            return true;
        }
        if (i10 == this.o && i11 == m91Var.B) {
            return true;
        }
        if (i10 == this.p && i11 == m91Var.C) {
            return true;
        }
        return i10 == this.q && i11 == m91Var.D;
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
        m91 m91Var = this.c;
        this.b = m91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            sparseIntArray.put(i12, m91Var.j(i12));
        }
        this.f = m91Var.e;
        this.g = m91Var.h;
        this.h = m91Var.r;
        this.i = m91Var.s;
        this.j = m91Var.v;
        this.k = m91Var.w;
        this.l = m91Var.x;
        this.m = m91Var.n;
        this.n = m91Var.y;
        this.x = m91Var.F;
        this.y = m91Var.G;
        this.o = m91Var.B;
        this.p = m91Var.C;
        this.q = m91Var.D;
        this.r = m91Var.H;
        this.s = m91Var.I;
        this.t = m91Var.J;
        this.u = m91Var.K;
        this.v = m91Var.L;
        this.w = m91Var.M;
        m91Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 > N0) {
                j10 = -1;
                i10 = 0;
                break;
            } else {
                if (m91Var.i(L0) != -1 && (m9 = j0Var.m(L0)) != null) {
                    j10 = m91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            }
        }
        f2.q.c(this, true).b(m91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 >= m91Var.Z) {
                    i11 = -1;
                    break;
                } else if (m91Var.i(i11) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                j0Var.h1(i11, i10);
            }
        }
    }
}
