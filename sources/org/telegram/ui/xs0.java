package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xs0 extends u4.o {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final /* synthetic */ PrivacyControlActivity e;

    public xs0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        int i11 = this.c.get(i3, -1);
        return i11 == this.d.get(i10, -1) && i11 >= 0;
    }

    @Override // u4.o
    public final int d() {
        return this.e.t0;
    }

    @Override // u4.o
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.O, sparseIntArray);
        g(2, privacyControlActivity.P, sparseIntArray);
        i3 = privacyControlActivity.everybodyRow;
        g(3, i3, sparseIntArray);
        g(4, privacyControlActivity.Q, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.i0, sparseIntArray);
        g(7, privacyControlActivity.R, sparseIntArray);
        g(8, privacyControlActivity.T, sparseIntArray);
        g(9, privacyControlActivity.U, sparseIntArray);
        g(10, privacyControlActivity.V, sparseIntArray);
        g(11, privacyControlActivity.W, sparseIntArray);
        g(12, privacyControlActivity.X, sparseIntArray);
        g(13, privacyControlActivity.Y, sparseIntArray);
        g(14, privacyControlActivity.Z, sparseIntArray);
        g(15, privacyControlActivity.a0, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.b0, sparseIntArray);
        g(19, privacyControlActivity.c0, sparseIntArray);
        g(20, privacyControlActivity.d0, sparseIntArray);
        g(21, privacyControlActivity.e0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.f0, sparseIntArray);
        g(24, privacyControlActivity.g0, sparseIntArray);
        g(25, privacyControlActivity.h0, sparseIntArray);
        g(26, privacyControlActivity.j0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.l0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.m0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.o0, sparseIntArray);
        g(33, privacyControlActivity.n0, sparseIntArray);
        g(34, privacyControlActivity.p0, sparseIntArray);
        g(35, privacyControlActivity.q0, sparseIntArray);
        g(36, privacyControlActivity.r0, sparseIntArray);
        g(37, privacyControlActivity.s0, sparseIntArray);
    }
}
