package th;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class j6 extends NestedScrollView implements y60 {
    public final t9 W;
    public final o1.j a0;
    public final i6 b0;
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

    public j6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.b.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        zs.i(this);
        i6 i6Var = new i6(this, getContext());
        this.b0 = i6Var;
        t9 t9Var = new t9(i6Var, p6Var);
        this.W = t9Var;
        t9Var.h0 = false;
        frameLayout.addView(i6Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.i0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j((Object) i6Var, (o1.h) o1.j.p, 0.0f);
        this.a0 = jVar;
        jVar.m.b(100.0f);
        jVar.f(1.0f);
        jVar.b(new fg.c(2, this));
        jVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("c", null).setAccessible(true);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.k0 = null;
            f8.g(e7, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.a0.d();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.c0 && i10 == 0) {
            this.c0 = false;
            if (this.d0 == 0.0f || (overScroller = this.k0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.f0);
        }
    }

    public final void D() {
        if (this.v0) {
            this.v0 = false;
            float scrollY = getScrollY();
            float f7 = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new c6(this, scrollY, f7, 0));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
        }
    }

    public final void E(boolean z10) {
        if (!this.v0 || z10) {
            this.v0 = true;
            float scrollY = getScrollY();
            float f7 = this.b0.x;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new c6(this, scrollY, f7, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gr.f);
            ofFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        i6 i6Var = this.b0;
        i6Var.x = 0.0f;
        i6Var.invalidate();
    }

    public final void K(float f7) {
        o1.j jVar = this.a0;
        if (!jVar.f) {
            jVar.a = f7;
            jVar.h();
        }
        if (getScrollY() < org.telegram.messenger.i0.L(2.0f)) {
            D();
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
            i6 i6Var = this.b0;
            h6 h6Var = i6Var.r[0];
            CharSequence charSequence = h6Var.n;
            e6 e6Var = h6Var.o;
            SpannableStringBuilder spannableStringBuilder = e6Var != null ? e6Var.k : null;
            String str = e6Var != null ? e6Var.l : null;
            int hashCode = charSequence.hashCode();
            int hashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int hashCode3 = str != null ? str.hashCode() : 0;
            Point point = org.telegram.messenger.i0.q;
            boolean z10 = point.x > point.y;
            if (this.m0 != hashCode || this.n0 != hashCode2 || this.o0 != hashCode3 || this.l0 != z10 || this.p0 != i11 || i6Var.H) {
                this.m0 = hashCode;
                this.n0 = hashCode2;
                this.o0 = hashCode3;
                this.l0 = z10;
                this.p0 = i11;
                i6Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                h6[] h6VarArr = i6Var.r;
                int a2 = h6VarArr[0].a(i11);
                h6 h6Var2 = h6VarArr[1];
                i12 = org.telegram.messenger.i0.W1(i6Var.G, a2, h6Var2 != null ? h6Var2.a(i11) : 0);
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

    @Override // org.telegram.ui.Components.y60
    public final void a(RectF rectF) {
        h6 h6Var;
        i6 i6Var = this.b0;
        h6[] h6VarArr = i6Var.r;
        if (h6VarArr == null || (h6Var = h6VarArr[0]) == null || h6Var.p == null) {
            return;
        }
        float f7 = i6Var.E;
        float W1 = (org.telegram.messenger.i0.W1(i6Var.x, h6Var.m, h6Var.l) + i6Var.F) - i6Var.r[0].p.b();
        float width = getWidth() - i6Var.E;
        int i10 = i6Var.F;
        h6 h6Var2 = i6Var.r[0];
        rectF.set(f7, W1, width, org.telegram.messenger.i0.W1(i6Var.x, h6Var2.m, h6Var2.l) + i10);
        float x10 = i6Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (i6Var.getY() - getScrollY()));
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(Canvas canvas, float f7) {
        h6 h6Var;
        i6 i6Var = this.b0;
        h6[] h6VarArr = i6Var.r;
        h6[] h6VarArr2 = i6Var.r;
        if (h6VarArr == null || (h6Var = h6VarArr[0]) == null || h6Var.p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x10 = i6Var.getX() - getScrollX();
        FrameLayout frameLayout = this.r0;
        float x11 = frameLayout.getX() + x10 + i6Var.E;
        float y3 = frameLayout.getY() + (i6Var.getY() - getScrollY()) + i6Var.F;
        h6 h6Var2 = h6VarArr2[0];
        canvas.translate(x11, (y3 + org.telegram.messenger.i0.W1(i6Var.x, h6Var2.m, h6Var2.l)) - h6VarArr2[0].p.b());
        e6 e6Var = h6VarArr2[0].p;
        int width = getWidth();
        int i10 = i6Var.E;
        e6Var.a(canvas, (width - i10) - i10);
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
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
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
                this.W.w();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.c0;
                i6 i6Var = this.b0;
                if (z10) {
                    float f10 = this.d0 - round;
                    this.d0 = f10;
                    i6Var.setTranslationY(f10);
                } else if (!this.a0.f) {
                    OverScroller overScroller = this.k0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f7 = 0.0f;
                    } else {
                        Point point = org.telegram.messenger.i0.q;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f7 = min * (-this.e0);
                    }
                    if (round != 0) {
                        float f11 = this.d0 - round;
                        this.d0 = f11;
                        i6Var.setTranslationY(f11);
                    }
                    K(f7);
                }
            }
        }
        this.W.w();
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
        return Utilities.i((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, org.telegram.messenger.i0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i10) {
        super.i(i10);
        this.e0 = Math.signum(i10);
        this.f0 = 0.0f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.getY() < (r0.getTranslationY() + (r5.r0.getTop() - getScrollY()))) goto L23;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i6 i6Var = this.b0;
        if (i6Var.x == 1.0f && !this.s0) {
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
        i6 i6Var = this.b0;
        if (i6Var.x == 1.0f && !this.s0) {
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

    public void F(org.telegram.ui.Components.o5 o5Var) {
    }

    public void I(e6 e6Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, sg.v vVar) {
    }
}
