package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class p6 extends NestedScrollView implements v70 {
    public final ca W;
    public final o1.k a0;
    public final o6 b0;
    public boolean c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public final OverScroller k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final FrameLayout r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public boolean w0;

    public p6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        o6 o6Var = new o6(this, getContext());
        this.b0 = o6Var;
        ca caVar = new ca(o6Var, f6Var);
        this.W = caVar;
        caVar.i0 = false;
        frameLayout.addView(o6Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(o6Var, o1.h.n, 0.0f);
        this.a0 = kVar;
        kVar.u.b(100.0f);
        kVar.j = 1.0f;
        kVar.b(new bi.i6(3, this));
        kVar.u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.k0 = null;
            FileLog.e(e7);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.c0 && i10 == 0) {
            this.c0 = false;
            if (this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.f0);
        }
    }

    public final void C() {
        if (this.v0) {
            this.v0 = false;
            float scrollY = getScrollY();
            float f7 = this.b0.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h6(this, scrollY, f7, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(wr.f);
            ofFloat.start();
        }
    }

    public final void D(boolean z10) {
        if (!this.v0 || z10) {
            this.v0 = true;
            float scrollY = getScrollY();
            float f7 = this.b0.w;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h6(this, scrollY, f7, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(wr.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        o6 o6Var = this.b0;
        o6Var.w = 0.0f;
        o6Var.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.a0;
        if (!kVar.f) {
            kVar.a = f7;
            kVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i10, int i11) {
        int i12;
        if (i10 != 0 && i11 != 0) {
            o6 o6Var = this.b0;
            n6 n6Var = o6Var.r[0];
            CharSequence charSequence = n6Var.n;
            j6 j6Var = n6Var.o;
            SpannableStringBuilder spannableStringBuilder = j6Var != null ? j6Var.k : null;
            String str = j6Var != null ? j6Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.m0 != hashCode || this.n0 != hashCode2 || this.o0 != hashCode3 || this.l0 != z10 || this.p0 != i11 || o6Var.H) {
                this.m0 = hashCode;
                this.n0 = hashCode2;
                this.o0 = hashCode3;
                this.l0 = z10;
                this.p0 = i11;
                o6Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                n6[] n6VarArr = o6Var.r;
                int a2 = n6VarArr[0].a(i11);
                n6 n6Var2 = n6VarArr[1];
                i12 = AndroidUtilities.lerp(a2, n6Var2 != null ? n6Var2.a(i11) : 0, o6Var.G);
                if (i12 < 0) {
                    ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin = i12;
                    this.q0 = -1;
                    return;
                }
                return;
            }
        }
        i12 = -1;
        if (i12 < 0) {
        }
    }

    @Override // org.telegram.ui.Components.v70
    public final void a(RectF rectF) {
        n6 n6Var;
        o6 o6Var = this.b0;
        n6[] n6VarArr = o6Var.r;
        if (n6VarArr == null || (n6Var = n6VarArr[0]) == null || n6Var.p == null) {
            return;
        }
        float f7 = o6Var.E;
        float lerp = (AndroidUtilities.lerp(n6Var.m, n6Var.l, o6Var.w) + o6Var.F) - o6Var.r[0].p.b();
        float width = getWidth() - o6Var.E;
        int i10 = o6Var.F;
        n6 n6Var2 = o6Var.r[0];
        rectF.set(f7, lerp, width, AndroidUtilities.lerp(n6Var2.m, n6Var2.l, o6Var.w) + i10);
        float x10 = o6Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (o6Var.getY() - getScrollY()));
    }

    @Override // org.telegram.ui.Components.v70
    public final void c(Canvas canvas, float f7) {
        n6 n6Var;
        o6 o6Var = this.b0;
        n6[] n6VarArr = o6Var.r;
        n6[] n6VarArr2 = o6Var.r;
        if (n6VarArr == null || (n6Var = n6VarArr[0]) == null || n6Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = o6Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        float x11 = frameLayout.getX() + x10 + o6Var.E;
        float y3 = frameLayout.getY() + (o6Var.getY() - getScrollY()) + o6Var.F;
        n6 n6Var2 = n6VarArr2[0];
        canvas.translate(x11, (y3 + AndroidUtilities.lerp(n6Var2.m, n6Var2.l, o6Var.w)) - n6VarArr2[0].p.b());
        j6 j6Var = n6VarArr2[0].p;
        int width = getWidth();
        int i10 = o6Var.E;
        j6Var.a(canvas, (width - i10) - i10);
        canvas.restore();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.c0 || this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f7 = this.d0;
            if ((f7 > 0.0f && i11 > 0) || (f7 < 0.0f && i11 < 0)) {
                float f10 = i11;
                float f11 = f7 - f10;
                if (f7 > 0.0f) {
                    if (f11 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f10 + f11 + 0);
                    } else {
                        this.d0 = f11;
                        iArr[1] = i11;
                    }
                } else if (f11 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f10 + f11 + 0);
                } else {
                    this.d0 = f11;
                    iArr[1] = i11;
                }
                this.b0.setTranslationY(this.d0);
                this.W.x();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.c0;
                o6 o6Var = this.b0;
                if (z10) {
                    float f10 = this.d0 - round;
                    this.d0 = f10;
                    o6Var.setTranslationY(f10);
                } else if (!this.a0.f) {
                    OverScroller overScroller = this.k0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f7 = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f7 = min * (-this.e0);
                    }
                    if (round != 0) {
                        float f11 = this.d0 - round;
                        this.d0 = f11;
                        o6Var.setTranslationY(f11);
                    }
                    K(f7);
                }
            }
        }
        this.W.x();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.x();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void k(int i10) {
        super.k(i10);
        this.e0 = Math.signum(i10);
        this.f0 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o6 o6Var = this.b0;
        if (o6Var.w == 1.0f && !this.s0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.w0 = true;
                invalidate();
            } else if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.w0 = false;
                invalidate();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.w0) {
            this.w0 = false;
            invalidate();
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o6 o6Var = this.b0;
        if (o6Var.w == 1.0f && !this.s0) {
            if (motionEvent.getAction() == 0) {
            }
            if (motionEvent.getAction() == 0) {
                this.w0 = true;
                invalidate();
            } else if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.w0 = false;
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.w0) {
            this.w0 = false;
            invalidate();
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.a0.c();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(j6 j6Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, k5 k5Var) {
    }
}
