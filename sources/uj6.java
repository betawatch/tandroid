// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uj6 extends qie {
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
    public final /* synthetic */ ck6 l;

    public uj6(ck6 ck6Var) {
        this.l = ck6Var;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.b;
        ck6 ck6Var = this.l;
        if (((i >= i5 && i < this.c) || (i >= this.d && i < this.e)) && ((i2 >= (i4 = ck6Var.E) && i2 < ck6Var.F) || (i2 >= ck6Var.I && i2 < ck6Var.J))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i2 < i4 || i2 >= ck6Var.F) ? (TLRPC.TL_chatInviteExported) ck6Var.k0.get(i2 - ck6Var.I) : (TLRPC.TL_chatInviteExported) ck6Var.j0.get(i2 - i4);
            int i6 = this.b;
            return ((i < i6 || i >= this.c) ? (TLRPC.TL_chatInviteExported) this.k.get(i - this.d) : (TLRPC.TL_chatInviteExported) this.j.get(i - i6)).link.equals(tL_chatInviteExported.link);
        }
        int i7 = this.f;
        if (i >= i7 && i < this.g && i2 >= (i3 = ck6Var.V) && i2 < ck6Var.W) {
            return i - i7 == i2 - i3;
        }
        int i8 = this.h.get(i, -1);
        return i8 >= 0 && i8 == this.i.get(i2, -1);
    }

    @Override // qie
    public final int c() {
        return this.l.Y;
    }

    @Override // qie
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ck6 ck6Var = this.l;
        f(1, ck6Var.r, sparseIntArray);
        f(2, ck6Var.s, sparseIntArray);
        f(3, ck6Var.w, sparseIntArray);
        f(4, ck6Var.x, sparseIntArray);
        f(5, ck6Var.y, sparseIntArray);
        f(6, ck6Var.M, sparseIntArray);
        f(7, ck6Var.O, sparseIntArray);
        f(8, ck6Var.P, sparseIntArray);
        f(9, ck6Var.R, sparseIntArray);
        f(10, ck6Var.S, sparseIntArray);
        f(11, ck6Var.T, sparseIntArray);
        f(12, ck6Var.Q, sparseIntArray);
        f(13, ck6Var.G, sparseIntArray);
    }
}
