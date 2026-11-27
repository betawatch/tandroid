// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class wka extends FrameLayout implements bl7 {
    public final g79 E;
    public d79 F;
    public RecyclerView G;
    public RecyclerView H;
    public vic I;
    public View J;
    public View K;
    public View L;
    public View M;
    public tka N;
    public ska O;
    public uka P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean a;
    public float a0;
    public int b;
    public float b0;
    public int c;
    public float c0;
    public long d;
    public boolean d0;
    public long e;
    public boolean e0;
    public long f;
    public boolean f0;
    public boolean g0;
    public long h;
    public boolean h0;
    public boolean i0;
    public final i09 j0;
    public final e98 k0;
    public final es1 l0;
    public int n;
    public int r;
    public final RectF s;
    public final d26 w;
    public final l09 x;
    public final int[] y;

    public wka(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new l09((byte) 3);
        this.y = new int[2];
        this.E = new g79();
        this.j0 = new i09((Object) this, (byte) 13);
        this.k0 = new e98(this, (byte) 22);
        this.l0 = new es1(this, (byte) 5);
        setClipChildren(false);
        setClipToPadding(false);
        d26 d26Var = new d26(this, context);
        this.w = d26Var;
        addView(d26Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder l = c00.l(str, ",scrollState=");
            l.append(recyclerView.getScrollState());
            l.append(",up=");
            l.append(recyclerView.canScrollVertically(-1));
            l.append(",down=");
            l.append(recyclerView.canScrollVertically(1));
            l.append(",layout=");
            l.append(recyclerView.e0());
            l.append(",pendingUpdates=");
            l.append(recyclerView.b0());
            l.append(",animating=");
            l.append(recyclerView.d0());
            l.append(",paddingTop=");
            l.append(recyclerView.getPaddingTop());
            l.append(",count=");
            l.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = l.toString();
        }
        return str.concat(")");
    }

    public static float j(RecyclerView recyclerView) {
        q79 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        if (layoutManager.m(0) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - q79.y(r0)) + ((ViewGroup.MarginLayoutParams) ((r79) r0.getLayoutParams())).topMargin);
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            int i2 = this.T;
            if (i == (-i2) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i2;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z) {
        if (this.f0 == z) {
            return;
        }
        this.f0 = z;
        f(z ? "TABS_PINNED" : "TABS_UNPINNED", this.F, 0, 0, true);
        this.N.t(z);
    }

    public static void w(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (recyclerView.getPaddingTop() == i && recyclerView.getPaddingBottom() == i2) {
            return;
        }
        q79 layoutManager = recyclerView.getLayoutManager();
        int i4 = 0;
        View q = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q == null) {
            i3 = -1;
        } else {
            layoutManager.getClass();
            int b = ((r79) q.getLayoutParams()).b();
            int y = (q79.y(q) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((r79) q.getLayoutParams())).topMargin;
            i3 = b;
            i4 = y;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), i2);
        if (i3 == -1 || !(layoutManager instanceof x46)) {
            return;
        }
        ((x46) layoutManager).g1(i3, i4);
    }

    public final void A(int i, int i2) {
        this.T = Math.max(0, i);
        this.U = Math.max(0, i2);
        requestLayout();
        C();
    }

    public final void B() {
        f("STOP_SCROLLING", null, 0, 0, true);
        d79 d79Var = this.F;
        if (d79Var != null) {
            d79Var.E0();
        }
        vic vicVar = this.I;
        if (vicVar == null || this.P == null) {
            return;
        }
        for (View view : vicVar.getViewPages()) {
            if (view != null) {
                this.P.h(view).E0();
            }
        }
    }

    public final void C() {
        g79 g79Var = this.E;
        if (this.d0 || this.N == null) {
            return;
        }
        this.d0 = true;
        try {
            float f = this.b0;
            D();
            d79 d79Var = this.F;
            if (d79Var != null && !this.i0) {
                setBleed(d79Var);
                d79 d79Var2 = this.F;
                int i = this.T;
                this.N.getClass();
                w(d79Var2, i, this.U);
            }
            vic vicVar = this.I;
            if (vicVar != null && this.P != null && this.K != null) {
                for (View view : vicVar.getViewPages()) {
                    if (view != null && view.getParent() == this.I) {
                        b(this.P.h(view));
                    }
                }
                t();
                float p = p();
                boolean isInfinite = Float.isInfinite(p);
                d26 d26Var = this.w;
                if (isInfinite) {
                    this.b0 = Float.POSITIVE_INFINITY;
                    this.J.setVisibility(4);
                    this.K.setVisibility(4);
                    d79 d79Var3 = this.F;
                    if (d79Var3 != null) {
                        d79Var3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f != this.b0) {
                        d26Var.invalidate();
                    }
                } else {
                    float f2 = this.V;
                    if (p > f2 + 0.5f) {
                        f2 = p;
                    }
                    this.a0 = f2;
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (this.e0) {
                        this.b0 = g79Var.b();
                        this.c0 = Math.max(g79Var.d, g79Var.b());
                        x(this.L, Math.max(0.0f, g79Var.a - g79Var.d) + (g79Var.f ? 0.0f : g79Var.b() - g79Var.b));
                        x(this.M, Math.max(g79Var.d, g79Var.b()) - g79Var.d);
                    } else {
                        RecyclerView recyclerView = this.G;
                        float max = this.a0 - Math.max(0.0f, Math.min(recyclerView == null ? 0.0f : this.P.b(recyclerView), Math.max(0.0f, this.V - this.W)));
                        this.b0 = max;
                        this.c0 = Math.max(this.V, max);
                        x(this.I.getCurrentView(), Math.max(0.0f, this.a0 - this.V));
                    }
                    this.F.setTranslationY(this.b0 - p);
                    this.K.setTranslationY(this.c0 - r0.getTop());
                    setTabsPinned(this.c0 <= this.V + 0.5f);
                    this.N.getClass();
                    if (f != this.b0) {
                        d26Var.invalidate();
                    }
                }
            }
        } finally {
            this.d0 = false;
        }
    }

    public final void D() {
        tka tkaVar = this.N;
        if (tkaVar == null) {
            return;
        }
        float e0 = tkaVar.e0();
        this.N.getClass();
        if (Float.isNaN(e0) || Float.isInfinite(e0) || e0 < 0.0f) {
            lq5.j("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
            return;
        }
        if (this.g0 && (e0 != this.V || 0.0f != this.W)) {
            float p = p();
            if (!Float.isInfinite(p)) {
                float f = this.V;
                boolean z = p <= 0.5f + f || p < e0;
                if (z && e0 != f) {
                    this.h0 = true;
                }
                if (this.e0) {
                    g79 g79Var = this.E;
                    float f2 = g79Var.e;
                    if (z) {
                        p = e0;
                    }
                    uka ukaVar = this.P;
                    g79Var.a(p, ukaVar.b(ukaVar.h(this.L)), e0, 0.0f);
                    g79Var.e = Math.max(0.0f, Math.min(1.0f, f2));
                    this.w.invalidate();
                }
            }
        }
        this.V = e0;
        this.W = 0.0f;
        this.g0 = true;
    }

    public final void a() {
        ska skaVar;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F == null || (skaVar = this.O) == null || this.N == null) {
            return;
        }
        int c = skaVar.c();
        q79 layoutManager = this.F.getLayoutManager();
        if (c == -1 || !(layoutManager instanceof x46)) {
            return;
        }
        D();
        ((x46) layoutManager).g1(c, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
        this.h0 = true;
        requestLayout();
    }

    public final void b(RecyclerView recyclerView) {
        int height;
        if (this.N == null || recyclerView == null) {
            return;
        }
        D();
        View view = this.K;
        if (view == null) {
            height = 0;
        } else {
            int height2 = view.getHeight();
            View view2 = this.K;
            height = height2 > 0 ? view2.getHeight() : view2.getLayoutParams().height;
        }
        setBleed(recyclerView);
        w(recyclerView, Math.max(0, height) + Math.round(this.V) + this.T, this.N.j0() + this.U);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        vic vicVar = this.I;
        return (vicVar == null || vicVar.getCurrentView() == null || Float.isInfinite(p()) || this.c0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r5.E.f == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, vka vkaVar) {
        if (this.I != null && this.P != null && this.J.getVisibility() == 0 && this.I.getVisibility() == 0) {
            for (View view : this.I.getViewPages()) {
                if (view != null && view.getParent() == this.I && view.getVisibility() == 0) {
                    vkaVar.c(canvas, rectF, this.P.h(view));
                }
            }
        }
        d79 d79Var = this.F;
        if (d79Var == null || d79Var.getVisibility() != 0) {
            return;
        }
        float x = this.e0 ? this.M.getX() : 0.0f;
        if (x == 0.0f) {
            vkaVar.c(canvas, rectF, this.F);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x, 0.0f);
            vkaVar.c(canvas, rectF2, this.F);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wka wkaVar;
        if (motionEvent.getActionMasked() == 0) {
            if (this.a) {
                this.n++;
                this.e = 0L;
                wkaVar = this;
                wkaVar.f("TOUCH_DOWN", null, 0, 0, true);
            } else {
                wkaVar = this;
            }
            wkaVar.B();
        } else {
            wkaVar = this;
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                wkaVar.f(motionEvent.getActionMasked() == 1 ? "TOUCH_UP" : "TOUCH_CANCEL", null, 0, 0, true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view, int i, int i2) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            f(str.concat(i2 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i, i, true);
        }
    }

    public final void f(String str, View view, int i, int i2, boolean z) {
        uka ukaVar;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            vic vicVar = this.I;
            int i3 = 0;
            View view2 = null;
            View view3 = vicVar == null ? null : vicVar.getViewPages()[0];
            vic vicVar2 = this.I;
            View view4 = vicVar2 == null ? null : vicVar2.getViewPages()[1];
            StringBuilder sb = new StringBuilder("root=");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" gesture=");
            sb.append(this.n);
            sb.append(" transition=");
            sb.append(this.r);
            sb.append(" event=");
            sb.append(str);
            sb.append(" target=");
            sb.append(h(view));
            sb.append(" dy=");
            sb.append(i);
            sb.append(" used=");
            sb.append(i2);
            sb.append(" transitioning=");
            sb.append(this.e0);
            sb.append(" progress=");
            sb.append(this.E.e);
            sb.append(" ageMs=");
            sb.append(this.e0 ? uptimeMillis - this.f : 0L);
            sb.append(" unchangedMs=");
            sb.append(this.e0 ? uptimeMillis - this.h : 0L);
            sb.append(" depth=");
            sb.append(this.R);
            sb.append(" updating=");
            sb.append(this.d0);
            sb.append(" callback=");
            sb.append(h(this.Q));
            sb.append(" common=");
            sb.append(h(this.F));
            sb.append(" active=");
            sb.append(h(this.G));
            sb.append(" current=");
            sb.append(h(view3));
            sb.append(" other=");
            sb.append(h(view4));
            sb.append(" source=");
            sb.append(h(this.L));
            sb.append(" incoming=");
            sb.append(h(this.M));
            sb.append(" boundary=");
            sb.append(p());
            sb.append(" pin=");
            sb.append(this.V);
            sb.append(" tail=");
            sb.append(this.b0);
            sb.append(" alignPending=");
            sb.append(this.h0);
            ska skaVar = this.O;
            int i4 = -1;
            int c = skaVar == null ? -1 : skaVar.c();
            d79 d79Var = this.F;
            q79 layoutManager = d79Var == null ? null : d79Var.getLayoutManager();
            if (layoutManager != null && c != -1) {
                view2 = layoutManager.m(c);
            }
            StringBuilder m = uh9.m(c, " row=", " anchor=");
            m.append(h(view2));
            m.append(" anchorTop=");
            m.append(view2 == null ? 0 : view2.getTop());
            m.append(" anchorHeight=");
            m.append(view2 == null ? 0 : view2.getHeight());
            m.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i3 = q79.y(view2);
            }
            m.append(i3);
            m.append(" adapterPosition=");
            if (view2 != null) {
                this.F.getClass();
                i4 = RecyclerView.S(view2);
            }
            m.append(i4);
            m.append(" pageOffset=");
            RecyclerView recyclerView = this.G;
            m.append((recyclerView == null || (ukaVar = this.P) == null) ? 0.0f : ukaVar.b(recyclerView));
            m.append(" tabsTop=");
            m.append(this.c0);
            m.append(" draw=");
            m.append(this.c);
            sb.append(m.toString());
            Log.d("SiblingScroll", sb.toString());
        }
    }

    public final void g(String str) {
        f(str, this.I, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.U;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.b();
    }

    public float getTabsTop() {
        return this.c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        wka wkaVar;
        if (this.a) {
            wkaVar = this;
            wkaVar.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            wkaVar = this;
        }
        wkaVar.e0 = false;
        wkaVar.M = null;
        wkaVar.L = null;
        wkaVar.w.invalidate();
    }

    @Override // al7
    public final void k(int i, View view) {
        f(i == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        l09 l09Var = this.x;
        if (i == 1) {
            l09Var.c = 0;
        } else {
            l09Var.b = 0;
        }
    }

    @Override // bl7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d79 d79Var;
        if (this.R != 0 || (view != (d79Var = this.F) && view != this.G)) {
            f("POST_IGNORED", view, i4, 0, false);
            return;
        }
        if (this.e0) {
            e("POST_BLOCKED", view, i4, i5);
            iArr[1] = iArr[1] + i4;
            return;
        }
        this.Q = view;
        try {
            i09 i09Var = this.j0;
            int i6 = 0;
            boolean z = view == d79Var;
            if (z && i2 > 0 && i4 > 0) {
                wka wkaVar = (wka) i09Var.b;
                ska skaVar = wkaVar.O;
                if (skaVar != null && skaVar.c() != -1) {
                    i6 = wkaVar.u(wkaVar.G, i4);
                }
            } else if (!z && i4 < 0) {
                wka wkaVar2 = (wka) i09Var.b;
                i6 = wkaVar2.u(wkaVar2.F, i4);
            }
            iArr[1] = iArr[1] + i6;
            f("POST", view, i4, i6, false);
        } finally {
            this.Q = null;
            C();
        }
    }

    @Override // al7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i, i2, i3, i4, i5, iArr);
    }

    @Override // al7
    public final boolean n(View view, View view2, int i, int i2) {
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        if (this.R == 0 && z2 && (view2 == this.F || view2 == this.G)) {
            z = true;
        }
        if (this.a) {
            f((z ? "NESTED_START" : "NESTED_REJECT") + "_axes=" + i + "_type=" + i2, view2, 0, 0, true);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.E.f == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(float f, float f2) {
        float f3;
        if (this.e0) {
            f3 = this.M.getX();
        }
        f3 = 0.0f;
        return f2 >= 0.0f && f2 < this.b0 && f >= Math.max(0.0f, f3) && f < Math.min((float) getWidth(), f3 + ((float) getWidth()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.l0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        B();
        getViewTreeObserver().removeOnPreDrawListener(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        r(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        q(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return n(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    public final float p() {
        View m;
        d79 d79Var = this.F;
        if (d79Var == null || this.O == null || d79Var.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        q79 layoutManager = this.F.getLayoutManager();
        int c = this.O.c();
        if (c == -1 || (m = layoutManager.m(c)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (q79.y(m) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((r79) m.getLayoutParams())).topMargin;
    }

    @Override // al7
    public final void q(View view, View view2, int i, int i2) {
        l09 l09Var = this.x;
        if (i2 == 1) {
            l09Var.c = i;
        } else {
            l09Var.b = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r9 <= 0.5f) goto L21;
     */
    @Override // al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        d79 d79Var;
        if (this.R != 0 || (view != (d79Var = this.F) && view != this.G)) {
            f("PRE_IGNORED", view, i2, 0, false);
            return;
        }
        if (this.e0) {
            e("PRE_BLOCKED", view, i2, i3);
            iArr[1] = iArr[1] + i2;
            return;
        }
        this.Q = view;
        try {
            i09 i09Var = this.j0;
            int i4 = 0;
            if (view == d79Var) {
                if (i2 >= 0) {
                    wka wkaVar = (wka) i09Var.b;
                    float p = wkaVar.p();
                    if (!Float.isInfinite(p)) {
                        p = Math.max(0.0f, p - wkaVar.V);
                    }
                }
                wka wkaVar2 = (wka) i09Var.b;
                ska skaVar = wkaVar2.O;
                if (skaVar != null && skaVar.c() != -1) {
                    i4 = wkaVar2.u(wkaVar2.G, i2);
                }
            } else if (i2 > 0) {
                wka wkaVar3 = (wka) i09Var.b;
                float p2 = wkaVar3.p();
                if (!Float.isInfinite(p2)) {
                    p2 = Math.max(0.0f, p2 - wkaVar3.V);
                }
                int min = Float.isInfinite(p2) ? i2 : Math.min(i2, Math.max(0, Math.round(p2)));
                wka wkaVar4 = (wka) i09Var.b;
                i4 = wkaVar4.u(wkaVar4.F, min);
            }
            iArr[1] = iArr[1] + i4;
            f("PRE", view, i2, i4, false);
        } finally {
            this.Q = null;
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        vic vicVar;
        wka wkaVar;
        View view;
        if (this.d0 || (vicVar = this.I) == null || this.P == null || this.N == null) {
            return;
        }
        View[] viewPages = vicVar.getViewPages();
        boolean z = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        vic vicVar2 = this.I;
        if (vicVar2 instanceof h79) {
            h79 h79Var = (h79) vicVar2;
            if (view2 != null && view3 != null && view2 == h79Var.b0 && view3 == h79Var.c0 && !h79Var.I && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z = true;
            }
        }
        if (this.e0 && z) {
            i("drag_aborted");
        }
        if (this.e0 && (view3 == null || ((view2 != (view = this.L) && view2 != this.M) || (view3 != view && view3 != this.M)))) {
            i("page_slots_changed");
        }
        t();
        boolean z2 = this.e0;
        d26 d26Var = this.w;
        g79 g79Var = this.E;
        if (!z2 && !z && view2 != null && view3 != null) {
            float p = p();
            if (!Float.isInfinite(p)) {
                D();
                B();
                this.L = view2;
                this.M = view3;
                float f = this.V;
                if (p <= 0.5f + f) {
                    p = f;
                }
                uka ukaVar = this.P;
                g79Var.a(p, ukaVar.b(ukaVar.h(view2)), this.V, this.W);
                this.e0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    wkaVar = this;
                    wkaVar.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    wkaVar = this;
                }
                d26Var.invalidate();
                if (wkaVar.e0) {
                    float max = Math.max(1, wkaVar.L.getWidth());
                    float f2 = g79Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(wkaVar.L.getTranslationX()) / max));
                    g79Var.e = max2;
                    if (f2 != max2) {
                        d26Var.invalidate();
                        if (wkaVar.a) {
                            wkaVar.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                wkaVar.C();
            }
        }
        wkaVar = this;
        if (wkaVar.e0) {
        }
        wkaVar.C();
    }

    public void setCommonInsetsManagedExternally(boolean z) {
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        C();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z) {
        this.a = z;
        if (z) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(tka tkaVar) {
        this.N = tkaVar;
        requestLayout();
        C();
    }

    public final void t() {
        vic vicVar = this.I;
        RecyclerView h = (vicVar == null || this.P == null || vicVar.getCurrentView() == null) ? null : this.P.h(this.I.getCurrentView());
        if (h != this.G) {
            f("ACTIVE_CHANGE", h, 0, 0, true);
            RecyclerView recyclerView = this.G;
            e98 e98Var = this.k0;
            if (recyclerView != null) {
                recyclerView.E0();
                ArrayList arrayList = this.G.x0;
                if (arrayList != null) {
                    arrayList.remove(e98Var);
                }
            }
            this.G = h;
            if (h != null) {
                h.j(e98Var);
            }
        }
    }

    public final int u(RecyclerView recyclerView, int i) {
        if (recyclerView == null || i == 0) {
            if (i != 0) {
                f("TRANSFER_NO_TARGET", recyclerView, i, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.Q) {
            f("TRANSFER_REENTRY", recyclerView, i, 0, true);
            grb.i("Reentrant scrollBy on nested source");
            return 0;
        }
        RecyclerView recyclerView2 = this.H;
        int i2 = this.S;
        this.H = recyclerView;
        this.S = 0;
        this.R++;
        try {
            recyclerView.scrollBy(0, i);
            int i3 = this.S;
            int max = i > 0 ? Math.max(0, Math.min(i, i3)) : Math.min(0, Math.max(i, i3));
            f(i3 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i, max, false);
            return max;
        } finally {
            this.R--;
            this.H = recyclerView2;
            this.S = i2;
        }
    }

    public final void v(d79 d79Var, ska skaVar) {
        d79 d79Var2 = this.F;
        d26 d26Var = this.w;
        e98 e98Var = this.k0;
        if (d79Var2 != null) {
            d79Var2.E0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(e98Var);
            }
            d26Var.removeView(this.F);
        }
        this.F = d79Var;
        this.O = skaVar;
        d26Var.addView(d79Var, new FrameLayout.LayoutParams(-1, -1));
        d79Var.j(e98Var);
        d79Var.setNestedScrollingEnabled(true);
        C();
    }

    public final void x(View view, float f) {
        if (view == null) {
            return;
        }
        this.P.h(view).setTranslationY((f + this.V) - Math.round(r1));
    }

    public final void y(View view, vic vicVar, uka ukaVar) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = vicVar;
        this.P = ukaVar;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        C();
    }

    public final void z(View view) {
        View view2 = this.K;
        if (view2 != null) {
            removeView(view2);
        }
        this.K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        C();
    }
}
