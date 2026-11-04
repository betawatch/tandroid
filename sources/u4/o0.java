package u4;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class o0 {
    public p7.d a;
    public RecyclerView b;
    public final mi.h0 c;
    public final mi.h0 d;
    public z0 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public o0() {
        nh nhVar = new nh(this, 23);
        i9 i9Var = new i9(this, 23);
        this.c = new mi.h0(nhVar);
        this.d = new mi.h0(i9Var);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((p0) view.getLayoutParams()).b();
    }

    public static boolean N(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i3 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    public static void O(View view, int i3, int i10, int i11, int i12) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int g(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(boolean z10, int i3, int i10, int i11, int i12) {
        int max = Math.max(0, i3 - i11);
        if (z10) {
            if (i12 < 0) {
                if (i12 == -1) {
                    if (i10 != Integer.MIN_VALUE) {
                        if (i10 != 0) {
                        }
                    }
                    i12 = max;
                }
                i10 = 0;
                i12 = 0;
            }
            i10 = 1073741824;
        } else {
            if (i12 < 0) {
                if (i12 != -1) {
                    if (i12 == -2) {
                        if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                            i12 = max;
                            i10 = Integer.MIN_VALUE;
                        } else {
                            i12 = max;
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    i12 = 0;
                }
                i12 = max;
            }
            i10 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i12, i10);
    }

    public static int v(View view) {
        return view.getBottom() + ((p0) view.getLayoutParams()).b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.R0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).b.left;
    }

    public static void x0(View view) {
        d1 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((p0) view.getLayoutParams()).b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((p0) view.getLayoutParams()).b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        h0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.b();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(tf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.x == null || !e()) {
            return 1;
        }
        return this.b.x.b();
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.b;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.b.C());
        }
        d1 U = RecyclerView.U(view);
        U.a(128);
        this.b.f.W0(U);
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect W = this.b.W(view);
        int i3 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s6 = s(d(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i3, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s10 = s(e(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s6, s10, p0Var)) {
            view.measure(s6, s10);
        }
    }

    public abstract View R(View view, int i3, tf.e eVar, a1 a1Var);

    public void S(tf.e eVar, a1 a1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            dVar.a(TLObject.FLAG_13);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            dVar.a(TLObject.FLAG_12);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, a1Var), u(eVar, a1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        d1 U = RecyclerView.U(view);
        if (U == null || U.j()) {
            return;
        }
        p7.d dVar2 = this.a;
        if (((ArrayList) dVar2.c).contains(U.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        U(recyclerView.b, recyclerView.v0, view, dVar);
    }

    public void U(tf.e eVar, a1 a1Var, View view, s0.d dVar) {
        dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void a(int i3, View view, boolean z10) {
        d1 U = RecyclerView.U(view);
        if (z10 || U.j()) {
            a0.f fVar = (a0.f) this.b.f.b;
            j1 j1Var = (j1) fVar.get(U);
            if (j1Var == null) {
                j1Var = j1.a();
                fVar.put(U, j1Var);
            }
            j1Var.a |= 1;
        } else {
            this.b.f.V0(U);
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (U.s() || U.k()) {
            if (U.k()) {
                U.p.k(U);
            } else {
                U.l &= -33;
            }
            this.a.i(view, i3, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            p7.d dVar = this.a;
            ig igVar = (ig) dVar.d;
            int indexOfChild = ((RecyclerView) ((nh) dVar.b).b).indexOfChild(view);
            int y9 = (indexOfChild == -1 || igVar.E(indexOfChild)) ? -1 : indexOfChild - igVar.y(indexOfChild);
            if (i3 == -1) {
                i3 = this.a.o();
            }
            if (y9 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
            }
            if (y9 != i3) {
                o0 o0Var = this.b.y;
                View q10 = o0Var.q(y9);
                if (q10 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + y9 + o0Var.b.toString());
                }
                o0Var.q(y9);
                o0Var.a.k(y9);
                p0 p0Var2 = (p0) q10.getLayoutParams();
                d1 U2 = RecyclerView.U(q10);
                if (U2.j()) {
                    a0.f fVar2 = (a0.f) o0Var.b.f.b;
                    j1 j1Var2 = (j1) fVar2.get(U2);
                    if (j1Var2 == null) {
                        j1Var2 = j1.a();
                        fVar2.put(U2, j1Var2);
                    }
                    j1Var2.a = 1 | j1Var2.a;
                } else {
                    o0Var.b.f.V0(U2);
                }
                o0Var.a.i(q10, i3, p0Var2, U2.j());
            }
        } else {
            this.a.h(i3, view, false);
            p0Var.c = true;
            z0 z0Var = this.e;
            if (z0Var != null && z0Var.e) {
                z0Var.b.getClass();
                if (RecyclerView.S(view) == z0Var.a) {
                    z0Var.f = view;
                }
            }
        }
        if (p0Var.d) {
            U.a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(tf.e eVar, a1 a1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(a1 a1Var);

    public abstract boolean d();

    public void d0(tf.e eVar, a1 a1Var, int i3, int i10) {
        this.b.q(i3, i10);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(p0 p0Var) {
        return p0Var != null;
    }

    public final void g0(tf.e eVar) {
        for (int r5 = r() - 1; r5 >= 0; r5--) {
            if (!RecyclerView.U(q(r5)).r()) {
                i0(r5, eVar);
            }
        }
    }

    public abstract int h(a1 a1Var);

    public final void h0(tf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.c;
        ArrayList arrayList2 = (ArrayList) eVar.c;
        int size = arrayList.size();
        for (int i3 = size - 1; i3 >= 0; i3--) {
            View view = ((d1) arrayList2.get(i3)).a;
            d1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                m0 m0Var = this.b.d0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                d1 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                eVar.h(U2);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = (ArrayList) eVar.d;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int i(a1 a1Var);

    public final void i0(int i3, tf.e eVar) {
        View q10 = q(i3);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i3);
        eVar.g(q10);
    }

    public abstract int j(a1 a1Var);

    public final void j0(int i3) {
        if (q(i3) != null) {
            p7.d dVar = this.a;
            int s6 = dVar.s(i3);
            nh nhVar = (nh) dVar.b;
            View childAt = ((RecyclerView) nhVar.b).getChildAt(s6);
            if (childAt == null) {
                return;
            }
            if (((ig) dVar.d).G(s6)) {
                dVar.H(childAt);
            }
            nhVar.I(s6);
        }
    }

    public abstract int k(a1 a1Var);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.bottom - r9) > r3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int[] t10 = t(view, rect);
        int i3 = t10[0];
        int i10 = t10[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D = D();
                int F = F();
                int E = this.m - E();
                int C = this.n - C();
                Rect rect2 = this.b.r;
                w(focusedChild, rect2);
                if (rect2.left - i3 < E) {
                    if (rect2.right - i3 > D) {
                        if (rect2.top - i10 < C) {
                        }
                    }
                }
            }
            return false;
        }
        if (i3 != 0 || i10 != 0) {
            if (z10) {
                recyclerView.scrollBy(i3, i10);
                return true;
            }
            recyclerView.w0(i3, i10, null);
            return true;
        }
        return false;
    }

    public abstract int l(a1 a1Var);

    public final void l0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i3);

    public abstract int m0(int i3, tf.e eVar, a1 a1Var);

    public abstract p0 n();

    public abstract void n0(int i3);

    public p0 o(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public abstract int o0(int i3, tf.e eVar, a1 a1Var);

    public p0 p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p0 ? new p0((p0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p0((ViewGroup.MarginLayoutParams) layoutParams) : new p0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), TLObject.FLAG_30));
    }

    public final View q(int i3) {
        p7.d dVar = this.a;
        if (dVar != null) {
            return dVar.n(i3);
        }
        return null;
    }

    public final void q0(int i3, int i10) {
        this.m = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.R0;
        }
        this.n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.R0;
        }
    }

    public final int r() {
        p7.d dVar = this.a;
        if (dVar != null) {
            return dVar.o();
        }
        return 0;
    }

    public void r0(Rect rect, int i3, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        this.b.setMeasuredDimension(g(i3, E, recyclerView.getMinimumWidth()), g(i10, C, this.b.getMinimumHeight()));
    }

    public final void s0(int i3, int i10) {
        int r5 = r();
        if (r5 == 0) {
            this.b.q(i3, i10);
            return;
        }
        int i11 = TLObject.FLAG_31;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r5; i15++) {
            View q10 = q(i15);
            Rect rect = this.b.r;
            w(q10, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.b.r.set(i14, i12, i11, i13);
        r0(this.b.r, i3, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.m - E();
        int C = this.n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - D;
        int min = Math.min(0, i3);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i11);
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = TLObject.FLAG_30;
        this.l = TLObject.FLAG_30;
    }

    public int u(tf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.x == null || !d()) {
            return 1;
        }
        return this.b.x.b();
    }

    public final boolean u0(View view, int i3, int i10, p0 p0Var) {
        return (!view.isLayoutRequested() && this.g && N(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, a1 a1Var, int i3);

    public final void w0(z0 z0Var) {
        z0 z0Var2 = this.e;
        if (z0Var2 != null && z0Var != z0Var2 && z0Var2.e) {
            z0Var2.h();
        }
        this.e = z0Var;
        RecyclerView recyclerView = this.b;
        z0Var.getClass();
        recyclerView.P0 = true;
        c1 c1Var = recyclerView.s0;
        RecyclerView recyclerView2 = c1Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(c1Var);
            c1Var.c.abortAnimation();
        }
        if (z0Var.h) {
            Log.w("RecyclerView", "An instance of " + z0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + z0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z0Var.b = recyclerView;
        z0Var.c = this;
        int i3 = z0Var.a;
        if (i3 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.v0.a = i3;
        z0Var.e = true;
        z0Var.d = true;
        z0Var.f = recyclerView.y.m(i3);
        z0Var.e();
        z0Var.b.s0.a();
        z0Var.h = true;
    }

    public abstract boolean y0();

    public void Q() {
    }

    public void Z() {
    }

    public void f0() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public void V(RecyclerView recyclerView, int i3, int i10) {
    }

    public void X(RecyclerView recyclerView, int i3, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i3, int i10) {
    }
}
