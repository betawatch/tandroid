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
import org.telegram.ui.su;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class t extends c0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.o O;
    public final Rect P;

    public t(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new su(1);
        this.P = new Rect();
        z1(i10);
    }

    @Override // s4.c0
    public final void A0(b1 b1Var, a0 a0Var, e2.f fVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && a0Var.b(b1Var) && i10 > 0; i11++) {
            int i12 = a0Var.d;
            fVar.b(i12, Math.max(0, a0Var.g));
            i10 -= this.O.i(i12);
            a0Var.d += a0Var.e;
        }
    }

    public final void A1(g.o oVar) {
        this.O = oVar;
    }

    public final void B1() {
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
        this.K = r1(this.J, i10, this.K);
    }

    @Override // s4.p0
    public int I(rf.e eVar, b1 b1Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return u1(b1Var.b() - 1, eVar, b1Var) + 1;
    }

    @Override // s4.c0
    public final View Q0(rf.e eVar, b1 b1Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.q.j();
        int f7 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q5 = q(i10);
            int H = p0.H(q5);
            if (H >= 0 && H < i12 && v1(H, eVar, b1Var) == 0) {
                if (((q0) q5.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q5;
                    }
                } else {
                    if (this.q.d(q5) < f7 && this.q.a(q5) >= j10) {
                        return q5;
                    }
                    if (view == null) {
                        view = q5;
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
    @Override // s4.c0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i10, rf.e eVar, b1 b1Var) {
        View F;
        int r6;
        int i11;
        int i12;
        View view2;
        View view3;
        int i13;
        int i14;
        rf.e eVar2 = eVar;
        b1 b1Var2 = b1Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            s sVar = (s) F.getLayoutParams();
            int i15 = sVar.e;
            int i16 = sVar.f + i15;
            if (super.R(view, i10, eVar, b1Var) != null) {
                if ((F0(i10) == 1) != this.v) {
                    i12 = r() - 1;
                    r6 = -1;
                    i11 = -1;
                } else {
                    r6 = r();
                    i11 = 1;
                    i12 = 0;
                }
                boolean z10 = this.o == 1 && Y0();
                int u12 = u1(i12, eVar2, b1Var2);
                View view4 = null;
                int i17 = -1;
                int i18 = -1;
                int i19 = 0;
                int i20 = i12;
                int i21 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i20 == r6) {
                        break;
                    }
                    int u13 = u1(i20, eVar2, b1Var2);
                    View q5 = q(i20);
                    if (q5 == F) {
                        break;
                    }
                    if (!q5.hasFocusable() || u13 == u12) {
                        s sVar2 = (s) q5.getLayoutParams();
                        int i22 = sVar2.e;
                        view3 = F;
                        int i23 = sVar2.f + i22;
                        if (q5.hasFocusable() && i22 == i15 && i23 == i16) {
                            return q5;
                        }
                        if (!(q5.hasFocusable() && view4 == null) && (q5.hasFocusable() || view2 != null)) {
                            i13 = r6;
                            int min = Math.min(i23, i16) - Math.max(i22, i15);
                            if (q5.hasFocusable()) {
                                if (min <= i19) {
                                    if (min == i19) {
                                    }
                                    i14 = i19;
                                }
                                i14 = i19;
                            } else {
                                if (view4 == null) {
                                    i14 = i19;
                                    if (!(this.c.O(q5) && this.d.O(q5))) {
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
                            i13 = r6;
                        }
                        if (q5.hasFocusable()) {
                            int i24 = sVar2.e;
                            i19 = Math.min(i23, i16) - Math.max(i22, i15);
                            view4 = q5;
                            i18 = i24;
                            view5 = view2;
                        } else {
                            int i25 = sVar2.e;
                            view5 = q5;
                            i17 = i25;
                            i19 = i14;
                            i21 = Math.min(i23, i16) - Math.max(i22, i15);
                        }
                        i20 += i11;
                        eVar2 = eVar;
                        b1Var2 = b1Var;
                        F = view3;
                        r6 = i13;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i14 = i19;
                        i13 = r6;
                    }
                    view5 = view2;
                    i19 = i14;
                    i20 += i11;
                    eVar2 = eVar;
                    b1Var2 = b1Var;
                    F = view3;
                    r6 = i13;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // s4.p0
    public void U(rf.e eVar, b1 b1Var, View view, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            T(view, dVar);
            return;
        }
        s sVar = (s) layoutParams;
        int u12 = u1(sVar.b(), eVar, b1Var);
        if (this.o == 0) {
            int i10 = sVar.e;
            int i11 = sVar.f;
            int i12 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, u12, 1, i12 > 1 && i11 == i12, false));
            return;
        }
        int i13 = sVar.e;
        int i14 = sVar.f;
        int i15 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(u12, 1, i13, i14, i15 > 1 && i14 == i15, false));
    }

    @Override // s4.p0
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.p0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.p0
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.p0
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
    public void Z0(rf.e eVar, b1 b1Var, a0 a0Var, k2.l lVar) {
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
            B1();
        }
        boolean z11 = a0Var.e == 1;
        int i20 = this.J;
        if (!z11) {
            i20 = v1(a0Var.d, eVar, b1Var) + w1(a0Var.d, eVar, b1Var);
        }
        int i21 = 0;
        while (i21 < this.J && a0Var.b(b1Var) && i20 > 0) {
            int i22 = a0Var.d;
            int w12 = w1(i22, eVar, b1Var);
            if (w12 > this.J) {
                throw new IllegalArgumentException(a1.g.n(this.J, " spans.", c3.h0.n("Item at position ", i22, " requires ", w12, " spans but GridLayoutManager has only ")));
            }
            i20 -= w12;
            if (i20 < 0 || (c10 = a0Var.c(eVar)) == null) {
                break;
            }
            this.L[i21] = c10;
            i21++;
        }
        q1(i21, eVar, b1Var, z11);
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
            x1(view, i18, false);
            int b10 = this.q.b(view);
            if (b10 > i23) {
                i23 = b10;
            }
            float c11 = (this.q.c(view) * 1.0f) / ((s) view.getLayoutParams()).f;
            if (c11 > f7) {
                f7 = c11;
            }
        }
        if (z10) {
            this.K = r1(this.J, Math.max(Math.round(f7 * this.J), i19), this.K);
            i23 = 0;
            for (int i25 = 0; i25 < i21; i25++) {
                View view2 = this.L[i25];
                x1(view2, TLObject.FLAG_30, true);
                int b11 = this.q.b(view2);
                if (b11 > i23) {
                    i23 = b11;
                }
            }
        }
        for (int i26 = 0; i26 < i21; i26++) {
            View view3 = this.L[i26];
            if (this.q.b(view3) != i23) {
                s sVar = (s) view3.getLayoutParams();
                Rect rect = sVar.b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
                int t12 = t1(sVar.e, sVar.f);
                if (this.o == 1) {
                    i17 = p0.s(false, t12, TLObject.FLAG_30, i28, ((ViewGroup.MarginLayoutParams) sVar).width);
                    s10 = View.MeasureSpec.makeMeasureSpec(i23 - i27, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, TLObject.FLAG_30);
                    s10 = p0.s(false, t12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) sVar).height);
                    i17 = makeMeasureSpec;
                }
                y1(i17, s10, view3, true);
            }
        }
        lVar.a = i23;
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
            s sVar2 = (s) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[sVar2.e];
                i13 = F;
                i15 = this.q.c(view4) + F;
            } else if (Y0()) {
                i14 = D() + this.K[this.J - sVar2.e];
                i12 = i14 - this.q.c(view4);
            } else {
                int D = D() + this.K[sVar2.e];
                i12 = D;
                i14 = this.q.c(view4) + D;
            }
            p0.O(view4, i12, i13, i14, i15);
            if (sVar2.a.j() || sVar2.a.m()) {
                lVar.c = true;
            }
            lVar.d = view4.hasFocusable() | lVar.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // s4.p0
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // s4.c0
    public final void a1(rf.e eVar, b1 b1Var, i2.p0 p0Var, int i10) {
        B1();
        if (b1Var.b() > 0 && !b1Var.g) {
            boolean z10 = i10 == 1;
            int v12 = v1(p0Var.b, eVar, b1Var);
            if (z10) {
                while (v12 > 0) {
                    int i11 = p0Var.b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    p0Var.b = i12;
                    v12 = v1(i12, eVar, b1Var);
                }
            } else {
                int b10 = b1Var.b() - 1;
                int i13 = p0Var.b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int v13 = v1(i14, eVar, b1Var);
                    if (v13 <= v12) {
                        break;
                    }
                    i13 = i14;
                    v12 = v13;
                }
                p0Var.b = i13;
            }
        }
        s1();
    }

    @Override // s4.c0, s4.p0
    public void b0(rf.e eVar, b1 b1Var) {
        boolean z10 = b1Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r6 = r();
            for (int i10 = 0; i10 < r6; i10++) {
                s sVar = (s) q(i10).getLayoutParams();
                int b10 = sVar.b();
                sparseIntArray2.put(b10, sVar.f);
                sparseIntArray.put(b10, sVar.e);
            }
        }
        super.b0(eVar, b1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // s4.c0, s4.p0
    public final void c0(b1 b1Var) {
        super.c0(b1Var);
        this.I = false;
    }

    @Override // s4.p0
    public final boolean f(q0 q0Var) {
        return q0Var instanceof s;
    }

    @Override // s4.c0, s4.p0
    public final int h(b1 b1Var) {
        return C0(b1Var);
    }

    @Override // s4.c0, s4.p0
    public final int i(b1 b1Var) {
        return D0(b1Var);
    }

    @Override // s4.c0, s4.p0
    public int k(b1 b1Var) {
        return C0(b1Var);
    }

    @Override // s4.c0, s4.p0
    public int l(b1 b1Var) {
        return D0(b1Var);
    }

    @Override // s4.c0, s4.p0
    public final int m0(int i10, rf.e eVar, b1 b1Var) {
        B1();
        s1();
        return super.m0(i10, eVar, b1Var);
    }

    @Override // s4.c0
    public final void m1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // s4.c0, s4.p0
    public final q0 n() {
        return this.o == 0 ? new s(-2, -1) : new s(-1, -2);
    }

    @Override // s4.p0
    public final q0 o(Context context, AttributeSet attributeSet) {
        s sVar = new s(context, attributeSet);
        sVar.e = -1;
        sVar.f = 0;
        return sVar;
    }

    @Override // s4.c0, s4.p0
    public int o0(int i10, rf.e eVar, b1 b1Var) {
        B1();
        s1();
        return super.o0(i10, eVar, b1Var);
    }

    @Override // s4.p0
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

    public final void q1(int i10, rf.e eVar, b1 b1Var, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            s sVar = (s) view.getLayoutParams();
            int w12 = w1(((q0) view.getLayoutParams()).b(), eVar, b1Var);
            sVar.f = w12;
            sVar.e = i14;
            i14 += w12;
            i11 += i13;
        }
    }

    @Override // s4.p0
    public final void r0(Rect rect, int i10, int i11) {
        int g7;
        int g10;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.i0.a;
            g10 = p0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g7 = p0.g(i10, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.i0.a;
            g7 = p0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g10 = p0.g(i11, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g7, g10);
    }

    public int[] r1(int i10, int i11, int[] iArr) {
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

    public final void s1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int t1(int i10, int i11) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // s4.p0
    public int u(rf.e eVar, b1 b1Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return u1(b1Var.b() - 1, eVar, b1Var) + 1;
    }

    public final int u1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.g) {
            return this.O.g(i10, this.J);
        }
        int b10 = eVar.b(i10);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int v1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.g) {
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

    public final int w1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.g) {
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

    public void x1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
        int t12 = t1(sVar.e, sVar.f);
        if (this.o == 1) {
            i12 = p0.s(false, t12, i10, i14, ((ViewGroup.MarginLayoutParams) sVar).width);
            i11 = p0.s(true, this.q.k(), this.l, i13, ((ViewGroup.MarginLayoutParams) sVar).height);
        } else {
            int s10 = p0.s(false, t12, i10, i13, ((ViewGroup.MarginLayoutParams) sVar).height);
            int s11 = p0.s(true, this.q.k(), this.k, i14, ((ViewGroup.MarginLayoutParams) sVar).width);
            i11 = s10;
            i12 = s11;
        }
        y1(i12, i11, view, z10);
    }

    @Override // s4.c0, s4.p0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public final void y1(int i10, int i11, View view, boolean z10) {
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10 ? (this.g && p0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && p0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true : u0(view, i10, i11, q0Var)) {
            view.measure(i10, i11);
        }
    }

    public void z1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(ic.a.i(i10, "Span count should be at least 1. Provided "));
        }
        this.J = i10;
        this.O.j();
        l0();
    }

    public t(int i10, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new su(1);
        this.P = new Rect();
        z1(i10);
    }
}
