// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sg3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ ug3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg3(ug3 ug3Var, Context context) {
        super(context);
        this.n = ug3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        if (!ug3Var.n) {
            return false;
        }
        if (!ug3Var.s) {
            if (Math.abs(tg3VarArr[1].getTranslationX()) < 1.0f) {
                tg3VarArr[0].setTranslationX(r1.getMeasuredWidth() * (ug3Var.r ? -1 : 1));
                tg3VarArr[1].setTranslationX(0.0f);
                animatorSet = ug3Var.h;
                if (animatorSet != null) {
                }
                ug3Var.n = false;
            }
            return ug3Var.n;
        }
        if (Math.abs(tg3VarArr[0].getTranslationX()) < 1.0f) {
            tg3VarArr[0].setTranslationX(0.0f);
            tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth() * (ug3Var.r ? 1 : -1));
            animatorSet = ug3Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ug3Var.h = null;
            }
            ug3Var.n = false;
        }
        return ug3Var.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        a aVar;
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ug3Var.e;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        aVar = ((d) ug3Var).actionBar;
        aVar.setEnabled(false);
        ug3Var.e.setEnabled(false);
        tg3 tg3Var = tg3VarArr[1];
        tg3Var.f = i;
        tg3Var.setVisibility(0);
        ug3Var.r = z;
        ug3Var.r0(true);
        if (z) {
            tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth());
            return true;
        }
        tg3VarArr[1].setTranslationX(-tg3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tk5 tk5Var;
        tk5 tk5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        ug3 ug3Var = this.n;
        tk5Var = ((d) ug3Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) ug3Var).parentLayout;
            aVar = ((d) ug3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((d) ug3Var).actionBar;
            ((ActionBarLayout) tk5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        ug3 ug3Var = this.n;
        Paint paint = ug3Var.d;
        paint.setColor(cmb.w0(null, cmb.c6, false));
        aVar = ((d) ug3Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) ug3Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        aVar = ((d) ug3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) ug3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < tg3VarArr.length; i3++) {
            tg3 tg3Var = tg3VarArr[i3];
            if (tg3Var != null) {
                r59 r59Var = tg3Var.d;
                if (r59Var != null) {
                    r59Var.setPadding(0, measuredHeight, 0, 0);
                }
                pu9 pu9Var = tg3VarArr[i3].e;
                if (pu9Var != null) {
                    pu9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((d) ug3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        tk5Var = ((d) ug3Var).parentLayout;
        if (((ActionBarLayout) tk5Var).h() || a()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.f = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (!ug3Var.r ? x < 0 : x > 0)) {
                if (!b(motionEvent, x < 0)) {
                    this.c = true;
                    this.b = false;
                    tg3VarArr[0].setTranslationX(0.0f);
                    tg3VarArr[1].setTranslationX(ug3Var.r ? tg3VarArr[0].getMeasuredWidth() : -tg3VarArr[0].getMeasuredWidth());
                    ug3Var.e.i(0.0f, tg3VarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    tg3VarArr[0].setTranslationX(x);
                    if (ug3Var.r) {
                        tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth() + x);
                    } else {
                        tg3VarArr[1].setTranslationX(x - tg3VarArr[0].getMeasuredWidth());
                    }
                    ug3Var.e.i(Math.abs(x) / tg3VarArr[0].getMeasuredWidth(), tg3VarArr[1].f);
                }
            } else if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                b(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, ug3Var.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.f.getXVelocity();
                f2 = this.f.getYVelocity();
                if (!this.b && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    b(motionEvent, f < 0.0f);
                }
            }
            if (this.b) {
                float x2 = tg3VarArr[0].getX();
                ug3Var.h = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) tg3VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                ug3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = ug3Var.r;
                    AnimatorSet animatorSet = ug3Var.h;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], (Property<tg3, Float>) property, 0.0f), ObjectAnimator.ofFloat(tg3VarArr[1], (Property<tg3, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], (Property<tg3, Float>) property, 0.0f), ObjectAnimator.ofFloat(tg3VarArr[1], (Property<tg3, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = tg3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = ug3Var.r;
                    AnimatorSet animatorSet2 = ug3Var.h;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], (Property<tg3, Float>) property, -r7.getMeasuredWidth()), ObjectAnimator.ofFloat(tg3VarArr[1], (Property<tg3, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], (Property<tg3, Float>) property, r7.getMeasuredWidth()), ObjectAnimator.ofFloat(tg3VarArr[1], (Property<tg3, Float>) property, 0.0f));
                    }
                }
                ug3Var.h.setInterpolator(ug3.y);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                ug3Var.h.setDuration(Math.max(nm7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                ug3Var.h.addListener(new kh2(this, (byte) 7));
                ug3Var.h.start();
                ug3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((d) ug3Var).actionBar;
                aVar.setEnabled(true);
                ug3Var.e.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f = null;
            }
        }
        return this.b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
