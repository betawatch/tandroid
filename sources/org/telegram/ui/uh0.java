package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uh0 extends s4.o {
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
    public final /* synthetic */ di0 m;

    public uh0(di0 di0Var) {
        this.m = di0Var;
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
        di0 di0Var = this.m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f)) && ((i11 >= (i13 = di0Var.y) && i11 < di0Var.E) || (i11 >= di0Var.H && i11 < di0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= di0Var.E) ? (TLRPC.TL_chatInviteExported) di0Var.j0.get(i11 - di0Var.H) : (TLRPC.TL_chatInviteExported) di0Var.i0.get(i11 - i13);
            int i15 = this.c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i10 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = di0Var.U) && i11 < di0Var.V) {
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
        di0 di0Var = this.m;
        g(1, di0Var.r, sparseIntArray);
        g(2, di0Var.s, sparseIntArray);
        g(3, di0Var.v, sparseIntArray);
        g(4, di0Var.w, sparseIntArray);
        g(5, di0Var.x, sparseIntArray);
        g(6, di0Var.L, sparseIntArray);
        g(7, di0Var.N, sparseIntArray);
        g(8, di0Var.O, sparseIntArray);
        g(9, di0Var.Q, sparseIntArray);
        g(10, di0Var.R, sparseIntArray);
        g(11, di0Var.S, sparseIntArray);
        g(12, di0Var.P, sparseIntArray);
        g(13, di0Var.F, sparseIntArray);
    }
}
