package u4;

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
import k2.p1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.qt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class s extends b0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public s(int i3) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new qt(1);
        this.P = new Rect();
        y1(i3);
    }

    @Override // u4.b0
    public final void A0(a1 a1Var, z zVar, g2.g gVar) {
        int i3 = this.J;
        for (int i10 = 0; i10 < this.J && zVar.b(a1Var) && i3 > 0; i10++) {
            int i11 = zVar.d;
            gVar.b(i11, Math.max(0, zVar.g));
            i3 -= this.O.i(i11);
            zVar.d += zVar.e;
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
        int i3 = C - F;
        this.K = q1(this.J, i3, this.K);
    }

    @Override // u4.o0
    public int I(tf.e eVar, a1 a1Var) {
        if (this.o == 0) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    @Override // u4.b0
    public final View Q0(tf.e eVar, a1 a1Var, int i3, int i10, int i11) {
        G0();
        int j10 = this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i10) {
            View q10 = q(i3);
            int H = o0.H(q10);
            if (H >= 0 && H < i11 && u1(H, eVar, a1Var) == 0) {
                if (((p0) q10.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else {
                    if (this.q.d(q10) < f10 && this.q.a(q10) >= j10) {
                        return q10;
                    }
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i3 += i12;
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
    
        if (((java.util.ArrayList) r22.a.c).contains(r3) != false) goto L5;
     */
    @Override // u4.b0, u4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R(View view, int i3, tf.e eVar, a1 a1Var) {
        View F;
        int r5;
        int i10;
        int i11;
        View view2;
        View view3;
        int i12;
        int i13;
        tf.e eVar2 = eVar;
        a1 a1Var2 = a1Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            F = recyclerView.F(view);
            if (F != null) {
            }
        }
        F = null;
        if (F != null) {
            r rVar = (r) F.getLayoutParams();
            int i14 = rVar.e;
            int i15 = rVar.f + i14;
            if (super.R(view, i3, eVar, a1Var) != null) {
                if ((F0(i3) == 1) != this.v) {
                    i11 = r() - 1;
                    r5 = -1;
                    i10 = -1;
                } else {
                    r5 = r();
                    i10 = 1;
                    i11 = 0;
                }
                boolean z10 = this.o == 1 && Y0();
                int t12 = t1(i11, eVar2, a1Var2);
                View view4 = null;
                int i16 = -1;
                int i17 = -1;
                int i18 = 0;
                int i19 = i11;
                int i20 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i19 == r5) {
                        break;
                    }
                    int t13 = t1(i19, eVar2, a1Var2);
                    View q10 = q(i19);
                    if (q10 == F) {
                        break;
                    }
                    if (!q10.hasFocusable() || t13 == t12) {
                        r rVar2 = (r) q10.getLayoutParams();
                        int i21 = rVar2.e;
                        view3 = F;
                        int i22 = rVar2.f + i21;
                        if (q10.hasFocusable() && i21 == i14 && i22 == i15) {
                            return q10;
                        }
                        if (!(q10.hasFocusable() && view4 == null) && (q10.hasFocusable() || view2 != null)) {
                            i12 = r5;
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
                                    if (!(this.c.O(q10) && this.d.O(q10))) {
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
                            i12 = r5;
                        }
                        if (q10.hasFocusable()) {
                            int i23 = rVar2.e;
                            i18 = Math.min(i22, i15) - Math.max(i21, i14);
                            view4 = q10;
                            i17 = i23;
                            view5 = view2;
                        } else {
                            int i24 = rVar2.e;
                            view5 = q10;
                            i16 = i24;
                            i18 = i13;
                            i20 = Math.min(i22, i15) - Math.max(i21, i14);
                        }
                        i19 += i10;
                        eVar2 = eVar;
                        a1Var2 = a1Var;
                        F = view3;
                        r5 = i12;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i13 = i18;
                        i12 = r5;
                    }
                    view5 = view2;
                    i18 = i13;
                    i19 += i10;
                    eVar2 = eVar;
                    a1Var2 = a1Var;
                    F = view3;
                    r5 = i12;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // u4.o0
    public void U(tf.e eVar, a1 a1Var, View view, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            T(view, dVar);
            return;
        }
        r rVar = (r) layoutParams;
        int t12 = t1(rVar.b(), eVar, a1Var);
        if (this.o == 0) {
            int i3 = rVar.e;
            int i10 = rVar.f;
            int i11 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i10, t12, 1, i11 > 1 && i10 == i11, false));
            return;
        }
        int i12 = rVar.e;
        int i13 = rVar.f;
        int i14 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, i14 > 1 && i13 == i14, false));
    }

    @Override // u4.o0
    public void V(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // u4.o0
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // u4.o0
    public void X(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // u4.o0
    public void Y(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // u4.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z0(tf.e eVar, a1 a1Var, z zVar, m2.j jVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int s6;
        int i16;
        View c2;
        int i17 = this.q.i();
        boolean z10 = i17 != 1073741824;
        int i18 = r() > 0 ? this.K[this.J] : 0;
        if (z10) {
            A1();
        }
        boolean z11 = zVar.e == 1;
        int i19 = this.J;
        if (!z11) {
            i19 = u1(zVar.d, eVar, a1Var) + v1(zVar.d, eVar, a1Var);
        }
        int i20 = 0;
        while (i20 < this.J && zVar.b(a1Var) && i19 > 0) {
            int i21 = zVar.d;
            int v12 = v1(i21, eVar, a1Var);
            if (v12 > this.J) {
                throw new IllegalArgumentException(a1.g.o(this.J, " spans.", com.google.android.recaptcha.internal.a.m("Item at position ", i21, " requires ", v12, " spans but GridLayoutManager has only ")));
            }
            i19 -= v12;
            if (i19 < 0 || (c2 = zVar.c(eVar)) == null) {
                break;
            }
            this.L[i20] = c2;
            i20++;
        }
        p1(i20, eVar, a1Var, z11);
        float f10 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i20; i23++) {
            View view = this.L[i23];
            if (zVar.k == null) {
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
            float c10 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
            if (c10 > f10) {
                f10 = c10;
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
                r rVar = (r) view3.getLayoutParams();
                Rect rect = rVar.b;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
                int s12 = s1(rVar.e, rVar.f);
                if (this.o == 1) {
                    i16 = o0.s(false, s12, TLObject.FLAG_30, i27, ((ViewGroup.MarginLayoutParams) rVar).width);
                    s6 = View.MeasureSpec.makeMeasureSpec(i22 - i26, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, TLObject.FLAG_30);
                    s6 = o0.s(false, s12, TLObject.FLAG_30, i26, ((ViewGroup.MarginLayoutParams) rVar).height);
                    i16 = makeMeasureSpec;
                }
                x1(i16, s6, view3, true);
            }
        }
        jVar.a = i22;
        if (this.o == 1) {
            if (zVar.f == -1) {
                i14 = zVar.b;
                i15 = i14 - i22;
            } else {
                i15 = zVar.b;
                i14 = i15 + i22;
            }
            i12 = i15;
            i13 = 0;
            i11 = 0;
        } else {
            if (zVar.f == -1) {
                i10 = zVar.b;
                i3 = i10 - i22;
            } else {
                i3 = zVar.b;
                i10 = i3 + i22;
            }
            i11 = i3;
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        for (int i28 = 0; i28 < i20; i28++) {
            View view4 = this.L[i28];
            r rVar2 = (r) view4.getLayoutParams();
            if (this.o != 1) {
                int F = F() + this.K[rVar2.e];
                i12 = F;
                i14 = this.q.c(view4) + F;
            } else if (Y0()) {
                i13 = D() + this.K[this.J - rVar2.e];
                i11 = i13 - this.q.c(view4);
            } else {
                int D = D() + this.K[rVar2.e];
                i11 = D;
                i13 = this.q.c(view4) + D;
            }
            o0.O(view4, i11, i12, i13, i14);
            if (rVar2.a.j() || rVar2.a.m()) {
                jVar.c = true;
            }
            jVar.d = view4.hasFocusable() | jVar.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // u4.o0
    public void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // u4.b0
    public final void a1(tf.e eVar, a1 a1Var, k2.o0 o0Var, int i3) {
        A1();
        if (a1Var.b() > 0 && !a1Var.g) {
            boolean z10 = i3 == 1;
            int u12 = u1(o0Var.b, eVar, a1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = o0Var.b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    o0Var.b = i11;
                    u12 = u1(i11, eVar, a1Var);
                }
            } else {
                int b10 = a1Var.b() - 1;
                int i12 = o0Var.b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, eVar, a1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                o0Var.b = i12;
            }
        }
        r1();
    }

    @Override // u4.b0, u4.o0
    public void b0(tf.e eVar, a1 a1Var) {
        boolean z10 = a1Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r5 = r();
            for (int i3 = 0; i3 < r5; i3++) {
                r rVar = (r) q(i3).getLayoutParams();
                int b10 = rVar.b();
                sparseIntArray2.put(b10, rVar.f);
                sparseIntArray.put(b10, rVar.e);
            }
        }
        super.b0(eVar, a1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // u4.b0, u4.o0
    public final void c0(a1 a1Var) {
        super.c0(a1Var);
        this.I = false;
    }

    @Override // u4.o0
    public final boolean f(p0 p0Var) {
        return p0Var instanceof r;
    }

    @Override // u4.b0, u4.o0
    public final int h(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // u4.b0, u4.o0
    public final int i(a1 a1Var) {
        return D0(a1Var);
    }

    @Override // u4.b0, u4.o0
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    @Override // u4.b0, u4.o0
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    @Override // u4.b0
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // u4.b0, u4.o0
    public final int m0(int i3, tf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.m0(i3, eVar, a1Var);
    }

    @Override // u4.b0, u4.o0
    public final p0 n() {
        return this.o == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // u4.o0
    public final p0 o(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.e = -1;
        rVar.f = 0;
        return rVar;
    }

    @Override // u4.b0, u4.o0
    public int o0(int i3, tf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.o0(i3, eVar, a1Var);
    }

    @Override // u4.o0
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

    public final void p1(int i3, tf.e eVar, a1 a1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i12 = 1;
            i11 = i3;
            i10 = 0;
        } else {
            i10 = i3 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            r rVar = (r) view.getLayoutParams();
            int v12 = v1(((p0) view.getLayoutParams()).b(), eVar, a1Var);
            rVar.f = v12;
            rVar.e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i3, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i3 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i3;
        int i14 = i10 % i3;
        int i15 = 0;
        for (int i16 = 1; i16 <= i3; i16++) {
            i12 += i14;
            if (i12 <= 0 || i3 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i3;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override // u4.o0
    public final void r0(Rect rect, int i3, int i10) {
        int g7;
        int g10;
        if (this.K == null) {
            super.r0(rect, i3, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = r0.i0.a;
            g10 = o0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g7 = o0.g(i3, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = r0.i0.a;
            g7 = o0.g(i3, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g10 = o0.g(i10, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g7, g10);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i3, int i10) {
        if (this.o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i10 + i3] - iArr[i3];
        }
        int[] iArr2 = this.K;
        int i11 = this.J;
        return iArr2[i11 - i3] - iArr2[(i11 - i3) - i10];
    }

    public final int t1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.g) {
            return this.O.g(i3, this.J);
        }
        int b10 = eVar.b(i3);
        if (b10 != -1) {
            return this.O.g(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // u4.o0
    public int u(tf.e eVar, a1 a1Var) {
        if (this.o == 1) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    public final int u1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.g) {
            return this.O.h(i3, this.J);
        }
        int i10 = this.N.get(i3, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = eVar.b(i3);
        if (b10 != -1) {
            return this.O.h(b10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    public final int v1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.g) {
            return this.O.i(i3);
        }
        int i10 = this.M.get(i3, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = eVar.b(i3);
        if (b10 != -1) {
            return this.O.i(b10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 1;
    }

    public void w1(int i3, View view, boolean z10) {
        int i10;
        int i11;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int s12 = s1(rVar.e, rVar.f);
        if (this.o == 1) {
            i11 = o0.s(false, s12, i3, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = o0.s(true, this.q.k(), this.l, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int s6 = o0.s(false, s12, i3, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
            int s10 = o0.s(true, this.q.k(), this.k, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = s6;
            i11 = s10;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i3, int i10, View view, boolean z10) {
        p0 p0Var = (p0) view.getLayoutParams();
        if (z10 ? (this.g && o0.N(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) p0Var).width) && o0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true : u0(view, i3, i10, p0Var)) {
            view.measure(i3, i10);
        }
    }

    @Override // u4.b0, u4.o0
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i3) {
        if (i3 == this.J) {
            return;
        }
        this.I = true;
        if (i3 < 1) {
            throw new IllegalArgumentException(p1.i(i3, "Span count should be at least 1. Provided "));
        }
        this.J = i3;
        this.O.j();
        l0();
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public s(int i3, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new qt(1);
        this.P = new Rect();
        y1(i3);
    }
}
