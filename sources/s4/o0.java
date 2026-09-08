package s4;

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
import java.util.ArrayList;
import java.util.WeakHashMap;
import ji.u4;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class o0 {
    public m2.t a;
    public RecyclerView b;
    public final o0.a c;
    public final o0.a d;
    public y0 e;
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
        u4 u4Var = new u4(this, 24);
        l.d dVar = new l.d(this, 26);
        this.c = new o0.a(u4Var);
        this.d = new o0.a(dVar);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((p0) view.getLayoutParams()).b();
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(boolean z10, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 < 0) {
                if (i13 == -1) {
                    if (i11 != Integer.MIN_VALUE) {
                        if (i11 != 0) {
                        }
                    }
                    i13 = max;
                }
                i11 = 0;
                i13 = 0;
            }
            i11 = TLObject.FLAG_30;
        } else {
            if (i13 < 0) {
                if (i13 != -1) {
                    if (i13 == -2) {
                        if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                            i13 = max;
                            i11 = TLObject.FLAG_31;
                        } else {
                            i13 = max;
                            i11 = 0;
                        }
                    }
                    i11 = 0;
                    i13 = 0;
                }
                i13 = max;
            }
            i11 = TLObject.FLAG_30;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public static int v(View view) {
        return view.getBottom() + ((p0) view.getLayoutParams()).b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.P0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).b.left;
    }

    public static void x0(View view) {
        c1 U = RecyclerView.U(view);
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
            return adapter.h();
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

    public int I(pf.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.w == null || !e()) {
            return 1;
        }
        return this.b.w.h();
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
            RectF rectF = this.b.v;
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
        c1 U = RecyclerView.U(view);
        U.a(128);
        this.b.f.K(U);
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect W = this.b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s11 = s(e(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s10, s11, p0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, pf.e eVar, z0 z0Var);

    public void S(pf.e eVar, z0 z0Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, z0Var), u(eVar, z0Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        c1 U = RecyclerView.U(view);
        if (U == null || U.j()) {
            return;
        }
        m2.t tVar = this.a;
        if (((ArrayList) tVar.b).contains(U.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        U(recyclerView.b, recyclerView.t0, view, cVar);
    }

    public void U(pf.e eVar, z0 z0Var, View view, s0.c cVar) {
        cVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        c1 U = RecyclerView.U(view);
        if (z10 || U.j()) {
            a0.f fVar = (a0.f) this.b.f.b;
            i1 i1Var = (i1) fVar.get(U);
            if (i1Var == null) {
                i1Var = i1.a();
                fVar.put(U, i1Var);
            }
            i1Var.a |= 1;
        } else {
            this.b.f.H(U);
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (U.s() || U.k()) {
            if (U.k()) {
                U.p.k(U);
            } else {
                U.l &= -33;
            }
            this.a.o(view, i10, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            m2.t tVar = this.a;
            e6.n nVar = (e6.n) tVar.d;
            int indexOfChild = ((RecyclerView) ((l.d) tVar.c).b).indexOfChild(view);
            int A = (indexOfChild == -1 || nVar.D(indexOfChild)) ? -1 : indexOfChild - nVar.A(indexOfChild);
            if (i10 == -1) {
                i10 = this.a.y();
            }
            if (A == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
            }
            if (A != i10) {
                o0 o0Var = this.b.x;
                View q6 = o0Var.q(A);
                if (q6 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + A + o0Var.b.toString());
                }
                o0Var.q(A);
                o0Var.a.u(A);
                p0 p0Var2 = (p0) q6.getLayoutParams();
                c1 U2 = RecyclerView.U(q6);
                if (U2.j()) {
                    a0.f fVar2 = (a0.f) o0Var.b.f.b;
                    i1 i1Var2 = (i1) fVar2.get(U2);
                    if (i1Var2 == null) {
                        i1Var2 = i1.a();
                        fVar2.put(U2, i1Var2);
                    }
                    i1Var2.a = 1 | i1Var2.a;
                } else {
                    o0Var.b.f.H(U2);
                }
                o0Var.a.o(q6, i10, p0Var2, U2.j());
            }
        } else {
            this.a.m(view, i10, false);
            p0Var.c = true;
            y0 y0Var = this.e;
            if (y0Var != null && y0Var.e) {
                y0Var.b.getClass();
                if (RecyclerView.S(view) == y0Var.a) {
                    y0Var.f = view;
                }
            }
        }
        if (p0Var.d) {
            U.a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(pf.e eVar, z0 z0Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(z0 z0Var);

    public abstract boolean d();

    public void d0(pf.e eVar, z0 z0Var, int i10, int i11) {
        this.b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract b0 e0();

    public boolean f(p0 p0Var) {
        return p0Var != null;
    }

    public final void g0(pf.e eVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, eVar);
            }
        }
    }

    public abstract int h(z0 z0Var);

    public final void h0(pf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.c;
        ArrayList arrayList2 = (ArrayList) eVar.c;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((c1) arrayList2.get(i10)).a;
            c1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                m0 m0Var = this.b.c0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                c1 U2 = RecyclerView.U(view);
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

    public abstract int i(z0 z0Var);

    public final void i0(int i10, pf.e eVar) {
        View q6 = q(i10);
        if (RecyclerView.U(q6).r()) {
            return;
        }
        j0(i10);
        eVar.g(q6);
    }

    public abstract int j(z0 z0Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            m2.t tVar = this.a;
            int C = tVar.C(i10);
            l.d dVar = (l.d) tVar.c;
            View childAt = ((RecyclerView) dVar.b).getChildAt(C);
            if (childAt == null) {
                return;
            }
            if (((e6.n) tVar.d).F(C)) {
                tVar.R(childAt);
            }
            dVar.C(C);
        }
    }

    public abstract int k(z0 z0Var);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.bottom - r9) > r3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int[] t10 = t(view, rect);
        int i10 = t10[0];
        int i11 = t10[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D = D();
                int F = F();
                int E = this.m - E();
                int C = this.n - C();
                Rect rect2 = this.b.r;
                w(focusedChild, rect2);
                if (rect2.left - i10 < E) {
                    if (rect2.right - i10 > D) {
                        if (rect2.top - i11 < C) {
                        }
                    }
                }
            }
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (z10) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.v0(i10, i11, null);
            return true;
        }
        return false;
    }

    public abstract int l(z0 z0Var);

    public final void l0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, pf.e eVar, z0 z0Var);

    public abstract p0 n();

    public abstract void n0(int i10);

    public p0 o(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public abstract int o0(int i10, pf.e eVar, z0 z0Var);

    public p0 p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p0 ? new p0((p0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p0((ViewGroup.MarginLayoutParams) layoutParams) : new p0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), TLObject.FLAG_30));
    }

    public final View q(int i10) {
        m2.t tVar = this.a;
        if (tVar != null) {
            return tVar.x(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.k = mode;
        if (mode == 0 && !RecyclerView.Q0) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.Q0) {
            return;
        }
        this.n = 0;
    }

    public final int r() {
        m2.t tVar = this.a;
        if (tVar != null) {
            return tVar.y();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        this.b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.b.q(i10, i11);
            return;
        }
        int i12 = TLObject.FLAG_31;
        int i13 = TLObject.FLAG_31;
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i16 = 0; i16 < r10; i16++) {
            View q6 = q(i16);
            Rect rect = this.b.r;
            w(q6, rect);
            int i17 = rect.left;
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i15) {
                i15 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i13) {
                i13 = i20;
            }
        }
        this.b.r.set(i14, i15, i12, i13);
        r0(this.b.r, i10, i11);
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
        int i10 = left - D;
        int min = Math.min(0, i10);
        int i11 = top - F;
        int min2 = Math.min(0, i11);
        int i12 = width - E;
        int max = Math.max(0, i12);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i10, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i12);
        }
        if (min2 == 0) {
            min2 = Math.min(i11, max2);
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

    public int u(pf.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.w == null || !d()) {
            return 1;
        }
        return this.b.w.h();
    }

    public final boolean u0(View view, int i10, int i11, p0 p0Var) {
        return (!view.isLayoutRequested() && this.g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) p0Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, z0 z0Var, int i10);

    public final void w0(y0 y0Var) {
        y0 y0Var2 = this.e;
        if (y0Var2 != null && y0Var != y0Var2 && y0Var2.e) {
            y0Var2.h();
        }
        this.e = y0Var;
        RecyclerView recyclerView = this.b;
        y0Var.getClass();
        recyclerView.N0 = true;
        b1 b1Var = recyclerView.q0;
        RecyclerView recyclerView2 = b1Var.h;
        if (recyclerView2.N0) {
            recyclerView2.removeCallbacks(b1Var);
            b1Var.c.abortAnimation();
        }
        if (y0Var.h) {
            Log.w("RecyclerView", "An instance of " + y0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + y0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        y0Var.b = recyclerView;
        y0Var.c = this;
        int i10 = y0Var.a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.t0.a = i10;
        y0Var.e = true;
        y0Var.d = true;
        y0Var.f = recyclerView.x.m(i10);
        y0Var.e();
        y0Var.b.q0.a();
        y0Var.h = true;
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

    public void V(RecyclerView recyclerView, int i10, int i11) {
    }

    public void X(RecyclerView recyclerView, int i10, int i11) {
    }

    public void Y(RecyclerView recyclerView, int i10, int i11) {
    }
}
