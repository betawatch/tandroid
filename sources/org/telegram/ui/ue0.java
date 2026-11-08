package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ue0 extends v4.o {
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
    public final /* synthetic */ cf0 m;

    public ue0(cf0 cf0Var) {
        this.m = cf0Var;
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
        cf0 cf0Var = this.m;
        if (((i7 >= i13 && i7 < this.d) || (i7 >= this.e && i7 < this.f)) && ((i10 >= (i12 = cf0Var.D) && i10 < cf0Var.E) || (i10 >= cf0Var.H && i10 < cf0Var.I))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i10 < i12 || i10 >= cf0Var.E) ? (TLRPC.TL_chatInviteExported) cf0Var.j0.get(i10 - cf0Var.H) : (TLRPC.TL_chatInviteExported) cf0Var.i0.get(i10 - i12);
            int i14 = this.c;
            return ((i7 < i14 || i7 >= this.d) ? (TLRPC.TL_chatInviteExported) this.l.get(i7 - this.e) : (TLRPC.TL_chatInviteExported) this.k.get(i7 - i14)).link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.g;
        if (i7 >= i15 && i7 < this.h && i10 >= (i11 = cf0Var.U) && i10 < cf0Var.V) {
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
        cf0 cf0Var = this.m;
        g(1, cf0Var.r, sparseIntArray);
        g(2, cf0Var.s, sparseIntArray);
        g(3, cf0Var.w, sparseIntArray);
        g(4, cf0Var.x, sparseIntArray);
        g(5, cf0Var.y, sparseIntArray);
        g(6, cf0Var.L, sparseIntArray);
        g(7, cf0Var.N, sparseIntArray);
        g(8, cf0Var.O, sparseIntArray);
        g(9, cf0Var.Q, sparseIntArray);
        g(10, cf0Var.R, sparseIntArray);
        g(11, cf0Var.S, sparseIntArray);
        g(12, cf0Var.P, sparseIntArray);
        g(13, cf0Var.F, sparseIntArray);
    }
}
