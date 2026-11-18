package v4;

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
import org.telegram.ui.wt;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class t extends c0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public t(int i7) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new wt(1);
        this.P = new Rect();
        y1(i7);
    }

    @Override // v4.c0
    public final void A0(c1 c1Var, a0 a0Var, h2.f fVar) {
        int i7 = this.J;
        for (int i10 = 0; i10 < this.J && a0Var.b(c1Var) && i7 > 0; i10++) {
            int i11 = a0Var.d;
            fVar.b(i11, Math.max(0, a0Var.g));
            i7 -= this.O.i(i11);
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
        int i7 = C - F;
        this.K = q1(this.J, i7, this.K);
    }

    @Override // v4.p0
    public int I(x0 x0Var, c1 c1Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (c1Var.b() < 1) {
            return 0;
        }
        return t1(c1Var.b() - 1, x0Var, c1Var) + 1;
    }

    @Override // v4.c0
    public final View Q0(x0 x0Var, c1 c1Var, int i7, int i10, int i11) {
        G0();
        int j3 = this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = p0.H(q10);
            if (H >= 0 && H < i11 && u1(H, x0Var, c1Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        if (r13 == (r2 > r8)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L5;
     */
    @Override // v4.c0, v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i7, x0 x0Var, c1 c1Var) {
        View F;
        int r10;
        int i10;
        int i11;
        View view2;
        View view3;
        int i12;
        int i13;
        x0 x0Var2 = x0Var;
        c1 c1Var2 = c1Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            s sVar = (s) F.getLayoutParams();
            int i14 = sVar.e;
            int i15 = sVar.f + i14;
            if (super.R(view, i7, x0Var, c1Var) != null) {
                if ((F0(i7) == 1) != this.v) {
                    i11 = r() - 1;
                    r10 = -1;
                    i10 = -1;
                } else {
                    r10 = r();
                    i10 = 1;
                    i11 = 0;
                }
                boolean z10 = this.o == 1 && Y0();
                int t12 = t1(i11, x0Var2, c1Var2);
                View view4 = null;
                int i16 = -1;
                int i17 = -1;
                int i18 = 0;
                int i19 = i11;
                int i20 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i19 == r10) {
                        break;
                    }
                    int t13 = t1(i19, x0Var2, c1Var2);
                    View q10 = q(i19);
                    if (q10 == F) {
                        break;
                    }
                    if (!q10.hasFocusable() || t13 == t12) {
                        s sVar2 = (s) q10.getLayoutParams();
                        int i21 = sVar2.e;
                        view3 = F;
                        int i22 = sVar2.f + i21;
                        if (q10.hasFocusable() && i21 == i14 && i22 == i15) {
                            return q10;
                        }
                        if (!(q10.hasFocusable() && view4 == null) && (q10.hasFocusable() || view2 != null)) {
                            i12 = r10;
                            int min = Math.min(i22, i15) - Math.max(i21, i14);
                            if (q10.hasFocusable()) {
                                if (min <= i18) {
                                    if (min == i18) {
                                    }
                                    i13 = i18;
                                }
                                i13 = i18;
                            } else {
                                if (view4 == null) {
                                    i13 = i18;
                                    if (!(this.c.e(q10) && this.d.e(q10))) {
                                        if (min <= i20) {
                                            if (min == i20) {
                                            }
                                        }
                                    }
                                }
                                i13 = i18;
                            }
                        } else {
                            i13 = i18;
                            i12 = r10;
                        }
                        if (q10.hasFocusable()) {
                            int i23 = sVar2.e;
                            i18 = Math.min(i22, i15) - Math.max(i21, i14);
                            view4 = q10;
                            i17 = i23;
                            view5 = view2;
                        } else {
                            int i24 = sVar2.e;
                            view5 = q10;
                            i16 = i24;
                            i18 = i13;
                            i20 = Math.min(i22, i15) - Math.max(i21, i14);
                        }
                        i19 += i10;
                        x0Var2 = x0Var;
                        c1Var2 = c1Var;
                        F = view3;
                        r10 = i12;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i13 = i18;
                        i12 = r10;
                    }
                    view5 = view2;
                    i18 = i13;
                    i19 += i10;
                    x0Var2 = x0Var;
                    c1Var2 = c1Var;
                    F = view3;
                    r10 = i12;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // v4.p0
    public void U(x0 x0Var, c1 c1Var, View view, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            T(view, cVar);
            return;
        }
        s sVar = (s) layoutParams;
        int t12 = t1(sVar.b(), x0Var, c1Var);
        if (this.o == 0) {
            int i7 = sVar.e;
            int i10 = sVar.f;
            int i11 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, t12, 1, i11 > 1 && i10 == i11, false));
            return;
        }
        int i12 = sVar.e;
        int i13 = sVar.f;
        int i14 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, i14 > 1 && i13 == i14, false));
    }

    @Override // v4.p0
    public void V(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // v4.p0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // v4.p0
    public void X(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // v4.p0
    public void Y(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // v4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(x0 x0Var, c1 c1Var, a0 a0Var, n2.j jVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int s5;
        int i16;
        View c10;
        int i17 = this.q.i();
        boolean z10 = i17 != 1073741824;
        int i18 = r() > 0 ? this.K[this.J] : 0;
        if (z10) {
            A1();
        }
        boolean z11 = a0Var.e == 1;
        int i19 = this.J;
        if (!z11) {
            i19 = u1(a0Var.d, x0Var, c1Var) + v1(a0Var.d, x0Var, c1Var);
        }
        int i20 = 0;
        while (i20 < this.J && a0Var.b(c1Var) && i19 > 0) {
            int i21 = a0Var.d;
            int v12 = v1(i21, x0Var, c1Var);
            if (v12 > this.J) {
                throw new IllegalArgumentException(a8.p0.n(this.J, " spans.", i5.c.n("Item at position ", i21, " requires ", v12, " spans but GridLayoutManager has only ")));
            }
            i19 -= v12;
            if (i19 < 0 || (c10 = a0Var.c(x0Var)) == null) {
                break;
            }
            this.L[i20] = c10;
            i20++;
        }
        p1(i20, x0Var, c1Var, z11);
        float f10 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i20; i23++) {
            View view = this.L[i23];
            if (a0Var.k == null) {
                if (z11) {
                    a(-1, view, false);
                } else {
                    a(0, view, false);
                }
            } else if (z11) {
                a(-1, view, true);
            } else {
                a(0, view, true);
            }
            c(view, this.P);
            w1(i17, view, false);
            int b10 = this.q.b(view);
            if (b10 > i22) {
                i22 = b10;
            }
            float c11 = (this.q.c(view) * 1.0f) / ((s) view.getLayoutParams()).f;
            if (c11 > f10) {
                f10 = c11;
            }
        }
        if (z10) {
            this.K = q1(this.J, Math.max(Math.round(f10 * this.J), i18), this.K);
            i22 = 0;
            for (int i24 = 0; i24 < i20; i24++) {
                View view2 = this.L[i24];
                w1(TLObject.FLAG_30, view2, true);
                int b11 = this.q.b(view2);
                if (b11 > i22) {
                    i22 = b11;
                }
            }
        }
        for (int i25 = 0; i25 < i20; i25++) {
            View view3 = this.L[i25];
            if (this.q.b(view3) != i22) {
                s sVar = (s) view3.getLayoutParams();
                Rect rect = sVar.b;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
                int s12 = s1(sVar.e, sVar.f);
                if (this.o == 1) {
                    i16 = p0.s(false, s12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) sVar).width);
                    s5 = View.MeasureSpec.makeMeasureSpec(i22 - i26, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, TLObject.FLAG_30);
                    s5 = p0.s(false, s12, TLObject.FLAG_30, i26, ((ViewGroup.MarginLayoutParams) sVar).height);
                    i16 = makeMeasureSpec;
                }
                x1(i16, s5, view3, true);
            }
        }
        jVar.a = i22;
        if (this.o == 1) {
            if (a0Var.f == -1) {
                i14 = a0Var.b;
                i15 = i14 - i22;
            } else {
                i15 = a0Var.b;
                i14 = i15 + i22;
            }
            i12 = i15;
            i13 = 0;
            i11 = 0;
        } else {
            if (a0Var.f == -1) {
                i10 = a0Var.b;
                i7 = i10 - i22;
            } else {
                i7 = a0Var.b;
                i10 = i7 + i22;
            }
            i11 = i7;
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        for (int i28 = 0; i28 < i20; i28++) {
            View view4 = this.L[i28];
            s sVar2 = (s) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[sVar2.e];
                i12 = F;
                i14 = this.q.c(view4) + F;
            } else if (Y0()) {
                i13 = D() + this.K[this.J - sVar2.e];
                i11 = i13 - this.q.c(view4);
            } else {
                int D = D() + this.K[sVar2.e];
                i11 = D;
                i13 = this.q.c(view4) + D;
            }
            p0.O(view4, i11, i12, i13, i14);
            if (sVar2.a.j() || sVar2.a.m()) {
                jVar.c = true;
            }
            jVar.d = view4.hasFocusable() | jVar.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // v4.p0
    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // v4.c0
    public final void a1(x0 x0Var, c1 c1Var, l2.l0 l0Var, int i7) {
        A1();
        if (c1Var.b() > 0 && !c1Var.g) {
            boolean z10 = i7 == 1;
            int u12 = u1(l0Var.b, x0Var, c1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = l0Var.b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    l0Var.b = i11;
                    u12 = u1(i11, x0Var, c1Var);
                }
            } else {
                int b10 = c1Var.b() - 1;
                int i12 = l0Var.b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, x0Var, c1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                l0Var.b = i12;
            }
        }
        r1();
    }

    @Override // v4.c0, v4.p0
    public void b0(x0 x0Var, c1 c1Var) {
        boolean z10 = c1Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i7 = 0; i7 < r10; i7++) {
                s sVar = (s) q(i7).getLayoutParams();
                int b10 = sVar.b();
                sparseIntArray2.put(b10, sVar.f);
                sparseIntArray.put(b10, sVar.e);
            }
        }
        super.b0(x0Var, c1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // v4.c0, v4.p0
    public final void c0(c1 c1Var) {
        super.c0(c1Var);
        this.I = false;
    }

    @Override // v4.p0
    public final boolean f(q0 q0Var) {
        return q0Var instanceof s;
    }

    @Override // v4.c0, v4.p0
    public final int h(c1 c1Var) {
        return C0(c1Var);
    }

    @Override // v4.c0, v4.p0
    public final int i(c1 c1Var) {
        return D0(c1Var);
    }

    @Override // v4.c0, v4.p0
    public int k(c1 c1Var) {
        return C0(c1Var);
    }

    @Override // v4.c0, v4.p0
    public int l(c1 c1Var) {
        return D0(c1Var);
    }

    @Override // v4.c0
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // v4.c0, v4.p0
    public final int m0(int i7, x0 x0Var, c1 c1Var) {
        A1();
        r1();
        return super.m0(i7, x0Var, c1Var);
    }

    @Override // v4.c0, v4.p0
    public final q0 n() {
        return this.o == 0 ? new s(-2, -1) : new s(-1, -2);
    }

    @Override // v4.p0
    public final q0 o(Context context, AttributeSet attributeSet) {
        s sVar = new s(context, attributeSet);
        sVar.e = -1;
        sVar.f = 0;
        return sVar;
    }

    @Override // v4.c0, v4.p0
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        A1();
        r1();
        return super.o0(i7, x0Var, c1Var);
    }

    @Override // v4.p0
    public final q0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            s sVar = new s((ViewGroup.MarginLayoutParams) layoutParams);
            sVar.e = -1;
            sVar.f = 0;
            return sVar;
        }
        s sVar2 = new s(layoutParams);
        sVar2.e = -1;
        sVar2.f = 0;
        return sVar2;
    }

    public final void p1(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i12 = 1;
            i11 = i7;
            i10 = 0;
        } else {
            i10 = i7 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            s sVar = (s) view.getLayoutParams();
            int v12 = v1(((q0) view.getLayoutParams()).b(), x0Var, c1Var);
            sVar.f = v12;
            sVar.e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i7, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i7 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i7;
        int i14 = i10 % i7;
        int i15 = 0;
        for (int i16 = 1; i16 <= i7; i16++) {
            i12 += i14;
            if (i12 <= 0 || i7 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i7;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override // v4.p0
    public final void r0(Rect rect, int i7, int i10) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i7, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.i0.a;
            g11 = p0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = p0.g(i7, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.i0.a;
            g10 = p0.g(i7, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = p0.g(i10, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i7, int i10) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i10 + i7] - iArr[i7];
        }
        int[] iArr2 = this.K;
        int i11 = this.J;
        return iArr2[i11 - i7] - iArr2[(i11 - i7) - i10];
    }

    public final int t1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.g) {
            return this.O.g(i7, this.J);
        }
        int b10 = x0Var.b(i7);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    @Override // v4.p0
    public int u(x0 x0Var, c1 c1Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (c1Var.b() < 1) {
            return 0;
        }
        return t1(c1Var.b() - 1, x0Var, c1Var) + 1;
    }

    public final int u1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.g) {
            return this.O.h(i7, this.J);
        }
        int i10 = this.N.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = x0Var.b(i7);
        if (b10 != -1) {
            return this.O.h(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    public final int v1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.g) {
            return this.O.i(i7);
        }
        int i10 = this.M.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = x0Var.b(i7);
        if (b10 != -1) {
            return this.O.i(b10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    public void w1(int i7, View view, boolean z10) {
        int i10;
        int i11;
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
        int s12 = s1(sVar.e, sVar.f);
        if (this.o == 1) {
            i11 = p0.s(false, s12, i7, i13, ((ViewGroup.MarginLayoutParams) sVar).width);
            i10 = p0.s(true, this.q.k(), this.l, i12, ((ViewGroup.MarginLayoutParams) sVar).height);
        } else {
            int s5 = p0.s(false, s12, i7, i12, ((ViewGroup.MarginLayoutParams) sVar).height);
            int s9 = p0.s(true, this.q.k(), this.k, i13, ((ViewGroup.MarginLayoutParams) sVar).width);
            i10 = s5;
            i11 = s9;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i7, int i10, View view, boolean z10) {
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10 ? (this.g && p0.N(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) q0Var).width) && p0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true : u0(view, i7, i10, q0Var)) {
            view.measure(i7, i10);
        }
    }

    @Override // v4.c0, v4.p0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i7) {
        if (i7 == this.J) {
            return;
        }
        this.I = true;
        if (i7 < 1) {
            throw new IllegalArgumentException(i5.c.i(i7, "Span count should be at least 1. Provided "));
        }
        this.J = i7;
        this.O.j();
        l0();
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public t(int i7, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new wt(1);
        this.P = new Rect();
        y1(i7);
    }
}
