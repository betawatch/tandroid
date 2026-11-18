package v4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class c0 extends p0 {
    public int A;
    public b0 B;
    public final l2.l0 C;
    public final n2.j D;
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

    public void A0(c1 c1Var, a0 a0Var, h2.f fVar) {
        int i7 = a0Var.d;
        if (i7 < 0 || i7 >= c1Var.b()) {
            return;
        }
        fVar.b(i7, Math.max(0, a0Var.g));
    }

    public final int B0(c1 c1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || c1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(c1 c1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && c1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (c1Var.b() - Math.max(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(c1 c1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || c1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return c1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1)) * c1Var.b());
    }

    public final PointF E0(int i7) {
        if (r() == 0) {
            return null;
        }
        int i10 = (i7 < p0.H(q(0))) != this.v ? -1 : 1;
        return this.o == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    public final int F0(int i7) {
        if (i7 == 1) {
            return (this.o != 1 && Y0()) ? 1 : -1;
        }
        if (i7 == 2) {
            return (this.o != 1 && Y0()) ? -1 : 1;
        }
        if (i7 == 17) {
            if (this.o == 0) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i7 == 33) {
            if (this.o == 1) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i7 == 66) {
            if (this.o == 0) {
                return 1;
            }
            return TLObject.FLAG_31;
        }
        if (i7 == 130 && this.o == 1) {
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

    public final int H0(x0 x0Var, a0 a0Var, c1 c1Var, boolean z10) {
        int i7 = a0Var.c;
        int i10 = a0Var.g;
        if (i10 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                a0Var.g = i10 + i7;
            }
            c1(x0Var, a0Var);
        }
        int i11 = a0Var.c + a0Var.h;
        while (true) {
            if ((!a0Var.l && i11 <= 0) || !a0Var.b(c1Var)) {
                break;
            }
            n2.j jVar = this.D;
            jVar.a = 0;
            jVar.b = false;
            jVar.c = false;
            jVar.d = false;
            Z0(x0Var, c1Var, a0Var, jVar);
            if (!jVar.b) {
                int i12 = a0Var.b;
                int i13 = jVar.a;
                a0Var.b = (a0Var.f * i13) + i12;
                if (!jVar.c || a0Var.k != null || !c1Var.g) {
                    a0Var.c -= i13;
                    i11 -= i13;
                }
                int i14 = a0Var.g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    a0Var.g = i15;
                    int i16 = a0Var.c;
                    if (i16 < 0) {
                        a0Var.g = i15 + i16;
                    }
                    c1(x0Var, a0Var);
                }
                if (z10 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - a0Var.c;
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

    public final View O0(int i7, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 <= i7 && i10 >= i7) {
            return q(i7);
        }
        if (this.q.d(q(i7)) < this.q.j()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.o == 0 ? this.c.d(i7, i10, i11, i12) : this.d.d(i7, i10, i11, i12);
    }

    public final View P0(int i7, int i10, boolean z10, boolean z11) {
        G0();
        int i11 = ks.r5;
        int i12 = z10 ? 24579 : 320;
        if (!z11) {
            i11 = 0;
        }
        return this.o == 0 ? this.c.d(i7, i10, i12, i11) : this.d.d(i7, i10, i12, i11);
    }

    public View Q0(x0 x0Var, c1 c1Var, int i7, int i10, int i11) {
        G0();
        int j3 = this.r ? 0 : this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = p0.H(q10);
            if (H >= 0 && H < i11) {
                if (((q0) q10.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else {
                    if (this.q.d(q10) < f10 && this.q.a(q10) >= j3) {
                        return q10;
                    }
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i7 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // v4.p0
    public View R(View view, int i7, x0 x0Var, c1 c1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i7)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, c1Var);
            a0 a0Var = this.p;
            a0Var.g = TLObject.FLAG_31;
            a0Var.a = false;
            H0(x0Var, a0Var, c1Var, true);
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

    public final int S0(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int f10;
        int f11;
        if (!this.G || !this.H || (f10 = this.q.f() - i7) <= 0) {
            return 0;
        }
        int i10 = -g1(-f10, x0Var, c1Var);
        int i11 = i7 + i10;
        if (!z10 || (f11 = this.q.f() - i11) <= 0) {
            return i10;
        }
        this.q.n(f11);
        return f11 + i10;
    }

    public final int T0(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int X0;
        int j3;
        if (!this.G || (X0 = i7 - X0()) <= 0) {
            return 0;
        }
        int i10 = -g1(X0, x0Var, c1Var);
        int i11 = i7 + i10;
        if (!z10 || (j3 = i11 - this.q.j()) <= 0) {
            return i10;
        }
        this.q.n(-j3);
        return i10 - j3;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(c1 c1Var) {
        if (c1Var.a != -1) {
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

    public void Z0(x0 x0Var, c1 c1Var, a0 a0Var, n2.j jVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        View c10 = a0Var.c(x0Var);
        if (c10 == null) {
            jVar.b = true;
            return;
        }
        q0 q0Var = (q0) c10.getLayoutParams();
        if (a0Var.k == null) {
            if (this.v == (a0Var.f == -1)) {
                a(-1, c10, false);
            } else {
                a(0, c10, false);
            }
        } else {
            if (this.v == (a0Var.f == -1)) {
                a(-1, c10, true);
            } else {
                a(0, c10, true);
            }
        }
        P(c10);
        jVar.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i12 = this.m - E();
                i7 = i12 - this.q.c(c10);
            } else {
                i7 = D();
                i12 = this.q.c(c10) + i7;
            }
            if (a0Var.f == -1) {
                i10 = a0Var.b;
                i11 = i10 - jVar.a;
            } else {
                i11 = a0Var.b;
                i10 = jVar.a + i11;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (a0Var.f == -1) {
                int i13 = a0Var.b;
                int i14 = i13 - jVar.a;
                i12 = i13;
                i10 = c11;
                i7 = i14;
                i11 = F;
            } else {
                int i15 = a0Var.b;
                int i16 = jVar.a + i15;
                i7 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        p0.O(c10, i7, i11, i12, i10);
        if (q0Var.a.j() || q0Var.a.m()) {
            jVar.c = true;
        }
        jVar.d = c10.hasFocusable();
    }

    @Override // v4.p0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(x0 x0Var, c1 c1Var) {
        View view;
        View view2;
        x0 x0Var2;
        View Q0;
        int i7;
        int d;
        int i10;
        int i11;
        List list;
        int i12;
        int i13;
        int S0;
        int i14;
        View m10;
        int d2;
        int i15;
        int i16;
        c0 c0Var = this;
        c1 c1Var2 = c1Var;
        int i17 = -1;
        if (!(c0Var.B == null && c0Var.y == -1) && c1Var2.b() == 0) {
            g0(x0Var);
            return;
        }
        b0 b0Var = c0Var.B;
        if (b0Var != null && (i16 = b0Var.a) >= 0) {
            c0Var.y = i16;
        }
        c0Var.G0();
        c0Var.p.a = false;
        c0Var.f1();
        RecyclerView recyclerView = c0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) c0Var.a.d).contains(view)) {
            view = null;
        }
        l2.l0 l0Var = c0Var.C;
        if (l0Var.d && c0Var.y == -1 && c0Var.B == null) {
            if (view != null && (c0Var.q.d(view) >= c0Var.q.f() || c0Var.q.a(view) <= c0Var.q.j())) {
                l0Var.d(((q0) view.getLayoutParams()).b(), view);
            }
            x0Var2 = x0Var;
        } else {
            l0Var.g();
            l0Var.c = c0Var.v ^ c0Var.w;
            if (!c1Var2.g && (i7 = c0Var.y) != -1) {
                if (i7 < 0 || i7 >= c1Var2.b()) {
                    c0Var.y = -1;
                    c0Var.A = TLObject.FLAG_31;
                } else {
                    int i18 = c0Var.y;
                    l0Var.b = i18;
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
                        View m11 = c0Var.m(i18);
                        if (m11 == null) {
                            if (c0Var.r() > 0) {
                                l0Var.c = (c0Var.y < p0.H(c0Var.q(0))) == c0Var.z;
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
                                int a10 = c0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = c0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a10;
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
                    x0Var2 = x0Var;
                    l0Var.d = true;
                }
            }
            if (c0Var.r() != 0) {
                RecyclerView recyclerView2 = c0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) c0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    q0 q0Var = (q0) view2.getLayoutParams();
                    if (!q0Var.a.j() && q0Var.b() >= 0 && q0Var.b() < c1Var2.b()) {
                        l0Var.d(((q0) view2.getLayoutParams()).b(), view2);
                        x0Var2 = x0Var;
                        l0Var.d = true;
                    }
                }
                if (c0Var.s == c0Var.w) {
                    if (l0Var.c) {
                        if (c0Var.v) {
                            Q0 = c0Var.Q0(x0Var, c1Var2, 0, c0Var.r(), c1Var2.b());
                            c0Var = this;
                        } else {
                            c0Var = this;
                            Q0 = c0Var.Q0(x0Var, c1Var, r() - 1, -1, c1Var.b());
                        }
                        x0Var2 = x0Var;
                        c1Var2 = c1Var;
                    } else if (c0Var.v) {
                        x0Var2 = x0Var;
                        c1Var2 = c1Var;
                        Q0 = c0Var.Q0(x0Var2, c1Var2, c0Var.r() - 1, -1, c1Var.b());
                        c0Var = this;
                    } else {
                        c0Var = this;
                        x0Var2 = x0Var;
                        c1Var2 = c1Var;
                        Q0 = c0Var.Q0(x0Var2, c1Var2, 0, r(), c1Var.b());
                    }
                    if (Q0 != null) {
                        l0Var.c(((q0) Q0.getLayoutParams()).b(), Q0);
                        if (!c1Var2.g && c0Var.y0() && (c0Var.q.d(Q0) >= c0Var.q.f() || c0Var.q.a(Q0) < c0Var.q.j())) {
                            l0Var.e = l0Var.c ? c0Var.q.f() : c0Var.q.j();
                        }
                        l0Var.d = true;
                    }
                    l0Var.b();
                    l0Var.b = !c0Var.w ? c1Var2.b() - 1 : c0Var.R0();
                    l0Var.d = true;
                }
            }
            x0Var2 = x0Var;
            l0Var.b();
            l0Var.b = !c0Var.w ? c1Var2.b() - 1 : c0Var.R0();
            l0Var.d = true;
        }
        a0 a0Var = c0Var.p;
        a0Var.f = a0Var.j >= 0 ? 1 : -1;
        int[] iArr = c0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        c0Var.z0(c1Var2, iArr);
        int j3 = c0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = c0Var.q.g() + Math.max(0, iArr[1]);
        if (c1Var2.g && (i14 = c0Var.y) != -1 && c0Var.A != Integer.MIN_VALUE && (m10 = c0Var.m(i14)) != null) {
            if (c0Var.z) {
                i15 = c0Var.q.f() - c0Var.q.a(m10);
                d2 = c0Var.A;
            } else {
                d2 = c0Var.q.d(m10) - c0Var.q.j();
                i15 = c0Var.A;
            }
            int i19 = i15 - d2;
            if (i19 > 0) {
                j3 += i19;
            } else {
                g10 -= i19;
            }
        }
        if (!l0Var.c ? !c0Var.v : c0Var.v) {
            i17 = 1;
        }
        c0Var.a1(x0Var2, c1Var2, l0Var, i17);
        for (int r10 = c0Var.r() - 1; r10 >= 0; r10--) {
            View q10 = c0Var.q(r10);
            f1 U = RecyclerView.U(q10);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || c0Var.b.x.b) {
                    c0Var.q(r10);
                    c0Var.a.p(r10);
                    x0Var2.i(q10);
                    c0Var.b.f.h(U);
                } else {
                    c0Var.j0(r10);
                    x0Var2.h(U);
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
            c0Var.H0(x0Var2, a0Var2, c1Var2, false);
            a0 a0Var3 = c0Var.p;
            i11 = a0Var3.b;
            int i20 = a0Var3.d;
            int i21 = a0Var3.c;
            if (i21 > 0) {
                g10 += i21;
            }
            c0Var.n1(l0Var.b, l0Var.e);
            a0 a0Var4 = c0Var.p;
            a0Var4.h = g10;
            a0Var4.d += a0Var4.e;
            c0Var.H0(x0Var2, a0Var4, c1Var2, false);
            a0 a0Var5 = c0Var.p;
            i10 = a0Var5.b;
            int i22 = a0Var5.c;
            if (i22 > 0) {
                c0Var.o1(i20, i11);
                a0 a0Var6 = c0Var.p;
                a0Var6.h = i22;
                c0Var.H0(x0Var2, a0Var6, c1Var2, false);
                i11 = c0Var.p.b;
            }
        } else {
            c0Var.n1(l0Var.b, l0Var.e);
            a0 a0Var7 = c0Var.p;
            a0Var7.h = g10;
            c0Var.H0(x0Var2, a0Var7, c1Var2, false);
            a0 a0Var8 = c0Var.p;
            i10 = a0Var8.b;
            int i23 = a0Var8.d;
            int i24 = a0Var8.c;
            if (i24 > 0) {
                j3 += i24;
            }
            c0Var.o1(l0Var.b, l0Var.e);
            a0 a0Var9 = c0Var.p;
            a0Var9.h = j3;
            a0Var9.d += a0Var9.e;
            c0Var.H0(x0Var2, a0Var9, c1Var2, false);
            a0 a0Var10 = c0Var.p;
            i11 = a0Var10.b;
            int i25 = a0Var10.c;
            if (i25 > 0) {
                c0Var.n1(i23, i10);
                a0 a0Var11 = c0Var.p;
                a0Var11.h = i25;
                c0Var.H0(x0Var2, a0Var11, c1Var2, false);
                i10 = c0Var.p.b;
            }
        }
        if (c0Var.r() > 0) {
            if (c0Var.v ^ c0Var.w) {
                int S02 = c0Var.S0(i10, x0Var2, c1Var2, true);
                i12 = i11 + S02;
                i13 = i10 + S02;
                S0 = c0Var.T0(i12, x0Var2, c1Var2, false);
            } else {
                int T0 = c0Var.T0(i11, x0Var2, c1Var2, true);
                i12 = i11 + T0;
                i13 = i10 + T0;
                S0 = c0Var.S0(i13, x0Var2, c1Var2, false);
            }
            i11 = i12 + S0;
            i10 = i13 + S0;
        }
        if (c1Var2.k && c0Var.r() != 0 && !c1Var2.g && c0Var.y0()) {
            List list2 = (List) x0Var2.f;
            int size = list2.size();
            int H = p0.H(c0Var.q(0));
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                f1 f1Var = (f1) list2.get(i28);
                boolean j10 = f1Var.j();
                View view3 = f1Var.a;
                if (!j10) {
                    if ((f1Var.c() < H) != c0Var.v) {
                        i26 += c0Var.q.b(view3);
                    } else {
                        i27 += c0Var.q.b(view3);
                    }
                }
            }
            c0Var.p.k = list2;
            if (i26 > 0) {
                c0Var.o1(p0.H(c0Var.V0()), i11);
                a0 a0Var12 = c0Var.p;
                a0Var12.h = i26;
                a0Var12.c = 0;
                a0Var12.a(null);
                c0Var.H0(x0Var2, c0Var.p, c1Var2, false);
            }
            if (i27 > 0) {
                c0Var.n1(p0.H(c0Var.U0()), i10);
                a0 a0Var13 = c0Var.p;
                a0Var13.h = i27;
                a0Var13.c = 0;
                list = null;
                a0Var13.a(null);
                c0Var.H0(x0Var2, c0Var.p, c1Var2, false);
            } else {
                list = null;
            }
            c0Var.p.k = list;
        }
        if (c1Var2.g) {
            l0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = c0Var.q;
            gVar2.a = gVar2.k();
        }
        c0Var.s = c0Var.w;
    }

    public void b1(View view, View view2, int i7, int i10) {
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

    @Override // v4.p0
    public void c0(c1 c1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(x0 x0Var, a0 a0Var) {
        f1 T;
        f1 T2;
        if (!a0Var.a || a0Var.l) {
            return;
        }
        int i7 = a0Var.g;
        int i10 = a0Var.i;
        if (a0Var.f != -1) {
            e1(x0Var, i7, i10);
            return;
        }
        int r10 = r();
        if (i7 < 0) {
            return;
        }
        int e10 = (this.q.e() - i7) + i10;
        if (this.v) {
            for (int i11 = 0; i11 < r10; i11++) {
                View q10 = q(i11);
                if (q10 != null && (T2 = this.b.T(q10)) != null && !T2.r() && (this.q.d(q10) < e10 || this.q.m(q10) < e10)) {
                    d1(x0Var, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11 != null && (T = this.b.T(q11)) != null && !T.r() && (this.q.d(q11) < e10 || this.q.m(q11) < e10)) {
                d1(x0Var, i12, i13);
                return;
            }
        }
    }

    @Override // v4.p0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(x0 x0Var, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        if (i10 <= i7) {
            while (i7 > i10) {
                i0(i7, x0Var);
                i7--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i7; i11--) {
                i0(i11, x0Var);
            }
        }
    }

    @Override // v4.p0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // v4.p0
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
            b0Var3.a = ((q0) U0.getLayoutParams()).b();
            return b0Var3;
        }
        View V0 = V0();
        b0Var3.a = p0.H(V0);
        b0Var3.b = this.q.d(V0) - this.q.j();
        return b0Var3;
    }

    public void e1(x0 x0Var, int i7, int i10) {
        f1 T;
        f1 T2;
        if (i7 < 0) {
            return;
        }
        int i11 = i7 - i10;
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q10 = q(i12);
                if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.a(q10) > i11 || this.q.l(q10) > i11)) {
                    d1(x0Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q11 = q(i14);
            if (q11 != null && (T2 = this.b.T(q11)) != null && !T2.r() && (this.q.a(q11) > i11 || this.q.l(q11) > i11)) {
                d1(x0Var, i13, i14);
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

    public final int g1(int i7, x0 x0Var, c1 c1Var) {
        if (r() == 0 || i7 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i10 = i7 > 0 ? 1 : -1;
        int abs = Math.abs(i7);
        m1(i10, abs, true, c1Var);
        a0 a0Var = this.p;
        int H0 = H0(x0Var, a0Var, c1Var, false) + a0Var.g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i7 = i10 * H0;
        }
        this.q.n(-i7);
        this.p.j = i7;
        return i7;
    }

    @Override // v4.p0
    public int h(c1 c1Var) {
        return C0(c1Var);
    }

    public void h1(int i7, int i10) {
        i1(i7, i10, this.v);
    }

    @Override // v4.p0
    public int i(c1 c1Var) {
        return D0(c1Var);
    }

    public void i1(int i7, int i10, boolean z10) {
        if (this.y == i7 && this.A == i10 && this.z == z10) {
            return;
        }
        this.y = i7;
        this.A = i10;
        this.z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.a = -1;
        }
        l0();
    }

    @Override // v4.p0
    public int j(c1 c1Var) {
        return B0(c1Var);
    }

    public final void j1(int i7) {
        g0 g0Var;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(i5.c.i(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 != this.o || this.q == null) {
            if (i7 == 0) {
                g0Var = new g0(this, 0);
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                g0Var = new g0(this, 1);
            }
            this.q = g0Var;
            this.C.f = g0Var;
            this.o = i7;
            l0();
        }
    }

    @Override // v4.p0
    public int k(c1 c1Var) {
        return C0(c1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // v4.p0
    public int l(c1 c1Var) {
        return D0(c1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // v4.p0
    public final View m(int i7) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i7 - p0.H(q(0));
        if (H >= 0 && H < r10) {
            View q10 = q(H);
            if (p0.H(q10) == i7) {
                return q10;
            }
        }
        int r11 = r();
        for (int i10 = 0; i10 < r11; i10++) {
            View q11 = q(i10);
            f1 U = RecyclerView.U(q11);
            if (U != null && U.c() == i7 && !U.r() && (this.b.v0.g || !U.j())) {
                return q11;
            }
        }
        return null;
    }

    @Override // v4.p0
    public int m0(int i7, x0 x0Var, c1 c1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i7, x0Var, c1Var);
    }

    public final void m1(int i7, int i10, boolean z10, c1 c1Var) {
        int j3;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i7;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(c1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i7 == 1;
        a0 a0Var = this.p;
        int i11 = z11 ? max2 : max;
        a0Var.h = i11;
        if (!z11) {
            max = max2;
        }
        a0Var.i = max;
        if (z11) {
            a0Var.h = this.q.g() + i11;
            View U0 = U0();
            a0 a0Var2 = this.p;
            a0Var2.e = this.v ? -1 : 1;
            int H = p0.H(U0);
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
            int H2 = p0.H(V0);
            a0 a0Var6 = this.p;
            a0Var5.d = H2 + a0Var6.e;
            a0Var6.b = this.q.d(V0);
            j3 = (-this.q.d(V0)) + this.q.j();
        }
        a0 a0Var7 = this.p;
        a0Var7.c = i10;
        if (z10) {
            a0Var7.c = i10 - j3;
        }
        a0Var7.g = j3;
    }

    @Override // v4.p0
    public q0 n() {
        return new q0(-2, -2);
    }

    @Override // v4.p0
    public void n0(int i7) {
        this.y = i7;
        this.A = TLObject.FLAG_31;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i7, int i10) {
        this.p.c = this.q.f() - i10;
        a0 a0Var = this.p;
        a0Var.e = this.v ? -1 : 1;
        a0Var.d = i7;
        a0Var.f = 1;
        a0Var.b = i10;
        a0Var.g = TLObject.FLAG_31;
    }

    @Override // v4.p0
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i7, x0Var, c1Var);
    }

    public final void o1(int i7, int i10) {
        this.p.c = i10 - this.q.j();
        a0 a0Var = this.p;
        a0Var.d = i7;
        a0Var.e = this.v ? 1 : -1;
        a0Var.f = -1;
        a0Var.b = i10;
        a0Var.g = TLObject.FLAG_31;
    }

    @Override // v4.p0
    public void v0(RecyclerView recyclerView, c1 c1Var, int i7) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.a = i7;
        w0(d0Var);
    }

    @Override // v4.p0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(c1 c1Var, int[] iArr) {
        int i7;
        int W0 = W0(c1Var);
        if (this.p.f == -1) {
            i7 = 0;
        } else {
            i7 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i7;
    }

    public c0(int i7, boolean z10) {
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
        l2.l0 l0Var = new l2.l0();
        l0Var.g();
        this.C = l0Var;
        this.D = new n2.j();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i7);
        k1(z10);
    }

    public void a1(x0 x0Var, c1 c1Var, l2.l0 l0Var, int i7) {
    }
}
