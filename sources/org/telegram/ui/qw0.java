package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qw0 extends f2.s {
    public int b;
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final /* synthetic */ PrivacyControlActivity e;

    public qw0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
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
        int i11 = this.c.get(i9, -1);
        return i11 == this.d.get(i10, -1) && i11 >= 0;
    }

    @Override // f2.s
    public final int d() {
        return this.e.n0;
    }

    @Override // f2.s
    public final int e() {
        return this.b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.I, sparseIntArray);
        g(2, privacyControlActivity.J, sparseIntArray);
        i9 = privacyControlActivity.everybodyRow;
        g(3, i9, sparseIntArray);
        g(4, privacyControlActivity.K, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.c0, sparseIntArray);
        g(7, privacyControlActivity.L, sparseIntArray);
        g(8, privacyControlActivity.N, sparseIntArray);
        g(9, privacyControlActivity.O, sparseIntArray);
        g(10, privacyControlActivity.P, sparseIntArray);
        g(11, privacyControlActivity.Q, sparseIntArray);
        g(12, privacyControlActivity.R, sparseIntArray);
        g(13, privacyControlActivity.S, sparseIntArray);
        g(14, privacyControlActivity.T, sparseIntArray);
        g(15, privacyControlActivity.U, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.V, sparseIntArray);
        g(19, privacyControlActivity.W, sparseIntArray);
        g(20, privacyControlActivity.X, sparseIntArray);
        g(21, privacyControlActivity.Y, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.Z, sparseIntArray);
        g(24, privacyControlActivity.a0, sparseIntArray);
        g(25, privacyControlActivity.b0, sparseIntArray);
        g(26, privacyControlActivity.d0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.g0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.i0, sparseIntArray);
        g(33, privacyControlActivity.h0, sparseIntArray);
        g(34, privacyControlActivity.j0, sparseIntArray);
        g(35, privacyControlActivity.k0, sparseIntArray);
        g(36, privacyControlActivity.l0, sparseIntArray);
        g(37, privacyControlActivity.m0, sparseIntArray);
    }
}
