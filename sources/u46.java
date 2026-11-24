// default package

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class u46 extends f69 {
    public int A;
    public t46 B;
    public final q46 C;
    public final r46 D;
    public byte E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public boolean o;
    public s46 p;
    public ns2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public u46(int i, boolean z) {
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
        q46 q46Var = new q46();
        q46Var.c();
        this.C = q46Var;
        this.D = new r46();
        this.E = (byte) 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        i1(i);
        j1(z);
    }

    public final int A0(r69 r69Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        ns2 ns2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || r69Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1;
        }
        return Math.min(ns2Var.k(), ns2Var.a(I0) - ns2Var.d(J0));
    }

    public final int B0(r69 r69Var) {
        if (r() != 0) {
            F0();
            ns2 ns2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            boolean z3 = this.v;
            if (r() != 0 && r69Var.b() != 0 && J0 != null && I0 != null) {
                int max = z3 ? Math.max(0, (r69Var.b() - Math.max(((g69) J0.getLayoutParams()).b(), ((g69) I0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((g69) J0.getLayoutParams()).b(), ((g69) I0.getLayoutParams()).b()));
                if (z) {
                    return Math.round((max * (Math.abs(ns2Var.a(I0) - ns2Var.d(J0)) / (Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1))) + (ns2Var.j() - ns2Var.d(J0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int C0(r69 r69Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        ns2 ns2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || r69Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return r69Var.b();
        }
        return (int) (((ns2Var.a(I0) - ns2Var.d(J0)) / (Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1)) * r69Var.b());
    }

    public final PointF D0(int i) {
        if (r() == 0) {
            return null;
        }
        int i2 = (i < f69.G(q(0))) != this.v ? -1 : 1;
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
            s46 s46Var = new s46();
            s46Var.a = true;
            s46Var.h = 0;
            s46Var.i = 0;
            s46Var.k = null;
            this.p = s46Var;
        }
    }

    public final int G0(ki2 ki2Var, s46 s46Var, r69 r69Var, boolean z) {
        int i = s46Var.c;
        int i2 = s46Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                s46Var.g = i2 + i;
            }
            b1(ki2Var, s46Var);
        }
        int i3 = s46Var.c + s46Var.h;
        while (true) {
            if ((!s46Var.l && i3 <= 0) || !s46Var.b(r69Var)) {
                break;
            }
            r46 r46Var = this.D;
            r46Var.a = 0;
            r46Var.b = false;
            r46Var.c = false;
            r46Var.d = false;
            Y0(ki2Var, r69Var, s46Var, r46Var);
            if (!r46Var.b) {
                int i4 = s46Var.b;
                int i5 = r46Var.a;
                s46Var.b = (s46Var.f * i5) + i4;
                if (!r46Var.c || s46Var.k != null || !r69Var.g) {
                    s46Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = s46Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    s46Var.g = i7;
                    int i8 = s46Var.c;
                    if (i8 < 0) {
                        s46Var.g = i7 + i8;
                    }
                    b1(ki2Var, s46Var);
                }
                if (z && r46Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - s46Var.c;
    }

    public final int H0() {
        View O0 = O0(0, r(), true, false);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
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
        return ((g69) O0.getLayoutParams()).b();
    }

    public final int L0() {
        View O0 = O0(r() - 1, -1, true, false);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
    }

    public final int M0() {
        View O0 = O0(r() - 1, -1, false, true);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
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
        return !this.o ? this.c.h(i, i2, i3, i4) : this.d.h(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z, boolean z2) {
        F0();
        int i3 = nm7.q5;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return !this.o ? this.c.h(i, i2, i4, i3) : this.d.h(i, i2, i4, i3);
    }

    public View P0(ki2 ki2Var, r69 r69Var, int i, int i2, int i3) {
        F0();
        int j = this.r ? 0 : this.q.j();
        int f = this.q.f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = f69.G(q);
            if (G >= 0 && G < i3) {
                if (((g69) q.getLayoutParams()).a.j()) {
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

    @Override // f69
    public View Q(View view, int i, ki2 ki2Var, r69 r69Var) {
        int E0;
        e1();
        if (r() != 0 && (E0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            l1(E0, (int) (this.q.k() * 0.33333334f), false, r69Var);
            s46 s46Var = this.p;
            s46Var.g = TLObject.FLAG_31;
            s46Var.a = false;
            G0(ki2Var, s46Var, r69Var, true);
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

    public final int R0(int i, ki2 ki2Var, r69 r69Var, boolean z) {
        int f;
        int f2;
        if (!this.G || !this.H || (f = this.q.f() - i) <= 0) {
            return 0;
        }
        int i2 = -f1(-f, ki2Var, r69Var);
        int i3 = i + i2;
        if (!z || (f2 = this.q.f() - i3) <= 0) {
            return i2;
        }
        this.q.p(f2);
        return f2 + i2;
    }

    public final int S0(int i, ki2 ki2Var, r69 r69Var, boolean z) {
        int W0;
        int j;
        if (!this.G || (W0 = i - W0()) <= 0) {
            return 0;
        }
        int i2 = -f1(W0, ki2Var, r69Var);
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

    public int V0(r69 r69Var) {
        if (r69Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int W0() {
        return this.q.j();
    }

    public boolean X0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = kfc.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Y0(ki2 ki2Var, r69 r69Var, s46 s46Var, r46 r46Var) {
        int i;
        int i2;
        int i3;
        int i4;
        View c = s46Var.c(ki2Var);
        if (c == null) {
            r46Var.b = true;
            return;
        }
        g69 g69Var = (g69) c.getLayoutParams();
        List list = s46Var.k;
        boolean z = this.v;
        int i5 = s46Var.f;
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
        r46Var.a = this.q.b(c);
        if (this.o) {
            if (X0()) {
                i4 = this.m - D();
                i2 = i4 - this.q.c(c);
            } else {
                int C = C();
                i4 = this.q.c(c) + C;
                i2 = C;
            }
            int i6 = s46Var.f;
            i3 = s46Var.b;
            int i7 = r46Var.a;
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
            int i9 = s46Var.f;
            int i10 = s46Var.b;
            int i11 = r46Var.a;
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
        f69.N(c, i2, i3, i4, i);
        if (g69Var.a.j() || g69Var.a.m()) {
            r46Var.c = true;
        }
        r46Var.d = c.hasFocusable();
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
    @Override // f69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a0(ki2 ki2Var, r69 r69Var) {
        View view;
        ki2 ki2Var2;
        View view2;
        View P0;
        u46 u46Var;
        int i;
        int d;
        u46 u46Var2;
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
        u46 u46Var3 = this;
        r69 r69Var2 = r69Var;
        int i9 = -1;
        if (!(u46Var3.B == null && u46Var3.y == -1) && r69Var2.b() == 0) {
            f0(ki2Var);
            return;
        }
        t46 t46Var = u46Var3.B;
        if (t46Var != null && (i8 = t46Var.a) >= 0) {
            u46Var3.y = i8;
        }
        u46Var3.F0();
        boolean z = false;
        u46Var3.p.a = false;
        u46Var3.e1();
        RecyclerView recyclerView = u46Var3.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) u46Var3.a.d).contains(view)) {
            view = null;
        }
        q46 q46Var = u46Var3.C;
        if (q46Var.e && u46Var3.y == -1 && u46Var3.B == null) {
            if (view != null && (u46Var3.q.d(view) >= u46Var3.q.f() || u46Var3.q.a(view) <= u46Var3.q.j())) {
                q46Var.b(((g69) view.getLayoutParams()).b(), view);
            }
            ki2Var2 = ki2Var;
            u46Var2 = u46Var3;
        } else {
            q46Var.c();
            q46Var.d = u46Var3.v ^ u46Var3.w;
            if (!r69Var2.g && (i = u46Var3.y) != -1) {
                if (i < 0 || i >= r69Var2.b()) {
                    u46Var3.y = -1;
                    u46Var3.A = TLObject.FLAG_31;
                } else {
                    int i10 = u46Var3.y;
                    q46Var.b = i10;
                    t46 t46Var2 = u46Var3.B;
                    if (t46Var2 != null && t46Var2.a >= 0) {
                        boolean z2 = t46Var2.c;
                        q46Var.d = z2;
                        ns2 ns2Var = u46Var3.q;
                        if (z2) {
                            q46Var.c = ns2Var.f() - u46Var3.B.b;
                        } else {
                            q46Var.c = ns2Var.j() + u46Var3.B.b;
                        }
                    } else if (u46Var3.A == Integer.MIN_VALUE) {
                        View m2 = u46Var3.m(i10);
                        if (m2 == null) {
                            if (u46Var3.r() > 0) {
                                q46Var.d = (u46Var3.y < f69.G(u46Var3.q(0))) == u46Var3.z;
                            }
                            q46Var.a();
                        } else if (u46Var3.q.b(m2) > u46Var3.q.k()) {
                            q46Var.a();
                        } else {
                            int d3 = u46Var3.q.d(m2) - u46Var3.q.j();
                            ns2 ns2Var2 = u46Var3.q;
                            if (d3 < 0) {
                                q46Var.c = ns2Var2.j();
                                q46Var.d = false;
                            } else if (ns2Var2.f() - u46Var3.q.a(m2) < 0) {
                                q46Var.c = u46Var3.q.f();
                                q46Var.d = true;
                            } else {
                                boolean z3 = q46Var.d;
                                ns2 ns2Var3 = u46Var3.q;
                                if (z3) {
                                    int a = ns2Var3.a(m2);
                                    ns2 ns2Var4 = u46Var3.q;
                                    d = (Integer.MIN_VALUE == ns2Var4.a ? 0 : ns2Var4.k() - ns2Var4.a) + a;
                                } else {
                                    d = ns2Var3.d(m2);
                                }
                                q46Var.c = d;
                            }
                        }
                    } else {
                        boolean z4 = u46Var3.z;
                        q46Var.d = z4;
                        ns2 ns2Var5 = u46Var3.q;
                        if (z4) {
                            q46Var.c = ns2Var5.f() - u46Var3.A;
                        } else {
                            q46Var.c = ns2Var5.j() + u46Var3.A;
                        }
                    }
                    ki2Var2 = ki2Var;
                    u46Var = u46Var3;
                    q46Var.e = true;
                    u46Var2 = u46Var;
                }
            }
            if (u46Var3.r() != 0) {
                RecyclerView recyclerView2 = u46Var3.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) u46Var3.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    g69 g69Var = (g69) view2.getLayoutParams();
                    if (!g69Var.a.j() && g69Var.b() >= 0 && g69Var.b() < r69Var2.b()) {
                        q46Var.b(((g69) view2.getLayoutParams()).b(), view2);
                        ki2Var2 = ki2Var;
                        u46Var = u46Var3;
                        q46Var.e = true;
                        u46Var2 = u46Var;
                    }
                }
                if (u46Var3.s == u46Var3.w) {
                    boolean z5 = q46Var.d;
                    boolean z6 = u46Var3.v;
                    if (z5) {
                        P0 = z6 ? u46Var3.P0(ki2Var, r69Var2, 0, u46Var3.r(), r69Var2.b()) : P0(ki2Var, r69Var, r() - 1, -1, r69Var.b());
                        u46Var3 = this;
                        ki2Var2 = ki2Var;
                        r69Var2 = r69Var;
                    } else if (z6) {
                        u46 u46Var4 = this;
                        ki2Var2 = ki2Var;
                        r69Var2 = r69Var;
                        P0 = u46Var4.P0(ki2Var2, r69Var2, r() - 1, -1, r69Var.b());
                        u46Var3 = u46Var4;
                    } else {
                        u46 u46Var5 = this;
                        ki2Var2 = ki2Var;
                        r69Var2 = r69Var;
                        P0 = u46Var5.P0(ki2Var2, r69Var2, 0, r(), r69Var.b());
                        u46Var3 = u46Var5;
                    }
                    if (P0 != null) {
                        int b = ((g69) P0.getLayoutParams()).b();
                        boolean z7 = q46Var.d;
                        ns2 ns2Var6 = q46Var.a;
                        if (z7) {
                            int a2 = ns2Var6.a(P0);
                            ns2 ns2Var7 = q46Var.a;
                            q46Var.c = (Integer.MIN_VALUE == ns2Var7.a ? 0 : ns2Var7.k() - ns2Var7.a) + a2;
                        } else {
                            q46Var.c = ns2Var6.d(P0);
                        }
                        q46Var.b = b;
                        u46Var = u46Var3;
                        if (!r69Var2.g) {
                            boolean x0 = u46Var3.x0();
                            u46Var = u46Var3;
                            if (x0) {
                                if (u46Var3.q.d(P0) < u46Var3.q.f()) {
                                    int a3 = u46Var3.q.a(P0);
                                    int j = u46Var3.q.j();
                                    u46Var = u46Var3;
                                }
                                boolean z8 = q46Var.d;
                                ns2 ns2Var8 = u46Var3.q;
                                q46Var.c = z8 ? ns2Var8.f() : ns2Var8.j();
                                u46Var = u46Var3;
                            }
                        }
                        q46Var.e = true;
                        u46Var2 = u46Var;
                    }
                    q46Var.a();
                    q46Var.b = !u46Var3.w ? r69Var2.b() - 1 : u46Var3.Q0();
                    u46Var = u46Var3;
                    q46Var.e = true;
                    u46Var2 = u46Var;
                }
            }
            ki2Var2 = ki2Var;
            q46Var.a();
            q46Var.b = !u46Var3.w ? r69Var2.b() - 1 : u46Var3.Q0();
            u46Var = u46Var3;
            q46Var.e = true;
            u46Var2 = u46Var;
        }
        s46 s46Var = u46Var2.p;
        s46Var.f = s46Var.j >= 0 ? 1 : -1;
        int[] iArr = u46Var2.F;
        iArr[0] = 0;
        iArr[1] = 0;
        u46Var2.y0(r69Var2, iArr);
        int j2 = u46Var2.q.j() + Math.max(0, iArr[0]);
        int g = u46Var2.q.g() + Math.max(0, iArr[1]);
        if (r69Var2.g && (i6 = u46Var2.y) != -1 && u46Var2.A != Integer.MIN_VALUE && (m = u46Var2.m(i6)) != null) {
            boolean z9 = u46Var2.z;
            ns2 ns2Var9 = u46Var2.q;
            if (z9) {
                i7 = ns2Var9.f() - u46Var2.q.a(m);
                d2 = u46Var2.A;
            } else {
                d2 = ns2Var9.d(m) - u46Var2.q.j();
                i7 = u46Var2.A;
            }
            int i11 = i7 - d2;
            if (i11 > 0) {
                j2 += i11;
            } else {
                g -= i11;
            }
        }
        boolean z10 = q46Var.d;
        boolean z11 = u46Var2.v;
        if (!z10 ? !z11 : z11) {
            i9 = 1;
        }
        u46Var2.Z0(ki2Var2, r69Var2, q46Var, i9);
        for (int r = u46Var2.r() - 1; r >= 0; r--) {
            View q = u46Var2.q(r);
            u69 U = RecyclerView.U(q);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || u46Var2.b.x.b) {
                    u46Var2.q(r);
                    u46Var2.a.z(r);
                    ki2Var2.j(q);
                    u46Var2.b.f.n(U);
                } else {
                    u46Var2.i0(r);
                    ki2Var2.i(U);
                }
            }
        }
        u46Var2.p.l = u46Var2.q.h() == 0 && u46Var2.q.e() == 0;
        u46Var2.p.getClass();
        u46Var2.p.i = 0;
        boolean z12 = q46Var.d;
        int i12 = q46Var.b;
        if (z12) {
            u46Var2.n1(i12, q46Var.c);
            s46 s46Var2 = u46Var2.p;
            s46Var2.h = j2;
            u46Var2.G0(ki2Var2, s46Var2, r69Var2, false);
            s46 s46Var3 = u46Var2.p;
            i3 = s46Var3.b;
            int i13 = s46Var3.d;
            int i14 = s46Var3.c;
            if (i14 > 0) {
                g += i14;
            }
            u46Var2.m1(q46Var.b, q46Var.c);
            s46 s46Var4 = u46Var2.p;
            s46Var4.h = g;
            s46Var4.d += s46Var4.e;
            u46Var2.G0(ki2Var2, s46Var4, r69Var2, false);
            s46 s46Var5 = u46Var2.p;
            i2 = s46Var5.b;
            int i15 = s46Var5.c;
            if (i15 > 0) {
                u46Var2.n1(i13, i3);
                s46 s46Var6 = u46Var2.p;
                s46Var6.h = i15;
                u46Var2.G0(ki2Var2, s46Var6, r69Var2, false);
                i3 = u46Var2.p.b;
            }
        } else {
            u46Var2.m1(i12, q46Var.c);
            s46 s46Var7 = u46Var2.p;
            s46Var7.h = g;
            u46Var2.G0(ki2Var2, s46Var7, r69Var2, false);
            s46 s46Var8 = u46Var2.p;
            i2 = s46Var8.b;
            int i16 = s46Var8.d;
            int i17 = s46Var8.c;
            if (i17 > 0) {
                j2 += i17;
            }
            u46Var2.n1(q46Var.b, q46Var.c);
            s46 s46Var9 = u46Var2.p;
            s46Var9.h = j2;
            s46Var9.d += s46Var9.e;
            u46Var2.G0(ki2Var2, s46Var9, r69Var2, false);
            s46 s46Var10 = u46Var2.p;
            i3 = s46Var10.b;
            int i18 = s46Var10.c;
            if (i18 > 0) {
                u46Var2.m1(i16, i2);
                s46 s46Var11 = u46Var2.p;
                s46Var11.h = i18;
                u46Var2.G0(ki2Var2, s46Var11, r69Var2, false);
                i2 = u46Var2.p.b;
            }
        }
        if (u46Var2.r() > 0) {
            if (u46Var2.v ^ u46Var2.w) {
                int R02 = u46Var2.R0(i2, ki2Var2, r69Var2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                R0 = u46Var2.S0(i4, ki2Var2, r69Var2, false);
            } else {
                int S0 = u46Var2.S0(i3, ki2Var2, r69Var2, true);
                i4 = i3 + S0;
                i5 = i2 + S0;
                R0 = u46Var2.R0(i5, ki2Var2, r69Var2, false);
            }
            i3 = i4 + R0;
            i2 = i5 + R0;
        }
        if (r69Var2.k && u46Var2.r() != 0 && !r69Var2.g && u46Var2.x0()) {
            List list2 = (List) ki2Var2.f;
            int size = list2.size();
            int G = f69.G(u46Var2.q(0));
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < size) {
                u69 u69Var = (u69) list2.get(i19);
                boolean j3 = u69Var.j();
                View view3 = u69Var.a;
                if (!j3) {
                    boolean z13 = u69Var.c() < G ? true : z;
                    boolean z14 = u46Var2.v;
                    ns2 ns2Var10 = u46Var2.q;
                    if (z13 != z14) {
                        i20 += ns2Var10.b(view3);
                    } else {
                        i21 += ns2Var10.b(view3);
                    }
                }
                i19++;
                z = false;
            }
            u46Var2.p.k = list2;
            if (i20 > 0) {
                u46Var2.n1(f69.G(u46Var2.U0()), i3);
                s46 s46Var12 = u46Var2.p;
                s46Var12.h = i20;
                r5 = 0;
                s46Var12.c = 0;
                s46Var12.a(null);
                u46Var2.G0(ki2Var2, u46Var2.p, r69Var2, false);
            } else {
                r5 = 0;
            }
            if (i21 > 0) {
                u46Var2.m1(f69.G(u46Var2.T0()), i2);
                s46 s46Var13 = u46Var2.p;
                s46Var13.h = i21;
                s46Var13.c = r5;
                list = null;
                s46Var13.a(null);
                u46Var2.G0(ki2Var2, u46Var2.p, r69Var2, r5);
            } else {
                list = null;
            }
            u46Var2.p.k = list;
        }
        if (r69Var2.g) {
            q46Var.c();
        } else {
            ns2 ns2Var11 = u46Var2.q;
            ns2Var11.a = ns2Var11.k();
        }
        u46Var2.s = u46Var2.w;
    }

    public void a1(View view, View view2, int i, int i2) {
        b("Cannot drop a view during a scroll or layout calculation");
        F0();
        e1();
        int G = f69.G(view);
        int G2 = f69.G(view2);
        char c = G < G2 ? (char) 1 : (char) 65535;
        boolean z = this.v;
        ns2 ns2Var = this.q;
        if (z) {
            if (c == 1) {
                g1(G2, ns2Var.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                g1(G2, ns2Var.f() - this.q.a(view2));
                return;
            }
        }
        if (c == 65535) {
            g1(G2, ns2Var.d(view2));
        } else {
            g1(G2, ns2Var.a(view2) - this.q.b(view));
        }
    }

    @Override // f69
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override // f69
    public void b0(r69 r69Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.c();
    }

    public final void b1(ki2 ki2Var, s46 s46Var) {
        u69 T;
        u69 T2;
        if (!s46Var.a || s46Var.l) {
            return;
        }
        int i = s46Var.g;
        int i2 = s46Var.i;
        if (s46Var.f != -1) {
            d1(ki2Var, i, i2);
            return;
        }
        int r = r();
        if (i >= 0) {
            int e = (this.q.e() - i) + i2;
            if (this.v) {
                for (int i3 = 0; i3 < r; i3++) {
                    View q = q(i3);
                    if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.d(q) < e || this.q.m(q) < e)) {
                        c1(ki2Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = r - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View q2 = q(i5);
                if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.d(q2) < e || this.q.m(q2) < e)) {
                    c1(ki2Var, i4, i5);
                    return;
                }
            }
        }
    }

    public final void c1(ki2 ki2Var, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    h0(i, ki2Var);
                    i--;
                }
            } else {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    h0(i3, ki2Var);
                }
            }
        }
    }

    @Override // f69
    public final boolean d() {
        return (this.u || this.o) ? false : true;
    }

    @Override // f69
    public final t46 d0() {
        t46 t46Var = this.B;
        if (t46Var != null) {
            t46 t46Var2 = new t46();
            t46Var2.a = t46Var.a;
            t46Var2.b = t46Var.b;
            t46Var2.c = t46Var.c;
            return t46Var2;
        }
        t46 t46Var3 = new t46();
        if (r() <= 0) {
            t46Var3.a = -1;
            return t46Var3;
        }
        F0();
        boolean z = this.s ^ this.v;
        t46Var3.c = z;
        if (z) {
            View T0 = T0();
            t46Var3.b = this.q.f() - this.q.a(T0);
            t46Var3.a = ((g69) T0.getLayoutParams()).b();
            return t46Var3;
        }
        View U0 = U0();
        t46Var3.a = f69.G(U0);
        t46Var3.b = this.q.d(U0) - this.q.j();
        return t46Var3;
    }

    public void d1(ki2 ki2Var, int i, int i2) {
        u69 T;
        u69 T2;
        if (i >= 0) {
            int i3 = i - i2;
            int r = r();
            if (!this.v) {
                for (int i4 = 0; i4 < r; i4++) {
                    View q = q(i4);
                    if (q != null && (T = this.b.T(q)) != null && !T.r() && (this.q.a(q) > i3 || this.q.l(q) > i3)) {
                        c1(ki2Var, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = r - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View q2 = q(i6);
                if (q2 != null && (T2 = this.b.T(q2)) != null && !T2.r() && (this.q.a(q2) > i3 || this.q.l(q2) > i3)) {
                    c1(ki2Var, i5, i6);
                    return;
                }
            }
        }
    }

    @Override // f69
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

    public final int f1(int i, ki2 ki2Var, r69 r69Var) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        F0();
        this.p.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i2, abs, true, r69Var);
        s46 s46Var = this.p;
        int G0 = G0(ki2Var, s46Var, r69Var, false) + s46Var.g;
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

    @Override // f69
    public int h(r69 r69Var) {
        return B0(r69Var);
    }

    public void h1(int i, int i2, boolean z) {
        if (this.y == i && this.A == i2 && this.z == z) {
            return;
        }
        this.y = i;
        this.A = i2;
        this.z = z;
        t46 t46Var = this.B;
        if (t46Var != null) {
            t46Var.a = -1;
        }
        k0();
    }

    @Override // f69
    public int i(r69 r69Var) {
        return C0(r69Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(int i) {
        ct7 ct7Var;
        if (i != 0 && i != 1) {
            u36.j(hg9.j(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            if (i == 0) {
                ct7Var = new ct7(this, (byte) 0);
            } else {
                if (i != 1) {
                    u36.j("invalid orientation");
                    return;
                }
                ct7Var = new ct7(this, (byte) 1);
            }
            this.q = ct7Var;
            this.C.a = ct7Var;
            this.o = i;
            k0();
        }
    }

    @Override // f69
    public int j(r69 r69Var) {
        return A0(r69Var);
    }

    public void j1(boolean z) {
        b(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        k0();
    }

    @Override // f69
    public int k(r69 r69Var) {
        return B0(r69Var);
    }

    public void k1(boolean z) {
        b(null);
        if (this.w == z) {
            return;
        }
        this.w = z;
        k0();
    }

    @Override // f69
    public int l(r69 r69Var) {
        return C0(r69Var);
    }

    @Override // f69
    public int l0(int i, ki2 ki2Var, r69 r69Var) {
        if (this.o) {
            return 0;
        }
        return f1(i, ki2Var, r69Var);
    }

    public final void l1(int i, int i2, boolean z, r69 r69Var) {
        int j;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(r69Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        s46 s46Var = this.p;
        int i3 = z2 ? max2 : max;
        s46Var.h = i3;
        if (!z2) {
            max = max2;
        }
        s46Var.i = max;
        if (z2) {
            s46Var.h = this.q.g() + i3;
            View T0 = T0();
            s46 s46Var2 = this.p;
            s46Var2.e = this.v ? -1 : 1;
            int G = f69.G(T0);
            s46 s46Var3 = this.p;
            s46Var2.d = G + s46Var3.e;
            s46Var3.b = this.q.a(T0);
            j = this.q.a(T0) - this.q.f();
        } else {
            View U0 = U0();
            s46 s46Var4 = this.p;
            s46Var4.h = this.q.j() + s46Var4.h;
            s46 s46Var5 = this.p;
            s46Var5.e = this.v ? 1 : -1;
            int G2 = f69.G(U0);
            s46 s46Var6 = this.p;
            s46Var5.d = G2 + s46Var6.e;
            s46Var6.b = this.q.d(U0);
            j = (-this.q.d(U0)) + this.q.j();
        }
        s46 s46Var7 = this.p;
        s46Var7.c = i2;
        if (z) {
            s46Var7.c = i2 - j;
        }
        s46Var7.g = j;
    }

    @Override // f69
    public final void m0(int i) {
        this.y = i;
        this.A = TLObject.FLAG_31;
        t46 t46Var = this.B;
        if (t46Var != null) {
            t46Var.a = -1;
        }
        k0();
    }

    public final void m1(int i, int i2) {
        this.p.c = this.q.f() - i2;
        s46 s46Var = this.p;
        s46Var.e = this.v ? -1 : 1;
        s46Var.d = i;
        s46Var.f = 1;
        s46Var.b = i2;
        s46Var.g = TLObject.FLAG_31;
    }

    @Override // f69
    public int n0(int i, ki2 ki2Var, r69 r69Var) {
        if (this.o) {
            return f1(i, ki2Var, r69Var);
        }
        return 0;
    }

    public final void n1(int i, int i2) {
        this.p.c = i2 - this.q.j();
        s46 s46Var = this.p;
        s46Var.d = i;
        s46Var.e = this.v ? 1 : -1;
        s46Var.f = -1;
        s46Var.b = i2;
        s46Var.g = TLObject.FLAG_31;
    }

    @Override // f69
    public boolean x0() {
        return this.B == null && this.s == this.w;
    }

    public void y0(r69 r69Var, int[] iArr) {
        int i;
        int V0 = V0(r69Var);
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = V0;
            V0 = 0;
        }
        iArr[0] = V0;
        iArr[1] = i;
    }

    public void z0(r69 r69Var, s46 s46Var, po poVar) {
        int i = s46Var.d;
        if (i < 0 || i >= r69Var.b()) {
            return;
        }
        poVar.b(i, Math.max(0, s46Var.g));
    }

    public u46() {
        this(1, false);
    }

    public void Z0(ki2 ki2Var, r69 r69Var, q46 q46Var, int i) {
    }
}
