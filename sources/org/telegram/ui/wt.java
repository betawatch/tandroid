package org.telegram.ui;

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
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wt extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ yt n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(yt ytVar, Context context) {
        super(context);
        this.n = ytVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        yt ytVar = this.n;
        xt[] xtVarArr = ytVar.f;
        if (!ytVar.n) {
            return false;
        }
        if (!ytVar.s) {
            if (Math.abs(xtVarArr[1].getTranslationX()) < 1.0f) {
                xtVarArr[0].setTranslationX(r2.getMeasuredWidth() * (ytVar.r ? -1 : 1));
                xtVarArr[1].setTranslationX(0.0f);
                animatorSet = ytVar.h;
                if (animatorSet != null) {
                }
                ytVar.n = false;
            }
            return ytVar.n;
        }
        if (Math.abs(xtVarArr[0].getTranslationX()) < 1.0f) {
            xtVarArr[0].setTranslationX(0.0f);
            xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth() * (ytVar.r ? 1 : -1));
            animatorSet = ytVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ytVar.h = null;
            }
            ytVar.n = false;
        }
        return ytVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        yt ytVar = this.n;
        xt[] xtVarArr = ytVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ytVar.e;
        int i3 = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i3 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        kVar.setEnabled(false);
        ytVar.e.setEnabled(false);
        xt xtVar = xtVarArr[1];
        xtVar.f = i3;
        xtVar.setVisibility(0);
        ytVar.r = z10;
        ytVar.r0(true);
        if (z10) {
            xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth());
            return true;
        }
        xtVarArr[1].setTranslationX(-xtVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        yt ytVar = this.n;
        q4Var = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
            ((ActionBarLayout) q4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yt ytVar = this.n;
        Paint paint = ytVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        yt ytVar = this.n;
        xt[] xtVarArr = ytVar.f;
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        measureChildWithMargins(kVar, i3, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < xtVarArr.length; i11++) {
            xt xtVar = xtVarArr[i11];
            if (xtVar != null) {
                org.telegram.ui.Components.tj0 tj0Var = xtVar.d;
                if (tj0Var != null) {
                    tj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ci.j1 j1Var = xtVarArr[i11].e;
                if (j1Var != null) {
                    j1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i3, 0, i10, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        yt ytVar = this.n;
        xt[] xtVarArr = ytVar.f;
        q4Var = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
        if (((ActionBarLayout) q4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f == null) {
                this.f = VelocityTracker.obtain();
            }
            this.f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (((z10 = ytVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    xtVarArr[0].setTranslationX(0.0f);
                    xtVarArr[1].setTranslationX(ytVar.r ? xtVarArr[0].getMeasuredWidth() : -xtVarArr[0].getMeasuredWidth());
                    ytVar.e.i(0.0f, xtVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    xtVarArr[0].setTranslationX(x10);
                    if (ytVar.r) {
                        xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        xtVarArr[1].setTranslationX(x10 - xtVarArr[0].getMeasuredWidth());
                    }
                    ytVar.e.i(Math.abs(x10) / xtVarArr[0].getMeasuredWidth(), xtVarArr[1].f);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, ytVar.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.f.getXVelocity();
                f11 = this.f.getYVelocity();
                if (!this.b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    b(motionEvent, f10 < 0.0f);
                }
            }
            if (this.b) {
                float x11 = xtVarArr[0].getX();
                ytVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) xtVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                ytVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (ytVar.r) {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], (Property<xt, Float>) property, 0.0f), ObjectAnimator.ofFloat(xtVarArr[1], (Property<xt, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], (Property<xt, Float>) property, 0.0f), ObjectAnimator.ofFloat(xtVarArr[1], (Property<xt, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = xtVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (ytVar.r) {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], (Property<xt, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(xtVarArr[1], (Property<xt, Float>) property, 0.0f));
                    } else {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], (Property<xt, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(xtVarArr[1], (Property<xt, Float>) property, 0.0f));
                    }
                }
                ytVar.h.setInterpolator(yt.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                ytVar.h.setDuration(Math.max(org.telegram.messenger.hs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                ytVar.h.addListener(new org.telegram.ui.Cells.w9(this, 23));
                ytVar.h.start();
                ytVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                kVar.setEnabled(true);
                ytVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
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
