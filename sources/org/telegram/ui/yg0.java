package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yg0 extends f2.q {
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
    public final /* synthetic */ hh0 m;

    public yg0(hh0 hh0Var) {
        this.m = hh0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.c;
        hh0 hh0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = hh0Var.y) && i11 < hh0Var.A) || (i11 >= hh0Var.D && i11 < hh0Var.E))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= hh0Var.A) ? (TLRPC.TL_chatInviteExported) hh0Var.f0.get(i11 - hh0Var.D) : (TLRPC.TL_chatInviteExported) hh0Var.e0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = hh0Var.Q) && i11 < hh0Var.R) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.i.get(i10, -1);
        return i17 >= 0 && i17 == this.j.get(i11, -1);
    }

    @Override // f2.q
    public final int d() {
        return this.m.T;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hh0 hh0Var = this.m;
        g(1, hh0Var.r, sparseIntArray);
        g(2, hh0Var.s, sparseIntArray);
        g(3, hh0Var.v, sparseIntArray);
        g(4, hh0Var.w, sparseIntArray);
        g(5, hh0Var.x, sparseIntArray);
        g(6, hh0Var.H, sparseIntArray);
        g(7, hh0Var.J, sparseIntArray);
        g(8, hh0Var.K, sparseIntArray);
        g(9, hh0Var.M, sparseIntArray);
        g(10, hh0Var.N, sparseIntArray);
        g(11, hh0Var.O, sparseIntArray);
        g(12, hh0Var.L, sparseIntArray);
        g(13, hh0Var.B, sparseIntArray);
    }
}
