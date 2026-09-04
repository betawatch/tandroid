package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class c0 extends o0 {
    public int A;
    public b0 B;
    public final i2.l0 C;
    public final z D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public a0 p;
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

    public c0() {
        this(1, false);
    }

    public void A0(z0 z0Var, a0 a0Var, a0.h hVar) {
        int i10 = a0Var.d;
        if (i10 < 0 || i10 >= z0Var.b()) {
            return;
        }
        hVar.b(i10, Math.max(0, a0Var.g));
    }

    public final int B0(z0 z0Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || z0Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (z0Var.b() - Math.max(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(z0 z0Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || z0Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return z0Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1)) * z0Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < o0.H(q(0))) != this.v ? -1 : 1;
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
            a0 a0Var = new a0();
            a0Var.a = true;
            a0Var.h = 0;
            a0Var.i = 0;
            a0Var.k = null;
            this.p = a0Var;
        }
    }

    public final int H0(pf.e eVar, a0 a0Var, z0 z0Var, boolean z10) {
        int i10 = a0Var.c;
        int i11 = a0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.g = i11 + i10;
            }
            c1(eVar, a0Var);
        }
        int i12 = a0Var.c + a0Var.h;
        while (true) {
            if ((!a0Var.l && i12 <= 0) || !a0Var.b(z0Var)) {
                break;
            }
            z zVar = this.D;
            zVar.a = 0;
            zVar.b = false;
            zVar.c = false;
            zVar.d = false;
            Z0(eVar, z0Var, a0Var, zVar);
            if (!zVar.b) {
                int i13 = a0Var.b;
                int i14 = zVar.a;
                a0Var.b = (a0Var.f * i14) + i13;
                if (!zVar.c || a0Var.k != null || !z0Var.g) {
                    a0Var.c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.g = i16;
                    int i17 = a0Var.c;
                    if (i17 < 0) {
                        a0Var.g = i16 + i17;
                    }
                    c1(eVar, a0Var);
                }
                if (z10 && zVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
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
        return ((p0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
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
        return this.o == 0 ? this.c.C(i10, i11, i12, i13) : this.d.C(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.C(i10, i11, i12, i13) : this.d.C(i10, i11, i12, i13);
    }

    public View Q0(pf.e eVar, z0 z0Var, int i10, int i11, int i12) {
        G0();
        int j3 = this.r ? 0 : this.q.j();
        int f7 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = o0.H(q6);
            if (H >= 0 && H < i12) {
                if (((p0) q6.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else {
                    if (this.q.d(q6) < f7 && this.q.a(q6) >= j3) {
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

    @Override // s4.o0
    public View R(View view, int i10, pf.e eVar, z0 z0Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, z0Var);
            a0 a0Var = this.p;
            a0Var.g = TLObject.FLAG_31;
            a0Var.a = false;
            H0(eVar, a0Var, z0Var, true);
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

    public final int S0(int i10, pf.e eVar, z0 z0Var, boolean z10) {
        int f7;
        int f10;
        if (!this.G || !this.H || (f7 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f7, eVar, z0Var);
        int i12 = i10 + i11;
        if (!z10 || (f10 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f10);
        return f10 + i11;
    }

    public final int T0(int i10, pf.e eVar, z0 z0Var, boolean z10) {
        int X0;
        int j3;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, eVar, z0Var);
        int i12 = i10 + i11;
        if (!z10 || (j3 = i12 - this.q.j()) <= 0) {
            return i11;
        }
        this.q.n(-j3);
        return i11 - j3;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(z0 z0Var) {
        if (z0Var.a != -1) {
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

    public void Z0(pf.e eVar, z0 z0Var, a0 a0Var, z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = a0Var.c(eVar);
        if (c10 == null) {
            zVar.b = true;
            return;
        }
        p0 p0Var = (p0) c10.getLayoutParams();
        if (a0Var.k == null) {
            if (this.v == (a0Var.f == -1)) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            if (this.v == (a0Var.f == -1)) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        zVar.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c10);
            } else {
                i10 = D();
                i13 = this.q.c(c10) + i10;
            }
            if (a0Var.f == -1) {
                i11 = a0Var.b;
                i12 = i11 - zVar.a;
            } else {
                i12 = a0Var.b;
                i11 = zVar.a + i12;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (a0Var.f == -1) {
                int i14 = a0Var.b;
                int i15 = i14 - zVar.a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = a0Var.b;
                int i17 = zVar.a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        o0.O(c10, i10, i12, i13, i11);
        if (p0Var.a.j() || p0Var.a.m()) {
            zVar.c = true;
        }
        zVar.d = c10.hasFocusable();
    }

    @Override // s4.o0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(pf.e eVar, z0 z0Var) {
        View view;
        View view2;
        pf.e eVar2;
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
        c0 c0Var = this;
        z0 z0Var2 = z0Var;
        int i18 = -1;
        if (!(c0Var.B == null && c0Var.y == -1) && z0Var2.b() == 0) {
            g0(eVar);
            return;
        }
        b0 b0Var = c0Var.B;
        if (b0Var != null && (i17 = b0Var.a) >= 0) {
            c0Var.y = i17;
        }
        c0Var.G0();
        c0Var.p.a = false;
        c0Var.f1();
        RecyclerView recyclerView = c0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) c0Var.a.b).contains(view)) {
            view = null;
        }
        i2.l0 l0Var = c0Var.C;
        if (l0Var.d && c0Var.y == -1 && c0Var.B == null) {
            if (view != null && (c0Var.q.d(view) >= c0Var.q.f() || c0Var.q.a(view) <= c0Var.q.j())) {
                l0Var.d(((p0) view.getLayoutParams()).b(), view);
            }
            eVar2 = eVar;
        } else {
            l0Var.g();
            l0Var.c = c0Var.v ^ c0Var.w;
            if (!z0Var2.g && (i10 = c0Var.y) != -1) {
                if (i10 < 0 || i10 >= z0Var2.b()) {
                    c0Var.y = -1;
                    c0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = c0Var.y;
                    l0Var.b = i19;
                    b0 b0Var2 = c0Var.B;
                    if (b0Var2 != null && b0Var2.a >= 0) {
                        boolean z10 = b0Var2.c;
                        l0Var.c = z10;
                        if (z10) {
                            l0Var.e = c0Var.q.f() - c0Var.B.b;
                        } else {
                            l0Var.e = c0Var.q.j() + c0Var.B.b;
                        }
                    } else if (c0Var.A == Integer.MIN_VALUE) {
                        View m11 = c0Var.m(i19);
                        if (m11 == null) {
                            if (c0Var.r() > 0) {
                                l0Var.c = (c0Var.y < o0.H(c0Var.q(0))) == c0Var.z;
                            }
                            l0Var.b();
                        } else if (c0Var.q.b(m11) > c0Var.q.k()) {
                            l0Var.b();
                        } else if (c0Var.q.d(m11) - c0Var.q.j() < 0) {
                            l0Var.e = c0Var.q.j();
                            l0Var.c = false;
                        } else if (c0Var.q.f() - c0Var.q.a(m11) < 0) {
                            l0Var.e = c0Var.q.f();
                            l0Var.c = true;
                        } else {
                            if (l0Var.c) {
                                int a2 = c0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = c0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = c0Var.q.d(m11);
                            }
                            l0Var.e = d;
                        }
                    } else {
                        boolean z11 = c0Var.z;
                        l0Var.c = z11;
                        if (z11) {
                            l0Var.e = c0Var.q.f() - c0Var.A;
                        } else {
                            l0Var.e = c0Var.q.j() + c0Var.A;
                        }
                    }
                    eVar2 = eVar;
                    l0Var.d = true;
                }
            }
            if (c0Var.r() != 0) {
                RecyclerView recyclerView2 = c0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) c0Var.a.b).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    p0 p0Var = (p0) view2.getLayoutParams();
                    if (!p0Var.a.j() && p0Var.b() >= 0 && p0Var.b() < z0Var2.b()) {
                        l0Var.d(((p0) view2.getLayoutParams()).b(), view2);
                        eVar2 = eVar;
                        l0Var.d = true;
                    }
                }
                if (c0Var.s == c0Var.w) {
                    if (l0Var.c) {
                        if (c0Var.v) {
                            Q0 = c0Var.Q0(eVar, z0Var2, 0, c0Var.r(), z0Var2.b());
                            c0Var = this;
                        } else {
                            c0Var = this;
                            Q0 = c0Var.Q0(eVar, z0Var, r() - 1, -1, z0Var.b());
                        }
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                    } else if (c0Var.v) {
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                        Q0 = c0Var.Q0(eVar2, z0Var2, c0Var.r() - 1, -1, z0Var.b());
                        c0Var = this;
                    } else {
                        c0Var = this;
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                        Q0 = c0Var.Q0(eVar2, z0Var2, 0, r(), z0Var.b());
                    }
                    if (Q0 != null) {
                        l0Var.c(((p0) Q0.getLayoutParams()).b(), Q0);
                        if (!z0Var2.g && c0Var.y0() && (c0Var.q.d(Q0) >= c0Var.q.f() || c0Var.q.a(Q0) < c0Var.q.j())) {
                            l0Var.e = l0Var.c ? c0Var.q.f() : c0Var.q.j();
                        }
                        l0Var.d = true;
                    }
                    l0Var.b();
                    l0Var.b = !c0Var.w ? z0Var2.b() - 1 : c0Var.R0();
                    l0Var.d = true;
                }
            }
            eVar2 = eVar;
            l0Var.b();
            l0Var.b = !c0Var.w ? z0Var2.b() - 1 : c0Var.R0();
            l0Var.d = true;
        }
        a0 a0Var = c0Var.p;
        a0Var.f = a0Var.j >= 0 ? 1 : -1;
        int[] iArr = c0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        c0Var.z0(z0Var2, iArr);
        int j3 = c0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = c0Var.q.g() + Math.max(0, iArr[1]);
        if (z0Var2.g && (i15 = c0Var.y) != -1 && c0Var.A != Integer.MIN_VALUE && (m10 = c0Var.m(i15)) != null) {
            if (c0Var.z) {
                i16 = c0Var.q.f() - c0Var.q.a(m10);
                d10 = c0Var.A;
            } else {
                d10 = c0Var.q.d(m10) - c0Var.q.j();
                i16 = c0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j3 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!l0Var.c ? !c0Var.v : c0Var.v) {
            i18 = 1;
        }
        c0Var.a1(eVar2, z0Var2, l0Var, i18);
        for (int r10 = c0Var.r() - 1; r10 >= 0; r10--) {
            View q6 = c0Var.q(r10);
            c1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || c0Var.b.w.b) {
                    c0Var.q(r10);
                    c0Var.a.u(r10);
                    eVar2.i(q6);
                    c0Var.b.f.H(U);
                } else {
                    c0Var.j0(r10);
                    eVar2.h(U);
                }
            }
        }
        c0Var.p.l = c0Var.q.h() == 0 && c0Var.q.e() == 0;
        c0Var.p.getClass();
        c0Var.p.i = 0;
        if (l0Var.c) {
            c0Var.o1(l0Var.b, l0Var.e);
            a0 a0Var2 = c0Var.p;
            a0Var2.h = j3;
            c0Var.H0(eVar2, a0Var2, z0Var2, false);
            a0 a0Var3 = c0Var.p;
            i12 = a0Var3.b;
            int i21 = a0Var3.d;
            int i22 = a0Var3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            c0Var.n1(l0Var.b, l0Var.e);
            a0 a0Var4 = c0Var.p;
            a0Var4.h = g10;
            a0Var4.d += a0Var4.e;
            c0Var.H0(eVar2, a0Var4, z0Var2, false);
            a0 a0Var5 = c0Var.p;
            i11 = a0Var5.b;
            int i23 = a0Var5.c;
            if (i23 > 0) {
                c0Var.o1(i21, i12);
                a0 a0Var6 = c0Var.p;
                a0Var6.h = i23;
                c0Var.H0(eVar2, a0Var6, z0Var2, false);
                i12 = c0Var.p.b;
            }
        } else {
            c0Var.n1(l0Var.b, l0Var.e);
            a0 a0Var7 = c0Var.p;
            a0Var7.h = g10;
            c0Var.H0(eVar2, a0Var7, z0Var2, false);
            a0 a0Var8 = c0Var.p;
            i11 = a0Var8.b;
            int i24 = a0Var8.d;
            int i25 = a0Var8.c;
            if (i25 > 0) {
                j3 += i25;
            }
            c0Var.o1(l0Var.b, l0Var.e);
            a0 a0Var9 = c0Var.p;
            a0Var9.h = j3;
            a0Var9.d += a0Var9.e;
            c0Var.H0(eVar2, a0Var9, z0Var2, false);
            a0 a0Var10 = c0Var.p;
            i12 = a0Var10.b;
            int i26 = a0Var10.c;
            if (i26 > 0) {
                c0Var.n1(i24, i11);
                a0 a0Var11 = c0Var.p;
                a0Var11.h = i26;
                c0Var.H0(eVar2, a0Var11, z0Var2, false);
                i11 = c0Var.p.b;
            }
        }
        if (c0Var.r() > 0) {
            if (c0Var.v ^ c0Var.w) {
                int S02 = c0Var.S0(i11, eVar2, z0Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = c0Var.T0(i13, eVar2, z0Var2, false);
            } else {
                int T0 = c0Var.T0(i12, eVar2, z0Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = c0Var.S0(i14, eVar2, z0Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (z0Var2.k && c0Var.r() != 0 && !z0Var2.g && c0Var.y0()) {
            List list2 = (List) eVar2.f;
            int size = list2.size();
            int H = o0.H(c0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                c1 c1Var = (c1) list2.get(i29);
                boolean j10 = c1Var.j();
                View view3 = c1Var.a;
                if (!j10) {
                    if ((c1Var.c() < H) != c0Var.v) {
                        i27 += c0Var.q.b(view3);
                    } else {
                        i28 += c0Var.q.b(view3);
                    }
                }
            }
            c0Var.p.k = list2;
            if (i27 > 0) {
                c0Var.o1(o0.H(c0Var.V0()), i12);
                a0 a0Var12 = c0Var.p;
                a0Var12.h = i27;
                a0Var12.c = 0;
                a0Var12.a(null);
                c0Var.H0(eVar2, c0Var.p, z0Var2, false);
            }
            if (i28 > 0) {
                c0Var.n1(o0.H(c0Var.U0()), i11);
                a0 a0Var13 = c0Var.p;
                a0Var13.h = i28;
                a0Var13.c = 0;
                list = null;
                a0Var13.a(null);
                c0Var.H0(eVar2, c0Var.p, z0Var2, false);
            } else {
                list = null;
            }
            c0Var.p.k = list;
        }
        if (z0Var2.g) {
            l0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = c0Var.q;
            gVar2.a = gVar2.k();
        }
        c0Var.s = c0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = o0.H(view);
        int H2 = o0.H(view2);
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

    @Override // s4.o0
    public void c0(z0 z0Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(pf.e eVar, a0 a0Var) {
        c1 T;
        c1 T2;
        if (!a0Var.a || a0Var.l) {
            return;
        }
        int i10 = a0Var.g;
        int i11 = a0Var.i;
        if (a0Var.f != -1) {
            e1(eVar, i10, i11);
            return;
        }
        int r10 = r();
        if (i10 < 0) {
            return;
        }
        int e7 = (this.q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6 != null && (T2 = this.b.T(q6)) != null && !T2.r() && (this.q.d(q6) < e7 || this.q.m(q6) < e7)) {
                    d1(eVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q10 = q(i14);
            if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.d(q10) < e7 || this.q.m(q10) < e7)) {
                d1(eVar, i13, i14);
                return;
            }
        }
    }

    @Override // s4.o0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(pf.e eVar, int i10, int i11) {
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

    @Override // s4.o0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // s4.o0
    public final b0 e0() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0 b0Var2 = new b0();
            b0Var2.a = b0Var.a;
            b0Var2.b = b0Var.b;
            b0Var2.c = b0Var.c;
            return b0Var2;
        }
        b0 b0Var3 = new b0();
        if (r() <= 0) {
            b0Var3.a = -1;
            return b0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        b0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            b0Var3.b = this.q.f() - this.q.a(U0);
            b0Var3.a = ((p0) U0.getLayoutParams()).b();
            return b0Var3;
        }
        View V0 = V0();
        b0Var3.a = o0.H(V0);
        b0Var3.b = this.q.d(V0) - this.q.j();
        return b0Var3;
    }

    public void e1(pf.e eVar, int i10, int i11) {
        c1 T;
        c1 T2;
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

    public final int g1(int i10, pf.e eVar, z0 z0Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, z0Var);
        a0 a0Var = this.p;
        int H0 = H0(eVar, a0Var, z0Var, false) + a0Var.g;
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

    @Override // s4.o0
    public int h(z0 z0Var) {
        return C0(z0Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // s4.o0
    public int i(z0 z0Var) {
        return D0(z0Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.y == i10 && this.A == i11 && this.z == z10) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.a = -1;
        }
        l0();
    }

    @Override // s4.o0
    public int j(z0 z0Var) {
        return B0(z0Var);
    }

    public final void j1(int i10) {
        f0 f0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i2.g.i(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                f0Var = new f0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                f0Var = new f0(this, 1);
            }
            this.q = f0Var;
            this.C.f = f0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // s4.o0
    public int k(z0 z0Var) {
        return C0(z0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // s4.o0
    public int l(z0 z0Var) {
        return D0(z0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // s4.o0
    public final View m(int i10) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i10 - o0.H(q(0));
        if (H >= 0 && H < r10) {
            View q6 = q(H);
            if (o0.H(q6) == i10) {
                return q6;
            }
        }
        int r11 = r();
        for (int i11 = 0; i11 < r11; i11++) {
            View q10 = q(i11);
            c1 U = RecyclerView.U(q10);
            if (U != null && U.c() == i10 && !U.r() && (this.b.t0.g || !U.j())) {
                return q10;
            }
        }
        return null;
    }

    @Override // s4.o0
    public int m0(int i10, pf.e eVar, z0 z0Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void m1(int i10, int i11, boolean z10, z0 z0Var) {
        int j3;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        a0 a0Var = this.p;
        int i12 = z11 ? max2 : max;
        a0Var.h = i12;
        if (!z11) {
            max = max2;
        }
        a0Var.i = max;
        if (z11) {
            a0Var.h = this.q.g() + i12;
            View U0 = U0();
            a0 a0Var2 = this.p;
            a0Var2.e = this.v ? -1 : 1;
            int H = o0.H(U0);
            a0 a0Var3 = this.p;
            a0Var2.d = H + a0Var3.e;
            a0Var3.b = this.q.a(U0);
            j3 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            a0 a0Var4 = this.p;
            a0Var4.h = this.q.j() + a0Var4.h;
            a0 a0Var5 = this.p;
            a0Var5.e = this.v ? 1 : -1;
            int H2 = o0.H(V0);
            a0 a0Var6 = this.p;
            a0Var5.d = H2 + a0Var6.e;
            a0Var6.b = this.q.d(V0);
            j3 = (-this.q.d(V0)) + this.q.j();
        }
        a0 a0Var7 = this.p;
        a0Var7.c = i11;
        if (z10) {
            a0Var7.c = i11 - j3;
        }
        a0Var7.g = j3;
    }

    @Override // s4.o0
    public p0 n() {
        return new p0(-2, -2);
    }

    @Override // s4.o0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        a0 a0Var = this.p;
        a0Var.e = this.v ? -1 : 1;
        a0Var.d = i10;
        a0Var.f = 1;
        a0Var.b = i11;
        a0Var.g = TLObject.FLAG_31;
    }

    @Override // s4.o0
    public int o0(int i10, pf.e eVar, z0 z0Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        a0 a0Var = this.p;
        a0Var.d = i10;
        a0Var.e = this.v ? 1 : -1;
        a0Var.f = -1;
        a0Var.b = i11;
        a0Var.g = TLObject.FLAG_31;
    }

    @Override // s4.o0
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.a = i10;
        w0(d0Var);
    }

    @Override // s4.o0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(z0 z0Var, int[] iArr) {
        int i10;
        int W0 = W0(z0Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public c0(int i10, boolean z10) {
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
        i2.l0 l0Var = new i2.l0();
        l0Var.g();
        this.C = l0Var;
        this.D = new z();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(pf.e eVar, z0 z0Var, i2.l0 l0Var, int i10) {
    }
}
