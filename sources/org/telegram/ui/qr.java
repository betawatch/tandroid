package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qr extends s4.o {
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ wr n;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public qr(wr wrVar) {
        this.n = wrVar;
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
        wr wrVar = this.n;
        if (i10 >= i12 && i10 < this.j && i11 >= wrVar.X0 && i11 < wrVar.Y0) {
            return ((TLObject) this.l.get(i10 - i12)).equals(wrVar.G.get(i11 - wrVar.X0));
        }
        int i13 = this.g;
        if (i10 >= i13 && i10 < this.h && i11 >= wrVar.U0 && i11 < wrVar.V0) {
            return ((TLObject) this.m.get(i10 - i13)).equals(wrVar.H.get(i11 - wrVar.U0));
        }
        int i14 = this.e;
        return (i10 < i14 || i10 >= this.f || i11 < wrVar.E0 || i11 >= wrVar.F0) ? this.c.get(i10) == this.d.get(i11) : ((TLObject) this.k.get(i10 - i14)).equals(wrVar.F.get(i11 - wrVar.E0));
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
        wr wrVar = this.n;
        g(1, wrVar.v0, sparseIntArray);
        g(2, wrVar.z0, sparseIntArray);
        g(3, wrVar.A0, sparseIntArray);
        g(4, wrVar.C0, sparseIntArray);
        g(5, wrVar.D0, sparseIntArray);
        g(6, wrVar.G0, sparseIntArray);
        g(7, wrVar.H0, sparseIntArray);
        g(8, wrVar.s0, sparseIntArray);
        g(9, wrVar.t0, sparseIntArray);
        g(10, wrVar.u0, sparseIntArray);
        g(11, wrVar.b1, sparseIntArray);
        g(12, wrVar.c1, sparseIntArray);
        g(13, wrVar.S, sparseIntArray);
        g(14, wrVar.T, sparseIntArray);
        g(15, wrVar.U, sparseIntArray);
        g(16, wrVar.e0, sparseIntArray);
        g(17, wrVar.d0, sparseIntArray);
        g(18, wrVar.f0, sparseIntArray);
        g(19, wrVar.h0, sparseIntArray);
        g(20, wrVar.m0, sparseIntArray);
        g(21, wrVar.i0, sparseIntArray);
        g(22, wrVar.j0, sparseIntArray);
        int i10 = 23;
        g(23, wrVar.k0, sparseIntArray);
        if (wrVar.x) {
            i10 = 24;
            g(24, wrVar.l0, sparseIntArray);
        }
        g(i10 + 1, wrVar.g0, sparseIntArray);
        g(i10 + 2, wrVar.B0, sparseIntArray);
        g(i10 + 3, wrVar.T0, sparseIntArray);
        g(i10 + 4, wrVar.W0, sparseIntArray);
        g(i10 + 5, wrVar.Z0, sparseIntArray);
        g(i10 + 6, wrVar.N0, sparseIntArray);
        g(i10 + 7, wrVar.O0, sparseIntArray);
        g(i10 + 8, wrVar.P0, sparseIntArray);
        g(i10 + 9, wrVar.Q0, sparseIntArray);
        g(i10 + 10, wrVar.S0, sparseIntArray);
        g(i10 + 11, wrVar.R0, sparseIntArray);
        g(i10 + 12, wrVar.a1, sparseIntArray);
        g(i10 + 13, wrVar.f1, sparseIntArray);
        g(i10 + 14, wrVar.g1, sparseIntArray);
        g(i10 + 15, wrVar.h1, sparseIntArray);
        g(i10 + 16, wrVar.i1, sparseIntArray);
        g(i10 + 17, wrVar.j1, sparseIntArray);
        g(i10 + 18, wrVar.n0, sparseIntArray);
        g(i10 + 19, wrVar.o0, sparseIntArray);
        g(i10 + 20, wrVar.p0, sparseIntArray);
        g(i10 + 21, wrVar.q0, sparseIntArray);
        g(i10 + 22, wrVar.r0, sparseIntArray);
    }
}
