// default package

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class r35 extends t26 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public yo O;
    public final Rect P;

    public r35(int i) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }

    @Override // d49
    public int H(wg2 wg2Var, p49 p49Var) {
        if (!this.o) {
            return this.J;
        }
        if (p49Var.b() < 1) {
            return 0;
        }
        return s1(p49Var.b() - 1, wg2Var, p49Var) + 1;
    }

    @Override // t26
    public final View P0(wg2 wg2Var, p49 p49Var, int i, int i2, int i3) {
        F0();
        int j = this.q.j();
        int f = this.q.f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = d49.G(q);
            if (G >= 0 && G < i3 && t1(G, wg2Var, p49Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r13 == (r2 > r8)) goto L73;
     */
    @Override // t26, d49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Q(View view, int i, wg2 wg2Var, p49 p49Var) {
        View F;
        int r;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        wg2 wg2Var2 = wg2Var;
        p49 p49Var2 = p49Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (F = recyclerView.F(view)) == null || ((ArrayList) this.a.d).contains(F)) {
            F = null;
        }
        if (F != null) {
            q35 q35Var = (q35) F.getLayoutParams();
            int i6 = q35Var.e;
            int i7 = q35Var.f + i6;
            if (super.Q(view, i, wg2Var, p49Var) != null) {
                if ((E0(i) == 1) != this.v) {
                    i3 = r() - 1;
                    r = -1;
                    i2 = -1;
                } else {
                    r = r();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.o && X0();
                int s1 = s1(i3, wg2Var2, p49Var2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == r) {
                        break;
                    }
                    int s12 = s1(i11, wg2Var2, p49Var2);
                    View q = q(i11);
                    if (q == F) {
                        break;
                    }
                    if (q.hasFocusable() && s12 != s1) {
                        if (view4 != null) {
                            break;
                        }
                        view3 = F;
                        i5 = i10;
                        i4 = r;
                    } else {
                        q35 q35Var2 = (q35) q.getLayoutParams();
                        int i13 = q35Var2.e;
                        view3 = F;
                        int i14 = q35Var2.f + i13;
                        if (q.hasFocusable() && i13 == i6 && i14 == i7) {
                            return q;
                        }
                        if (!(q.hasFocusable() && view4 == null) && (q.hasFocusable() || view2 != null)) {
                            i4 = r;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (q.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!(this.c.H(q) && this.d.H(q))) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = r;
                        }
                        boolean hasFocusable = q.hasFocusable();
                        int i15 = q35Var2.e;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = q;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = q;
                        }
                        i11 += i2;
                        wg2Var2 = wg2Var;
                        p49Var2 = p49Var;
                        F = view3;
                        r = i4;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    wg2Var2 = wg2Var;
                    p49Var2 = p49Var;
                    F = view3;
                    r = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // d49
    public void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof q35)) {
            T(view, u4Var);
            return;
        }
        q35 q35Var = (q35) layoutParams;
        int s1 = s1(q35Var.b(), wg2Var, p49Var);
        boolean z = this.o;
        int i = q35Var.e;
        int i2 = q35Var.f;
        if (z) {
            int i3 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(s1, 1, i, i2, i3 > 1 && i2 == i3, false));
        } else {
            int i4 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, s1, 1, i4 > 1 && i2 == i4, false));
        }
    }

    @Override // d49
    public void U(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // d49
    public void V(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // d49
    public void W(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // d49
    public void X(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        return;
     */
    @Override // t26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Y0(wg2 wg2Var, p49 p49Var, r26 r26Var, q26 q26Var) {
        int i;
        int i2;
        int i3;
        int s;
        int i4;
        View c;
        int i5 = this.q.i();
        int i6 = 0;
        boolean z = i5 != 1073741824;
        int i7 = r() > 0 ? this.K[this.J] : 0;
        if (z) {
            y1();
        }
        boolean z2 = r26Var.e == 1;
        int i8 = this.J;
        if (!z2) {
            i8 = t1(r26Var.d, wg2Var, p49Var) + u1(r26Var.d, wg2Var, p49Var);
        }
        int i9 = 0;
        while (i9 < this.J && r26Var.b(p49Var) && i8 > 0) {
            int i10 = r26Var.d;
            int u1 = u1(i10, wg2Var, p49Var);
            if (u1 > this.J) {
                w26.j(de9.l(ir2.p("Item at position ", i10, " requires ", u1, " spans but GridLayoutManager has only "), this.J, " spans."));
                return;
            }
            i8 -= u1;
            if (i8 < 0 || (c = r26Var.c(wg2Var)) == null) {
                break;
            }
            this.L[i9] = c;
            i9++;
        }
        o1(i9, wg2Var, p49Var, z2);
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            View view = this.L[i12];
            if (r26Var.k == null) {
                if (z2) {
                    a(-1, view, false);
                } else {
                    a(0, view, false);
                }
            } else if (z2) {
                a(-1, view, true);
            } else {
                a(0, view, true);
            }
            c(view, this.P);
            v1(i5, view, false);
            int b = this.q.b(view);
            if (b > i11) {
                i11 = b;
            }
            float c2 = (this.q.c(view) * 1.0f) / ((q35) view.getLayoutParams()).f;
            if (c2 > f) {
                f = c2;
            }
        }
        if (z) {
            this.K = p1(this.J, Math.max(Math.round(f * this.J), i7), this.K);
            i11 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                View view2 = this.L[i13];
                v1(TLObject.FLAG_30, view2, true);
                int b2 = this.q.b(view2);
                if (b2 > i11) {
                    i11 = b2;
                }
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            View view3 = this.L[i14];
            if (this.q.b(view3) != i11) {
                q35 q35Var = (q35) view3.getLayoutParams();
                Rect rect = q35Var.b;
                int i15 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q35Var).topMargin + ((ViewGroup.MarginLayoutParams) q35Var).bottomMargin;
                int i16 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q35Var).leftMargin + ((ViewGroup.MarginLayoutParams) q35Var).rightMargin;
                int r1 = r1(q35Var.e, q35Var.f);
                if (this.o) {
                    i4 = d49.s(false, r1, TLObject.FLAG_30, i16, ((ViewGroup.MarginLayoutParams) q35Var).width);
                    s = View.MeasureSpec.makeMeasureSpec(i11 - i15, TLObject.FLAG_30);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, TLObject.FLAG_30);
                    s = d49.s(false, r1, TLObject.FLAG_30, i15, ((ViewGroup.MarginLayoutParams) q35Var).height);
                    i4 = makeMeasureSpec;
                }
                w1(i4, s, view3, true);
            }
        }
        q26Var.a = i11;
        boolean z3 = this.o;
        int i17 = r26Var.f;
        int i18 = r26Var.b;
        if (!z3) {
            if (i17 == -1) {
                i = i18 - i11;
                i2 = i18;
                i18 = 0;
            } else {
                int i19 = i11 + i18;
                i = i18;
                i18 = 0;
                i2 = i19;
            }
            i3 = i18;
        } else if (i17 == -1) {
            int i20 = i18 - i11;
            i3 = i18;
            i2 = 0;
            i18 = i20;
            i = 0;
        } else {
            i3 = i11 + i18;
            i = 0;
            i2 = 0;
        }
        while (true) {
            View[] viewArr = this.L;
            if (i6 >= i9) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view4 = viewArr[i6];
            q35 q35Var2 = (q35) view4.getLayoutParams();
            if (!this.o) {
                i18 = E() + this.K[q35Var2.e];
                i3 = this.q.c(view4) + i18;
            } else if (X0()) {
                int C = C() + this.K[this.J - q35Var2.e];
                i2 = C;
                i = C - this.q.c(view4);
            } else {
                i = C() + this.K[q35Var2.e];
                i2 = this.q.c(view4) + i;
            }
            d49.N(view4, i, i18, i2, i3);
            if (q35Var2.a.j() || q35Var2.a.m()) {
                q26Var.c = true;
            }
            q26Var.d |= view4.hasFocusable();
            i6++;
        }
    }

    @Override // d49
    public void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override // t26
    public final void Z0(wg2 wg2Var, p49 p49Var, p26 p26Var, int i) {
        y1();
        if (p49Var.b() > 0 && !p49Var.g) {
            boolean z = i == 1;
            int t1 = t1(p26Var.b, wg2Var, p49Var);
            if (z) {
                while (t1 > 0) {
                    int i2 = p26Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    p26Var.b = i3;
                    t1 = t1(i3, wg2Var, p49Var);
                }
            } else {
                int b = p49Var.b() - 1;
                int i4 = p26Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int t12 = t1(i5, wg2Var, p49Var);
                    if (t12 <= t1) {
                        break;
                    }
                    i4 = i5;
                    t1 = t12;
                }
                p26Var.b = i4;
            }
        }
        q1();
    }

    @Override // t26, d49
    public void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = p49Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z) {
            int r = r();
            for (int i = 0; i < r; i++) {
                q35 q35Var = (q35) q(i).getLayoutParams();
                int b = q35Var.b();
                sparseIntArray2.put(b, q35Var.f);
                sparseIntArray.put(b, q35Var.e);
            }
        }
        super.a0(wg2Var, p49Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // t26, d49
    public final void b0(p49 p49Var) {
        super.b0(p49Var);
        this.I = false;
    }

    @Override // d49
    public final boolean f(e49 e49Var) {
        return e49Var instanceof q35;
    }

    @Override // t26, d49
    public final int h(p49 p49Var) {
        return B0(p49Var);
    }

    @Override // t26, d49
    public final int i(p49 p49Var) {
        return C0(p49Var);
    }

    @Override // t26, d49
    public int k(p49 p49Var) {
        return B0(p49Var);
    }

    @Override // t26
    public final void k1(boolean z) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // t26, d49
    public int l(p49 p49Var) {
        return C0(p49Var);
    }

    @Override // t26, d49
    public final int l0(int i, wg2 wg2Var, p49 p49Var) {
        y1();
        q1();
        return super.l0(i, wg2Var, p49Var);
    }

    @Override // d49
    public final e49 n() {
        return !this.o ? new q35(-2, -1) : new q35(-1, -2);
    }

    @Override // t26, d49
    public int n0(int i, wg2 wg2Var, p49 p49Var) {
        y1();
        q1();
        return super.n0(i, wg2Var, p49Var);
    }

    @Override // d49
    public final e49 o(Context context, AttributeSet attributeSet) {
        q35 q35Var = new q35(context, attributeSet);
        q35Var.e = -1;
        q35Var.f = 0;
        return q35Var;
    }

    public final void o1(int i, wg2 wg2Var, p49 p49Var, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.L[i2];
            q35 q35Var = (q35) view.getLayoutParams();
            int u1 = u1(((e49) view.getLayoutParams()).b(), wg2Var, p49Var);
            q35Var.f = u1;
            q35Var.e = i5;
            i5 += u1;
            i2 += i4;
        }
    }

    @Override // d49
    public final e49 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            q35 q35Var = new q35((ViewGroup.MarginLayoutParams) layoutParams);
            q35Var.e = -1;
            q35Var.f = 0;
            return q35Var;
        }
        q35 q35Var2 = new q35(layoutParams);
        q35Var2.e = -1;
        q35Var2.f = 0;
        return q35Var2;
    }

    public int[] p1(int i, int i2, int[] iArr) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // d49
    public final void q0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.K == null) {
            super.q0(rect, i, i2);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.o) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = jdc.a;
            g2 = d49.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g = d49.g(i, iArr[iArr.length - 1] + D, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = jdc.a;
            g = d49.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g2 = d49.g(i2, iArr2[iArr2.length - 1] + B, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    public final void q1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int r1(int i, int i2) {
        if (!this.o || !X0()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public final int s1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.g(i, this.J);
        }
        int b = wg2Var.b(i);
        if (b != -1) {
            return this.O.g(b, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int t1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.h(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = wg2Var.b(i);
        if (b != -1) {
            return this.O.h(b, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // d49
    public int u(wg2 wg2Var, p49 p49Var) {
        if (this.o) {
            return this.J;
        }
        if (p49Var.b() < 1) {
            return 0;
        }
        return s1(p49Var.b() - 1, wg2Var, p49Var) + 1;
    }

    public final int u1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.i(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = wg2Var.b(i);
        if (b != -1) {
            return this.O.i(b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public void v1(int i, View view, boolean z) {
        int i2;
        int i3;
        q35 q35Var = (q35) view.getLayoutParams();
        Rect rect = q35Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q35Var).topMargin + ((ViewGroup.MarginLayoutParams) q35Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q35Var).leftMargin + ((ViewGroup.MarginLayoutParams) q35Var).rightMargin;
        int r1 = r1(q35Var.e, q35Var.f);
        if (this.o) {
            i3 = d49.s(false, r1, i, i5, ((ViewGroup.MarginLayoutParams) q35Var).width);
            i2 = d49.s(true, this.q.k(), this.l, i4, ((ViewGroup.MarginLayoutParams) q35Var).height);
        } else {
            int s = d49.s(false, r1, i, i4, ((ViewGroup.MarginLayoutParams) q35Var).height);
            int s2 = d49.s(true, this.q.k(), this.k, i5, ((ViewGroup.MarginLayoutParams) q35Var).width);
            i2 = s;
            i3 = s2;
        }
        w1(i3, i2, view, z);
    }

    public final void w1(int i, int i2, View view, boolean z) {
        e49 e49Var = (e49) view.getLayoutParams();
        if (z ? (this.g && d49.M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) e49Var).width) && d49.M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) e49Var).height)) ? false : true : t0(view, i, i2, e49Var)) {
            view.measure(i, i2);
        }
    }

    @Override // t26, d49
    public boolean x0() {
        return this.B == null && !this.I;
    }

    public final void x1(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i < 1) {
            w26.j(de9.k(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.J = i;
        this.O.j();
        k0();
    }

    public final void y1() {
        int B;
        int E;
        if (this.o) {
            B = this.m - D();
            E = C();
        } else {
            B = this.n - B();
            E = E();
        }
        int i = B - E;
        this.K = p1(this.J, i, this.K);
    }

    @Override // t26
    public final void z0(p49 p49Var, r26 r26Var, on onVar) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && r26Var.b(p49Var) && i > 0; i2++) {
            int i3 = r26Var.d;
            onVar.b(i3, Math.max(0, r26Var.g));
            i -= this.O.i(i3);
            r26Var.d += r26Var.e;
        }
    }

    public r35(int i, boolean z) {
        super(1, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }
}
