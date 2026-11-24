// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qh6 extends zde {
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
    public final /* synthetic */ yh6 l;

    public qh6(yh6 yh6Var) {
        this.l = yh6Var;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override // zde
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // zde
    public final boolean b(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.b;
        yh6 yh6Var = this.l;
        if (((i >= i5 && i < this.c) || (i >= this.d && i < this.e)) && ((i2 >= (i4 = yh6Var.E) && i2 < yh6Var.F) || (i2 >= yh6Var.I && i2 < yh6Var.J))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i2 < i4 || i2 >= yh6Var.F) ? (TLRPC.TL_chatInviteExported) yh6Var.k0.get(i2 - yh6Var.I) : (TLRPC.TL_chatInviteExported) yh6Var.j0.get(i2 - i4);
            int i6 = this.b;
            return ((i < i6 || i >= this.c) ? (TLRPC.TL_chatInviteExported) this.k.get(i - this.d) : (TLRPC.TL_chatInviteExported) this.j.get(i - i6)).link.equals(tL_chatInviteExported.link);
        }
        int i7 = this.f;
        if (i >= i7 && i < this.g && i2 >= (i3 = yh6Var.V) && i2 < yh6Var.W) {
            return i - i7 == i2 - i3;
        }
        int i8 = this.h.get(i, -1);
        return i8 >= 0 && i8 == this.i.get(i2, -1);
    }

    @Override // zde
    public final int c() {
        return this.l.Y;
    }

    @Override // zde
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yh6 yh6Var = this.l;
        f(1, yh6Var.r, sparseIntArray);
        f(2, yh6Var.s, sparseIntArray);
        f(3, yh6Var.w, sparseIntArray);
        f(4, yh6Var.x, sparseIntArray);
        f(5, yh6Var.y, sparseIntArray);
        f(6, yh6Var.M, sparseIntArray);
        f(7, yh6Var.O, sparseIntArray);
        f(8, yh6Var.P, sparseIntArray);
        f(9, yh6Var.R, sparseIntArray);
        f(10, yh6Var.S, sparseIntArray);
        f(11, yh6Var.T, sparseIntArray);
        f(12, yh6Var.Q, sparseIntArray);
        f(13, yh6Var.G, sparseIntArray);
    }
}
