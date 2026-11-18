package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ye0 extends v4.o {
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
    public final /* synthetic */ gf0 m;

    public ye0(gf0 gf0Var) {
        this.m = gf0Var;
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
        gf0 gf0Var = this.m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.e && i7 < this.f)) && ((i10 >= (i12 = gf0Var.E) && i10 < gf0Var.F) || (i10 >= gf0Var.I && i10 < gf0Var.J))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i10 < i12 || i10 >= gf0Var.F) ? (TLRPC.TL_chatInviteExported) gf0Var.k0.get(i10 - gf0Var.I) : (TLRPC.TL_chatInviteExported) gf0Var.j0.get(i10 - i12);
            int i14 = this.c;
            return ((i7 < i14 || i7 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i7 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i7 - i14)).link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = gf0Var.V) && i10 < gf0Var.W) {
            return i7 - i15 == i10 - i11;
        }
        int i16 = this.i.get(i7, -1);
        return i16 >= 0 && i16 == this.j.get(i10, -1);
    }

    @Override // v4.o
    public final int d() {
        return this.m.Y;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        gf0 gf0Var = this.m;
        g(1, gf0Var.r, sparseIntArray);
        g(2, gf0Var.s, sparseIntArray);
        g(3, gf0Var.w, sparseIntArray);
        g(4, gf0Var.x, sparseIntArray);
        g(5, gf0Var.y, sparseIntArray);
        g(6, gf0Var.M, sparseIntArray);
        g(7, gf0Var.O, sparseIntArray);
        g(8, gf0Var.P, sparseIntArray);
        g(9, gf0Var.R, sparseIntArray);
        g(10, gf0Var.S, sparseIntArray);
        g(11, gf0Var.T, sparseIntArray);
        g(12, gf0Var.Q, sparseIntArray);
        g(13, gf0Var.G, sparseIntArray);
    }
}
