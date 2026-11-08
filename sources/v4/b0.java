package v4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class b0 extends n0 {
    public int A;
    public a0 B;
    public final l2.o0 C;
    public final n2.j D;
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

    public void A0(a1 a1Var, z zVar, h2.f fVar) {
        int i7 = zVar.d;
        if (i7 < 0 || i7 >= a1Var.b()) {
            return;
        }
        fVar.b(i7, Math.max(0, zVar.g));
    }

    public final int B0(a1 a1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z9 = this.x;
        boolean z10 = !z9;
        View K0 = K0(z10);
        View J0 = J0(z10);
        if (r() == 0 || a1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z9 = this.x;
            boolean z10 = !z9;
            View K0 = K0(z10);
            View J0 = J0(z10);
            boolean z11 = this.v;
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z11 ? Math.max(0, (a1Var.b() - Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b()));
                if (z9) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
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
        boolean z9 = this.x;
        boolean z10 = !z9;
        View K0 = K0(z10);
        View J0 = J0(z10);
        if (r() == 0 || a1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z9) {
            return a1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * a1Var.b());
    }

    public final PointF E0(int i7) {
        if (r() == 0) {
            return null;
        }
        int i10 = (i7 < n0.H(q(0))) != this.v ? -1 : 1;
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
            z zVar = new z();
            zVar.a = true;
            zVar.h = 0;
            zVar.i = 0;
            zVar.k = null;
            this.p = zVar;
        }
    }

    public final int H0(v0 v0Var, z zVar, a1 a1Var, boolean z9) {
        int i7 = zVar.c;
        int i10 = zVar.g;
        if (i10 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                zVar.g = i10 + i7;
            }
            c1(v0Var, zVar);
        }
        int i11 = zVar.c + zVar.h;
        while (true) {
            if ((!zVar.l && i11 <= 0) || !zVar.b(a1Var)) {
                break;
            }
            n2.j jVar = this.D;
            jVar.a = 0;
            jVar.b = false;
            jVar.c = false;
            jVar.d = false;
            Z0(v0Var, a1Var, zVar, jVar);
            if (!jVar.b) {
                int i12 = zVar.b;
                int i13 = jVar.a;
                zVar.b = (zVar.f * i13) + i12;
                if (!jVar.c || zVar.k != null || !a1Var.g) {
                    zVar.c -= i13;
                    i11 -= i13;
                }
                int i14 = zVar.g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    zVar.g = i15;
                    int i16 = zVar.c;
                    if (i16 < 0) {
                        zVar.g = i15 + i16;
                    }
                    c1(v0Var, zVar);
                }
                if (z9 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - zVar.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z9) {
        return this.v ? P0(0, r(), z9, true) : P0(r() - 1, -1, z9, true);
    }

    public final View K0(boolean z9) {
        return this.v ? P0(r() - 1, -1, z9, true) : P0(0, r(), z9, true);
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

    public final View P0(int i7, int i10, boolean z9, boolean z10) {
        G0();
        int i11 = qs.r5;
        int i12 = z9 ? 24579 : 320;
        if (!z10) {
            i11 = 0;
        }
        return this.o == 0 ? this.c.d(i7, i10, i12, i11) : this.d.d(i7, i10, i12, i11);
    }

    public View Q0(v0 v0Var, a1 a1Var, int i7, int i10, int i11) {
        G0();
        int j3 = this.r ? 0 : this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = n0.H(q10);
            if (H >= 0 && H < i11) {
                if (((o0) q10.getLayoutParams()).a.j()) {
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

    @Override // v4.n0
    public View R(View view, int i7, v0 v0Var, a1 a1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i7)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, a1Var);
            z zVar = this.p;
            zVar.g = TLObject.FLAG_31;
            zVar.a = false;
            H0(v0Var, zVar, a1Var, true);
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

    public final int S0(int i7, v0 v0Var, a1 a1Var, boolean z9) {
        int f10;
        int f11;
        if (!this.G || !this.H || (f10 = this.q.f() - i7) <= 0) {
            return 0;
        }
        int i10 = -g1(-f10, v0Var, a1Var);
        int i11 = i7 + i10;
        if (!z9 || (f11 = this.q.f() - i11) <= 0) {
            return i10;
        }
        this.q.n(f11);
        return f11 + i10;
    }

    public final int T0(int i7, v0 v0Var, a1 a1Var, boolean z9) {
        int X0;
        int j3;
        if (!this.G || (X0 = i7 - X0()) <= 0) {
            return 0;
        }
        int i10 = -g1(X0, v0Var, a1Var);
        int i11 = i7 + i10;
        if (!z9 || (j3 = i11 - this.q.j()) <= 0) {
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

    public void Z0(v0 v0Var, a1 a1Var, z zVar, n2.j jVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        View c10 = zVar.c(v0Var);
        if (c10 == null) {
            jVar.b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (zVar.k == null) {
            if (this.v == (zVar.f == -1)) {
                a(-1, c10, false);
            } else {
                a(0, c10, false);
            }
        } else {
            if (this.v == (zVar.f == -1)) {
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
            if (zVar.f == -1) {
                i10 = zVar.b;
                i11 = i10 - jVar.a;
            } else {
                i11 = zVar.b;
                i10 = jVar.a + i11;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (zVar.f == -1) {
                int i13 = zVar.b;
                int i14 = i13 - jVar.a;
                i12 = i13;
                i10 = c11;
                i7 = i14;
                i11 = F;
            } else {
                int i15 = zVar.b;
                int i16 = jVar.a + i15;
                i7 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        n0.O(c10, i7, i11, i12, i10);
        if (o0Var.a.j() || o0Var.a.m()) {
            jVar.c = true;
        }
        jVar.d = c10.hasFocusable();
    }

    @Override // v4.n0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // v4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(v0 v0Var, a1 a1Var) {
        View view;
        View view2;
        v0 v0Var2;
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
        b0 b0Var = this;
        a1 a1Var2 = a1Var;
        int i17 = -1;
        if (!(b0Var.B == null && b0Var.y == -1) && a1Var2.b() == 0) {
            g0(v0Var);
            return;
        }
        a0 a0Var = b0Var.B;
        if (a0Var != null && (i16 = a0Var.a) >= 0) {
            b0Var.y = i16;
        }
        b0Var.G0();
        b0Var.p.a = false;
        b0Var.f1();
        RecyclerView recyclerView = b0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) b0Var.a.d).contains(view)) {
            view = null;
        }
        l2.o0 o0Var = b0Var.C;
        if (o0Var.d && b0Var.y == -1 && b0Var.B == null) {
            if (view != null && (b0Var.q.d(view) >= b0Var.q.f() || b0Var.q.a(view) <= b0Var.q.j())) {
                o0Var.d(((o0) view.getLayoutParams()).b(), view);
            }
            v0Var2 = v0Var;
        } else {
            o0Var.g();
            o0Var.c = b0Var.v ^ b0Var.w;
            if (!a1Var2.g && (i7 = b0Var.y) != -1) {
                if (i7 < 0 || i7 >= a1Var2.b()) {
                    b0Var.y = -1;
                    b0Var.A = TLObject.FLAG_31;
                } else {
                    int i18 = b0Var.y;
                    o0Var.b = i18;
                    a0 a0Var2 = b0Var.B;
                    if (a0Var2 != null && a0Var2.a >= 0) {
                        boolean z9 = a0Var2.c;
                        o0Var.c = z9;
                        if (z9) {
                            o0Var.e = b0Var.q.f() - b0Var.B.b;
                        } else {
                            o0Var.e = b0Var.q.j() + b0Var.B.b;
                        }
                    } else if (b0Var.A == Integer.MIN_VALUE) {
                        View m11 = b0Var.m(i18);
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
                                int a10 = b0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = b0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a10;
                            } else {
                                d = b0Var.q.d(m11);
                            }
                            o0Var.e = d;
                        }
                    } else {
                        boolean z10 = b0Var.z;
                        o0Var.c = z10;
                        if (z10) {
                            o0Var.e = b0Var.q.f() - b0Var.A;
                        } else {
                            o0Var.e = b0Var.q.j() + b0Var.A;
                        }
                    }
                    v0Var2 = v0Var;
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
                    if (!o0Var2.a.j() && o0Var2.b() >= 0 && o0Var2.b() < a1Var2.b()) {
                        o0Var.d(((o0) view2.getLayoutParams()).b(), view2);
                        v0Var2 = v0Var;
                        o0Var.d = true;
                    }
                }
                if (b0Var.s == b0Var.w) {
                    if (o0Var.c) {
                        if (b0Var.v) {
                            Q0 = b0Var.Q0(v0Var, a1Var2, 0, b0Var.r(), a1Var2.b());
                            b0Var = this;
                        } else {
                            b0Var = this;
                            Q0 = b0Var.Q0(v0Var, a1Var, r() - 1, -1, a1Var.b());
                        }
                        v0Var2 = v0Var;
                        a1Var2 = a1Var;
                    } else if (b0Var.v) {
                        v0Var2 = v0Var;
                        a1Var2 = a1Var;
                        Q0 = b0Var.Q0(v0Var2, a1Var2, b0Var.r() - 1, -1, a1Var.b());
                        b0Var = this;
                    } else {
                        b0Var = this;
                        v0Var2 = v0Var;
                        a1Var2 = a1Var;
                        Q0 = b0Var.Q0(v0Var2, a1Var2, 0, r(), a1Var.b());
                    }
                    if (Q0 != null) {
                        o0Var.c(((o0) Q0.getLayoutParams()).b(), Q0);
                        if (!a1Var2.g && b0Var.y0() && (b0Var.q.d(Q0) >= b0Var.q.f() || b0Var.q.a(Q0) < b0Var.q.j())) {
                            o0Var.e = o0Var.c ? b0Var.q.f() : b0Var.q.j();
                        }
                        o0Var.d = true;
                    }
                    o0Var.b();
                    o0Var.b = !b0Var.w ? a1Var2.b() - 1 : b0Var.R0();
                    o0Var.d = true;
                }
            }
            v0Var2 = v0Var;
            o0Var.b();
            o0Var.b = !b0Var.w ? a1Var2.b() - 1 : b0Var.R0();
            o0Var.d = true;
        }
        z zVar = b0Var.p;
        zVar.f = zVar.j >= 0 ? 1 : -1;
        int[] iArr = b0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        b0Var.z0(a1Var2, iArr);
        int j3 = b0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = b0Var.q.g() + Math.max(0, iArr[1]);
        if (a1Var2.g && (i14 = b0Var.y) != -1 && b0Var.A != Integer.MIN_VALUE && (m10 = b0Var.m(i14)) != null) {
            if (b0Var.z) {
                i15 = b0Var.q.f() - b0Var.q.a(m10);
                d2 = b0Var.A;
            } else {
                d2 = b0Var.q.d(m10) - b0Var.q.j();
                i15 = b0Var.A;
            }
            int i19 = i15 - d2;
            if (i19 > 0) {
                j3 += i19;
            } else {
                g10 -= i19;
            }
        }
        if (!o0Var.c ? !b0Var.v : b0Var.v) {
            i17 = 1;
        }
        b0Var.a1(v0Var2, a1Var2, o0Var, i17);
        for (int r10 = b0Var.r() - 1; r10 >= 0; r10--) {
            View q10 = b0Var.q(r10);
            d1 U = RecyclerView.U(q10);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || b0Var.b.x.b) {
                    b0Var.q(r10);
                    b0Var.a.p(r10);
                    v0Var2.i(q10);
                    b0Var.b.f.S0(U);
                } else {
                    b0Var.j0(r10);
                    v0Var2.h(U);
                }
            }
        }
        b0Var.p.l = b0Var.q.h() == 0 && b0Var.q.e() == 0;
        b0Var.p.getClass();
        b0Var.p.i = 0;
        if (o0Var.c) {
            b0Var.o1(o0Var.b, o0Var.e);
            z zVar2 = b0Var.p;
            zVar2.h = j3;
            b0Var.H0(v0Var2, zVar2, a1Var2, false);
            z zVar3 = b0Var.p;
            i11 = zVar3.b;
            int i20 = zVar3.d;
            int i21 = zVar3.c;
            if (i21 > 0) {
                g10 += i21;
            }
            b0Var.n1(o0Var.b, o0Var.e);
            z zVar4 = b0Var.p;
            zVar4.h = g10;
            zVar4.d += zVar4.e;
            b0Var.H0(v0Var2, zVar4, a1Var2, false);
            z zVar5 = b0Var.p;
            i10 = zVar5.b;
            int i22 = zVar5.c;
            if (i22 > 0) {
                b0Var.o1(i20, i11);
                z zVar6 = b0Var.p;
                zVar6.h = i22;
                b0Var.H0(v0Var2, zVar6, a1Var2, false);
                i11 = b0Var.p.b;
            }
        } else {
            b0Var.n1(o0Var.b, o0Var.e);
            z zVar7 = b0Var.p;
            zVar7.h = g10;
            b0Var.H0(v0Var2, zVar7, a1Var2, false);
            z zVar8 = b0Var.p;
            i10 = zVar8.b;
            int i23 = zVar8.d;
            int i24 = zVar8.c;
            if (i24 > 0) {
                j3 += i24;
            }
            b0Var.o1(o0Var.b, o0Var.e);
            z zVar9 = b0Var.p;
            zVar9.h = j3;
            zVar9.d += zVar9.e;
            b0Var.H0(v0Var2, zVar9, a1Var2, false);
            z zVar10 = b0Var.p;
            i11 = zVar10.b;
            int i25 = zVar10.c;
            if (i25 > 0) {
                b0Var.n1(i23, i10);
                z zVar11 = b0Var.p;
                zVar11.h = i25;
                b0Var.H0(v0Var2, zVar11, a1Var2, false);
                i10 = b0Var.p.b;
            }
        }
        if (b0Var.r() > 0) {
            if (b0Var.v ^ b0Var.w) {
                int S02 = b0Var.S0(i10, v0Var2, a1Var2, true);
                i12 = i11 + S02;
                i13 = i10 + S02;
                S0 = b0Var.T0(i12, v0Var2, a1Var2, false);
            } else {
                int T0 = b0Var.T0(i11, v0Var2, a1Var2, true);
                i12 = i11 + T0;
                i13 = i10 + T0;
                S0 = b0Var.S0(i13, v0Var2, a1Var2, false);
            }
            i11 = i12 + S0;
            i10 = i13 + S0;
        }
        if (a1Var2.k && b0Var.r() != 0 && !a1Var2.g && b0Var.y0()) {
            List list2 = (List) v0Var2.f;
            int size = list2.size();
            int H = n0.H(b0Var.q(0));
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                d1 d1Var = (d1) list2.get(i28);
                boolean j10 = d1Var.j();
                View view3 = d1Var.a;
                if (!j10) {
                    if ((d1Var.c() < H) != b0Var.v) {
                        i26 += b0Var.q.b(view3);
                    } else {
                        i27 += b0Var.q.b(view3);
                    }
                }
            }
            b0Var.p.k = list2;
            if (i26 > 0) {
                b0Var.o1(n0.H(b0Var.V0()), i11);
                z zVar12 = b0Var.p;
                zVar12.h = i26;
                zVar12.c = 0;
                zVar12.a(null);
                b0Var.H0(v0Var2, b0Var.p, a1Var2, false);
            }
            if (i27 > 0) {
                b0Var.n1(n0.H(b0Var.U0()), i10);
                z zVar13 = b0Var.p;
                zVar13.h = i27;
                zVar13.c = 0;
                list = null;
                zVar13.a(null);
                b0Var.H0(v0Var2, b0Var.p, a1Var2, false);
            } else {
                list = null;
            }
            b0Var.p.k = list;
        }
        if (a1Var2.g) {
            o0Var.g();
        } else {
            androidx.emoji2.text.g gVar2 = b0Var.q;
            gVar2.a = gVar2.k();
        }
        b0Var.s = b0Var.w;
    }

    public void b1(View view, View view2, int i7, int i10) {
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

    @Override // v4.n0
    public void c0(a1 a1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.g();
    }

    public final void c1(v0 v0Var, z zVar) {
        d1 T;
        d1 T2;
        if (!zVar.a || zVar.l) {
            return;
        }
        int i7 = zVar.g;
        int i10 = zVar.i;
        if (zVar.f != -1) {
            e1(v0Var, i7, i10);
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
                    d1(v0Var, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11 != null && (T = this.b.T(q11)) != null && !T.r() && (this.q.d(q11) < e10 || this.q.m(q11) < e10)) {
                d1(v0Var, i12, i13);
                return;
            }
        }
    }

    @Override // v4.n0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(v0 v0Var, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        if (i10 <= i7) {
            while (i7 > i10) {
                i0(i7, v0Var);
                i7--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i7; i11--) {
                i0(i11, v0Var);
            }
        }
    }

    @Override // v4.n0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // v4.n0
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
        boolean z9 = this.s ^ this.v;
        a0Var3.c = z9;
        if (z9) {
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

    public void e1(v0 v0Var, int i7, int i10) {
        d1 T;
        d1 T2;
        if (i7 < 0) {
            return;
        }
        int i11 = i7 - i10;
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q10 = q(i12);
                if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.a(q10) > i11 || this.q.l(q10) > i11)) {
                    d1(v0Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q11 = q(i14);
            if (q11 != null && (T2 = this.b.T(q11)) != null && !T2.r() && (this.q.a(q11) > i11 || this.q.l(q11) > i11)) {
                d1(v0Var, i13, i14);
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

    public final int g1(int i7, v0 v0Var, a1 a1Var) {
        if (r() == 0 || i7 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i10 = i7 > 0 ? 1 : -1;
        int abs = Math.abs(i7);
        m1(i10, abs, true, a1Var);
        z zVar = this.p;
        int H0 = H0(v0Var, zVar, a1Var, false) + zVar.g;
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

    @Override // v4.n0
    public int h(a1 a1Var) {
        return C0(a1Var);
    }

    public void h1(int i7, int i10) {
        i1(i7, i10, this.v);
    }

    @Override // v4.n0
    public int i(a1 a1Var) {
        return D0(a1Var);
    }

    public void i1(int i7, int i10, boolean z9) {
        if (this.y == i7 && this.A == i10 && this.z == z9) {
            return;
        }
        this.y = i7;
        this.A = i10;
        this.z = z9;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.a = -1;
        }
        l0();
    }

    @Override // v4.n0
    public int j(a1 a1Var) {
        return B0(a1Var);
    }

    public final void j1(int i7) {
        e0 e0Var;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(jg.g.j(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 != this.o || this.q == null) {
            if (i7 == 0) {
                e0Var = new e0(this, 0);
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                e0Var = new e0(this, 1);
            }
            this.q = e0Var;
            this.C.f = e0Var;
            this.o = i7;
            l0();
        }
    }

    @Override // v4.n0
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    public void k1(boolean z9) {
        b(null);
        if (z9 == this.t) {
            return;
        }
        this.t = z9;
        l0();
    }

    @Override // v4.n0
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    public void l1(boolean z9) {
        b(null);
        if (this.w == z9) {
            return;
        }
        this.w = z9;
        l0();
    }

    @Override // v4.n0
    public final View m(int i7) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i7 - n0.H(q(0));
        if (H >= 0 && H < r10) {
            View q10 = q(H);
            if (n0.H(q10) == i7) {
                return q10;
            }
        }
        int r11 = r();
        for (int i10 = 0; i10 < r11; i10++) {
            View q11 = q(i10);
            d1 U = RecyclerView.U(q11);
            if (U != null && U.c() == i7 && !U.r() && (this.b.u0.g || !U.j())) {
                return q11;
            }
        }
        return null;
    }

    @Override // v4.n0
    public int m0(int i7, v0 v0Var, a1 a1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i7, v0Var, a1Var);
    }

    public final void m1(int i7, int i10, boolean z9, a1 a1Var) {
        int j3;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i7;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(a1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z10 = i7 == 1;
        z zVar = this.p;
        int i11 = z10 ? max2 : max;
        zVar.h = i11;
        if (!z10) {
            max = max2;
        }
        zVar.i = max;
        if (z10) {
            zVar.h = this.q.g() + i11;
            View U0 = U0();
            z zVar2 = this.p;
            zVar2.e = this.v ? -1 : 1;
            int H = n0.H(U0);
            z zVar3 = this.p;
            zVar2.d = H + zVar3.e;
            zVar3.b = this.q.a(U0);
            j3 = this.q.a(U0) - this.q.f();
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
            j3 = (-this.q.d(V0)) + this.q.j();
        }
        z zVar7 = this.p;
        zVar7.c = i10;
        if (z9) {
            zVar7.c = i10 - j3;
        }
        zVar7.g = j3;
    }

    @Override // v4.n0
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override // v4.n0
    public void n0(int i7) {
        this.y = i7;
        this.A = TLObject.FLAG_31;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i7, int i10) {
        this.p.c = this.q.f() - i10;
        z zVar = this.p;
        zVar.e = this.v ? -1 : 1;
        zVar.d = i7;
        zVar.f = 1;
        zVar.b = i10;
        zVar.g = TLObject.FLAG_31;
    }

    @Override // v4.n0
    public int o0(int i7, v0 v0Var, a1 a1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i7, v0Var, a1Var);
    }

    public final void o1(int i7, int i10) {
        this.p.c = i10 - this.q.j();
        z zVar = this.p;
        zVar.d = i7;
        zVar.e = this.v ? 1 : -1;
        zVar.f = -1;
        zVar.b = i10;
        zVar.g = TLObject.FLAG_31;
    }

    @Override // v4.n0
    public void v0(RecyclerView recyclerView, a1 a1Var, int i7) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.a = i7;
        w0(c0Var);
    }

    @Override // v4.n0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(a1 a1Var, int[] iArr) {
        int i7;
        int W0 = W0(a1Var);
        if (this.p.f == -1) {
            i7 = 0;
        } else {
            i7 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i7;
    }

    public b0(int i7, boolean z9) {
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
        l2.o0 o0Var = new l2.o0();
        o0Var.g();
        this.C = o0Var;
        this.D = new n2.j();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i7);
        k1(z9);
    }

    public void a1(v0 v0Var, a1 a1Var, l2.o0 o0Var, int i7) {
    }
}
