package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.gv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class s extends c0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public s(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gv(1);
        this.P = new Rect();
        y1(i10);
    }

    @Override // s4.c0
    public final void A0(z0 z0Var, a0 a0Var, a0.h hVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && a0Var.b(z0Var) && i10 > 0; i11++) {
            int i12 = a0Var.d;
            hVar.b(i12, Math.max(0, a0Var.g));
            i10 -= this.O.i(i12);
            a0Var.d += a0Var.e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.o == 1) {
            C = this.m - E();
            F = D();
        } else {
            C = this.n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = q1(this.J, i10, this.K);
    }

    @Override // s4.o0
    public int I(of.e eVar, z0 z0Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return t1(z0Var.b() - 1, eVar, z0Var) + 1;
    }

    @Override // s4.c0
    public final View Q0(of.e eVar, z0 z0Var, int i10, int i11, int i12) {
        G0();
        int j3 = this.q.j();
        int f7 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = o0.H(q6);
            if (H >= 0 && H < i12 && u1(H, eVar, z0Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        if (r13 == (r2 > r8)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L5;
     */
    @Override // s4.c0, s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i10, of.e eVar, z0 z0Var) {
        View F;
        int r10;
        int i11;
        int i12;
        View view2;
        View view3;
        int i13;
        int i14;
        of.e eVar2 = eVar;
        z0 z0Var2 = z0Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            r rVar = (r) F.getLayoutParams();
            int i15 = rVar.e;
            int i16 = rVar.f + i15;
            if (super.R(view, i10, eVar, z0Var) != null) {
                if ((F0(i10) == 1) != this.v) {
                    i11 = r() - 1;
                    r10 = -1;
                    i12 = -1;
                } else {
                    r10 = r();
                    i11 = 0;
                    i12 = 1;
                }
                boolean z10 = this.o == 1 && Y0();
                int t12 = t1(i11, eVar2, z0Var2);
                View view4 = null;
                int i17 = i11;
                int i18 = -1;
                int i19 = 0;
                int i20 = -1;
                View view5 = null;
                int i21 = 0;
                while (true) {
                    view2 = view5;
                    if (i17 == r10) {
                        break;
                    }
                    int t13 = t1(i17, eVar2, z0Var2);
                    View q6 = q(i17);
                    if (q6 == F) {
                        break;
                    }
                    if (!q6.hasFocusable() || t13 == t12) {
                        r rVar2 = (r) q6.getLayoutParams();
                        int i22 = rVar2.e;
                        view3 = F;
                        int i23 = rVar2.f + i22;
                        if (q6.hasFocusable() && i22 == i15 && i23 == i16) {
                            return q6;
                        }
                        if (!(q6.hasFocusable() && view4 == null) && (q6.hasFocusable() || view2 != null)) {
                            i13 = r10;
                            int min = Math.min(i23, i16) - Math.max(i22, i15);
                            if (q6.hasFocusable()) {
                                if (min <= i19) {
                                    if (min == i19) {
                                    }
                                    i14 = i19;
                                }
                                i14 = i19;
                            } else {
                                if (view4 == null) {
                                    i14 = i19;
                                    if (!(this.c.o(q6) && this.d.o(q6))) {
                                        if (min <= i21) {
                                            if (min == i21) {
                                            }
                                        }
                                    }
                                }
                                i14 = i19;
                            }
                        } else {
                            i14 = i19;
                            i13 = r10;
                        }
                        if (q6.hasFocusable()) {
                            int i24 = rVar2.e;
                            i19 = Math.min(i23, i16) - Math.max(i22, i15);
                            view4 = q6;
                            i20 = i24;
                            view5 = view2;
                        } else {
                            int i25 = rVar2.e;
                            view5 = q6;
                            i18 = i25;
                            i19 = i14;
                            i21 = Math.min(i23, i16) - Math.max(i22, i15);
                        }
                        i17 += i12;
                        eVar2 = eVar;
                        z0Var2 = z0Var;
                        F = view3;
                        r10 = i13;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i14 = i19;
                        i13 = r10;
                    }
                    view5 = view2;
                    i19 = i14;
                    i17 += i12;
                    eVar2 = eVar;
                    z0Var2 = z0Var;
                    F = view3;
                    r10 = i13;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // s4.o0
    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            T(view, dVar);
            return;
        }
        r rVar = (r) layoutParams;
        int t12 = t1(rVar.b(), eVar, z0Var);
        if (this.o == 0) {
            int i10 = rVar.e;
            int i11 = rVar.f;
            int i12 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, t12, 1, i12 > 1 && i11 == i12, false));
            return;
        }
        int i13 = rVar.e;
        int i14 = rVar.f;
        int i15 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i13, i14, i15 > 1 && i14 == i15, false));
    }

    @Override // s4.o0
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.o0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.o0
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.o0
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // s4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(of.e eVar, z0 z0Var, a0 a0Var, z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int s10;
        int i17;
        View c10;
        int i18 = this.q.i();
        boolean z10 = i18 != 1073741824;
        int i19 = r() > 0 ? this.K[this.J] : 0;
        if (z10) {
            A1();
        }
        boolean z11 = a0Var.e == 1;
        int i20 = this.J;
        if (!z11) {
            i20 = u1(a0Var.d, eVar, z0Var) + v1(a0Var.d, eVar, z0Var);
        }
        int i21 = 0;
        while (i21 < this.J && a0Var.b(z0Var) && i20 > 0) {
            int i22 = a0Var.d;
            int v12 = v1(i22, eVar, z0Var);
            if (v12 > this.J) {
                throw new IllegalArgumentException(a4.a.n(this.J, " spans.", hc.b.n("Item at position ", i22, " requires ", v12, " spans but GridLayoutManager has only ")));
            }
            i20 -= v12;
            if (i20 < 0 || (c10 = a0Var.c(eVar)) == null) {
                break;
            }
            this.L[i21] = c10;
            i21++;
        }
        p1(i21, eVar, z0Var, z11);
        float f7 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i21; i24++) {
            View view = this.L[i24];
            if (a0Var.k == null) {
                if (z11) {
                    a(view, -1, false);
                } else {
                    a(view, 0, false);
                }
            } else if (z11) {
                a(view, -1, true);
            } else {
                a(view, 0, true);
            }
            c(view, this.P);
            w1(view, i18, false);
            int b10 = this.q.b(view);
            if (b10 > i23) {
                i23 = b10;
            }
            float c11 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
            if (c11 > f7) {
                f7 = c11;
            }
        }
        if (z10) {
            this.K = q1(this.J, Math.max(Math.round(f7 * this.J), i19), this.K);
            i23 = 0;
            for (int i25 = 0; i25 < i21; i25++) {
                View view2 = this.L[i25];
                w1(view2, TLObject.FLAG_30, true);
                int b11 = this.q.b(view2);
                if (b11 > i23) {
                    i23 = b11;
                }
            }
        }
        for (int i26 = 0; i26 < i21; i26++) {
            View view3 = this.L[i26];
            if (this.q.b(view3) != i23) {
                r rVar = (r) view3.getLayoutParams();
                Rect rect = rVar.b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
                int s12 = s1(rVar.e, rVar.f);
                if (this.o == 1) {
                    i17 = o0.s(false, s12, TLObject.FLAG_30, i28, ((ViewGroup.MarginLayoutParams) rVar).width);
                    s10 = View.MeasureSpec.makeMeasureSpec(i23 - i27, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, TLObject.FLAG_30);
                    s10 = o0.s(false, s12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) rVar).height);
                    i17 = makeMeasureSpec;
                }
                x1(i17, s10, view3, true);
            }
        }
        zVar.a = i23;
        if (this.o == 1) {
            if (a0Var.f == -1) {
                i15 = a0Var.b;
                i16 = i15 - i23;
            } else {
                i16 = a0Var.b;
                i15 = i16 + i23;
            }
            i13 = i16;
            i14 = 0;
            i12 = 0;
        } else {
            if (a0Var.f == -1) {
                i11 = a0Var.b;
                i10 = i11 - i23;
            } else {
                i10 = a0Var.b;
                i11 = i10 + i23;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        for (int i29 = 0; i29 < i21; i29++) {
            View view4 = this.L[i29];
            r rVar2 = (r) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[rVar2.e];
                i13 = F;
                i15 = this.q.c(view4) + F;
            } else if (Y0()) {
                i14 = D() + this.K[this.J - rVar2.e];
                i12 = i14 - this.q.c(view4);
            } else {
                int D = D() + this.K[rVar2.e];
                i12 = D;
                i14 = this.q.c(view4) + D;
            }
            o0.O(view4, i12, i13, i14, i15);
            if (rVar2.a.j() || rVar2.a.m()) {
                zVar.c = true;
            }
            zVar.d = view4.hasFocusable() | zVar.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // s4.o0
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.c0
    public final void a1(of.e eVar, z0 z0Var, i2.k0 k0Var, int i10) {
        A1();
        if (z0Var.b() > 0 && !z0Var.g) {
            boolean z10 = i10 == 1;
            int u12 = u1(k0Var.b, eVar, z0Var);
            if (z10) {
                while (u12 > 0) {
                    int i11 = k0Var.b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    k0Var.b = i12;
                    u12 = u1(i12, eVar, z0Var);
                }
            } else {
                int b10 = z0Var.b() - 1;
                int i13 = k0Var.b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int u13 = u1(i14, eVar, z0Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i13 = i14;
                    u12 = u13;
                }
                k0Var.b = i13;
            }
        }
        r1();
    }

    @Override // s4.c0, s4.o0
    public void b0(of.e eVar, z0 z0Var) {
        boolean z10 = z0Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i10 = 0; i10 < r10; i10++) {
                r rVar = (r) q(i10).getLayoutParams();
                int b10 = rVar.b();
                sparseIntArray2.put(b10, rVar.f);
                sparseIntArray.put(b10, rVar.e);
            }
        }
        super.b0(eVar, z0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // s4.c0, s4.o0
    public final void c0(z0 z0Var) {
        super.c0(z0Var);
        this.I = false;
    }

    @Override // s4.o0
    public final boolean f(p0 p0Var) {
        return p0Var instanceof r;
    }

    @Override // s4.c0, s4.o0
    public final int h(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // s4.c0, s4.o0
    public final int i(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // s4.c0, s4.o0
    public int k(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // s4.c0, s4.o0
    public int l(z0 z0Var) {
        return D0(z0Var);
    }

    @Override // s4.c0
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // s4.c0, s4.o0
    public final int m0(int i10, of.e eVar, z0 z0Var) {
        A1();
        r1();
        return super.m0(i10, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public final p0 n() {
        return this.o == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // s4.o0
    public final p0 o(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.e = -1;
        rVar.f = 0;
        return rVar;
    }

    @Override // s4.c0, s4.o0
    public int o0(int i10, of.e eVar, z0 z0Var) {
        A1();
        r1();
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.o0
    public final p0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.e = -1;
            rVar.f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.e = -1;
        rVar2.f = 0;
        return rVar2;
    }

    public final void p1(int i10, of.e eVar, z0 z0Var, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            r rVar = (r) view.getLayoutParams();
            int v12 = v1(((p0) view.getLayoutParams()).b(), eVar, z0Var);
            rVar.f = v12;
            rVar.e = i14;
            i14 += v12;
            i11 += i13;
        }
    }

    public int[] q1(int i10, int i11, int[] iArr) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // s4.o0
    public final void r0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.i0.a;
            g11 = o0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = o0.g(i10, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.i0.a;
            g10 = o0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = o0.g(i11, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i10, int i11) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int t1(int i10, of.e eVar, z0 z0Var) {
        if (!z0Var.g) {
            return this.O.g(i10, this.J);
        }
        int b10 = eVar.b(i10);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // s4.o0
    public int u(of.e eVar, z0 z0Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (z0Var.b() < 1) {
            return 0;
        }
        return t1(z0Var.b() - 1, eVar, z0Var) + 1;
    }

    public final int u1(int i10, of.e eVar, z0 z0Var) {
        if (!z0Var.g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = eVar.b(i10);
        if (b10 != -1) {
            return this.O.h(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int v1(int i10, of.e eVar, z0 z0Var) {
        if (!z0Var.g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = eVar.b(i10);
        if (b10 != -1) {
            return this.O.i(b10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public void w1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int s12 = s1(rVar.e, rVar.f);
        if (this.o == 1) {
            i12 = o0.s(false, s12, i10, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = o0.s(true, this.q.k(), this.l, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int s10 = o0.s(false, s12, i10, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
            int s11 = o0.s(true, this.q.k(), this.k, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = s10;
            i12 = s11;
        }
        x1(i12, i11, view, z10);
    }

    public final void x1(int i10, int i11, View view, boolean z10) {
        p0 p0Var = (p0) view.getLayoutParams();
        if (z10 ? (this.g && o0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) p0Var).width) && o0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true : u0(view, i10, i11, p0Var)) {
            view.measure(i10, i11);
        }
    }

    @Override // s4.c0, s4.o0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(hc.b.j(i10, "Span count should be at least 1. Provided "));
        }
        this.J = i10;
        this.O.j();
        l0();
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public s(int i10, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gv(1);
        this.P = new Rect();
        y1(i10);
    }
}
