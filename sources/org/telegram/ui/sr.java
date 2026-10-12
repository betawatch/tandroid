package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ yr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public sr(yr yrVar) {
        this.n = yrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.n.D0 != i11;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        int i12 = this.i;
        yr yrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= yrVar.X0 && i11 < yrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(yrVar.G.get(i11 - yrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= yrVar.U0 && i11 < yrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(yrVar.H.get(i11 - yrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < yrVar.E0 || i11 >= yrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(yrVar.F.get(i11 - yrVar.E0));
    }

    @Override // s4.o
    public final int d() {
        return this.n.d1;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yr yrVar = this.n;
        g(1, yrVar.v0, sparseIntArray);
        g(2, yrVar.z0, sparseIntArray);
        g(3, yrVar.A0, sparseIntArray);
        g(4, yrVar.C0, sparseIntArray);
        g(5, yrVar.D0, sparseIntArray);
        g(6, yrVar.G0, sparseIntArray);
        g(7, yrVar.H0, sparseIntArray);
        g(8, yrVar.s0, sparseIntArray);
        g(9, yrVar.t0, sparseIntArray);
        g(10, yrVar.u0, sparseIntArray);
        g(11, yrVar.b1, sparseIntArray);
        g(12, yrVar.c1, sparseIntArray);
        g(13, yrVar.S, sparseIntArray);
        g(14, yrVar.T, sparseIntArray);
        g(15, yrVar.U, sparseIntArray);
        g(16, yrVar.e0, sparseIntArray);
        g(17, yrVar.d0, sparseIntArray);
        g(18, yrVar.f0, sparseIntArray);
        g(19, yrVar.h0, sparseIntArray);
        g(20, yrVar.m0, sparseIntArray);
        g(21, yrVar.i0, sparseIntArray);
        g(22, yrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, yrVar.k0, sparseIntArray);
        if (yrVar.x) {
            i10 = 24;
            g(24, yrVar.l0, sparseIntArray);
        }
        g(i10 + 1, yrVar.g0, sparseIntArray);
        g(i10 + 2, yrVar.B0, sparseIntArray);
        g(i10 + 3, yrVar.T0, sparseIntArray);
        g(i10 + 4, yrVar.W0, sparseIntArray);
        g(i10 + 5, yrVar.Z0, sparseIntArray);
        g(i10 + 6, yrVar.N0, sparseIntArray);
        g(i10 + 7, yrVar.O0, sparseIntArray);
        g(i10 + 8, yrVar.P0, sparseIntArray);
        g(i10 + 9, yrVar.Q0, sparseIntArray);
        g(i10 + 10, yrVar.S0, sparseIntArray);
        g(i10 + 11, yrVar.R0, sparseIntArray);
        g(i10 + 12, yrVar.a1, sparseIntArray);
        g(i10 + 13, yrVar.f1, sparseIntArray);
        g(i10 + 14, yrVar.g1, sparseIntArray);
        g(i10 + 15, yrVar.h1, sparseIntArray);
        g(i10 + 16, yrVar.i1, sparseIntArray);
        g(i10 + 17, yrVar.j1, sparseIntArray);
        g(i10 + 18, yrVar.n0, sparseIntArray);
        g(i10 + 19, yrVar.o0, sparseIntArray);
        g(i10 + 20, yrVar.p0, sparseIntArray);
        g(i10 + 21, yrVar.q0, sparseIntArray);
        g(i10 + 22, yrVar.r0, sparseIntArray);
    }
}
