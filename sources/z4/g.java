package z4;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import bi.fb;
import bi.o5;
import bi.t9;
import fb.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.l2;
import r0.a0;
import r0.i0;
import rg.b0;
import s4.d1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class g extends ViewGroup {
    public static final int[] s0 = {R.attr.layout_gravity};
    public static final i t0 = new i(6);
    public static final l2 u0 = new l2(4);
    public static final i v0 = new i(7);
    public int E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public VelocityTracker W;
    public int a;
    public final int a0;
    public final ArrayList b;
    public final int b0;
    public final c c;
    public final int c0;
    public final Rect d;
    public final int d0;
    public a e;
    public boolean e0;
    public int f;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public int h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public ArrayList k0;
    public e l0;
    public a1.c m0;
    public Parcelable n;
    public int n0;
    public int o0;
    public ArrayList p0;
    public final b0 q0;
    public Scroller r;
    public int r0;
    public boolean s;
    public h1.a v;
    public int w;
    public Drawable x;
    public int y;

    public g(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new c();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.h0 = true;
        this.q0 = new b0(this, 11);
        this.r0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, u0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f7 = context2.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.a0 = (int) (400.0f * f7);
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f0 = new EdgeEffect(context2);
        this.g0 = new EdgeEffect(context2);
        this.c0 = (int) (25.0f * f7);
        this.d0 = (int) (2.0f * f7);
        this.O = (int) (f7 * 16.0f);
        i0.k(this, new d1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        a0.j(this, new o0.a(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
        }
    }

    public final c a(int i10, int i11) {
        c cVar = new c();
        cVar.b = i10;
        cVar.a = this.e.e(this, i10);
        this.e.getClass();
        cVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(cVar);
            return cVar;
        }
        arrayList.add(i11, cVar);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c k10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z10 = dVar.a | (view.getClass().getAnnotation(b.class) != null);
        dVar.a = z10;
        if (!this.I) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final void b(e eVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10) {
        View findNextFocus;
        boolean z10;
        int i11;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
            boolean z11 = true;
            z10 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i10 == 17) {
                    int i12 = j(findNextFocus, rect).left;
                    int i13 = j(findFocus, rect).left;
                    if (findFocus == null || i12 < i13) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i14 = this.f;
                        if (i14 > 0) {
                            x(i14 - 1, true);
                            z10 = z11;
                        }
                        z11 = false;
                        z10 = z11;
                    }
                } else if (i10 == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z10 = requestFocus;
            } else if (i10 != 17 || i10 == 1) {
                i11 = this.f;
                if (i11 > 0) {
                    x(i11 - 1, true);
                    z10 = z11;
                }
                z11 = false;
                z10 = z11;
            } else if (i10 == 66 || i10 == 2) {
                z10 = p();
            }
            if (z10) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return z10;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        boolean z112 = true;
        z10 = false;
        if (findNextFocus == null) {
        }
        if (i10 != 17) {
        }
        i11 = this.f;
        if (i11 > 0) {
        }
        z112 = false;
        z10 = z112;
        if (z10) {
        }
        return z10;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.F)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.G));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!q(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = i0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z10 = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = c(1);
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i10 = this.f;
                        if (i10 > 0) {
                            x(i10 - 1, true);
                            z10 = true;
                        }
                    } else {
                        z10 = c(17);
                    }
                    if (!z10) {
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.b() > 1)) {
            if (!this.f0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.F * width);
                this.f0.setSize(height, width);
                z10 = this.f0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.g0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.g0.setSize(height2, width2);
                z10 |= this.g0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f0.finish();
            this.g0.finish();
        }
        if (z10) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.x;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z10) {
        boolean z11 = this.r0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.K = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.c) {
                cVar.c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            b0 b0Var = this.q0;
            if (!z10) {
                b0Var.run();
            } else {
                WeakHashMap weakHashMap = i0.a;
                postOnAnimation(b0Var);
            }
        }
    }

    public final void f() {
        int b10 = this.e.b();
        this.a = b10;
        ArrayList arrayList = this.b;
        boolean z10 = arrayList.size() < (this.L * 2) + 1 && arrayList.size() < b10;
        int i10 = this.f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < arrayList.size()) {
            c cVar = (c) arrayList.get(i11);
            int c10 = this.e.c(cVar.a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z11) {
                        this.e.getClass();
                        z11 = true;
                    }
                    this.e.a(this, cVar.a);
                    int i12 = this.f;
                    if (i12 == cVar.b) {
                        i10 = Math.max(0, Math.min(i12, b10 - 1));
                    }
                } else {
                    int i13 = cVar.b;
                    if (i13 != c10) {
                        if (i13 == this.f) {
                            i10 = c10;
                        }
                        cVar.b = c10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.e.getClass();
        }
        Collections.sort(arrayList, t0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                d dVar = (d) getChildAt(i14).getLayoutParams();
                if (!dVar.a) {
                    dVar.c = 0.0f;
                }
            }
            y(i10, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f7, int i12) {
        if (Math.abs(i12) <= this.c0 || Math.abs(i11) <= this.a0) {
            i10 += (int) (f7 + (i10 >= this.f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).b, Math.min(i10, ((c) i2.g.h(1, arrayList)).b));
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.o0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((d) ((View) this.p0.get(i11)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.w;
    }

    public final void h(int i10) {
        e eVar = this.l0;
        if (eVar != null) {
            eVar.b(i10);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.k0.get(i11);
                if (eVar2 != null) {
                    eVar2.b(i10);
                }
            }
        }
    }

    public final void i() {
        if (!this.e0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.W;
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.b0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.V);
            this.K = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            c l4 = l();
            y(g(l4.b, xVelocity, ((scrollX / clientWidth) - l4.e) / l4.d, (int) (this.R - this.T)), xVelocity, true, true);
        }
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker2 = this.W;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.W = null;
        }
        this.e0 = false;
    }

    public final Rect j(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final c k(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (this.e.f(view, cVar.a)) {
                return cVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c l() {
        c cVar;
        int i10;
        int clientWidth = getClientWidth();
        float f7 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.w / clientWidth : 0.0f;
        c cVar2 = null;
        float f11 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (true) {
            ArrayList arrayList = this.b;
            if (i12 >= arrayList.size()) {
                break;
            }
            c cVar3 = (c) arrayList.get(i12);
            if (z10 || cVar3.b == (i10 = i11 + 1)) {
                cVar = cVar3;
            } else {
                float f12 = f7 + f11 + f10;
                c cVar4 = this.c;
                cVar4.e = f12;
                cVar4.b = i10;
                this.e.getClass();
                cVar4.d = 1.0f;
                i12--;
                cVar = cVar4;
            }
            f7 = cVar.e;
            float f13 = cVar.d + f7 + f10;
            if (!z10 && scrollX < f7) {
                break;
            }
            if (scrollX < f13 || i12 == arrayList.size() - 1) {
                break;
            }
            int i13 = cVar.b;
            float f14 = cVar.d;
            i12++;
            c cVar5 = cVar;
            i11 = i13;
            f11 = f14;
            cVar2 = cVar5;
            z10 = false;
        }
        return cVar;
    }

    public final c m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar.b == i10) {
                return cVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f7, int i10, int i11) {
        int max;
        int i12;
        int left;
        if (this.j0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a) {
                    int i14 = dVar.b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            i12 = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            i12 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i12;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = max;
                    i12 = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i12;
                }
            }
        }
        e eVar = this.l0;
        if (eVar != null) {
            eVar.a(f7, i10, i11);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                e eVar2 = (e) this.k0.get(i16);
                if (eVar2 != null) {
                    eVar2.a(f7, i10, i11);
                }
            }
        }
        if (this.m0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!((d) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    fb fbVar = (fb) this.m0.b;
                    t9 t9Var = (t9) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        t9Var.a(false);
                        AndroidUtilities.runOnUIThread(new a3.d(t9Var, 27), 16L);
                    } else {
                        if (!t9Var.d) {
                            t9Var.a(true);
                            if (fbVar.x0 != null) {
                                o5 o5Var = t9Var.a;
                                long j3 = t9Var.b;
                                ArrayList arrayList2 = t9Var.c;
                                o5Var.B1 = j3;
                                o5Var.z1 = arrayList2;
                                o5Var.o0(-1);
                            } else {
                                t9Var.a.U0(-1, t9Var.b);
                            }
                        }
                        t9Var.a.setOffset(left2);
                        childAt2.setCameraDistance(childAt2.getWidth() * 15);
                        childAt2.setPivotX(left2 < 0.0f ? childAt2.getWidth() : 0.0f);
                        childAt2.setPivotY(childAt2.getHeight() * 0.5f);
                        childAt2.setRotationY(left2 * 90.0f);
                    }
                }
            }
        }
        this.i0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getX(i10);
            this.V = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        ArrayList arrayList;
        int i11;
        super.onDraw(canvas);
        if (this.w <= 0 || this.x == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f10 = this.w / width;
        int i12 = 0;
        c cVar = (c) arrayList2.get(0);
        float f11 = cVar.e;
        int size = arrayList2.size();
        int i13 = cVar.b;
        int i14 = ((c) arrayList2.get(size - 1)).b;
        while (i13 < i14) {
            while (true) {
                i10 = cVar.b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                cVar = (c) arrayList2.get(i12);
            }
            if (i13 == i10) {
                float f12 = cVar.e;
                float f13 = cVar.d;
                f7 = (f12 + f13) * width;
                f11 = f12 + f13 + f10;
            } else {
                this.e.getClass();
                f7 = (f11 + 1.0f) * width;
                f11 = 1.0f + f10 + f11;
            }
            if (this.w + f7 > scrollX) {
                arrayList = arrayList2;
                i11 = scrollX;
                this.x.setBounds(Math.round(f7), this.y, Math.round(this.w + f7), this.E);
                this.x.draw(canvas);
            } else {
                arrayList = arrayList2;
                i11 = scrollX;
            }
            if (f7 > i11 + r3) {
                return;
            }
            i13++;
            arrayList2 = arrayList;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.M) {
                return true;
            }
            if (this.N) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.T = x10;
            this.R = x10;
            float y3 = motionEvent.getY();
            this.U = y3;
            this.S = y3;
            this.V = motionEvent.getPointerId(0);
            this.N = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.r0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.d0) {
                e(false);
                this.M = false;
            } else {
                this.r.abortAnimation();
                this.K = false;
                s();
                this.M = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.V;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f7 = x11 - this.R;
                float abs = Math.abs(f7);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.U);
                if (f7 != 0.0f) {
                    float f10 = this.R;
                    if ((f10 >= this.P || f7 <= 0.0f) && ((f10 <= getWidth() - this.P || f7 >= 0.0f) && d((int) f7, (int) x11, (int) y10, this, false))) {
                        this.R = x11;
                        this.S = y10;
                        this.N = true;
                        return false;
                    }
                }
                int i11 = this.Q;
                float f11 = i11;
                if (abs > f11 && abs * 0.5f > abs2) {
                    this.M = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f12 = this.T;
                    float f13 = i11;
                    this.R = f7 > 0.0f ? f12 + f13 : f12 - f13;
                    this.S = y10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f11) {
                    this.N = true;
                }
                if (this.M && r(x11)) {
                    WeakHashMap weakHashMap = i0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        c k10;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a) {
                    int i20 = dVar.b;
                    int i21 = i20 & 7;
                    int i22 = i20 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            i14 = paddingLeft;
                        } else {
                            max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 == 16) {
                            if (i22 == 48) {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                i15 = paddingTop;
                            } else {
                                max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, childAt.getMeasuredHeight() + paddingTop);
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, childAt.getMeasuredHeight() + paddingTop);
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                d dVar2 = (d) childAt2.getLayoutParams();
                if (!dVar2.a && (k10 = k(childAt2)) != null) {
                    float f7 = i26;
                    int i28 = ((int) (k10.e * f7)) + paddingLeft;
                    if (dVar2.d) {
                        dVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * dVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.y = paddingTop;
        this.E = i17 - paddingBottom;
        this.j0 = i18;
        if (this.h0) {
            z11 = false;
            w(this.f, 0, false, false);
        } else {
            z11 = false;
        }
        this.h0 = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r10 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r3 != (-1)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        d dVar;
        d dVar2;
        int i12;
        int i13;
        int i14;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.P = Math.min(measuredWidth / 10, this.O);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            boolean z10 = true;
            int i16 = TLObject.FLAG_30;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.a) {
                int i17 = dVar2.b;
                int i18 = i17 & 7;
                int i19 = i17 & 112;
                boolean z11 = i19 == 48 || i19 == 80;
                if (i18 != 3 && i18 != 5) {
                    z10 = false;
                }
                int i20 = TLObject.FLAG_31;
                if (z11) {
                    i20 = TLObject.FLAG_30;
                } else if (z10) {
                    i12 = TLObject.FLAG_30;
                    i13 = ((ViewGroup.LayoutParams) dVar2).width;
                    if (i13 != -2) {
                        i20 = TLObject.FLAG_30;
                    }
                    i13 = paddingLeft;
                    i14 = ((ViewGroup.LayoutParams) dVar2).height;
                    if (i14 != -2) {
                        i16 = i12;
                    }
                    i14 = measuredHeight;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                    if (!z11) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z10) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i12 = TLObject.FLAG_31;
                i13 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i13 != -2) {
                }
                i13 = paddingLeft;
                i14 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i14 != -2) {
                }
                i14 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                if (!z11) {
                }
            }
            i15++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        this.H = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.I = true;
        s();
        this.I = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.c), TLObject.FLAG_30), this.H);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c k10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a);
        if (this.e != null) {
            y(fVar.c, 0, false, true);
        } else {
            this.h = fVar.c;
            this.n = fVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.c = this.f;
        if (this.e != null) {
            fVar.d = null;
        }
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.w;
            u(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.e0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.r.abortAnimation();
                this.K = false;
                s();
                float x10 = motionEvent.getX();
                this.T = x10;
                this.R = x10;
                float y3 = motionEvent.getY();
                this.U = y3;
                this.S = y3;
                this.V = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.M) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.V);
                        if (findPointerIndex == -1) {
                            z10 = v();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.R);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.S);
                            int i10 = this.Q;
                            if (abs > i10 && abs > abs2) {
                                this.M = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f7 = this.T;
                                this.R = x11 - f7 > 0.0f ? f7 + i10 : f7 - i10;
                                this.S = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.M) {
                        z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.R = motionEvent.getX(actionIndex);
                        this.V = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        o(motionEvent);
                        this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                    }
                } else if (this.M) {
                    w(this.f, 0, true, false);
                    z10 = v();
                }
            } else if (this.M) {
                VelocityTracker velocityTracker = this.W;
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.b0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                this.K = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c l4 = l();
                float f10 = clientWidth;
                y(g(l4.b, xVelocity, ((scrollX / f10) - l4.e) / (l4.d + (this.w / f10)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)), xVelocity, true, true);
                z10 = v();
            }
            if (z10) {
                WeakHashMap weakHashMap = i0.a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.e;
        if (aVar == null || this.f >= aVar.b() - 1) {
            return false;
        }
        x(this.f + 1, true);
        return true;
    }

    public final boolean q(int i10) {
        if (this.b.size() == 0) {
            if (!this.h0) {
                this.i0 = false;
                n(0.0f, 0, 0);
                if (!this.i0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c l4 = l();
        int clientWidth = getClientWidth();
        int i11 = this.w;
        int i12 = clientWidth + i11;
        float f7 = clientWidth;
        int i13 = l4.b;
        float f10 = ((i10 / f7) - l4.e) / (l4.d + (i11 / f7));
        this.i0 = false;
        n(f10, i13, (int) (i12 * f10));
        if (this.i0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f7) {
        boolean z10;
        boolean z11;
        float f10 = this.R - f7;
        this.R = f7;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.F * clientWidth;
        float f12 = this.G * clientWidth;
        ArrayList arrayList = this.b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) i2.g.h(1, arrayList);
        if (cVar.b != 0) {
            f11 = cVar.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.b != this.e.b() - 1) {
            f12 = cVar2.e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.g0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.R = (scrollX - i10) + this.R;
        scrollTo(i10, getScrollY());
        q(i10);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.b;
        a aVar2 = this.e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.b = null;
            }
            this.e.getClass();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c cVar = (c) arrayList.get(i10);
                a aVar3 = this.e;
                int i11 = cVar.b;
                aVar3.a(this, cVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((d) getChildAt(i12).getLayoutParams()).a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = aVar;
        this.a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 3);
            }
            this.e.i(this.v);
            this.K = false;
            boolean z10 = this.h0;
            this.h0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
                return;
            }
            if (z10) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.K = false;
        y(i10, 0, !this.h0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.L) {
            this.L = i10;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.l0 = eVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.w;
        this.w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.r0 == i10) {
            return;
        }
        this.r0 = i10;
        if (this.m0 != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.n0 : 0, null);
            }
        }
        e eVar = this.l0;
        if (eVar != null) {
            eVar.c(i10);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = (e) this.k0.get(i12);
                if (eVar2 != null) {
                    eVar2.c(i10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r10 == r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i10) {
        c cVar;
        String hexString;
        ArrayList arrayList;
        c cVar2;
        float f7;
        c cVar3;
        c k10;
        int i11;
        int i12;
        c cVar4;
        c cVar5;
        c cVar6;
        int i13 = this.f;
        if (i13 != i10) {
            cVar = m(i13);
            this.f = i10;
        } else {
            cVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.K) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i14 = this.L;
        int max = Math.max(0, this.f - i14);
        int b10 = this.e.b();
        int min = Math.min(b10 - 1, this.f + i14);
        if (b10 != this.a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            i2.g.v(sb2, this.a, ", found: ", b10, " Pager id: ");
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.e.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i15 >= arrayList.size()) {
                break;
            }
            cVar2 = (c) arrayList.get(i15);
            int i16 = cVar2.b;
            int i17 = this.f;
            if (i16 < i17) {
                i15++;
            }
        }
        if (cVar2 == null && b10 > 0) {
            cVar2 = a(this.f, i15);
        }
        if (cVar2 != null) {
            int i18 = i15 - 1;
            c cVar7 = i18 >= 0 ? (c) arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - cVar2.d);
            float f10 = 0.0f;
            for (int i19 = this.f - 1; i19 >= 0; i19--) {
                if (f10 >= paddingLeft && i19 < max) {
                    if (cVar7 == null) {
                        break;
                    }
                    if (i19 == cVar7.b && !cVar7.c) {
                        arrayList.remove(i18);
                        this.e.a(this, cVar7.a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            cVar6 = (c) arrayList.get(i18);
                            cVar7 = cVar6;
                        }
                        cVar6 = null;
                        cVar7 = cVar6;
                    }
                } else if (cVar7 == null || i19 != cVar7.b) {
                    f10 += a(i19, i18 + 1).d;
                    i15++;
                    if (i18 >= 0) {
                        cVar6 = (c) arrayList.get(i18);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                } else {
                    f10 += cVar7.d;
                    i18--;
                    if (i18 >= 0) {
                        cVar6 = (c) arrayList.get(i18);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                }
            }
            f7 = 0.0f;
            float f11 = cVar2.d;
            int i20 = i15 + 1;
            if (f11 < 2.0f) {
                c cVar8 = i20 < arrayList.size() ? (c) arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f + 1; i22 < b10; i22++) {
                    if (f11 >= paddingRight && i22 > min) {
                        if (cVar8 == null) {
                            break;
                        }
                        if (i22 == cVar8.b && !cVar8.c) {
                            arrayList.remove(i21);
                            this.e.a(this, cVar8.a);
                            if (i21 < arrayList.size()) {
                                cVar8 = (c) arrayList.get(i21);
                            }
                            cVar8 = null;
                        }
                    } else if (cVar8 == null || i22 != cVar8.b) {
                        c a2 = a(i22, i21);
                        i21++;
                        f11 += a2.d;
                        if (i21 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i21);
                        }
                        cVar8 = null;
                    } else {
                        f11 += cVar8.d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i21);
                        }
                        cVar8 = null;
                    }
                }
            }
            int b11 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f12 = clientWidth2 > 0 ? this.w / clientWidth2 : 0.0f;
            if (cVar != null) {
                int i23 = cVar.b;
                int i24 = cVar2.b;
                if (i23 < i24) {
                    float f13 = cVar.e + cVar.d + f12;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= cVar2.b && i26 < arrayList.size()) {
                        Object obj = arrayList.get(i26);
                        while (true) {
                            cVar5 = (c) obj;
                            if (i25 <= cVar5.b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            obj = arrayList.get(i26);
                        }
                        while (i25 < cVar5.b) {
                            this.e.getClass();
                            f13 += 1.0f + f12;
                            i25++;
                        }
                        cVar5.e = f13;
                        f13 += cVar5.d + f12;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f14 = cVar.e;
                    while (true) {
                        i23--;
                        if (i23 < cVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            cVar4 = (c) obj2;
                            if (i23 >= cVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i23 > cVar4.b) {
                            this.e.getClass();
                            f14 -= 1.0f + f12;
                            i23--;
                        }
                        f14 -= cVar4.d + f12;
                        cVar4.e = f14;
                    }
                }
            }
            int size2 = arrayList.size();
            float f15 = cVar2.e;
            int i27 = cVar2.b;
            int i28 = i27 - 1;
            this.F = i27 == 0 ? f15 : -3.4028235E38f;
            int i29 = b11 - 1;
            this.G = i27 == i29 ? (cVar2.d + f15) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                c cVar9 = (c) arrayList.get(i30);
                while (true) {
                    i12 = cVar9.b;
                    if (i28 <= i12) {
                        break;
                    }
                    i28--;
                    this.e.getClass();
                    f15 -= 1.0f + f12;
                }
                f15 -= cVar9.d + f12;
                cVar9.e = f15;
                if (i12 == 0) {
                    this.F = f15;
                }
                i30--;
                i28--;
            }
            float f16 = cVar2.e + cVar2.d + f12;
            int i31 = cVar2.b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                c cVar10 = (c) arrayList.get(i20);
                while (true) {
                    i11 = cVar10.b;
                    if (i31 >= i11) {
                        break;
                    }
                    i31++;
                    this.e.getClass();
                    f16 += 1.0f + f12;
                }
                if (i11 == i29) {
                    this.G = (cVar10.d + f16) - 1.0f;
                }
                cVar10.e = f16;
                f16 += cVar10.d + f12;
                i20++;
            }
            this.e.h(this.f);
        } else {
            f7 = 0.0f;
        }
        this.e.getClass();
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            d dVar = (d) childAt.getLayoutParams();
            dVar.f = i32;
            if (!dVar.a && dVar.c == f7 && (k10 = k(childAt)) != null) {
                dVar.c = k10.d;
                dVar.e = k10.b;
            }
        }
        z();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        cVar3 = k(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            cVar3 = null;
            if (cVar3 == null || cVar3.b != this.f) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    c k11 = k(childAt2);
                    if (k11 != null && k11.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        c m10 = m(this.f);
        int min = (int) ((m10 != null ? Math.min(m10.e, this.G) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public final boolean v() {
        this.V = -1;
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
        this.f0.onRelease();
        this.g0.onRelease();
        return this.f0.isFinished() || this.g0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public final void w(int i10, int i11, boolean z10, boolean z11) {
        int scrollX;
        int abs;
        c m10 = m(i10);
        int max = m10 != null ? (int) (Math.max(this.F, Math.min(m10.e, this.G)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                h(i10);
            }
            e(false);
            scrollTo(max, 0);
            q(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.r;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.s ? this.r.getCurrX() : this.r.getStartX();
                this.r.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = max - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                e(false);
                s();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f7 = clientWidth;
                float f10 = i15;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f10) + f10;
                int abs2 = Math.abs(i11);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    abs = (int) (((Math.abs(i13) / ((f7 * 1.0f) + this.w)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i12, scrollY, i13, i14, min);
                WeakHashMap weakHashMap = i0.a;
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            h(i10);
        }
    }

    public void x(int i10, boolean z10) {
        this.K = false;
        y(i10, 0, z10, false);
    }

    public final void y(int i10, int i11, boolean z10, boolean z11) {
        a aVar = this.e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z11 && this.f == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.e.b()) {
            i10 = this.e.b() - 1;
        }
        int i12 = this.L;
        int i13 = this.f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).c = true;
            }
        }
        boolean z12 = this.f != i10;
        if (!this.h0) {
            t(i10);
            w(i10, i11, z10, z12);
        } else {
            this.f = i10;
            if (z12) {
                h(i10);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.o0 != 0) {
            ArrayList arrayList = this.p0;
            if (arrayList == null) {
                this.p0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.p0.add(getChildAt(i10));
            }
            Collections.sort(this.p0, v0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0);
        dVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
