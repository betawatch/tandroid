// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sj6 extends age {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final SparseIntArray h = new SparseIntArray();
    public final SparseIntArray i = new SparseIntArray();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final /* synthetic */ ak6 l;

    public sj6(ak6 ak6Var) {
        this.l = ak6Var;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override // age
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // age
    public final boolean b(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.b;
        ak6 ak6Var = this.l;
        if (((i >= i5 && i < this.c) || (i >= this.d && i < this.e)) && ((i2 >= (i4 = ak6Var.E) && i2 < ak6Var.F) || (i2 >= ak6Var.I && i2 < ak6Var.J))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i2 < i4 || i2 >= ak6Var.F) ? (TLRPC.TL_chatInviteExported) ak6Var.k0.get(i2 - ak6Var.I) : (TLRPC.TL_chatInviteExported) ak6Var.j0.get(i2 - i4);
            int i6 = this.b;
            return ((i < i6 || i >= this.c) ? (TLRPC.TL_chatInviteExported) this.k.get(i - this.d) : (TLRPC.TL_chatInviteExported) this.j.get(i - i6)).link.equals(tL_chatInviteExported.link);
        }
        int i7 = this.f;
        if (i >= i7 && i < this.g && i2 >= (i3 = ak6Var.V) && i2 < ak6Var.W) {
            return i - i7 == i2 - i3;
        }
        int i8 = this.h.get(i, -1);
        return i8 >= 0 && i8 == this.i.get(i2, -1);
    }

    @Override // age
    public final int c() {
        return this.l.Y;
    }

    @Override // age
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ak6 ak6Var = this.l;
        f(1, ak6Var.r, sparseIntArray);
        f(2, ak6Var.s, sparseIntArray);
        f(3, ak6Var.w, sparseIntArray);
        f(4, ak6Var.x, sparseIntArray);
        f(5, ak6Var.y, sparseIntArray);
        f(6, ak6Var.M, sparseIntArray);
        f(7, ak6Var.O, sparseIntArray);
        f(8, ak6Var.P, sparseIntArray);
        f(9, ak6Var.R, sparseIntArray);
        f(10, ak6Var.S, sparseIntArray);
        f(11, ak6Var.T, sparseIntArray);
        f(12, ak6Var.Q, sparseIntArray);
        f(13, ak6Var.G, sparseIntArray);
    }
}
