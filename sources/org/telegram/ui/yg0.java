package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yg0 extends f2.s {
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

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        int i11;
        int i12;
        int i13 = this.c;
        hh0 hh0Var = this.m;
        if (((i9 >= i13 && i9 < this.d) || (i9 >= this.e && i9 < this.f)) && ((i10 >= (i12 = hh0Var.y) && i10 < hh0Var.A) || (i10 >= hh0Var.D && i10 < hh0Var.E))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i10 < i12 || i10 >= hh0Var.A) ? (TLRPC.TL_chatInviteExported) hh0Var.f0.get(i10 - hh0Var.D) : (TLRPC.TL_chatInviteExported) hh0Var.e0.get(i10 - i12);
            int i14 = this.c;
            return ((i9 < i14 || i9 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i9 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i9 - i14)).link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.g;
        if (i9 >= i15 && i9 < this.h && i10 >= (i11 = hh0Var.Q) && i10 < hh0Var.R) {
            return i9 - i15 == i10 - i11;
        }
        int i16 = this.i.get(i9, -1);
        return i16 >= 0 && i16 == this.j.get(i10, -1);
    }

    @Override // f2.s
    public final int d() {
        return this.m.T;
    }

    @Override // f2.s
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
