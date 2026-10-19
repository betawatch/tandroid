package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class b0 extends n0 {
    public int A;
    public a0 B;
    public final i2.o0 C;
    public final k2.k D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public z p;
    public androidx.emoji2.text.g q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public b0() {
        this(1, false);
    }

    public void A0(y0 y0Var, z zVar, e2.f fVar) {
        int i10 = zVar.d;
        if (i10 < 0 || i10 >= y0Var.b()) {
            return;
        }
        fVar.b(i10, Math.max(0, zVar.g));
    }

    public final int B0(y0 y0Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || y0Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(y0 y0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && y0Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (y0Var.b() - Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(y0 y0Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || y0Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return y0Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * y0Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < n0.H(q(0))) != this.v ? -1 : 1;
        return this.o == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final int F0(int i10) {
        if (i10 == 1) {
            return (this.o != 1 && Y0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.o != 1 && Y0()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.o == 0) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 33) {
            if (this.o == 1) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 66) {
            if (this.o == 0) {
                return 1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 130 && this.o == 1) {
            return 1;
        }
        return TLObject.FLAG_31;
    }

    public final void G0() {
        if (this.p == null) {
            z zVar = new z();
            zVar.a = true;
            zVar.h = 0;
            zVar.i = 0;
            zVar.k = null;
            this.p = zVar;
        }
    }

    public final int H0(qf.e eVar, z zVar, y0 y0Var, boolean z10) {
        int i10 = zVar.c;
        int i11 = zVar.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                zVar.g = i11 + i10;
            }
            c1(eVar, zVar);
        }
        int i12 = zVar.c + zVar.h;
        while (true) {
            if ((!zVar.l && i12 <= 0) || !zVar.b(y0Var)) {
                break;
            }
            k2.k kVar = this.D;
            kVar.a = 0;
            kVar.b = false;
            kVar.c = false;
            kVar.d = false;
            Z0(eVar, y0Var, zVar, kVar);
            if (!kVar.b) {
                int i13 = zVar.b;
                int i14 = kVar.a;
                zVar.b = (zVar.f * i14) + i13;
                if (!kVar.c || zVar.k != null || !y0Var.g) {
                    zVar.c -= i14;
                    i12 -= i14;
                }
                int i15 = zVar.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    zVar.g = i16;
                    int i17 = zVar.c;
                    if (i17 < 0) {
                        zVar.g = i16 + i17;
                    }
                    c1(eVar, zVar);
                }
                if (z10 && kVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - zVar.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z10) {
        return this.v ? P0(0, r(), z10, true) : P0(r() - 1, -1, z10, true);
    }

    public final View K0(boolean z10) {
        return this.v ? P0(r() - 1, -1, z10, true) : P0(0, r(), z10, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 <= i10 && i11 >= i10) {
            return q(i10);
        }
        if (this.q.d(q(i10)) < this.q.j()) {
            i12 = 16644;
            i13 = LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.o == 0 ? this.c.U(i10, i11, i12, i13) : this.d.U(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.U(i10, i11, i12, i13) : this.d.U(i10, i11, i12, i13);
    }

    public View Q0(qf.e eVar, y0 y0Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.r ? 0 : this.q.j();
        int f7 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = n0.H(q6);
            if (H >= 0 && H < i12) {
                if (((o0) q6.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else {
                    if (this.q.d(q6) < f7 && this.q.a(q6) >= j10) {
                        return q6;
                    }
                    if (view == null) {
                        view = q6;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // s4.n0
    public View R(View view, int i10, qf.e eVar, y0 y0Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, y0Var);
            z zVar = this.p;
            zVar.g = TLObject.FLAG_31;
            zVar.a = false;
            H0(eVar, zVar, y0Var, true);
            View O0 = F0 == -1 ? this.v ? O0(r() - 1, -1) : O0(0, r()) : this.v ? O0(0, r()) : O0(r() - 1, -1);
            View V0 = F0 == -1 ? V0() : U0();
            if (!V0.hasFocusable()) {
                return O0;
            }
            if (O0 != null) {
                return V0;
            }
        }
        return null;
    }

    public int R0() {
        return 0;
    }

    public final int S0(int i10, qf.e eVar, y0 y0Var, boolean z10) {
        int f7;
        int f10;
        if (!this.G || !this.H || (f7 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f7, eVar, y0Var);
        int i12 = i10 + i11;
        if (!z10 || (f10 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f10);
        return f10 + i11;
    }

    public final int T0(int i10, qf.e eVar, y0 y0Var, boolean z10) {
        int X0;
        int j10;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, eVar, y0Var);
        int i12 = i10 + i11;
        if (!z10 || (j10 = i12 - this.q.j()) <= 0) {
            return i11;
        }
        this.q.n(-j10);
        return i11 - j10;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(y0 y0Var) {
        if (y0Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int X0() {
        return this.q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Z0(qf.e eVar, y0 y0Var, z zVar, k2.k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = zVar.c(eVar);
        if (c10 == null) {
            kVar.b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (zVar.k == null) {
            if (this.v == (zVar.f == -1)) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            if (this.v == (zVar.f == -1)) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        kVar.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c10);
            } else {
                i10 = D();
                i13 = this.q.c(c10) + i10;
            }
            if (zVar.f == -1) {
                i11 = zVar.b;
                i12 = i11 - kVar.a;
            } else {
                i12 = zVar.b;
                i11 = kVar.a + i12;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (zVar.f == -1) {
                int i14 = zVar.b;
                int i15 = i14 - kVar.a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = zVar.b;
                int i17 = kVar.a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        n0.O(c10, i10, i12, i13, i11);
        if (o0Var.a.j() || o0Var.a.m()) {
            kVar.c = true;
        }
        kVar.d = c10.hasFocusable();
    }

    @Override // s4.n0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(qf.e eVar, y0 y0Var) {
        View view;
        View view2;
        qf.e eVar2;
        View Q0;
        int i10;
        int d;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int S0;
        int i15;
        View m10;
        int d10;
        int i16;
        int i17;
        b0 b0Var = this;
        y0 y0Var2 = y0Var;
        int i18 = -1;
        if (!(b0Var.B == null && b0Var.y == -1) && y0Var2.b() == 0) {
            g0(eVar);
            return;
        }
        a0 a0Var = b0Var.B;
        if (a0Var != null && (i17 = a0Var.a) >= 0) {
            b0Var.y = i17;
        }
        b0Var.G0();
        b0Var.p.a = false;
        b0Var.f1();
        RecyclerView recyclerView = b0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) b0Var.a.d).contains(view)) {
            view = null;
        }
        i2.o0 o0Var = b0Var.C;
        if (o0Var.d && b0Var.y == -1 && b0Var.B == null) {
            if (view != null && (b0Var.q.d(view) >= b0Var.q.f() || b0Var.q.a(view) <= b0Var.q.j())) {
                o0Var.d(((o0) view.getLayoutParams()).b(), view);
            }
            eVar2 = eVar;
        } else {
            o0Var.g();
            o0Var.c = b0Var.v ^ b0Var.w;
            if (!y0Var2.g && (i10 = b0Var.y) != -1) {
                if (i10 < 0 || i10 >= y0Var2.b()) {
                    b0Var.y = -1;
                    b0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = b0Var.y;
                    o0Var.b = i19;
                    a0 a0Var2 = b0Var.B;
                    if (a0Var2 != null && a0Var2.a >= 0) {
                        boolean z10 = a0Var2.c;
                        o0Var.c = z10;
                        if (z10) {
                            o0Var.e = b0Var.q.f() - b0Var.B.b;
                        } else {
                            o0Var.e = b0Var.q.j() + b0Var.B.b;
                        }
                    } else if (b0Var.A == Integer.MIN_VALUE) {
                        View m11 = b0Var.m(i19);
                        if (m11 == null) {
                            if (b0Var.r() > 0) {
                                o0Var.c = (b0Var.y < n0.H(b0Var.q(0))) == b0Var.z;
                            }
                            o0Var.b();
                        } else if (b0Var.q.b(m11) > b0Var.q.k()) {
                            o0Var.b();
                        } else if (b0Var.q.d(m11) - b0Var.q.j() < 0) {
                            o0Var.e = b0Var.q.j();
                            o0Var.c = false;
                        } else if (b0Var.q.f() - b0Var.q.a(m11) < 0) {
                            o0Var.e = b0Var.q.f();
                            o0Var.c = true;
                        } else {
                            if (o0Var.c) {
                                int a2 = b0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = b0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = b0Var.q.d(m11);
                            }
                            o0Var.e = d;
                        }
                    } else {
                        boolean z11 = b0Var.z;
                        o0Var.c = z11;
                        if (z11) {
                            o0Var.e = b0Var.q.f() - b0Var.A;
                        } else {
                            o0Var.e = b0Var.q.j() + b0Var.A;
                        }
                    }
                    eVar2 = eVar;
                    o0Var.d = true;
                }
            }
            if (b0Var.r() != 0) {
                RecyclerView recyclerView2 = b0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) b0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    o0 o0Var2 = (o0) view2.getLayoutParams();
                    if (!o0Var2.a.j() && o0Var2.b() >= 0 && o0Var2.b() < y0Var2.b()) {
                        o0Var.d(((o0) view2.getLayoutParams()).b(), view2);
                        eVar2 = eVar;
                        o0Var.d = true;
                    }
                }
                if (b0Var.s == b0Var.w) {
                    if (o0Var.c) {
                        if (b0Var.v) {
                            Q0 = b0Var.Q0(eVar, y0Var2, 0, b0Var.r(), y0Var2.b());
                            b0Var = this;
                        } else {
                            b0Var = this;
                            Q0 = b0Var.Q0(eVar, y0Var, r() - 1, -1, y0Var.b());
                        }
                        eVar2 = eVar;
                        y0Var2 = y0Var;
                    } else if (b0Var.v) {
                        eVar2 = eVar;
                        y0Var2 = y0Var;
                        Q0 = b0Var.Q0(eVar2, y0Var2, b0Var.r() - 1, -1, y0Var.b());
                        b0Var = this;
                    } else {
                        b0Var = this;
                        eVar2 = eVar;
                        y0Var2 = y0Var;
                        Q0 = b0Var.Q0(eVar2, y0Var2, 0, r(), y0Var.b());
                    }
                    if (Q0 != null) {
                        o0Var.c(((o0) Q0.getLayoutParams()).b(), Q0);
                        if (!y0Var2.g && b0Var.y0() && (b0Var.q.d(Q0) >= b0Var.q.f() || b0Var.q.a(Q0) < b0Var.q.j())) {
                            o0Var.e = o0Var.c ? b0Var.q.f() : b0Var.q.j();
                        }
                        o0Var.d = true;
                    }
                    o0Var.b();
                    o0Var.b = !b0Var.w ? y0Var2.b() - 1 : b0Var.R0();
                    o0Var.d = true;
                }
            }
            eVar2 = eVar;
            o0Var.b();
            o0Var.b = !b0Var.w ? y0Var2.b() - 1 : b0Var.R0();
            o0Var.d = true;
        }
        z zVar = b0Var.p;
        zVar.f = zVar.j >= 0 ? 1 : -1;
        int[] iArr = b0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        b0Var.z0(y0Var2, iArr);
        int j10 = b0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = b0Var.q.g() + Math.max(0, iArr[1]);
        if (y0Var2.g && (i15 = b0Var.y) != -1 && b0Var.A != Integer.MIN_VALUE && (m10 = b0Var.m(i15)) != null) {
            if (b0Var.z) {
                i16 = b0Var.q.f() - b0Var.q.a(m10);
                d10 = b0Var.A;
            } else {
                d10 = b0Var.q.d(m10) - b0Var.q.j();
                i16 = b0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j10 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!o0Var.c ? !b0Var.v : b0Var.v) {
            i18 = 1;
        }
        b0Var.a1(eVar2, y0Var2, o0Var, i18);
        for (int r10 = b0Var.r() - 1; r10 >= 0; r10--) {
            View q6 = b0Var.q(r10);
            b1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || b0Var.b.w.b) {
                    b0Var.q(r10);
                    b0Var.a.y(r10);
                    eVar2.i(q6);
                    b0Var.b.f.m0(U);
                } else {
                    b0Var.j0(r10);
                    eVar2.h(U);
                }
            }
        }
        b0Var.p.l = b0Var.q.h() == 0 && b0Var.q.e() == 0;
        b0Var.p.getClass();
        b0Var.p.i = 0;
        if (o0Var.c) {
            b0Var.o1(o0Var.b, o0Var.e);
            z zVar2 = b0Var.p;
            zVar2.h = j10;
            b0Var.H0(eVar2, zVar2, y0Var2, false);
            z zVar3 = b0Var.p;
            i12 = zVar3.b;
            int i21 = zVar3.d;
            int i22 = zVar3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            b0Var.n1(o0Var.b, o0Var.e);
            z zVar4 = b0Var.p;
            zVar4.h = g10;
            zVar4.d += zVar4.e;
            b0Var.H0(eVar2, zVar4, y0Var2, false);
            z zVar5 = b0Var.p;
            i11 = zVar5.b;
            int i23 = zVar5.c;
            if (i23 > 0) {
                b0Var.o1(i21, i12);
                z zVar6 = b0Var.p;
                zVar6.h = i23;
                b0Var.H0(eVar2, zVar6, y0Var2, false);
                i12 = b0Var.p.b;
            }
        } else {
            b0Var.n1(o0Var.b, o0Var.e);
            z zVar7 = b0Var.p;
            zVar7.h = g10;
            b0Var.H0(eVar2, zVar7, y0Var2, false);
            z zVar8 = b0Var.p;
            i11 = zVar8.b;
            int i24 = zVar8.d;
            int i25 = zVar8.c;
            if (i25 > 0) {
                j10 += i25;
            }
            b0Var.o1(o0Var.b, o0Var.e);
            z zVar9 = b0Var.p;
            zVar9.h = j10;
            zVar9.d += zVar9.e;
            b0Var.H0(eVar2, zVar9, y0Var2, false);
            z zVar10 = b0Var.p;
            i12 = zVar10.b;
            int i26 = zVar10.c;
            if (i26 > 0) {
                b0Var.n1(i24, i11);
                z zVar11 = b0Var.p;
                zVar11.h = i26;
                b0Var.H0(eVar2, zVar11, y0Var2, false);
                i11 = b0Var.p.b;
            }
        }
        if (b0Var.r() > 0) {
            if (b0Var.v ^ b0Var.w) {
                int S02 = b0Var.S0(i11, eVar2, y0Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = b0Var.T0(i13, eVar2, y0Var2, false);
            } else {
                int T0 = b0Var.T0(i12, eVar2, y0Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = b0Var.S0(i14, eVar2, y0Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (y0Var2.k && b0Var.r() != 0 && !y0Var2.g && b0Var.y0()) {
            List list2 = (List) eVar2.f;
            int size = list2.size();
            int H = n0.H(b0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                b1 b1Var = (b1) list2.get(i29);
                boolean j11 = b1Var.j();
                View view3 = b1Var.a;
                if (!j11) {
                    if ((b1Var.c() < H) != b0Var.v) {
                        i27 += b0Var.q.b(view3);
                    } else {
                        i28 += b0Var.q.b(view3);
                    }
                }
            }
            b0Var.p.k = list2;
            if (i27 > 0) {
                b0Var.o1(n0.H(b0Var.V0()), i12);
                z zVar12 = b0Var.p;
                zVar12.h = i27;
                zVar12.c = 0;
                zVar12.a(null);
                b0Var.H0(eVar2, b0Var.p, y0Var2, false);
            }
            if (i28 > 0) {
                b0Var.n1(n0.H(b0Var.U0()), i11);
                z zVar13 = b0Var.p;
                zVar13.h = i28;
                zVar13.c = 0;
                list = null;
                zVar13.a(null);
                b0Var.H0(eVar2, b0Var.p, y0Var2, false);
            } else {
                list = null;
            }
            b0Var.p.k = list;
        }
        if (y0Var2.g) {
            o0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = b0Var.q;
            gVar2.a = gVar2.k();
        }
        b0Var.s = b0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = n0.H(view);
        int H2 = n0.H(view2);
        char c10 = H < H2 ? (char) 1 : (char) 65535;
        if (this.v) {
            if (c10 == 1) {
                h1(H2, this.q.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                h1(H2, this.q.f() - this.q.a(view2));
                return;
            }
        }
        if (c10 == 65535) {
            h1(H2, this.q.d(view2));
        } else {
            h1(H2, this.q.a(view2) - this.q.b(view));
        }
    }

    @Override // s4.n0
    public void c0(y0 y0Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(qf.e eVar, z zVar) {
        b1 T;
        b1 T2;
        if (!zVar.a || zVar.l) {
            return;
        }
        int i10 = zVar.g;
        int i11 = zVar.i;
        if (zVar.f != -1) {
            e1(eVar, i10, i11);
            return;
        }
        int r10 = r();
        if (i10 < 0) {
            return;
        }
        int e = (this.q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6 != null && (T2 = this.b.T(q6)) != null && !T2.r() && (this.q.d(q6) < e || this.q.m(q6) < e)) {
                    d1(eVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q10 = q(i14);
            if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.d(q10) < e || this.q.m(q10) < e)) {
                d1(eVar, i13, i14);
                return;
            }
        }
    }

    @Override // s4.n0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(qf.e eVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                i0(i10, eVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                i0(i12, eVar);
            }
        }
    }

    @Override // s4.n0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // s4.n0
    public final a0 e0() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0 a0Var2 = new a0();
            a0Var2.a = a0Var.a;
            a0Var2.b = a0Var.b;
            a0Var2.c = a0Var.c;
            return a0Var2;
        }
        a0 a0Var3 = new a0();
        if (r() <= 0) {
            a0Var3.a = -1;
            return a0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        a0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            a0Var3.b = this.q.f() - this.q.a(U0);
            a0Var3.a = ((o0) U0.getLayoutParams()).b();
            return a0Var3;
        }
        View V0 = V0();
        a0Var3.a = n0.H(V0);
        a0Var3.b = this.q.d(V0) - this.q.j();
        return a0Var3;
    }

    public void e1(qf.e eVar, int i10, int i11) {
        b1 T;
        b1 T2;
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int r10 = r();
        if (!this.v) {
            for (int i13 = 0; i13 < r10; i13++) {
                View q6 = q(i13);
                if (q6 != null && (T = this.b.T(q6)) != null && !T.r() && (this.q.a(q6) > i12 || this.q.l(q6) > i12)) {
                    d1(eVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = r10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View q10 = q(i15);
            if (q10 != null && (T2 = this.b.T(q10)) != null && !T2.r() && (this.q.a(q10) > i12 || this.q.l(q10) > i12)) {
                d1(eVar, i14, i15);
                return;
            }
        }
    }

    public final void f1() {
        if (this.o == 1 || !Y0()) {
            this.v = this.t;
        } else {
            this.v = !this.t;
        }
    }

    public final int g1(int i10, qf.e eVar, y0 y0Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, y0Var);
        z zVar = this.p;
        int H0 = H0(eVar, zVar, y0Var, false) + zVar.g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.q.n(-i10);
        this.p.j = i10;
        return i10;
    }

    @Override // s4.n0
    public int h(y0 y0Var) {
        return C0(y0Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // s4.n0
    public int i(y0 y0Var) {
        return D0(y0Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.y == i10 && this.A == i11 && this.z == z10) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z10;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.a = -1;
        }
        l0();
    }

    @Override // s4.n0
    public int j(y0 y0Var) {
        return B0(y0Var);
    }

    public final void j1(int i10) {
        e0 e0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i2.e.j(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                e0Var = new e0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                e0Var = new e0(this, 1);
            }
            this.q = e0Var;
            this.C.f = e0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // s4.n0
    public int k(y0 y0Var) {
        return C0(y0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // s4.n0
    public int l(y0 y0Var) {
        return D0(y0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // s4.n0
    public final View m(int i10) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i10 - n0.H(q(0));
        if (H >= 0 && H < r10) {
            View q6 = q(H);
            if (n0.H(q6) == i10) {
                return q6;
            }
        }
        int r11 = r();
        for (int i11 = 0; i11 < r11; i11++) {
            View q10 = q(i11);
            b1 U = RecyclerView.U(q10);
            if (U != null && U.c() == i10 && !U.r() && (this.b.u0.g || !U.j())) {
                return q10;
            }
        }
        return null;
    }

    @Override // s4.n0
    public int m0(int i10, qf.e eVar, y0 y0Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, eVar, y0Var);
    }

    public final void m1(int i10, int i11, boolean z10, y0 y0Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(y0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        z zVar = this.p;
        int i12 = z11 ? max2 : max;
        zVar.h = i12;
        if (!z11) {
            max = max2;
        }
        zVar.i = max;
        if (z11) {
            zVar.h = this.q.g() + i12;
            View U0 = U0();
            z zVar2 = this.p;
            zVar2.e = this.v ? -1 : 1;
            int H = n0.H(U0);
            z zVar3 = this.p;
            zVar2.d = H + zVar3.e;
            zVar3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            z zVar4 = this.p;
            zVar4.h = this.q.j() + zVar4.h;
            z zVar5 = this.p;
            zVar5.e = this.v ? 1 : -1;
            int H2 = n0.H(V0);
            z zVar6 = this.p;
            zVar5.d = H2 + zVar6.e;
            zVar6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        z zVar7 = this.p;
        zVar7.c = i11;
        if (z10) {
            zVar7.c = i11 - j10;
        }
        zVar7.g = j10;
    }

    @Override // s4.n0
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override // s4.n0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        z zVar = this.p;
        zVar.e = this.v ? -1 : 1;
        zVar.d = i10;
        zVar.f = 1;
        zVar.b = i11;
        zVar.g = TLObject.FLAG_31;
    }

    @Override // s4.n0
    public int o0(int i10, qf.e eVar, y0 y0Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, eVar, y0Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        z zVar = this.p;
        zVar.d = i10;
        zVar.e = this.v ? 1 : -1;
        zVar.f = -1;
        zVar.b = i11;
        zVar.g = TLObject.FLAG_31;
    }

    @Override // s4.n0
    public void v0(RecyclerView recyclerView, y0 y0Var, int i10) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.a = i10;
        w0(c0Var);
    }

    @Override // s4.n0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(y0 y0Var, int[] iArr) {
        int i10;
        int W0 = W0(y0Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public b0(int i10, boolean z10) {
        this.o = 1;
        this.r = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = true;
        this.y = -1;
        this.z = true;
        this.A = TLObject.FLAG_31;
        this.B = null;
        i2.o0 o0Var = new i2.o0();
        o0Var.g();
        this.C = o0Var;
        this.D = new k2.k();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(qf.e eVar, y0 y0Var, i2.o0 o0Var, int i10) {
    }
}
