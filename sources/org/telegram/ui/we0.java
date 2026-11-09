package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class we0 extends v4.o {
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
    public final /* synthetic */ ef0 m;

    public we0(ef0 ef0Var) {
        this.m = ef0Var;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        int i11;
        int i12;
        int i13 = this.c;
        ef0 ef0Var = this.m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.e && i7 < this.f)) && ((i10 >= (i12 = ef0Var.D) && i10 < ef0Var.E) || (i10 >= ef0Var.H && i10 < ef0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i10 < i12 || i10 >= ef0Var.E) ? (TLRPC.TL_chatInviteExported) ef0Var.j0.get(i10 - ef0Var.H) : (TLRPC.TL_chatInviteExported) ef0Var.i0.get(i10 - i12);
            int i14 = this.c;
            return ((i7 < i14 || i7 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i7 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i7 - i14)).link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = ef0Var.U) && i10 < ef0Var.V) {
            return i7 - i15 == i10 - i11;
        }
        int i16 = this.i.get(i7, -1);
        return i16 >= 0 && i16 == this.j.get(i10, -1);
    }

    @Override // v4.o
    public final int d() {
        return this.m.X;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ef0 ef0Var = this.m;
        g(1, ef0Var.r, sparseIntArray);
        g(2, ef0Var.s, sparseIntArray);
        g(3, ef0Var.w, sparseIntArray);
        g(4, ef0Var.x, sparseIntArray);
        g(5, ef0Var.y, sparseIntArray);
        g(6, ef0Var.L, sparseIntArray);
        g(7, ef0Var.N, sparseIntArray);
        g(8, ef0Var.O, sparseIntArray);
        g(9, ef0Var.Q, sparseIntArray);
        g(10, ef0Var.R, sparseIntArray);
        g(11, ef0Var.S, sparseIntArray);
        g(12, ef0Var.P, sparseIntArray);
        g(13, ef0Var.F, sparseIntArray);
    }
}
