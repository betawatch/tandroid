package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class a0 extends n0 {
    public int A;
    public z B;
    public final i2.p0 C;
    public final k2.k D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public y p;
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

    public a0() {
        this(1, false);
    }

    public void A0(z0 z0Var, y yVar, e2.f fVar) {
        int i10 = yVar.d;
        if (i10 < 0 || i10 >= z0Var.b()) {
            return;
        }
        fVar.b(i10, Math.max(0, yVar.g));
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
            return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
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
                int max = z12 ? Math.max(0, (z0Var.b() - Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
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
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * z0Var.b());
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
            y yVar = new y();
            yVar.a = true;
            yVar.h = 0;
            yVar.i = 0;
            yVar.k = null;
            this.p = yVar;
        }
    }

    public final int H0(hf.e eVar, y yVar, z0 z0Var, boolean z10) {
        int i10 = yVar.c;
        int i11 = yVar.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                yVar.g = i11 + i10;
            }
            c1(eVar, yVar);
        }
        int i12 = yVar.c + yVar.h;
        while (true) {
            if ((!yVar.l && i12 <= 0) || !yVar.b(z0Var)) {
                break;
            }
            k2.k kVar = this.D;
            kVar.a = 0;
            kVar.b = false;
            kVar.c = false;
            kVar.d = false;
            Z0(eVar, z0Var, yVar, kVar);
            if (!kVar.b) {
                int i13 = yVar.b;
                int i14 = kVar.a;
                yVar.b = (yVar.f * i14) + i13;
                if (!kVar.c || yVar.k != null || !z0Var.g) {
                    yVar.c -= i14;
                    i12 -= i14;
                }
                int i15 = yVar.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    yVar.g = i16;
                    int i17 = yVar.c;
                    if (i17 < 0) {
                        yVar.g = i16 + i17;
                    }
                    c1(eVar, yVar);
                }
                if (z10 && kVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - yVar.c;
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
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.o == 0 ? this.c.I(i10, i11, i12, i13) : this.d.I(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = zs.r5;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.o == 0 ? this.c.I(i10, i11, i13, i12) : this.d.I(i10, i11, i13, i12);
    }

    public View Q0(hf.e eVar, z0 z0Var, int i10, int i11, int i12) {
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
    public View R(View view, int i10, hf.e eVar, z0 z0Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, z0Var);
            y yVar = this.p;
            yVar.g = TLObject.FLAG_31;
            yVar.a = false;
            H0(eVar, yVar, z0Var, true);
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

    public final int S0(int i10, hf.e eVar, z0 z0Var, boolean z10) {
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

    public final int T0(int i10, hf.e eVar, z0 z0Var, boolean z10) {
        int X0;
        int j10;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, eVar, z0Var);
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
        WeakHashMap weakHashMap = r0.h0.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Z0(hf.e eVar, z0 z0Var, y yVar, k2.k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = yVar.c(eVar);
        if (c10 == null) {
            kVar.b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (yVar.k == null) {
            if (this.v == (yVar.f == -1)) {
                a(-1, c10, false);
            } else {
                a(0, c10, false);
            }
        } else {
            if (this.v == (yVar.f == -1)) {
                a(-1, c10, true);
            } else {
                a(0, c10, true);
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
            if (yVar.f == -1) {
                i11 = yVar.b;
                i12 = i11 - kVar.a;
            } else {
                i12 = yVar.b;
                i11 = kVar.a + i12;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (yVar.f == -1) {
                int i14 = yVar.b;
                int i15 = i14 - kVar.a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = yVar.b;
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
    public void b0(hf.e eVar, z0 z0Var) {
        View view;
        View view2;
        hf.e eVar2;
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
        a0 a0Var = this;
        z0 z0Var2 = z0Var;
        int i18 = -1;
        if (!(a0Var.B == null && a0Var.y == -1) && z0Var2.b() == 0) {
            g0(eVar);
            return;
        }
        z zVar = a0Var.B;
        if (zVar != null && (i17 = zVar.a) >= 0) {
            a0Var.y = i17;
        }
        a0Var.G0();
        a0Var.p.a = false;
        a0Var.f1();
        RecyclerView recyclerView = a0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) a0Var.a.d).contains(view)) {
            view = null;
        }
        i2.p0 p0Var = a0Var.C;
        if (p0Var.d && a0Var.y == -1 && a0Var.B == null) {
            if (view != null && (a0Var.q.d(view) >= a0Var.q.f() || a0Var.q.a(view) <= a0Var.q.j())) {
                p0Var.d(((o0) view.getLayoutParams()).b(), view);
            }
            eVar2 = eVar;
        } else {
            p0Var.g();
            p0Var.c = a0Var.v ^ a0Var.w;
            if (!z0Var2.g && (i10 = a0Var.y) != -1) {
                if (i10 < 0 || i10 >= z0Var2.b()) {
                    a0Var.y = -1;
                    a0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = a0Var.y;
                    p0Var.b = i19;
                    z zVar2 = a0Var.B;
                    if (zVar2 != null && zVar2.a >= 0) {
                        boolean z10 = zVar2.c;
                        p0Var.c = z10;
                        if (z10) {
                            p0Var.e = a0Var.q.f() - a0Var.B.b;
                        } else {
                            p0Var.e = a0Var.q.j() + a0Var.B.b;
                        }
                    } else if (a0Var.A == Integer.MIN_VALUE) {
                        View m11 = a0Var.m(i19);
                        if (m11 == null) {
                            if (a0Var.r() > 0) {
                                p0Var.c = (a0Var.y < n0.H(a0Var.q(0))) == a0Var.z;
                            }
                            p0Var.b();
                        } else if (a0Var.q.b(m11) > a0Var.q.k()) {
                            p0Var.b();
                        } else if (a0Var.q.d(m11) - a0Var.q.j() < 0) {
                            p0Var.e = a0Var.q.j();
                            p0Var.c = false;
                        } else if (a0Var.q.f() - a0Var.q.a(m11) < 0) {
                            p0Var.e = a0Var.q.f();
                            p0Var.c = true;
                        } else {
                            if (p0Var.c) {
                                int a2 = a0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = a0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = a0Var.q.d(m11);
                            }
                            p0Var.e = d;
                        }
                    } else {
                        boolean z11 = a0Var.z;
                        p0Var.c = z11;
                        if (z11) {
                            p0Var.e = a0Var.q.f() - a0Var.A;
                        } else {
                            p0Var.e = a0Var.q.j() + a0Var.A;
                        }
                    }
                    eVar2 = eVar;
                    p0Var.d = true;
                }
            }
            if (a0Var.r() != 0) {
                RecyclerView recyclerView2 = a0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) a0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    o0 o0Var = (o0) view2.getLayoutParams();
                    if (!o0Var.a.j() && o0Var.b() >= 0 && o0Var.b() < z0Var2.b()) {
                        p0Var.d(((o0) view2.getLayoutParams()).b(), view2);
                        eVar2 = eVar;
                        p0Var.d = true;
                    }
                }
                if (a0Var.s == a0Var.w) {
                    if (p0Var.c) {
                        if (a0Var.v) {
                            Q0 = a0Var.Q0(eVar, z0Var2, 0, a0Var.r(), z0Var2.b());
                            a0Var = this;
                        } else {
                            a0Var = this;
                            Q0 = a0Var.Q0(eVar, z0Var, r() - 1, -1, z0Var.b());
                        }
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                    } else if (a0Var.v) {
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                        Q0 = a0Var.Q0(eVar2, z0Var2, a0Var.r() - 1, -1, z0Var.b());
                        a0Var = this;
                    } else {
                        a0Var = this;
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                        Q0 = a0Var.Q0(eVar2, z0Var2, 0, r(), z0Var.b());
                    }
                    if (Q0 != null) {
                        p0Var.c(((o0) Q0.getLayoutParams()).b(), Q0);
                        if (!z0Var2.g && a0Var.y0() && (a0Var.q.d(Q0) >= a0Var.q.f() || a0Var.q.a(Q0) < a0Var.q.j())) {
                            p0Var.e = p0Var.c ? a0Var.q.f() : a0Var.q.j();
                        }
                        p0Var.d = true;
                    }
                    p0Var.b();
                    p0Var.b = !a0Var.w ? z0Var2.b() - 1 : a0Var.R0();
                    p0Var.d = true;
                }
            }
            eVar2 = eVar;
            p0Var.b();
            p0Var.b = !a0Var.w ? z0Var2.b() - 1 : a0Var.R0();
            p0Var.d = true;
        }
        y yVar = a0Var.p;
        yVar.f = yVar.j >= 0 ? 1 : -1;
        int[] iArr = a0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        a0Var.z0(z0Var2, iArr);
        int j10 = a0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = a0Var.q.g() + Math.max(0, iArr[1]);
        if (z0Var2.g && (i15 = a0Var.y) != -1 && a0Var.A != Integer.MIN_VALUE && (m10 = a0Var.m(i15)) != null) {
            if (a0Var.z) {
                i16 = a0Var.q.f() - a0Var.q.a(m10);
                d10 = a0Var.A;
            } else {
                d10 = a0Var.q.d(m10) - a0Var.q.j();
                i16 = a0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j10 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!p0Var.c ? !a0Var.v : a0Var.v) {
            i18 = 1;
        }
        a0Var.a1(eVar2, z0Var2, p0Var, i18);
        for (int r10 = a0Var.r() - 1; r10 >= 0; r10--) {
            View q6 = a0Var.q(r10);
            c1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || a0Var.b.x.b) {
                    a0Var.q(r10);
                    a0Var.a.j(r10);
                    eVar2.i(q6);
                    a0Var.b.f.B0(U);
                } else {
                    a0Var.j0(r10);
                    eVar2.h(U);
                }
            }
        }
        a0Var.p.l = a0Var.q.h() == 0 && a0Var.q.e() == 0;
        a0Var.p.getClass();
        a0Var.p.i = 0;
        if (p0Var.c) {
            a0Var.o1(p0Var.b, p0Var.e);
            y yVar2 = a0Var.p;
            yVar2.h = j10;
            a0Var.H0(eVar2, yVar2, z0Var2, false);
            y yVar3 = a0Var.p;
            i12 = yVar3.b;
            int i21 = yVar3.d;
            int i22 = yVar3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            a0Var.n1(p0Var.b, p0Var.e);
            y yVar4 = a0Var.p;
            yVar4.h = g10;
            yVar4.d += yVar4.e;
            a0Var.H0(eVar2, yVar4, z0Var2, false);
            y yVar5 = a0Var.p;
            i11 = yVar5.b;
            int i23 = yVar5.c;
            if (i23 > 0) {
                a0Var.o1(i21, i12);
                y yVar6 = a0Var.p;
                yVar6.h = i23;
                a0Var.H0(eVar2, yVar6, z0Var2, false);
                i12 = a0Var.p.b;
            }
        } else {
            a0Var.n1(p0Var.b, p0Var.e);
            y yVar7 = a0Var.p;
            yVar7.h = g10;
            a0Var.H0(eVar2, yVar7, z0Var2, false);
            y yVar8 = a0Var.p;
            i11 = yVar8.b;
            int i24 = yVar8.d;
            int i25 = yVar8.c;
            if (i25 > 0) {
                j10 += i25;
            }
            a0Var.o1(p0Var.b, p0Var.e);
            y yVar9 = a0Var.p;
            yVar9.h = j10;
            yVar9.d += yVar9.e;
            a0Var.H0(eVar2, yVar9, z0Var2, false);
            y yVar10 = a0Var.p;
            i12 = yVar10.b;
            int i26 = yVar10.c;
            if (i26 > 0) {
                a0Var.n1(i24, i11);
                y yVar11 = a0Var.p;
                yVar11.h = i26;
                a0Var.H0(eVar2, yVar11, z0Var2, false);
                i11 = a0Var.p.b;
            }
        }
        if (a0Var.r() > 0) {
            if (a0Var.v ^ a0Var.w) {
                int S02 = a0Var.S0(i11, eVar2, z0Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = a0Var.T0(i13, eVar2, z0Var2, false);
            } else {
                int T0 = a0Var.T0(i12, eVar2, z0Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = a0Var.S0(i14, eVar2, z0Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (z0Var2.k && a0Var.r() != 0 && !z0Var2.g && a0Var.y0()) {
            List list2 = (List) eVar2.f;
            int size = list2.size();
            int H = n0.H(a0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                c1 c1Var = (c1) list2.get(i29);
                boolean j11 = c1Var.j();
                View view3 = c1Var.a;
                if (!j11) {
                    if ((c1Var.c() < H) != a0Var.v) {
                        i27 += a0Var.q.b(view3);
                    } else {
                        i28 += a0Var.q.b(view3);
                    }
                }
            }
            a0Var.p.k = list2;
            if (i27 > 0) {
                a0Var.o1(n0.H(a0Var.V0()), i12);
                y yVar12 = a0Var.p;
                yVar12.h = i27;
                yVar12.c = 0;
                yVar12.a(null);
                a0Var.H0(eVar2, a0Var.p, z0Var2, false);
            }
            if (i28 > 0) {
                a0Var.n1(n0.H(a0Var.U0()), i11);
                y yVar13 = a0Var.p;
                yVar13.h = i28;
                yVar13.c = 0;
                list = null;
                yVar13.a(null);
                a0Var.H0(eVar2, a0Var.p, z0Var2, false);
            } else {
                list = null;
            }
            a0Var.p.k = list;
        }
        if (z0Var2.g) {
            p0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = a0Var.q;
            gVar2.a = gVar2.k();
        }
        a0Var.s = a0Var.w;
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
    public void c0(z0 z0Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(hf.e eVar, y yVar) {
        c1 T;
        c1 T2;
        if (!yVar.a || yVar.l) {
            return;
        }
        int i10 = yVar.g;
        int i11 = yVar.i;
        if (yVar.f != -1) {
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

    public final void d1(hf.e eVar, int i10, int i11) {
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
    public final z e0() {
        z zVar = this.B;
        if (zVar != null) {
            z zVar2 = new z();
            zVar2.a = zVar.a;
            zVar2.b = zVar.b;
            zVar2.c = zVar.c;
            return zVar2;
        }
        z zVar3 = new z();
        if (r() <= 0) {
            zVar3.a = -1;
            return zVar3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        zVar3.c = z10;
        if (z10) {
            View U0 = U0();
            zVar3.b = this.q.f() - this.q.a(U0);
            zVar3.a = ((o0) U0.getLayoutParams()).b();
            return zVar3;
        }
        View V0 = V0();
        zVar3.a = n0.H(V0);
        zVar3.b = this.q.d(V0) - this.q.j();
        return zVar3;
    }

    public void e1(hf.e eVar, int i10, int i11) {
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

    public final int g1(int i10, hf.e eVar, z0 z0Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, z0Var);
        y yVar = this.p;
        int H0 = H0(eVar, yVar, z0Var, false) + yVar.g;
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
    public int h(z0 z0Var) {
        return C0(z0Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // s4.n0
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
        z zVar = this.B;
        if (zVar != null) {
            zVar.a = -1;
        }
        l0();
    }

    @Override // s4.n0
    public int j(z0 z0Var) {
        return B0(z0Var);
    }

    public final void j1(int i10) {
        d0 d0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i0.a.i(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                d0Var = new d0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                d0Var = new d0(this, 1);
            }
            this.q = d0Var;
            this.C.f = d0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // s4.n0
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

    @Override // s4.n0
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
            c1 U = RecyclerView.U(q10);
            if (U != null && U.c() == i10 && !U.r() && (this.b.u0.g || !U.j())) {
                return q10;
            }
        }
        return null;
    }

    @Override // s4.n0
    public int m0(int i10, hf.e eVar, z0 z0Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void m1(int i10, int i11, boolean z10, z0 z0Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        y yVar = this.p;
        int i12 = z11 ? max2 : max;
        yVar.h = i12;
        if (!z11) {
            max = max2;
        }
        yVar.i = max;
        if (z11) {
            yVar.h = this.q.g() + i12;
            View U0 = U0();
            y yVar2 = this.p;
            yVar2.e = this.v ? -1 : 1;
            int H = n0.H(U0);
            y yVar3 = this.p;
            yVar2.d = H + yVar3.e;
            yVar3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            y yVar4 = this.p;
            yVar4.h = this.q.j() + yVar4.h;
            y yVar5 = this.p;
            yVar5.e = this.v ? 1 : -1;
            int H2 = n0.H(V0);
            y yVar6 = this.p;
            yVar5.d = H2 + yVar6.e;
            yVar6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        y yVar7 = this.p;
        yVar7.c = i11;
        if (z10) {
            yVar7.c = i11 - j10;
        }
        yVar7.g = j10;
    }

    @Override // s4.n0
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override // s4.n0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        z zVar = this.B;
        if (zVar != null) {
            zVar.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        y yVar = this.p;
        yVar.e = this.v ? -1 : 1;
        yVar.d = i10;
        yVar.f = 1;
        yVar.b = i11;
        yVar.g = TLObject.FLAG_31;
    }

    @Override // s4.n0
    public int o0(int i10, hf.e eVar, z0 z0Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        y yVar = this.p;
        yVar.d = i10;
        yVar.e = this.v ? 1 : -1;
        yVar.f = -1;
        yVar.b = i11;
        yVar.g = TLObject.FLAG_31;
    }

    @Override // s4.n0
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        b0 b0Var = new b0(recyclerView.getContext());
        b0Var.a = i10;
        w0(b0Var);
    }

    @Override // s4.n0
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

    public a0(int i10, boolean z10) {
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
        i2.p0 p0Var = new i2.p0();
        p0Var.g();
        this.C = p0Var;
        this.D = new k2.k();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(hf.e eVar, z0 z0Var, i2.p0 p0Var, int i10) {
    }
}
