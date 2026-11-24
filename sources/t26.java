// default package

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class t26 extends d49 {
    public int A;
    public s26 B;
    public final p26 C;
    public final q26 D;
    public byte E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public boolean o;
    public r26 p;
    public cr2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public t26(int i, boolean z) {
        this.o = true;
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
        p26 p26Var = new p26();
        p26Var.c();
        this.C = p26Var;
        this.D = new q26();
        this.E = (byte) 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        i1(i);
        j1(z);
    }

    public final int A0(p49 p49Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        cr2 cr2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || p49Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1;
        }
        return Math.min(cr2Var.k(), cr2Var.a(I0) - cr2Var.d(J0));
    }

    public final int B0(p49 p49Var) {
        if (r() != 0) {
            F0();
            cr2 cr2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            boolean z3 = this.v;
            if (r() != 0 && p49Var.b() != 0 && J0 != null && I0 != null) {
                int max = z3 ? Math.max(0, (p49Var.b() - Math.max(((e49) J0.getLayoutParams()).b(), ((e49) I0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((e49) J0.getLayoutParams()).b(), ((e49) I0.getLayoutParams()).b()));
                if (z) {
                    return Math.round((max * (Math.abs(cr2Var.a(I0) - cr2Var.d(J0)) / (Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1))) + (cr2Var.j() - cr2Var.d(J0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int C0(p49 p49Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        cr2 cr2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || p49Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return p49Var.b();
        }
        return (int) (((cr2Var.a(I0) - cr2Var.d(J0)) / (Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1)) * p49Var.b());
    }

    public final PointF D0(int i) {
        if (r() == 0) {
            return null;
        }
        int i2 = (i < d49.G(q(0))) != this.v ? -1 : 1;
        return !this.o ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int E0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (this.o) {
                        return TLObject.FLAG_31;
                    }
                    return -1;
                }
                if (i == 33) {
                    if (this.o) {
                        return -1;
                    }
                    return TLObject.FLAG_31;
                }
                if (i != 66) {
                    if (i != 130 || !this.o) {
                        return TLObject.FLAG_31;
                    }
                } else if (this.o) {
                    return TLObject.FLAG_31;
                }
            } else if (!this.o && X0()) {
                return -1;
            }
        } else if (this.o || !X0()) {
            return -1;
        }
        return 1;
    }

    public final void F0() {
        if (this.p == null) {
            r26 r26Var = new r26();
            r26Var.a = true;
            r26Var.h = 0;
            r26Var.i = 0;
            r26Var.k = null;
            this.p = r26Var;
        }
    }

    public final int G0(wg2 wg2Var, r26 r26Var, p49 p49Var, boolean z) {
        int i = r26Var.c;
        int i2 = r26Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                r26Var.g = i2 + i;
            }
            b1(wg2Var, r26Var);
        }
        int i3 = r26Var.c + r26Var.h;
        while (true) {
            if ((!r26Var.l && i3 <= 0) || !r26Var.b(p49Var)) {
                break;
            }
            q26 q26Var = this.D;
            q26Var.a = 0;
            q26Var.b = false;
            q26Var.c = false;
            q26Var.d = false;
            Y0(wg2Var, p49Var, r26Var, q26Var);
            if (!q26Var.b) {
                int i4 = r26Var.b;
                int i5 = q26Var.a;
                r26Var.b = (r26Var.f * i5) + i4;
                if (!q26Var.c || r26Var.k != null || !p49Var.g) {
                    r26Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = r26Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    r26Var.g = i7;
                    int i8 = r26Var.c;
                    if (i8 < 0) {
                        r26Var.g = i7 + i8;
                    }
                    b1(wg2Var, r26Var);
                }
                if (z && q26Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - r26Var.c;
    }

    public final int H0() {
        View O0 = O0(0, r(), true, false);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final View I0(boolean z) {
        return this.v ? O0(0, r(), z, true) : O0(r() - 1, -1, z, true);
    }

    public final View J0(boolean z) {
        return this.v ? O0(r() - 1, -1, z, true) : O0(0, r(), z, true);
    }

    public final int K0() {
        View O0 = O0(0, r(), false, true);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final int L0() {
        View O0 = O0(r() - 1, -1, true, false);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final int M0() {
        View O0 = O0(r() - 1, -1, false, true);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        F0();
        if (i2 <= i && i2 >= i) {
            return q(i);
        }
        if (this.q.d(q(i)) < this.q.j()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return !this.o ? this.c.r(i, i2, i3, i4) : this.d.r(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z, boolean z2) {
        F0();
        int i3 = kk7.q5;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return !this.o ? this.c.r(i, i2, i4, i3) : this.d.r(i, i2, i4, i3);
    }

    public View P0(wg2 wg2Var, p49 p49Var, int i, int i2, int i3) {
        F0();
        int j = this.r ? 0 : this.q.j();
        int f = this.q.f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = d49.G(q);
            if (G >= 0 && G < i3) {
                if (((e49) q.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q;
                    }
                } else {
                    if (this.q.d(q) < f && this.q.a(q) >= j) {
                        return q;
                    }
                    if (view == null) {
                        view = q;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // d49
    public View Q(View view, int i, wg2 wg2Var, p49 p49Var) {
        int E0;
        e1();
        if (r() != 0 && (E0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            l1(E0, (int) (this.q.k() * 0.33333334f), false, p49Var);
            r26 r26Var = this.p;
            r26Var.g = TLObject.FLAG_31;
            r26Var.a = false;
            G0(wg2Var, r26Var, p49Var, true);
            boolean z = this.v;
            View N0 = E0 == -1 ? z ? N0(r() - 1, -1) : N0(0, r()) : z ? N0(0, r()) : N0(r() - 1, -1);
            View U0 = E0 == -1 ? U0() : T0();
            if (!U0.hasFocusable()) {
                return N0;
            }
            if (N0 != null) {
                return U0;
            }
        }
        return null;
    }

    public int Q0() {
        return 0;
    }

    public final int R0(int i, wg2 wg2Var, p49 p49Var, boolean z) {
        int f;
        int f2;
        if (!this.G || !this.H || (f = this.q.f() - i) <= 0) {
            return 0;
        }
        int i2 = -f1(-f, wg2Var, p49Var);
        int i3 = i + i2;
        if (!z || (f2 = this.q.f() - i3) <= 0) {
            return i2;
        }
        this.q.p(f2);
        return f2 + i2;
    }

    public final int S0(int i, wg2 wg2Var, p49 p49Var, boolean z) {
        int W0;
        int j;
        if (!this.G || (W0 = i - W0()) <= 0) {
            return 0;
        }
        int i2 = -f1(W0, wg2Var, p49Var);
        int i3 = i + i2;
        if (!z || (j = i3 - this.q.j()) <= 0) {
            return i2;
        }
        this.q.p(-j);
        return i2 - j;
    }

    public final View T0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View U0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int V0(p49 p49Var) {
        if (p49Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int W0() {
        return this.q.j();
    }

    public boolean X0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = jdc.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Y0(wg2 wg2Var, p49 p49Var, r26 r26Var, q26 q26Var) {
        int i;
        int i2;
        int i3;
        int i4;
        View c = r26Var.c(wg2Var);
        if (c == null) {
            q26Var.b = true;
            return;
        }
        e49 e49Var = (e49) c.getLayoutParams();
        List list = r26Var.k;
        boolean z = this.v;
        int i5 = r26Var.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                a(-1, c, false);
            } else {
                a(0, c, false);
            }
        } else {
            if (z == (i5 == -1)) {
                a(-1, c, true);
            } else {
                a(0, c, true);
            }
        }
        O(c);
        q26Var.a = this.q.b(c);
        if (this.o) {
            if (X0()) {
                i4 = this.m - D();
                i2 = i4 - this.q.c(c);
            } else {
                int C = C();
                i4 = this.q.c(c) + C;
                i2 = C;
            }
            int i6 = r26Var.f;
            i3 = r26Var.b;
            int i7 = q26Var.a;
            if (i6 == -1) {
                int i8 = i3 - i7;
                i = i3;
                i3 = i8;
            } else {
                i = i7 + i3;
            }
        } else {
            int E = E();
            int c2 = this.q.c(c) + E;
            int i9 = r26Var.f;
            int i10 = r26Var.b;
            int i11 = q26Var.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                i4 = i10;
                i3 = E;
                i = c2;
                i2 = i12;
            } else {
                int i13 = i10 + i11;
                i = c2;
                i2 = i10;
                i3 = E;
                i4 = i13;
            }
        }
        d49.N(c, i2, i3, i4, i);
        if (e49Var.a.j() || e49Var.a.m()) {
            q26Var.c = true;
        }
        q26Var.d = c.hasFocusable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x028b, code lost:
    
        if (r3 < r4) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ac  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    @Override // d49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a0(wg2 wg2Var, p49 p49Var) {
        View view;
        wg2 wg2Var2;
        View view2;
        View P0;
        t26 t26Var;
        int i;
        int d;
        t26 t26Var2;
        int i2;
        int i3;
        ?? r5;
        List list;
        int i4;
        int i5;
        int R0;
        int i6;
        View m;
        int d2;
        int i7;
        int i8;
        t26 t26Var3 = this;
        p49 p49Var2 = p49Var;
        int i9 = -1;
        if (!(t26Var3.B == null && t26Var3.y == -1) && p49Var2.b() == 0) {
            f0(wg2Var);
            return;
        }
        s26 s26Var = t26Var3.B;
        if (s26Var != null && (i8 = s26Var.a) >= 0) {
            t26Var3.y = i8;
        }
        t26Var3.F0();
        boolean z = false;
        t26Var3.p.a = false;
        t26Var3.e1();
        RecyclerView recyclerView = t26Var3.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) t26Var3.a.d).contains(view)) {
            view = null;
        }
        p26 p26Var = t26Var3.C;
        if (p26Var.e && t26Var3.y == -1 && t26Var3.B == null) {
            if (view != null && (t26Var3.q.d(view) >= t26Var3.q.f() || t26Var3.q.a(view) <= t26Var3.q.j())) {
                p26Var.b(((e49) view.getLayoutParams()).b(), view);
            }
            wg2Var2 = wg2Var;
            t26Var2 = t26Var3;
        } else {
            p26Var.c();
            p26Var.d = t26Var3.v ^ t26Var3.w;
            if (!p49Var2.g && (i = t26Var3.y) != -1) {
                if (i < 0 || i >= p49Var2.b()) {
                    t26Var3.y = -1;
                    t26Var3.A = TLObject.FLAG_31;
                } else {
                    int i10 = t26Var3.y;
                    p26Var.b = i10;
                    s26 s26Var2 = t26Var3.B;
                    if (s26Var2 != null && s26Var2.a >= 0) {
                        boolean z2 = s26Var2.c;
                        p26Var.d = z2;
                        cr2 cr2Var = t26Var3.q;
                        if (z2) {
                            p26Var.c = cr2Var.f() - t26Var3.B.b;
                        } else {
                            p26Var.c = cr2Var.j() + t26Var3.B.b;
                        }
                    } else if (t26Var3.A == Integer.MIN_VALUE) {
                        View m2 = t26Var3.m(i10);
                        if (m2 == null) {
                            if (t26Var3.r() > 0) {
                                p26Var.d = (t26Var3.y < d49.G(t26Var3.q(0))) == t26Var3.z;
                            }
                            p26Var.a();
                        } else if (t26Var3.q.b(m2) > t26Var3.q.k()) {
                            p26Var.a();
                        } else {
                            int d3 = t26Var3.q.d(m2) - t26Var3.q.j();
                            cr2 cr2Var2 = t26Var3.q;
                            if (d3 < 0) {
                                p26Var.c = cr2Var2.j();
                                p26Var.d = false;
                            } else if (cr2Var2.f() - t26Var3.q.a(m2) < 0) {
                                p26Var.c = t26Var3.q.f();
                                p26Var.d = true;
                            } else {
                                boolean z3 = p26Var.d;
                                cr2 cr2Var3 = t26Var3.q;
                                if (z3) {
                                    int a = cr2Var3.a(m2);
                                    cr2 cr2Var4 = t26Var3.q;
                                    d = (Integer.MIN_VALUE == cr2Var4.a ? 0 : cr2Var4.k() - cr2Var4.a) + a;
                                } else {
                                    d = cr2Var3.d(m2);
                                }
                                p26Var.c = d;
                            }
                        }
                    } else {
                        boolean z4 = t26Var3.z;
                        p26Var.d = z4;
                        cr2 cr2Var5 = t26Var3.q;
                        if (z4) {
                            p26Var.c = cr2Var5.f() - t26Var3.A;
                        } else {
                            p26Var.c = cr2Var5.j() + t26Var3.A;
                        }
                    }
                    wg2Var2 = wg2Var;
                    t26Var = t26Var3;
                    p26Var.e = true;
                    t26Var2 = t26Var;
                }
            }
            if (t26Var3.r() != 0) {
                RecyclerView recyclerView2 = t26Var3.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) t26Var3.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    e49 e49Var = (e49) view2.getLayoutParams();
                    if (!e49Var.a.j() && e49Var.b() >= 0 && e49Var.b() < p49Var2.b()) {
                        p26Var.b(((e49) view2.getLayoutParams()).b(), view2);
                        wg2Var2 = wg2Var;
                        t26Var = t26Var3;
                        p26Var.e = true;
                        t26Var2 = t26Var;
                    }
                }
                if (t26Var3.s == t26Var3.w) {
                    boolean z5 = p26Var.d;
                    boolean z6 = t26Var3.v;
                    if (z5) {
                        P0 = z6 ? t26Var3.P0(wg2Var, p49Var2, 0, t26Var3.r(), p49Var2.b()) : P0(wg2Var, p49Var, r() - 1, -1, p49Var.b());
                        t26Var3 = this;
                        wg2Var2 = wg2Var;
                        p49Var2 = p49Var;
                    } else if (z6) {
                        t26 t26Var4 = this;
                        wg2Var2 = wg2Var;
                        p49Var2 = p49Var;
                        P0 = t26Var4.P0(wg2Var2, p49Var2, r() - 1, -1, p49Var.b());
                        t26Var3 = t26Var4;
                    } else {
                        t26 t26Var5 = this;
                        wg2Var2 = wg2Var;
                        p49Var2 = p49Var;
                        P0 = t26Var5.P0(wg2Var2, p49Var2, 0, r(), p49Var.b());
                        t26Var3 = t26Var5;
                    }
                    if (P0 != null) {
                        int b = ((e49) P0.getLayoutParams()).b();
                        boolean z7 = p26Var.d;
                        cr2 cr2Var6 = p26Var.a;
                        if (z7) {
                            int a2 = cr2Var6.a(P0);
                            cr2 cr2Var7 = p26Var.a;
                            p26Var.c = (Integer.MIN_VALUE == cr2Var7.a ? 0 : cr2Var7.k() - cr2Var7.a) + a2;
                        } else {
                            p26Var.c = cr2Var6.d(P0);
                        }
                        p26Var.b = b;
                        t26Var = t26Var3;
                        if (!p49Var2.g) {
                            boolean x0 = t26Var3.x0();
                            t26Var = t26Var3;
                            if (x0) {
                                if (t26Var3.q.d(P0) < t26Var3.q.f()) {
                                    int a3 = t26Var3.q.a(P0);
                                    int j = t26Var3.q.j();
                                    t26Var = t26Var3;
                                }
                                boolean z8 = p26Var.d;
                                cr2 cr2Var8 = t26Var3.q;
                                p26Var.c = z8 ? cr2Var8.f() : cr2Var8.j();
                                t26Var = t26Var3;
                            }
                        }
                        p26Var.e = true;
                        t26Var2 = t26Var;
                    }
                    p26Var.a();
                    p26Var.b = !t26Var3.w ? p49Var2.b() - 1 : t26Var3.Q0();
                    t26Var = t26Var3;
                    p26Var.e = true;
                    t26Var2 = t26Var;
                }
            }
            wg2Var2 = wg2Var;
            p26Var.a();
            p26Var.b = !t26Var3.w ? p49Var2.b() - 1 : t26Var3.Q0();
            t26Var = t26Var3;
            p26Var.e = true;
            t26Var2 = t26Var;
        }
        r26 r26Var = t26Var2.p;
        r26Var.f = r26Var.j >= 0 ? 1 : -1;
        int[] iArr = t26Var2.F;
        iArr[0] = 0;
        iArr[1] = 0;
        t26Var2.y0(p49Var2, iArr);
        int j2 = t26Var2.q.j() + Math.max(0, iArr[0]);
        int g = t26Var2.q.g() + Math.max(0, iArr[1]);
        if (p49Var2.g && (i6 = t26Var2.y) != -1 && t26Var2.A != Integer.MIN_VALUE && (m = t26Var2.m(i6)) != null) {
            boolean z9 = t26Var2.z;
            cr2 cr2Var9 = t26Var2.q;
            if (z9) {
                i7 = cr2Var9.f() - t26Var2.q.a(m);
                d2 = t26Var2.A;
            } else {
                d2 = cr2Var9.d(m) - t26Var2.q.j();
                i7 = t26Var2.A;
            }
            int i11 = i7 - d2;
            if (i11 > 0) {
                j2 += i11;
            } else {
                g -= i11;
            }
        }
        boolean z10 = p26Var.d;
        boolean z11 = t26Var2.v;
        if (!z10 ? !z11 : z11) {
            i9 = 1;
        }
        t26Var2.Z0(wg2Var2, p49Var2, p26Var, i9);
        for (int r = t26Var2.r() - 1; r >= 0; r--) {
            View q = t26Var2.q(r);
            s49 U = RecyclerView.U(q);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || t26Var2.b.x.b) {
                    t26Var2.q(r);
                    t26Var2.a.w(r);
                    wg2Var2.j(q);
                    t26Var2.b.f.n(U);
                } else {
                    t26Var2.i0(r);
                    wg2Var2.i(U);
                }
            }
        }
        t26Var2.p.l = t26Var2.q.h() == 0 && t26Var2.q.e() == 0;
        t26Var2.p.getClass();
        t26Var2.p.i = 0;
        boolean z12 = p26Var.d;
        int i12 = p26Var.b;
        if (z12) {
            t26Var2.n1(i12, p26Var.c);
            r26 r26Var2 = t26Var2.p;
            r26Var2.h = j2;
            t26Var2.G0(wg2Var2, r26Var2, p49Var2, false);
            r26 r26Var3 = t26Var2.p;
            i3 = r26Var3.b;
            int i13 = r26Var3.d;
            int i14 = r26Var3.c;
            if (i14 > 0) {
                g += i14;
            }
            t26Var2.m1(p26Var.b, p26Var.c);
            r26 r26Var4 = t26Var2.p;
            r26Var4.h = g;
            r26Var4.d += r26Var4.e;
            t26Var2.G0(wg2Var2, r26Var4, p49Var2, false);
            r26 r26Var5 = t26Var2.p;
            i2 = r26Var5.b;
            int i15 = r26Var5.c;
            if (i15 > 0) {
                t26Var2.n1(i13, i3);
                r26 r26Var6 = t26Var2.p;
                r26Var6.h = i15;
                t26Var2.G0(wg2Var2, r26Var6, p49Var2, false);
                i3 = t26Var2.p.b;
            }
        } else {
            t26Var2.m1(i12, p26Var.c);
            r26 r26Var7 = t26Var2.p;
            r26Var7.h = g;
            t26Var2.G0(wg2Var2, r26Var7, p49Var2, false);
            r26 r26Var8 = t26Var2.p;
            i2 = r26Var8.b;
            int i16 = r26Var8.d;
            int i17 = r26Var8.c;
            if (i17 > 0) {
                j2 += i17;
            }
            t26Var2.n1(p26Var.b, p26Var.c);
            r26 r26Var9 = t26Var2.p;
            r26Var9.h = j2;
            r26Var9.d += r26Var9.e;
            t26Var2.G0(wg2Var2, r26Var9, p49Var2, false);
            r26 r26Var10 = t26Var2.p;
            i3 = r26Var10.b;
            int i18 = r26Var10.c;
            if (i18 > 0) {
                t26Var2.m1(i16, i2);
                r26 r26Var11 = t26Var2.p;
                r26Var11.h = i18;
                t26Var2.G0(wg2Var2, r26Var11, p49Var2, false);
                i2 = t26Var2.p.b;
            }
        }
        if (t26Var2.r() > 0) {
            if (t26Var2.v ^ t26Var2.w) {
                int R02 = t26Var2.R0(i2, wg2Var2, p49Var2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                R0 = t26Var2.S0(i4, wg2Var2, p49Var2, false);
            } else {
                int S0 = t26Var2.S0(i3, wg2Var2, p49Var2, true);
                i4 = i3 + S0;
                i5 = i2 + S0;
                R0 = t26Var2.R0(i5, wg2Var2, p49Var2, false);
            }
            i3 = i4 + R0;
            i2 = i5 + R0;
        }
        if (p49Var2.k && t26Var2.r() != 0 && !p49Var2.g && t26Var2.x0()) {
            List list2 = (List) wg2Var2.f;
            int size = list2.size();
            int G = d49.G(t26Var2.q(0));
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < size) {
                s49 s49Var = (s49) list2.get(i19);
                boolean j3 = s49Var.j();
                View view3 = s49Var.a;
                if (!j3) {
                    boolean z13 = s49Var.c() < G ? true : z;
                    boolean z14 = t26Var2.v;
                    cr2 cr2Var10 = t26Var2.q;
                    if (z13 != z14) {
                        i20 += cr2Var10.b(view3);
                    } else {
                        i21 += cr2Var10.b(view3);
                    }
                }
                i19++;
                z = false;
            }
            t26Var2.p.k = list2;
            if (i20 > 0) {
                t26Var2.n1(d49.G(t26Var2.U0()), i3);
                r26 r26Var12 = t26Var2.p;
                r26Var12.h = i20;
                r5 = 0;
                r26Var12.c = 0;
                r26Var12.a(null);
                t26Var2.G0(wg2Var2, t26Var2.p, p49Var2, false);
            } else {
                r5 = 0;
            }
            if (i21 > 0) {
                t26Var2.m1(d49.G(t26Var2.T0()), i2);
                r26 r26Var13 = t26Var2.p;
                r26Var13.h = i21;
                r26Var13.c = r5;
                list = null;
                r26Var13.a(null);
                t26Var2.G0(wg2Var2, t26Var2.p, p49Var2, r5);
            } else {
                list = null;
            }
            t26Var2.p.k = list;
        }
        if (p49Var2.g) {
            p26Var.c();
        } else {
            cr2 cr2Var11 = t26Var2.q;
            cr2Var11.a = cr2Var11.k();
        }
        t26Var2.s = t26Var2.w;
    }

    public void a1(View view, View view2, int i, int i2) {
        b("Cannot drop a view during a scroll or layout calculation");
        F0();
        e1();
        int G = d49.G(view);
        int G2 = d49.G(view2);
        char c = G < G2 ? (char) 1 : (char) 65535;
        boolean z = this.v;
        cr2 cr2Var = this.q;
        if (z) {
            if (c == 1) {
                g1(G2, cr2Var.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                g1(G2, cr2Var.f() - this.q.a(view2));
                return;
            }
        }
        if (c == 65535) {
            g1(G2, cr2Var.d(view2));
        } else {
            g1(G2, cr2Var.a(view2) - this.q.b(view));
        }
    }

    @Override // d49
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override // d49
    public void b0(p49 p49Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.c();
    }

    public final void b1(wg2 wg2Var, r26 r26Var) {
        s49 T;
        s49 T2;
        if (!r26Var.a || r26Var.l) {
            return;
        }
        int i = r26Var.g;
        int i2 = r26Var.i;
        if (r26Var.f != -1) {
            d1(wg2Var, i, i2);
            return;
        }
        int r = r();
        if (i >= 0) {
            int e = (this.q.e() - i) + i2;
            if (this.v) {
                for (int i3 = 0; i3 < r; i3++) {
                    View q = q(i3);
                    if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.d(q) < e || this.q.m(q) < e)) {
                        c1(wg2Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = r - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View q2 = q(i5);
                if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.d(q2) < e || this.q.m(q2) < e)) {
                    c1(wg2Var, i4, i5);
                    return;
                }
            }
        }
    }

    public final void c1(wg2 wg2Var, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    h0(i, wg2Var);
                    i--;
                }
            } else {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    h0(i3, wg2Var);
                }
            }
        }
    }

    @Override // d49
    public final boolean d() {
        return (this.u || this.o) ? false : true;
    }

    @Override // d49
    public final s26 d0() {
        s26 s26Var = this.B;
        if (s26Var != null) {
            s26 s26Var2 = new s26();
            s26Var2.a = s26Var.a;
            s26Var2.b = s26Var.b;
            s26Var2.c = s26Var.c;
            return s26Var2;
        }
        s26 s26Var3 = new s26();
        if (r() <= 0) {
            s26Var3.a = -1;
            return s26Var3;
        }
        F0();
        boolean z = this.s ^ this.v;
        s26Var3.c = z;
        if (z) {
            View T0 = T0();
            s26Var3.b = this.q.f() - this.q.a(T0);
            s26Var3.a = ((e49) T0.getLayoutParams()).b();
            return s26Var3;
        }
        View U0 = U0();
        s26Var3.a = d49.G(U0);
        s26Var3.b = this.q.d(U0) - this.q.j();
        return s26Var3;
    }

    public void d1(wg2 wg2Var, int i, int i2) {
        s49 T;
        s49 T2;
        if (i >= 0) {
            int i3 = i - i2;
            int r = r();
            if (!this.v) {
                for (int i4 = 0; i4 < r; i4++) {
                    View q = q(i4);
                    if (q != null && (T = this.b.T(q)) != null && !T.r() && (this.q.a(q) > i3 || this.q.l(q) > i3)) {
                        c1(wg2Var, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = r - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View q2 = q(i6);
                if (q2 != null && (T2 = this.b.T(q2)) != null && !T2.r() && (this.q.a(q2) > i3 || this.q.l(q2) > i3)) {
                    c1(wg2Var, i5, i6);
                    return;
                }
            }
        }
    }

    @Override // d49
    public boolean e() {
        return !this.u && this.o;
    }

    public final void e1() {
        if (this.o || !X0()) {
            this.v = this.t;
        } else {
            this.v = !this.t;
        }
    }

    public final int f1(int i, wg2 wg2Var, p49 p49Var) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        F0();
        this.p.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i2, abs, true, p49Var);
        r26 r26Var = this.p;
        int G0 = G0(wg2Var, r26Var, p49Var, false) + r26Var.g;
        if (G0 < 0) {
            return 0;
        }
        if (abs > G0) {
            i = i2 * G0;
        }
        this.q.p(-i);
        this.p.j = i;
        return i;
    }

    public void g1(int i, int i2) {
        h1(i, i2, this.v);
    }

    @Override // d49
    public int h(p49 p49Var) {
        return B0(p49Var);
    }

    public void h1(int i, int i2, boolean z) {
        if (this.y == i && this.A == i2 && this.z == z) {
            return;
        }
        this.y = i;
        this.A = i2;
        this.z = z;
        s26 s26Var = this.B;
        if (s26Var != null) {
            s26Var.a = -1;
        }
        k0();
    }

    @Override // d49
    public int i(p49 p49Var) {
        return C0(p49Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(int i) {
        ar7 ar7Var;
        if (i != 0 && i != 1) {
            w26.j(de9.k(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            if (i == 0) {
                ar7Var = new ar7(this, (byte) 0);
            } else {
                if (i != 1) {
                    w26.j("invalid orientation");
                    return;
                }
                ar7Var = new ar7(this, (byte) 1);
            }
            this.q = ar7Var;
            this.C.a = ar7Var;
            this.o = i;
            k0();
        }
    }

    @Override // d49
    public int j(p49 p49Var) {
        return A0(p49Var);
    }

    public void j1(boolean z) {
        b(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        k0();
    }

    @Override // d49
    public int k(p49 p49Var) {
        return B0(p49Var);
    }

    public void k1(boolean z) {
        b(null);
        if (this.w == z) {
            return;
        }
        this.w = z;
        k0();
    }

    @Override // d49
    public int l(p49 p49Var) {
        return C0(p49Var);
    }

    @Override // d49
    public int l0(int i, wg2 wg2Var, p49 p49Var) {
        if (this.o) {
            return 0;
        }
        return f1(i, wg2Var, p49Var);
    }

    public final void l1(int i, int i2, boolean z, p49 p49Var) {
        int j;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(p49Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        r26 r26Var = this.p;
        int i3 = z2 ? max2 : max;
        r26Var.h = i3;
        if (!z2) {
            max = max2;
        }
        r26Var.i = max;
        if (z2) {
            r26Var.h = this.q.g() + i3;
            View T0 = T0();
            r26 r26Var2 = this.p;
            r26Var2.e = this.v ? -1 : 1;
            int G = d49.G(T0);
            r26 r26Var3 = this.p;
            r26Var2.d = G + r26Var3.e;
            r26Var3.b = this.q.a(T0);
            j = this.q.a(T0) - this.q.f();
        } else {
            View U0 = U0();
            r26 r26Var4 = this.p;
            r26Var4.h = this.q.j() + r26Var4.h;
            r26 r26Var5 = this.p;
            r26Var5.e = this.v ? 1 : -1;
            int G2 = d49.G(U0);
            r26 r26Var6 = this.p;
            r26Var5.d = G2 + r26Var6.e;
            r26Var6.b = this.q.d(U0);
            j = (-this.q.d(U0)) + this.q.j();
        }
        r26 r26Var7 = this.p;
        r26Var7.c = i2;
        if (z) {
            r26Var7.c = i2 - j;
        }
        r26Var7.g = j;
    }

    @Override // d49
    public final void m0(int i) {
        this.y = i;
        this.A = TLObject.FLAG_31;
        s26 s26Var = this.B;
        if (s26Var != null) {
            s26Var.a = -1;
        }
        k0();
    }

    public final void m1(int i, int i2) {
        this.p.c = this.q.f() - i2;
        r26 r26Var = this.p;
        r26Var.e = this.v ? -1 : 1;
        r26Var.d = i;
        r26Var.f = 1;
        r26Var.b = i2;
        r26Var.g = TLObject.FLAG_31;
    }

    @Override // d49
    public int n0(int i, wg2 wg2Var, p49 p49Var) {
        if (this.o) {
            return f1(i, wg2Var, p49Var);
        }
        return 0;
    }

    public final void n1(int i, int i2) {
        this.p.c = i2 - this.q.j();
        r26 r26Var = this.p;
        r26Var.d = i;
        r26Var.e = this.v ? 1 : -1;
        r26Var.f = -1;
        r26Var.b = i2;
        r26Var.g = TLObject.FLAG_31;
    }

    @Override // d49
    public boolean x0() {
        return this.B == null && this.s == this.w;
    }

    public void y0(p49 p49Var, int[] iArr) {
        int i;
        int V0 = V0(p49Var);
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = V0;
            V0 = 0;
        }
        iArr[0] = V0;
        iArr[1] = i;
    }

    public void z0(p49 p49Var, r26 r26Var, on onVar) {
        int i = r26Var.d;
        if (i < 0 || i >= p49Var.b()) {
            return;
        }
        onVar.b(i, Math.max(0, r26Var.g));
    }

    public t26() {
        this(1, false);
    }

    public void Z0(wg2 wg2Var, p49 p49Var, p26 p26Var, int i) {
    }
}
