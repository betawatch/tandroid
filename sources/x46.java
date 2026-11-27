// default package

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class x46 extends q79 {
    public int A;
    public w46 B;
    public final t46 C;
    public final u46 D;
    public byte E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public boolean o;
    public v46 p;
    public vr2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public x46(int i, boolean z) {
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
        t46 t46Var = new t46();
        t46Var.c();
        this.C = t46Var;
        this.D = new u46();
        this.E = (byte) 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        i1(i);
        j1(z);
    }

    public final int A0(c89 c89Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        vr2 vr2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || c89Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((r79) J0.getLayoutParams()).b() - ((r79) I0.getLayoutParams()).b()) + 1;
        }
        return Math.min(vr2Var.k(), vr2Var.a(I0) - vr2Var.d(J0));
    }

    public final int B0(c89 c89Var) {
        if (r() != 0) {
            F0();
            vr2 vr2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            boolean z3 = this.v;
            if (r() != 0 && c89Var.b() != 0 && J0 != null && I0 != null) {
                int max = z3 ? Math.max(0, (c89Var.b() - Math.max(((r79) J0.getLayoutParams()).b(), ((r79) I0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((r79) J0.getLayoutParams()).b(), ((r79) I0.getLayoutParams()).b()));
                if (z) {
                    return Math.round((max * (Math.abs(vr2Var.a(I0) - vr2Var.d(J0)) / (Math.abs(((r79) J0.getLayoutParams()).b() - ((r79) I0.getLayoutParams()).b()) + 1))) + (vr2Var.j() - vr2Var.d(J0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int C0(c89 c89Var) {
        if (r() == 0) {
            return 0;
        }
        F0();
        vr2 vr2Var = this.q;
        boolean z = this.x;
        boolean z2 = !z;
        View J0 = J0(z2);
        View I0 = I0(z2);
        if (r() == 0 || c89Var.b() == 0 || J0 == null || I0 == null) {
            return 0;
        }
        if (!z) {
            return c89Var.b();
        }
        return (int) (((vr2Var.a(I0) - vr2Var.d(J0)) / (Math.abs(((r79) J0.getLayoutParams()).b() - ((r79) I0.getLayoutParams()).b()) + 1)) * c89Var.b());
    }

    public final PointF D0(int i) {
        if (r() == 0) {
            return null;
        }
        int i2 = (i < q79.G(q(0))) != this.v ? -1 : 1;
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
            v46 v46Var = new v46();
            v46Var.a = true;
            v46Var.h = 0;
            v46Var.i = 0;
            v46Var.k = null;
            this.p = v46Var;
        }
    }

    public final int G0(oh2 oh2Var, v46 v46Var, c89 c89Var, boolean z) {
        int i = v46Var.c;
        int i2 = v46Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                v46Var.g = i2 + i;
            }
            b1(oh2Var, v46Var);
        }
        int i3 = v46Var.c + v46Var.h;
        while (true) {
            if ((!v46Var.l && i3 <= 0) || !v46Var.b(c89Var)) {
                break;
            }
            u46 u46Var = this.D;
            u46Var.a = 0;
            u46Var.b = false;
            u46Var.c = false;
            u46Var.d = false;
            Y0(oh2Var, c89Var, v46Var, u46Var);
            if (!u46Var.b) {
                int i4 = v46Var.b;
                int i5 = u46Var.a;
                v46Var.b = (v46Var.f * i5) + i4;
                if (!u46Var.c || v46Var.k != null || !c89Var.g) {
                    v46Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = v46Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    v46Var.g = i7;
                    int i8 = v46Var.c;
                    if (i8 < 0) {
                        v46Var.g = i7 + i8;
                    }
                    b1(oh2Var, v46Var);
                }
                if (z && u46Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - v46Var.c;
    }

    public final int H0() {
        View O0 = O0(0, r(), true, false);
        if (O0 == null) {
            return -1;
        }
        return ((r79) O0.getLayoutParams()).b();
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
        return ((r79) O0.getLayoutParams()).b();
    }

    public final int L0() {
        View O0 = O0(r() - 1, -1, true, false);
        if (O0 == null) {
            return -1;
        }
        return ((r79) O0.getLayoutParams()).b();
    }

    public final int M0() {
        View O0 = O0(r() - 1, -1, false, true);
        if (O0 == null) {
            return -1;
        }
        return ((r79) O0.getLayoutParams()).b();
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
        return !this.o ? this.c.x(i, i2, i3, i4) : this.d.x(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z, boolean z2) {
        F0();
        int i3 = jn7.q5;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return !this.o ? this.c.x(i, i2, i4, i3) : this.d.x(i, i2, i4, i3);
    }

    public View P0(oh2 oh2Var, c89 c89Var, int i, int i2, int i3) {
        F0();
        int j = this.r ? 0 : this.q.j();
        int f = this.q.f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = q79.G(q);
            if (G >= 0 && G < i3) {
                if (((r79) q.getLayoutParams()).a.j()) {
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

    @Override // q79
    public View Q(View view, int i, oh2 oh2Var, c89 c89Var) {
        int E0;
        e1();
        if (r() != 0 && (E0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            l1(E0, (int) (this.q.k() * 0.33333334f), false, c89Var);
            v46 v46Var = this.p;
            v46Var.g = TLObject.FLAG_31;
            v46Var.a = false;
            G0(oh2Var, v46Var, c89Var, true);
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

    public final int R0(int i, oh2 oh2Var, c89 c89Var, boolean z) {
        int f;
        int f2;
        if (!this.G || !this.H || (f = this.q.f() - i) <= 0) {
            return 0;
        }
        int i2 = -f1(-f, oh2Var, c89Var);
        int i3 = i + i2;
        if (!z || (f2 = this.q.f() - i3) <= 0) {
            return i2;
        }
        this.q.p(f2);
        return f2 + i2;
    }

    public final int S0(int i, oh2 oh2Var, c89 c89Var, boolean z) {
        int W0;
        int j;
        if (!this.G || (W0 = i - W0()) <= 0) {
            return 0;
        }
        int i2 = -f1(W0, oh2Var, c89Var);
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

    public int V0(c89 c89Var) {
        if (c89Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int W0() {
        return this.q.j();
    }

    public boolean X0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ihc.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Y0(oh2 oh2Var, c89 c89Var, v46 v46Var, u46 u46Var) {
        int i;
        int i2;
        int i3;
        int i4;
        View c = v46Var.c(oh2Var);
        if (c == null) {
            u46Var.b = true;
            return;
        }
        r79 r79Var = (r79) c.getLayoutParams();
        List list = v46Var.k;
        boolean z = this.v;
        int i5 = v46Var.f;
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
        u46Var.a = this.q.b(c);
        if (this.o) {
            if (X0()) {
                i4 = this.m - D();
                i2 = i4 - this.q.c(c);
            } else {
                int C = C();
                i4 = this.q.c(c) + C;
                i2 = C;
            }
            int i6 = v46Var.f;
            i3 = v46Var.b;
            int i7 = u46Var.a;
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
            int i9 = v46Var.f;
            int i10 = v46Var.b;
            int i11 = u46Var.a;
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
        q79.N(c, i2, i3, i4, i);
        if (r79Var.a.j() || r79Var.a.m()) {
            u46Var.c = true;
        }
        u46Var.d = c.hasFocusable();
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
    @Override // q79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a0(oh2 oh2Var, c89 c89Var) {
        View view;
        oh2 oh2Var2;
        View view2;
        View P0;
        x46 x46Var;
        int i;
        int d;
        x46 x46Var2;
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
        x46 x46Var3 = this;
        c89 c89Var2 = c89Var;
        int i9 = -1;
        if (!(x46Var3.B == null && x46Var3.y == -1) && c89Var2.b() == 0) {
            f0(oh2Var);
            return;
        }
        w46 w46Var = x46Var3.B;
        if (w46Var != null && (i8 = w46Var.a) >= 0) {
            x46Var3.y = i8;
        }
        x46Var3.F0();
        boolean z = false;
        x46Var3.p.a = false;
        x46Var3.e1();
        RecyclerView recyclerView = x46Var3.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) x46Var3.a.d).contains(view)) {
            view = null;
        }
        t46 t46Var = x46Var3.C;
        if (t46Var.e && x46Var3.y == -1 && x46Var3.B == null) {
            if (view != null && (x46Var3.q.d(view) >= x46Var3.q.f() || x46Var3.q.a(view) <= x46Var3.q.j())) {
                t46Var.b(((r79) view.getLayoutParams()).b(), view);
            }
            oh2Var2 = oh2Var;
            x46Var2 = x46Var3;
        } else {
            t46Var.c();
            t46Var.d = x46Var3.v ^ x46Var3.w;
            if (!c89Var2.g && (i = x46Var3.y) != -1) {
                if (i < 0 || i >= c89Var2.b()) {
                    x46Var3.y = -1;
                    x46Var3.A = TLObject.FLAG_31;
                } else {
                    int i10 = x46Var3.y;
                    t46Var.b = i10;
                    w46 w46Var2 = x46Var3.B;
                    if (w46Var2 != null && w46Var2.a >= 0) {
                        boolean z2 = w46Var2.c;
                        t46Var.d = z2;
                        vr2 vr2Var = x46Var3.q;
                        if (z2) {
                            t46Var.c = vr2Var.f() - x46Var3.B.b;
                        } else {
                            t46Var.c = vr2Var.j() + x46Var3.B.b;
                        }
                    } else if (x46Var3.A == Integer.MIN_VALUE) {
                        View m2 = x46Var3.m(i10);
                        if (m2 == null) {
                            if (x46Var3.r() > 0) {
                                t46Var.d = (x46Var3.y < q79.G(x46Var3.q(0))) == x46Var3.z;
                            }
                            t46Var.a();
                        } else if (x46Var3.q.b(m2) > x46Var3.q.k()) {
                            t46Var.a();
                        } else {
                            int d3 = x46Var3.q.d(m2) - x46Var3.q.j();
                            vr2 vr2Var2 = x46Var3.q;
                            if (d3 < 0) {
                                t46Var.c = vr2Var2.j();
                                t46Var.d = false;
                            } else if (vr2Var2.f() - x46Var3.q.a(m2) < 0) {
                                t46Var.c = x46Var3.q.f();
                                t46Var.d = true;
                            } else {
                                boolean z3 = t46Var.d;
                                vr2 vr2Var3 = x46Var3.q;
                                if (z3) {
                                    int a = vr2Var3.a(m2);
                                    vr2 vr2Var4 = x46Var3.q;
                                    d = (Integer.MIN_VALUE == vr2Var4.a ? 0 : vr2Var4.k() - vr2Var4.a) + a;
                                } else {
                                    d = vr2Var3.d(m2);
                                }
                                t46Var.c = d;
                            }
                        }
                    } else {
                        boolean z4 = x46Var3.z;
                        t46Var.d = z4;
                        vr2 vr2Var5 = x46Var3.q;
                        if (z4) {
                            t46Var.c = vr2Var5.f() - x46Var3.A;
                        } else {
                            t46Var.c = vr2Var5.j() + x46Var3.A;
                        }
                    }
                    oh2Var2 = oh2Var;
                    x46Var = x46Var3;
                    t46Var.e = true;
                    x46Var2 = x46Var;
                }
            }
            if (x46Var3.r() != 0) {
                RecyclerView recyclerView2 = x46Var3.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) x46Var3.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    r79 r79Var = (r79) view2.getLayoutParams();
                    if (!r79Var.a.j() && r79Var.b() >= 0 && r79Var.b() < c89Var2.b()) {
                        t46Var.b(((r79) view2.getLayoutParams()).b(), view2);
                        oh2Var2 = oh2Var;
                        x46Var = x46Var3;
                        t46Var.e = true;
                        x46Var2 = x46Var;
                    }
                }
                if (x46Var3.s == x46Var3.w) {
                    boolean z5 = t46Var.d;
                    boolean z6 = x46Var3.v;
                    if (z5) {
                        P0 = z6 ? x46Var3.P0(oh2Var, c89Var2, 0, x46Var3.r(), c89Var2.b()) : P0(oh2Var, c89Var, r() - 1, -1, c89Var.b());
                        x46Var3 = this;
                        oh2Var2 = oh2Var;
                        c89Var2 = c89Var;
                    } else if (z6) {
                        x46 x46Var4 = this;
                        oh2Var2 = oh2Var;
                        c89Var2 = c89Var;
                        P0 = x46Var4.P0(oh2Var2, c89Var2, r() - 1, -1, c89Var.b());
                        x46Var3 = x46Var4;
                    } else {
                        x46 x46Var5 = this;
                        oh2Var2 = oh2Var;
                        c89Var2 = c89Var;
                        P0 = x46Var5.P0(oh2Var2, c89Var2, 0, r(), c89Var.b());
                        x46Var3 = x46Var5;
                    }
                    if (P0 != null) {
                        int b = ((r79) P0.getLayoutParams()).b();
                        boolean z7 = t46Var.d;
                        vr2 vr2Var6 = t46Var.a;
                        if (z7) {
                            int a2 = vr2Var6.a(P0);
                            vr2 vr2Var7 = t46Var.a;
                            t46Var.c = (Integer.MIN_VALUE == vr2Var7.a ? 0 : vr2Var7.k() - vr2Var7.a) + a2;
                        } else {
                            t46Var.c = vr2Var6.d(P0);
                        }
                        t46Var.b = b;
                        x46Var = x46Var3;
                        if (!c89Var2.g) {
                            boolean x0 = x46Var3.x0();
                            x46Var = x46Var3;
                            if (x0) {
                                if (x46Var3.q.d(P0) < x46Var3.q.f()) {
                                    int a3 = x46Var3.q.a(P0);
                                    int j = x46Var3.q.j();
                                    x46Var = x46Var3;
                                }
                                boolean z8 = t46Var.d;
                                vr2 vr2Var8 = x46Var3.q;
                                t46Var.c = z8 ? vr2Var8.f() : vr2Var8.j();
                                x46Var = x46Var3;
                            }
                        }
                        t46Var.e = true;
                        x46Var2 = x46Var;
                    }
                    t46Var.a();
                    t46Var.b = !x46Var3.w ? c89Var2.b() - 1 : x46Var3.Q0();
                    x46Var = x46Var3;
                    t46Var.e = true;
                    x46Var2 = x46Var;
                }
            }
            oh2Var2 = oh2Var;
            t46Var.a();
            t46Var.b = !x46Var3.w ? c89Var2.b() - 1 : x46Var3.Q0();
            x46Var = x46Var3;
            t46Var.e = true;
            x46Var2 = x46Var;
        }
        v46 v46Var = x46Var2.p;
        v46Var.f = v46Var.j >= 0 ? 1 : -1;
        int[] iArr = x46Var2.F;
        iArr[0] = 0;
        iArr[1] = 0;
        x46Var2.y0(c89Var2, iArr);
        int j2 = x46Var2.q.j() + Math.max(0, iArr[0]);
        int g = x46Var2.q.g() + Math.max(0, iArr[1]);
        if (c89Var2.g && (i6 = x46Var2.y) != -1 && x46Var2.A != Integer.MIN_VALUE && (m = x46Var2.m(i6)) != null) {
            boolean z9 = x46Var2.z;
            vr2 vr2Var9 = x46Var2.q;
            if (z9) {
                i7 = vr2Var9.f() - x46Var2.q.a(m);
                d2 = x46Var2.A;
            } else {
                d2 = vr2Var9.d(m) - x46Var2.q.j();
                i7 = x46Var2.A;
            }
            int i11 = i7 - d2;
            if (i11 > 0) {
                j2 += i11;
            } else {
                g -= i11;
            }
        }
        boolean z10 = t46Var.d;
        boolean z11 = x46Var2.v;
        if (!z10 ? !z11 : z11) {
            i9 = 1;
        }
        x46Var2.Z0(oh2Var2, c89Var2, t46Var, i9);
        for (int r = x46Var2.r() - 1; r >= 0; r--) {
            View q = x46Var2.q(r);
            f89 V = RecyclerView.V(q);
            if (V != null && !V.r()) {
                if (!V.h() || V.j() || x46Var2.b.x.b) {
                    x46Var2.q(r);
                    x46Var2.a.z(r);
                    oh2Var2.j(q);
                    x46Var2.b.f.q(V);
                } else {
                    x46Var2.i0(r);
                    oh2Var2.i(V);
                }
            }
        }
        x46Var2.p.l = x46Var2.q.h() == 0 && x46Var2.q.e() == 0;
        x46Var2.p.getClass();
        x46Var2.p.i = 0;
        boolean z12 = t46Var.d;
        int i12 = t46Var.b;
        if (z12) {
            x46Var2.n1(i12, t46Var.c);
            v46 v46Var2 = x46Var2.p;
            v46Var2.h = j2;
            x46Var2.G0(oh2Var2, v46Var2, c89Var2, false);
            v46 v46Var3 = x46Var2.p;
            i3 = v46Var3.b;
            int i13 = v46Var3.d;
            int i14 = v46Var3.c;
            if (i14 > 0) {
                g += i14;
            }
            x46Var2.m1(t46Var.b, t46Var.c);
            v46 v46Var4 = x46Var2.p;
            v46Var4.h = g;
            v46Var4.d += v46Var4.e;
            x46Var2.G0(oh2Var2, v46Var4, c89Var2, false);
            v46 v46Var5 = x46Var2.p;
            i2 = v46Var5.b;
            int i15 = v46Var5.c;
            if (i15 > 0) {
                x46Var2.n1(i13, i3);
                v46 v46Var6 = x46Var2.p;
                v46Var6.h = i15;
                x46Var2.G0(oh2Var2, v46Var6, c89Var2, false);
                i3 = x46Var2.p.b;
            }
        } else {
            x46Var2.m1(i12, t46Var.c);
            v46 v46Var7 = x46Var2.p;
            v46Var7.h = g;
            x46Var2.G0(oh2Var2, v46Var7, c89Var2, false);
            v46 v46Var8 = x46Var2.p;
            i2 = v46Var8.b;
            int i16 = v46Var8.d;
            int i17 = v46Var8.c;
            if (i17 > 0) {
                j2 += i17;
            }
            x46Var2.n1(t46Var.b, t46Var.c);
            v46 v46Var9 = x46Var2.p;
            v46Var9.h = j2;
            v46Var9.d += v46Var9.e;
            x46Var2.G0(oh2Var2, v46Var9, c89Var2, false);
            v46 v46Var10 = x46Var2.p;
            i3 = v46Var10.b;
            int i18 = v46Var10.c;
            if (i18 > 0) {
                x46Var2.m1(i16, i2);
                v46 v46Var11 = x46Var2.p;
                v46Var11.h = i18;
                x46Var2.G0(oh2Var2, v46Var11, c89Var2, false);
                i2 = x46Var2.p.b;
            }
        }
        if (x46Var2.r() > 0) {
            if (x46Var2.v ^ x46Var2.w) {
                int R02 = x46Var2.R0(i2, oh2Var2, c89Var2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                R0 = x46Var2.S0(i4, oh2Var2, c89Var2, false);
            } else {
                int S0 = x46Var2.S0(i3, oh2Var2, c89Var2, true);
                i4 = i3 + S0;
                i5 = i2 + S0;
                R0 = x46Var2.R0(i5, oh2Var2, c89Var2, false);
            }
            i3 = i4 + R0;
            i2 = i5 + R0;
        }
        if (c89Var2.k && x46Var2.r() != 0 && !c89Var2.g && x46Var2.x0()) {
            List list2 = (List) oh2Var2.f;
            int size = list2.size();
            int G = q79.G(x46Var2.q(0));
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < size) {
                f89 f89Var = (f89) list2.get(i19);
                boolean j3 = f89Var.j();
                View view3 = f89Var.a;
                if (!j3) {
                    boolean z13 = f89Var.c() < G ? true : z;
                    boolean z14 = x46Var2.v;
                    vr2 vr2Var10 = x46Var2.q;
                    if (z13 != z14) {
                        i20 += vr2Var10.b(view3);
                    } else {
                        i21 += vr2Var10.b(view3);
                    }
                }
                i19++;
                z = false;
            }
            x46Var2.p.k = list2;
            if (i20 > 0) {
                x46Var2.n1(q79.G(x46Var2.U0()), i3);
                v46 v46Var12 = x46Var2.p;
                v46Var12.h = i20;
                r5 = 0;
                v46Var12.c = 0;
                v46Var12.a(null);
                x46Var2.G0(oh2Var2, x46Var2.p, c89Var2, false);
            } else {
                r5 = 0;
            }
            if (i21 > 0) {
                x46Var2.m1(q79.G(x46Var2.T0()), i2);
                v46 v46Var13 = x46Var2.p;
                v46Var13.h = i21;
                v46Var13.c = r5;
                list = null;
                v46Var13.a(null);
                x46Var2.G0(oh2Var2, x46Var2.p, c89Var2, r5);
            } else {
                list = null;
            }
            x46Var2.p.k = list;
        }
        if (c89Var2.g) {
            t46Var.c();
        } else {
            vr2 vr2Var11 = x46Var2.q;
            vr2Var11.a = vr2Var11.k();
        }
        x46Var2.s = x46Var2.w;
    }

    public void a1(View view, View view2, int i, int i2) {
        b("Cannot drop a view during a scroll or layout calculation");
        F0();
        e1();
        int G = q79.G(view);
        int G2 = q79.G(view2);
        char c = G < G2 ? (char) 1 : (char) 65535;
        boolean z = this.v;
        vr2 vr2Var = this.q;
        if (z) {
            if (c == 1) {
                g1(G2, vr2Var.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                g1(G2, vr2Var.f() - this.q.a(view2));
                return;
            }
        }
        if (c == 65535) {
            g1(G2, vr2Var.d(view2));
        } else {
            g1(G2, vr2Var.a(view2) - this.q.b(view));
        }
    }

    @Override // q79
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override // q79
    public void b0(c89 c89Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.c();
    }

    public final void b1(oh2 oh2Var, v46 v46Var) {
        f89 U;
        f89 U2;
        if (!v46Var.a || v46Var.l) {
            return;
        }
        int i = v46Var.g;
        int i2 = v46Var.i;
        if (v46Var.f != -1) {
            d1(oh2Var, i, i2);
            return;
        }
        int r = r();
        if (i >= 0) {
            int e = (this.q.e() - i) + i2;
            if (this.v) {
                for (int i3 = 0; i3 < r; i3++) {
                    View q = q(i3);
                    if (q != null && (U2 = this.b.U(q)) != null && !U2.r() && (this.q.d(q) < e || this.q.m(q) < e)) {
                        c1(oh2Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = r - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View q2 = q(i5);
                if (q2 != null && (U = this.b.U(q2)) != null && !U.r() && (this.q.d(q2) < e || this.q.m(q2) < e)) {
                    c1(oh2Var, i4, i5);
                    return;
                }
            }
        }
    }

    public final void c1(oh2 oh2Var, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    h0(i, oh2Var);
                    i--;
                }
            } else {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    h0(i3, oh2Var);
                }
            }
        }
    }

    @Override // q79
    public final boolean d() {
        return (this.u || this.o) ? false : true;
    }

    @Override // q79
    public final w46 d0() {
        w46 w46Var = this.B;
        if (w46Var != null) {
            w46 w46Var2 = new w46();
            w46Var2.a = w46Var.a;
            w46Var2.b = w46Var.b;
            w46Var2.c = w46Var.c;
            return w46Var2;
        }
        w46 w46Var3 = new w46();
        if (r() <= 0) {
            w46Var3.a = -1;
            return w46Var3;
        }
        F0();
        boolean z = this.s ^ this.v;
        w46Var3.c = z;
        if (z) {
            View T0 = T0();
            w46Var3.b = this.q.f() - this.q.a(T0);
            w46Var3.a = ((r79) T0.getLayoutParams()).b();
            return w46Var3;
        }
        View U0 = U0();
        w46Var3.a = q79.G(U0);
        w46Var3.b = this.q.d(U0) - this.q.j();
        return w46Var3;
    }

    public void d1(oh2 oh2Var, int i, int i2) {
        f89 U;
        f89 U2;
        if (i >= 0) {
            int i3 = i - i2;
            int r = r();
            if (!this.v) {
                for (int i4 = 0; i4 < r; i4++) {
                    View q = q(i4);
                    if (q != null && (U = this.b.U(q)) != null && !U.r() && (this.q.a(q) > i3 || this.q.l(q) > i3)) {
                        c1(oh2Var, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = r - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View q2 = q(i6);
                if (q2 != null && (U2 = this.b.U(q2)) != null && !U2.r() && (this.q.a(q2) > i3 || this.q.l(q2) > i3)) {
                    c1(oh2Var, i5, i6);
                    return;
                }
            }
        }
    }

    @Override // q79
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

    public final int f1(int i, oh2 oh2Var, c89 c89Var) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        F0();
        this.p.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i2, abs, true, c89Var);
        v46 v46Var = this.p;
        int G0 = G0(oh2Var, v46Var, c89Var, false) + v46Var.g;
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

    @Override // q79
    public int h(c89 c89Var) {
        return B0(c89Var);
    }

    public void h1(int i, int i2, boolean z) {
        if (this.y == i && this.A == i2 && this.z == z) {
            return;
        }
        this.y = i;
        this.A = i2;
        this.z = z;
        w46 w46Var = this.B;
        if (w46Var != null) {
            w46Var.a = -1;
        }
        k0();
    }

    @Override // q79
    public int i(c89 c89Var) {
        return C0(c89Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(int i) {
        gu7 gu7Var;
        if (i != 0 && i != 1) {
            lq5.j(uh9.k(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            if (i == 0) {
                gu7Var = new gu7(this, (byte) 0);
            } else {
                if (i != 1) {
                    lq5.j("invalid orientation");
                    return;
                }
                gu7Var = new gu7(this, (byte) 1);
            }
            this.q = gu7Var;
            this.C.a = gu7Var;
            this.o = i;
            k0();
        }
    }

    @Override // q79
    public int j(c89 c89Var) {
        return A0(c89Var);
    }

    public void j1(boolean z) {
        b(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        k0();
    }

    @Override // q79
    public int k(c89 c89Var) {
        return B0(c89Var);
    }

    public void k1(boolean z) {
        b(null);
        if (this.w == z) {
            return;
        }
        this.w = z;
        k0();
    }

    @Override // q79
    public int l(c89 c89Var) {
        return C0(c89Var);
    }

    @Override // q79
    public int l0(int i, oh2 oh2Var, c89 c89Var) {
        if (this.o) {
            return 0;
        }
        return f1(i, oh2Var, c89Var);
    }

    public final void l1(int i, int i2, boolean z, c89 c89Var) {
        int j;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(c89Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        v46 v46Var = this.p;
        int i3 = z2 ? max2 : max;
        v46Var.h = i3;
        if (!z2) {
            max = max2;
        }
        v46Var.i = max;
        if (z2) {
            v46Var.h = this.q.g() + i3;
            View T0 = T0();
            v46 v46Var2 = this.p;
            v46Var2.e = this.v ? -1 : 1;
            int G = q79.G(T0);
            v46 v46Var3 = this.p;
            v46Var2.d = G + v46Var3.e;
            v46Var3.b = this.q.a(T0);
            j = this.q.a(T0) - this.q.f();
        } else {
            View U0 = U0();
            v46 v46Var4 = this.p;
            v46Var4.h = this.q.j() + v46Var4.h;
            v46 v46Var5 = this.p;
            v46Var5.e = this.v ? 1 : -1;
            int G2 = q79.G(U0);
            v46 v46Var6 = this.p;
            v46Var5.d = G2 + v46Var6.e;
            v46Var6.b = this.q.d(U0);
            j = (-this.q.d(U0)) + this.q.j();
        }
        v46 v46Var7 = this.p;
        v46Var7.c = i2;
        if (z) {
            v46Var7.c = i2 - j;
        }
        v46Var7.g = j;
    }

    @Override // q79
    public final void m0(int i) {
        this.y = i;
        this.A = TLObject.FLAG_31;
        w46 w46Var = this.B;
        if (w46Var != null) {
            w46Var.a = -1;
        }
        k0();
    }

    public final void m1(int i, int i2) {
        this.p.c = this.q.f() - i2;
        v46 v46Var = this.p;
        v46Var.e = this.v ? -1 : 1;
        v46Var.d = i;
        v46Var.f = 1;
        v46Var.b = i2;
        v46Var.g = TLObject.FLAG_31;
    }

    @Override // q79
    public int n0(int i, oh2 oh2Var, c89 c89Var) {
        if (this.o) {
            return f1(i, oh2Var, c89Var);
        }
        return 0;
    }

    public final void n1(int i, int i2) {
        this.p.c = i2 - this.q.j();
        v46 v46Var = this.p;
        v46Var.d = i;
        v46Var.e = this.v ? 1 : -1;
        v46Var.f = -1;
        v46Var.b = i2;
        v46Var.g = TLObject.FLAG_31;
    }

    @Override // q79
    public boolean x0() {
        return this.B == null && this.s == this.w;
    }

    public void y0(c89 c89Var, int[] iArr) {
        int i;
        int V0 = V0(c89Var);
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = V0;
            V0 = 0;
        }
        iArr[0] = V0;
        iArr[1] = i;
    }

    public void z0(c89 c89Var, v46 v46Var, pn pnVar) {
        int i = v46Var.d;
        if (i < 0 || i >= c89Var.b()) {
            return;
        }
        pnVar.b(i, Math.max(0, v46Var.g));
    }

    public x46() {
        this(1, false);
    }

    public void Z0(oh2 oh2Var, c89 c89Var, t46 t46Var, int i) {
    }
}
