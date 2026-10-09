package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class d0 extends p0 {
    public int A;
    public c0 B;
    public final i2.m0 C;
    public final a0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public b0 p;
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

    public d0() {
        this(1, false);
    }

    public void A0(a1 a1Var, b0 b0Var, a0.h hVar) {
        int i10 = b0Var.d;
        if (i10 < 0 || i10 >= a1Var.b()) {
            return;
        }
        hVar.b(i10, Math.max(0, b0Var.g));
    }

    public final int B0(a1 a1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || a1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (a1Var.b() - Math.max(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(a1 a1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || a1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return a1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1)) * a1Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < p0.H(q(0))) != this.v ? -1 : 1;
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
            b0 b0Var = new b0();
            b0Var.a = true;
            b0Var.h = 0;
            b0Var.i = 0;
            b0Var.k = null;
            this.p = b0Var;
        }
    }

    public final int H0(pf.e eVar, b0 b0Var, a1 a1Var, boolean z10) {
        int i10 = b0Var.c;
        int i11 = b0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                b0Var.g = i11 + i10;
            }
            c1(eVar, b0Var);
        }
        int i12 = b0Var.c + b0Var.h;
        while (true) {
            if ((!b0Var.l && i12 <= 0) || !b0Var.b(a1Var)) {
                break;
            }
            a0 a0Var = this.D;
            a0Var.a = 0;
            a0Var.b = false;
            a0Var.c = false;
            a0Var.d = false;
            Z0(eVar, a1Var, b0Var, a0Var);
            if (!a0Var.b) {
                int i13 = b0Var.b;
                int i14 = a0Var.a;
                b0Var.b = (b0Var.f * i14) + i13;
                if (!a0Var.c || b0Var.k != null || !a1Var.g) {
                    b0Var.c -= i14;
                    i12 -= i14;
                }
                int i15 = b0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    b0Var.g = i16;
                    int i17 = b0Var.c;
                    if (i17 < 0) {
                        b0Var.g = i16 + i17;
                    }
                    c1(eVar, b0Var);
                }
                if (z10 && a0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - b0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
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
        return ((q0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
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
        return this.o == 0 ? this.c.k(i10, i11, i12, i13) : this.d.k(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.k(i10, i11, i12, i13) : this.d.k(i10, i11, i12, i13);
    }

    public View Q0(pf.e eVar, a1 a1Var, int i10, int i11, int i12) {
        G0();
        int j3 = this.r ? 0 : this.q.j();
        int f7 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = p0.H(q6);
            if (H >= 0 && H < i12) {
                if (((q0) q6.getLayoutParams()).a.j()) {
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

    @Override // s4.p0
    public View R(View view, int i10, pf.e eVar, a1 a1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, a1Var);
            b0 b0Var = this.p;
            b0Var.g = TLObject.FLAG_31;
            b0Var.a = false;
            H0(eVar, b0Var, a1Var, true);
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

    public final int S0(int i10, pf.e eVar, a1 a1Var, boolean z10) {
        int f7;
        int f10;
        if (!this.G || !this.H || (f7 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f7, eVar, a1Var);
        int i12 = i10 + i11;
        if (!z10 || (f10 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f10);
        return f10 + i11;
    }

    public final int T0(int i10, pf.e eVar, a1 a1Var, boolean z10) {
        int X0;
        int j3;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, eVar, a1Var);
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

    public int W0(a1 a1Var) {
        if (a1Var.a != -1) {
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

    public void Z0(pf.e eVar, a1 a1Var, b0 b0Var, a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = b0Var.c(eVar);
        if (c10 == null) {
            a0Var.b = true;
            return;
        }
        q0 q0Var = (q0) c10.getLayoutParams();
        if (b0Var.k == null) {
            if (this.v == (b0Var.f == -1)) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            if (this.v == (b0Var.f == -1)) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        a0Var.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c10);
            } else {
                i10 = D();
                i13 = this.q.c(c10) + i10;
            }
            if (b0Var.f == -1) {
                i11 = b0Var.b;
                i12 = i11 - a0Var.a;
            } else {
                i12 = b0Var.b;
                i11 = a0Var.a + i12;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (b0Var.f == -1) {
                int i14 = b0Var.b;
                int i15 = i14 - a0Var.a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = b0Var.b;
                int i17 = a0Var.a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        p0.O(c10, i10, i12, i13, i11);
        if (q0Var.a.j() || q0Var.a.m()) {
            a0Var.c = true;
        }
        a0Var.d = c10.hasFocusable();
    }

    @Override // s4.p0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(pf.e eVar, a1 a1Var) {
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
        d0 d0Var = this;
        a1 a1Var2 = a1Var;
        int i18 = -1;
        if (!(d0Var.B == null && d0Var.y == -1) && a1Var2.b() == 0) {
            g0(eVar);
            return;
        }
        c0 c0Var = d0Var.B;
        if (c0Var != null && (i17 = c0Var.a) >= 0) {
            d0Var.y = i17;
        }
        d0Var.G0();
        d0Var.p.a = false;
        d0Var.f1();
        RecyclerView recyclerView = d0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) d0Var.a.d).contains(view)) {
            view = null;
        }
        i2.m0 m0Var = d0Var.C;
        if (m0Var.d && d0Var.y == -1 && d0Var.B == null) {
            if (view != null && (d0Var.q.d(view) >= d0Var.q.f() || d0Var.q.a(view) <= d0Var.q.j())) {
                m0Var.d(((q0) view.getLayoutParams()).b(), view);
            }
            eVar2 = eVar;
        } else {
            m0Var.g();
            m0Var.c = d0Var.v ^ d0Var.w;
            if (!a1Var2.g && (i10 = d0Var.y) != -1) {
                if (i10 < 0 || i10 >= a1Var2.b()) {
                    d0Var.y = -1;
                    d0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = d0Var.y;
                    m0Var.b = i19;
                    c0 c0Var2 = d0Var.B;
                    if (c0Var2 != null && c0Var2.a >= 0) {
                        boolean z10 = c0Var2.c;
                        m0Var.c = z10;
                        if (z10) {
                            m0Var.e = d0Var.q.f() - d0Var.B.b;
                        } else {
                            m0Var.e = d0Var.q.j() + d0Var.B.b;
                        }
                    } else if (d0Var.A == Integer.MIN_VALUE) {
                        View m11 = d0Var.m(i19);
                        if (m11 == null) {
                            if (d0Var.r() > 0) {
                                m0Var.c = (d0Var.y < p0.H(d0Var.q(0))) == d0Var.z;
                            }
                            m0Var.b();
                        } else if (d0Var.q.b(m11) > d0Var.q.k()) {
                            m0Var.b();
                        } else if (d0Var.q.d(m11) - d0Var.q.j() < 0) {
                            m0Var.e = d0Var.q.j();
                            m0Var.c = false;
                        } else if (d0Var.q.f() - d0Var.q.a(m11) < 0) {
                            m0Var.e = d0Var.q.f();
                            m0Var.c = true;
                        } else {
                            if (m0Var.c) {
                                int a2 = d0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = d0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = d0Var.q.d(m11);
                            }
                            m0Var.e = d;
                        }
                    } else {
                        boolean z11 = d0Var.z;
                        m0Var.c = z11;
                        if (z11) {
                            m0Var.e = d0Var.q.f() - d0Var.A;
                        } else {
                            m0Var.e = d0Var.q.j() + d0Var.A;
                        }
                    }
                    eVar2 = eVar;
                    m0Var.d = true;
                }
            }
            if (d0Var.r() != 0) {
                RecyclerView recyclerView2 = d0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) d0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    q0 q0Var = (q0) view2.getLayoutParams();
                    if (!q0Var.a.j() && q0Var.b() >= 0 && q0Var.b() < a1Var2.b()) {
                        m0Var.d(((q0) view2.getLayoutParams()).b(), view2);
                        eVar2 = eVar;
                        m0Var.d = true;
                    }
                }
                if (d0Var.s == d0Var.w) {
                    if (m0Var.c) {
                        if (d0Var.v) {
                            Q0 = d0Var.Q0(eVar, a1Var2, 0, d0Var.r(), a1Var2.b());
                            d0Var = this;
                        } else {
                            d0Var = this;
                            Q0 = d0Var.Q0(eVar, a1Var, r() - 1, -1, a1Var.b());
                        }
                        eVar2 = eVar;
                        a1Var2 = a1Var;
                    } else if (d0Var.v) {
                        eVar2 = eVar;
                        a1Var2 = a1Var;
                        Q0 = d0Var.Q0(eVar2, a1Var2, d0Var.r() - 1, -1, a1Var.b());
                        d0Var = this;
                    } else {
                        d0Var = this;
                        eVar2 = eVar;
                        a1Var2 = a1Var;
                        Q0 = d0Var.Q0(eVar2, a1Var2, 0, r(), a1Var.b());
                    }
                    if (Q0 != null) {
                        m0Var.c(((q0) Q0.getLayoutParams()).b(), Q0);
                        if (!a1Var2.g && d0Var.y0() && (d0Var.q.d(Q0) >= d0Var.q.f() || d0Var.q.a(Q0) < d0Var.q.j())) {
                            m0Var.e = m0Var.c ? d0Var.q.f() : d0Var.q.j();
                        }
                        m0Var.d = true;
                    }
                    m0Var.b();
                    m0Var.b = !d0Var.w ? a1Var2.b() - 1 : d0Var.R0();
                    m0Var.d = true;
                }
            }
            eVar2 = eVar;
            m0Var.b();
            m0Var.b = !d0Var.w ? a1Var2.b() - 1 : d0Var.R0();
            m0Var.d = true;
        }
        b0 b0Var = d0Var.p;
        b0Var.f = b0Var.j >= 0 ? 1 : -1;
        int[] iArr = d0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        d0Var.z0(a1Var2, iArr);
        int j3 = d0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = d0Var.q.g() + Math.max(0, iArr[1]);
        if (a1Var2.g && (i15 = d0Var.y) != -1 && d0Var.A != Integer.MIN_VALUE && (m10 = d0Var.m(i15)) != null) {
            if (d0Var.z) {
                i16 = d0Var.q.f() - d0Var.q.a(m10);
                d10 = d0Var.A;
            } else {
                d10 = d0Var.q.d(m10) - d0Var.q.j();
                i16 = d0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j3 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!m0Var.c ? !d0Var.v : d0Var.v) {
            i18 = 1;
        }
        d0Var.a1(eVar2, a1Var2, m0Var, i18);
        for (int r10 = d0Var.r() - 1; r10 >= 0; r10--) {
            View q6 = d0Var.q(r10);
            d1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || d0Var.b.w.b) {
                    d0Var.q(r10);
                    d0Var.a.y(r10);
                    eVar2.i(q6);
                    d0Var.b.f.a0(U);
                } else {
                    d0Var.j0(r10);
                    eVar2.h(U);
                }
            }
        }
        d0Var.p.l = d0Var.q.h() == 0 && d0Var.q.e() == 0;
        d0Var.p.getClass();
        d0Var.p.i = 0;
        if (m0Var.c) {
            d0Var.o1(m0Var.b, m0Var.e);
            b0 b0Var2 = d0Var.p;
            b0Var2.h = j3;
            d0Var.H0(eVar2, b0Var2, a1Var2, false);
            b0 b0Var3 = d0Var.p;
            i12 = b0Var3.b;
            int i21 = b0Var3.d;
            int i22 = b0Var3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            d0Var.n1(m0Var.b, m0Var.e);
            b0 b0Var4 = d0Var.p;
            b0Var4.h = g10;
            b0Var4.d += b0Var4.e;
            d0Var.H0(eVar2, b0Var4, a1Var2, false);
            b0 b0Var5 = d0Var.p;
            i11 = b0Var5.b;
            int i23 = b0Var5.c;
            if (i23 > 0) {
                d0Var.o1(i21, i12);
                b0 b0Var6 = d0Var.p;
                b0Var6.h = i23;
                d0Var.H0(eVar2, b0Var6, a1Var2, false);
                i12 = d0Var.p.b;
            }
        } else {
            d0Var.n1(m0Var.b, m0Var.e);
            b0 b0Var7 = d0Var.p;
            b0Var7.h = g10;
            d0Var.H0(eVar2, b0Var7, a1Var2, false);
            b0 b0Var8 = d0Var.p;
            i11 = b0Var8.b;
            int i24 = b0Var8.d;
            int i25 = b0Var8.c;
            if (i25 > 0) {
                j3 += i25;
            }
            d0Var.o1(m0Var.b, m0Var.e);
            b0 b0Var9 = d0Var.p;
            b0Var9.h = j3;
            b0Var9.d += b0Var9.e;
            d0Var.H0(eVar2, b0Var9, a1Var2, false);
            b0 b0Var10 = d0Var.p;
            i12 = b0Var10.b;
            int i26 = b0Var10.c;
            if (i26 > 0) {
                d0Var.n1(i24, i11);
                b0 b0Var11 = d0Var.p;
                b0Var11.h = i26;
                d0Var.H0(eVar2, b0Var11, a1Var2, false);
                i11 = d0Var.p.b;
            }
        }
        if (d0Var.r() > 0) {
            if (d0Var.v ^ d0Var.w) {
                int S02 = d0Var.S0(i11, eVar2, a1Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = d0Var.T0(i13, eVar2, a1Var2, false);
            } else {
                int T0 = d0Var.T0(i12, eVar2, a1Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = d0Var.S0(i14, eVar2, a1Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (a1Var2.k && d0Var.r() != 0 && !a1Var2.g && d0Var.y0()) {
            List list2 = (List) eVar2.f;
            int size = list2.size();
            int H = p0.H(d0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                d1 d1Var = (d1) list2.get(i29);
                boolean j10 = d1Var.j();
                View view3 = d1Var.a;
                if (!j10) {
                    if ((d1Var.c() < H) != d0Var.v) {
                        i27 += d0Var.q.b(view3);
                    } else {
                        i28 += d0Var.q.b(view3);
                    }
                }
            }
            d0Var.p.k = list2;
            if (i27 > 0) {
                d0Var.o1(p0.H(d0Var.V0()), i12);
                b0 b0Var12 = d0Var.p;
                b0Var12.h = i27;
                b0Var12.c = 0;
                b0Var12.a(null);
                d0Var.H0(eVar2, d0Var.p, a1Var2, false);
            }
            if (i28 > 0) {
                d0Var.n1(p0.H(d0Var.U0()), i11);
                b0 b0Var13 = d0Var.p;
                b0Var13.h = i28;
                b0Var13.c = 0;
                list = null;
                b0Var13.a(null);
                d0Var.H0(eVar2, d0Var.p, a1Var2, false);
            } else {
                list = null;
            }
            d0Var.p.k = list;
        }
        if (a1Var2.g) {
            m0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = d0Var.q;
            gVar2.a = gVar2.k();
        }
        d0Var.s = d0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = p0.H(view);
        int H2 = p0.H(view2);
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

    @Override // s4.p0
    public void c0(a1 a1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(pf.e eVar, b0 b0Var) {
        d1 T;
        d1 T2;
        if (!b0Var.a || b0Var.l) {
            return;
        }
        int i10 = b0Var.g;
        int i11 = b0Var.i;
        if (b0Var.f != -1) {
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

    @Override // s4.p0
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

    @Override // s4.p0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // s4.p0
    public final c0 e0() {
        c0 c0Var = this.B;
        if (c0Var != null) {
            c0 c0Var2 = new c0();
            c0Var2.a = c0Var.a;
            c0Var2.b = c0Var.b;
            c0Var2.c = c0Var.c;
            return c0Var2;
        }
        c0 c0Var3 = new c0();
        if (r() <= 0) {
            c0Var3.a = -1;
            return c0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        c0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            c0Var3.b = this.q.f() - this.q.a(U0);
            c0Var3.a = ((q0) U0.getLayoutParams()).b();
            return c0Var3;
        }
        View V0 = V0();
        c0Var3.a = p0.H(V0);
        c0Var3.b = this.q.d(V0) - this.q.j();
        return c0Var3;
    }

    public void e1(pf.e eVar, int i10, int i11) {
        d1 T;
        d1 T2;
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

    public final int g1(int i10, pf.e eVar, a1 a1Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, a1Var);
        b0 b0Var = this.p;
        int H0 = H0(eVar, b0Var, a1Var, false) + b0Var.g;
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

    @Override // s4.p0
    public int h(a1 a1Var) {
        return C0(a1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // s4.p0
    public int i(a1 a1Var) {
        return D0(a1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.y == i10 && this.A == i11 && this.z == z10) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z10;
        c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.a = -1;
        }
        l0();
    }

    @Override // s4.p0
    public int j(a1 a1Var) {
        return B0(a1Var);
    }

    public final void j1(int i10) {
        g0 g0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(hg.c.h(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                g0Var = new g0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                g0Var = new g0(this, 1);
            }
            this.q = g0Var;
            this.C.f = g0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // s4.p0
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // s4.p0
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // s4.p0
    public final View m(int i10) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i10 - p0.H(q(0));
        if (H >= 0 && H < r10) {
            View q6 = q(H);
            if (p0.H(q6) == i10) {
                return q6;
            }
        }
        int r11 = r();
        for (int i11 = 0; i11 < r11; i11++) {
            View q10 = q(i11);
            d1 U = RecyclerView.U(q10);
            if (U != null && U.c() == i10 && !U.r() && (this.b.u0.g || !U.j())) {
                return q10;
            }
        }
        return null;
    }

    @Override // s4.p0
    public int m0(int i10, pf.e eVar, a1 a1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, eVar, a1Var);
    }

    public final void m1(int i10, int i11, boolean z10, a1 a1Var) {
        int j3;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(a1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        b0 b0Var = this.p;
        int i12 = z11 ? max2 : max;
        b0Var.h = i12;
        if (!z11) {
            max = max2;
        }
        b0Var.i = max;
        if (z11) {
            b0Var.h = this.q.g() + i12;
            View U0 = U0();
            b0 b0Var2 = this.p;
            b0Var2.e = this.v ? -1 : 1;
            int H = p0.H(U0);
            b0 b0Var3 = this.p;
            b0Var2.d = H + b0Var3.e;
            b0Var3.b = this.q.a(U0);
            j3 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            b0 b0Var4 = this.p;
            b0Var4.h = this.q.j() + b0Var4.h;
            b0 b0Var5 = this.p;
            b0Var5.e = this.v ? 1 : -1;
            int H2 = p0.H(V0);
            b0 b0Var6 = this.p;
            b0Var5.d = H2 + b0Var6.e;
            b0Var6.b = this.q.d(V0);
            j3 = (-this.q.d(V0)) + this.q.j();
        }
        b0 b0Var7 = this.p;
        b0Var7.c = i11;
        if (z10) {
            b0Var7.c = i11 - j3;
        }
        b0Var7.g = j3;
    }

    @Override // s4.p0
    public q0 n() {
        return new q0(-2, -2);
    }

    @Override // s4.p0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        b0 b0Var = this.p;
        b0Var.e = this.v ? -1 : 1;
        b0Var.d = i10;
        b0Var.f = 1;
        b0Var.b = i11;
        b0Var.g = TLObject.FLAG_31;
    }

    @Override // s4.p0
    public int o0(int i10, pf.e eVar, a1 a1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, eVar, a1Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        b0 b0Var = this.p;
        b0Var.d = i10;
        b0Var.e = this.v ? 1 : -1;
        b0Var.f = -1;
        b0Var.b = i11;
        b0Var.g = TLObject.FLAG_31;
    }

    @Override // s4.p0
    public void v0(RecyclerView recyclerView, a1 a1Var, int i10) {
        e0 e0Var = new e0(recyclerView.getContext());
        e0Var.a = i10;
        w0(e0Var);
    }

    @Override // s4.p0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(a1 a1Var, int[] iArr) {
        int i10;
        int W0 = W0(a1Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public d0(int i10, boolean z10) {
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
        i2.m0 m0Var = new i2.m0();
        m0Var.g();
        this.C = m0Var;
        this.D = new a0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(pf.e eVar, a1 a1Var, i2.m0 m0Var, int i10) {
    }
}
