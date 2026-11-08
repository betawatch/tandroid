package v4;

import a8.ua;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class n0 {
    public hy0 a;
    public RecyclerView b;
    public final sg.i0 c;
    public final sg.i0 d;
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

    public n0() {
        vy vyVar = new vy(this, 26);
        rt rtVar = new rt(this, 23);
        this.c = new sg.i0(vyVar);
        this.d = new sg.i0(rtVar);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((o0) view.getLayoutParams()).b();
    }

    public static boolean N(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i7 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i7;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i7;
        }
        return true;
    }

    public static void O(View view, int i7, int i10, int i11, int i12) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect = o0Var.b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) o0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int g(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(boolean z9, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, i7 - i11);
        if (z9) {
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
        return view.getBottom() + ((o0) view.getLayoutParams()).b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.Q0;
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect2 = o0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((o0) view.getLayoutParams()).b.left;
    }

    public static void x0(View view) {
        d1 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((o0) view.getLayoutParams()).b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((o0) view.getLayoutParams()).b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        g0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
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

    public int I(v0 v0Var, a1 a1Var) {
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
        Rect rect2 = ((o0) view.getLayoutParams()).b;
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
        this.b.f.T0(U);
    }

    public void P(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect W = this.b.W(view);
        int i7 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s5 = s(d(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin + i7, ((ViewGroup.MarginLayoutParams) o0Var).width);
        int s9 = s(e(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) o0Var).height);
        if (u0(view, s5, s9, o0Var)) {
            view.measure(s5, s9);
        }
    }

    public abstract View R(View view, int i7, v0 v0Var, a1 a1Var);

    public void S(v0 v0Var, a1 a1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            dVar.a(TLObject.FLAG_13);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            dVar.a(TLObject.FLAG_12);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(v0Var, a1Var), u(v0Var, a1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        d1 U = RecyclerView.U(view);
        if (U == null || U.j()) {
            return;
        }
        hy0 hy0Var = this.a;
        if (((ArrayList) hy0Var.d).contains(U.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        U(recyclerView.b, recyclerView.u0, view, dVar);
    }

    public void U(v0 v0Var, a1 a1Var, View view, s0.d dVar) {
        dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void a(int i7, View view, boolean z9) {
        d1 U = RecyclerView.U(view);
        if (z9 || U.j()) {
            a0.f fVar = (a0.f) this.b.f.a;
            j1 j1Var = (j1) fVar.get(U);
            if (j1Var == null) {
                j1Var = j1.a();
                fVar.put(U, j1Var);
            }
            j1Var.a |= 1;
        } else {
            this.b.f.S0(U);
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (U.s() || U.k()) {
            if (U.k()) {
                U.p.k(U);
            } else {
                U.l &= -33;
            }
            this.a.l(view, i7, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            hy0 hy0Var = this.a;
            ua uaVar = (ua) hy0Var.c;
            int indexOfChild = ((RecyclerView) ((vy) hy0Var.b).b).indexOfChild(view);
            int B = (indexOfChild == -1 || uaVar.E(indexOfChild)) ? -1 : indexOfChild - uaVar.B(indexOfChild);
            if (i7 == -1) {
                i7 = this.a.v();
            }
            if (B == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
            }
            if (B != i7) {
                n0 n0Var = this.b.y;
                View q10 = n0Var.q(B);
                if (q10 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + B + n0Var.b.toString());
                }
                n0Var.q(B);
                n0Var.a.p(B);
                o0 o0Var2 = (o0) q10.getLayoutParams();
                d1 U2 = RecyclerView.U(q10);
                if (U2.j()) {
                    a0.f fVar2 = (a0.f) n0Var.b.f.a;
                    j1 j1Var2 = (j1) fVar2.get(U2);
                    if (j1Var2 == null) {
                        j1Var2 = j1.a();
                        fVar2.put(U2, j1Var2);
                    }
                    j1Var2.a = 1 | j1Var2.a;
                } else {
                    n0Var.b.f.S0(U2);
                }
                n0Var.a.l(q10, i7, o0Var2, U2.j());
            }
        } else {
            this.a.k(i7, view, false);
            o0Var.c = true;
            z0 z0Var = this.e;
            if (z0Var != null && z0Var.e) {
                z0Var.b.getClass();
                if (RecyclerView.S(view) == z0Var.a) {
                    z0Var.f = view;
                }
            }
        }
        if (o0Var.d) {
            U.a.invalidate();
            o0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(v0 v0Var, a1 a1Var);

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

    public void d0(v0 v0Var, a1 a1Var, int i7, int i10) {
        this.b.q(i7, i10);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(o0 o0Var) {
        return o0Var != null;
    }

    public final void g0(v0 v0Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, v0Var);
            }
        }
    }

    public abstract int h(a1 a1Var);

    public final void h0(v0 v0Var) {
        ArrayList arrayList = (ArrayList) v0Var.c;
        ArrayList arrayList2 = (ArrayList) v0Var.c;
        int size = arrayList.size();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            View view = ((d1) arrayList2.get(i7)).a;
            d1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                l0 l0Var = this.b.c0;
                if (l0Var != null) {
                    l0Var.f(U);
                }
                U.q(true);
                d1 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                v0Var.h(U2);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = (ArrayList) v0Var.d;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int i(a1 a1Var);

    public final void i0(int i7, v0 v0Var) {
        View q10 = q(i7);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i7);
        v0Var.g(q10);
    }

    public abstract int j(a1 a1Var);

    public final void j0(int i7) {
        if (q(i7) != null) {
            hy0 hy0Var = this.a;
            int z9 = hy0Var.z(i7);
            vy vyVar = (vy) hy0Var.b;
            View childAt = ((RecyclerView) vyVar.b).getChildAt(z9);
            if (childAt == null) {
                return;
            }
            if (((ua) hy0Var.c).G(z9)) {
                hy0Var.M(childAt);
            }
            vyVar.Q(z9);
        }
    }

    public abstract int k(a1 a1Var);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.bottom - r9) > r3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        int[] t6 = t(view, rect);
        int i7 = t6[0];
        int i10 = t6[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D = D();
                int F = F();
                int E = this.m - E();
                int C = this.n - C();
                Rect rect2 = this.b.r;
                w(focusedChild, rect2);
                if (rect2.left - i7 < E) {
                    if (rect2.right - i7 > D) {
                        if (rect2.top - i10 < C) {
                        }
                    }
                }
            }
            return false;
        }
        if (i7 != 0 || i10 != 0) {
            if (z9) {
                recyclerView.scrollBy(i7, i10);
                return true;
            }
            recyclerView.w0(i7, i10, null);
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

    public abstract View m(int i7);

    public abstract int m0(int i7, v0 v0Var, a1 a1Var);

    public abstract o0 n();

    public abstract void n0(int i7);

    public o0 o(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    public abstract int o0(int i7, v0 v0Var, a1 a1Var);

    public o0 p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o0 ? new o0((o0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o0((ViewGroup.MarginLayoutParams) layoutParams) : new o0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), TLObject.FLAG_30));
    }

    public final View q(int i7) {
        hy0 hy0Var = this.a;
        if (hy0Var != null) {
            return hy0Var.u(i7);
        }
        return null;
    }

    public final void q0(int i7, int i10) {
        this.m = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.Q0;
        }
        this.n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.Q0;
        }
    }

    public final int r() {
        hy0 hy0Var = this.a;
        if (hy0Var != null) {
            return hy0Var.v();
        }
        return 0;
    }

    public void r0(Rect rect, int i7, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        this.b.setMeasuredDimension(g(i7, E, recyclerView.getMinimumWidth()), g(i10, C, this.b.getMinimumHeight()));
    }

    public final void s0(int i7, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.b.q(i7, i10);
            return;
        }
        int i11 = TLObject.FLAG_31;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r10; i15++) {
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
        r0(this.b.r, i7, i10);
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
        int i7 = left - D;
        int min = Math.min(0, i7);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.i0.a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i7, max);
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

    public int u(v0 v0Var, a1 a1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.x == null || !d()) {
            return 1;
        }
        return this.b.x.b();
    }

    public final boolean u0(View view, int i7, int i10, o0 o0Var) {
        return (!view.isLayoutRequested() && this.g && N(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) o0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) o0Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, a1 a1Var, int i7);

    public final void w0(z0 z0Var) {
        z0 z0Var2 = this.e;
        if (z0Var2 != null && z0Var != z0Var2 && z0Var2.e) {
            z0Var2.h();
        }
        this.e = z0Var;
        RecyclerView recyclerView = this.b;
        z0Var.getClass();
        recyclerView.O0 = true;
        c1 c1Var = recyclerView.r0;
        RecyclerView recyclerView2 = c1Var.h;
        if (recyclerView2.O0) {
            recyclerView2.removeCallbacks(c1Var);
            c1Var.c.abortAnimation();
        }
        if (z0Var.h) {
            Log.w("RecyclerView", "An instance of " + z0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + z0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z0Var.b = recyclerView;
        z0Var.c = this;
        int i7 = z0Var.a;
        if (i7 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.u0.a = i7;
        z0Var.e = true;
        z0Var.d = true;
        z0Var.f = recyclerView.y.m(i7);
        z0Var.e();
        z0Var.b.r0.a();
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

    public void V(RecyclerView recyclerView, int i7, int i10) {
    }

    public void X(RecyclerView recyclerView, int i7, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i7, int i10) {
    }
}
