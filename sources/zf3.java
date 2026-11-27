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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zf3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ bg3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf3(bg3 bg3Var, Context context) {
        super(context);
        this.n = bg3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        if (!bg3Var.n) {
            return false;
        }
        if (!bg3Var.s) {
            if (Math.abs(ag3VarArr[1].getTranslationX()) < 1.0f) {
                ag3VarArr[0].setTranslationX(r1.getMeasuredWidth() * (bg3Var.r ? -1 : 1));
                ag3VarArr[1].setTranslationX(0.0f);
                animatorSet = bg3Var.h;
                if (animatorSet != null) {
                }
                bg3Var.n = false;
            }
            return bg3Var.n;
        }
        if (Math.abs(ag3VarArr[0].getTranslationX()) < 1.0f) {
            ag3VarArr[0].setTranslationX(0.0f);
            ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth() * (bg3Var.r ? 1 : -1));
            animatorSet = bg3Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                bg3Var.h = null;
            }
            bg3Var.n = false;
        }
        return bg3Var.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        a aVar;
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bg3Var.e;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        aVar = ((e) bg3Var).actionBar;
        aVar.setEnabled(false);
        bg3Var.e.setEnabled(false);
        ag3 ag3Var = ag3VarArr[1];
        ag3Var.f = i;
        ag3Var.setVisibility(0);
        bg3Var.r = z;
        bg3Var.q0(true);
        if (z) {
            ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth());
            return true;
        }
        ag3VarArr[1].setTranslationX(-ag3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        bg3 bg3Var = this.n;
        wk5Var = ((e) bg3Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) bg3Var).parentLayout;
            aVar = ((e) bg3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((e) bg3Var).actionBar;
            ((ActionBarLayout) wk5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        bg3 bg3Var = this.n;
        Paint paint = bg3Var.d;
        paint.setColor(aob.w0(null, aob.d6, false));
        aVar = ((e) bg3Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((e) bg3Var).actionBar;
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
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        aVar = ((e) bg3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((e) bg3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < ag3VarArr.length; i3++) {
            ag3 ag3Var = ag3VarArr[i3];
            if (ag3Var != null) {
                d79 d79Var = ag3Var.d;
                if (d79Var != null) {
                    d79Var.setPadding(0, measuredHeight, 0, 0);
                }
                gw9 gw9Var = ag3VarArr[i3].e;
                if (gw9Var != null) {
                    gw9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((e) bg3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        wk5Var = ((e) bg3Var).parentLayout;
        if (((ActionBarLayout) wk5Var).h() || a()) {
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
            if (this.b && (!bg3Var.r ? x < 0 : x > 0)) {
                if (!b(motionEvent, x < 0)) {
                    this.c = true;
                    this.b = false;
                    ag3VarArr[0].setTranslationX(0.0f);
                    ag3VarArr[1].setTranslationX(bg3Var.r ? ag3VarArr[0].getMeasuredWidth() : -ag3VarArr[0].getMeasuredWidth());
                    bg3Var.e.i(0.0f, ag3VarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    ag3VarArr[0].setTranslationX(x);
                    if (bg3Var.r) {
                        ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth() + x);
                    } else {
                        ag3VarArr[1].setTranslationX(x - ag3VarArr[0].getMeasuredWidth());
                    }
                    bg3Var.e.i(Math.abs(x) / ag3VarArr[0].getMeasuredWidth(), ag3VarArr[1].f);
                }
            } else if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                b(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, bg3Var.w);
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
                float x2 = ag3VarArr[0].getX();
                bg3Var.h = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) ag3VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                bg3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = bg3Var.r;
                    AnimatorSet animatorSet = bg3Var.h;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], (Property<ag3, Float>) property, 0.0f), ObjectAnimator.ofFloat(ag3VarArr[1], (Property<ag3, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], (Property<ag3, Float>) property, 0.0f), ObjectAnimator.ofFloat(ag3VarArr[1], (Property<ag3, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ag3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = bg3Var.r;
                    AnimatorSet animatorSet2 = bg3Var.h;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], (Property<ag3, Float>) property, -r7.getMeasuredWidth()), ObjectAnimator.ofFloat(ag3VarArr[1], (Property<ag3, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], (Property<ag3, Float>) property, r7.getMeasuredWidth()), ObjectAnimator.ofFloat(ag3VarArr[1], (Property<ag3, Float>) property, 0.0f));
                    }
                }
                bg3Var.h.setInterpolator(bg3.y);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                bg3Var.h.setDuration(Math.max(jn7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                bg3Var.h.addListener(new cn2(this, (byte) 5));
                bg3Var.h.start();
                bg3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((e) bg3Var).actionBar;
                aVar.setEnabled(true);
                bg3Var.e.setEnabled(true);
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
