package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qh0 extends s4.o {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final SparseIntArray i = new SparseIntArray();
    public final SparseIntArray j = new SparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final /* synthetic */ zh0 m;

    public qh0(zh0 zh0Var) {
        this.m = zh0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.c;
        zh0 zh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = zh0Var.y) && i11 < zh0Var.E) || (i11 >= zh0Var.H && i11 < zh0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= zh0Var.E) ? (TLRPC.TL_chatInviteExported) zh0Var.j0.get(i11 - zh0Var.H) : (TLRPC.TL_chatInviteExported) zh0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = zh0Var.U) && i11 < zh0Var.V) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // s4.o
    public final int d() {
        return this.m.X;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        zh0 zh0Var = this.m;
        g(1, zh0Var.r, sparseIntArray);
        g(2, zh0Var.s, sparseIntArray);
        g(3, zh0Var.v, sparseIntArray);
        g(4, zh0Var.w, sparseIntArray);
        g(5, zh0Var.x, sparseIntArray);
        g(6, zh0Var.L, sparseIntArray);
        g(7, zh0Var.N, sparseIntArray);
        g(8, zh0Var.O, sparseIntArray);
        g(9, zh0Var.Q, sparseIntArray);
        g(10, zh0Var.R, sparseIntArray);
        g(11, zh0Var.S, sparseIntArray);
        g(12, zh0Var.P, sparseIntArray);
        g(13, zh0Var.F, sparseIntArray);
    }
}
