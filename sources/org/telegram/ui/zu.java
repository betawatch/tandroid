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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zu extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ bv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(bv bvVar, Context context) {
        super(context);
        this.n = bvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        bv bvVar = this.n;
        av[] avVarArr = bvVar.f;
        if (!bvVar.n) {
            return false;
        }
        if (!bvVar.s) {
            if (Math.abs(avVarArr[1].getTranslationX()) < 1.0f) {
                avVarArr[0].setTranslationX(r2.getMeasuredWidth() * (bvVar.r ? -1 : 1));
                avVarArr[1].setTranslationX(0.0f);
                animatorSet = bvVar.h;
                if (animatorSet != null) {
                }
                bvVar.n = false;
            }
            return bvVar.n;
        }
        if (Math.abs(avVarArr[0].getTranslationX()) < 1.0f) {
            avVarArr[0].setTranslationX(0.0f);
            avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() * (bvVar.r ? 1 : -1));
            animatorSet = bvVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                bvVar.h = null;
            }
            bvVar.n = false;
        }
        return bvVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        bv bvVar = this.n;
        av[] avVarArr = bvVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bvVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        kVar.setEnabled(false);
        bvVar.e.setEnabled(false);
        av avVar = avVarArr[1];
        avVar.f = i10;
        avVar.setVisibility(0);
        bvVar.r = z10;
        bvVar.m0(true);
        if (z10) {
            avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth());
            return true;
        }
        avVarArr[1].setTranslationX(-avVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        bv bvVar = this.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bv bvVar = this.n;
        Paint paint = bvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        bv bvVar = this.n;
        av[] avVarArr = bvVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < avVarArr.length; i12++) {
            av avVar = avVarArr[i12];
            if (avVar != null) {
                org.telegram.ui.Components.im0 im0Var = avVar.d;
                if (im0Var != null) {
                    im0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.u1 u1Var = avVarArr[i12].e;
                if (u1Var != null) {
                    u1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        bv bvVar = this.n;
        av[] avVarArr = bvVar.f;
        d5Var = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
        if (((ActionBarLayout) d5Var).j() || a()) {
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
            if (this.b && (((z10 = bvVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    avVarArr[0].setTranslationX(0.0f);
                    avVarArr[1].setTranslationX(bvVar.r ? avVarArr[0].getMeasuredWidth() : -avVarArr[0].getMeasuredWidth());
                    bvVar.e.j(0.0f, avVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    avVarArr[0].setTranslationX(x10);
                    if (bvVar.r) {
                        avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        avVarArr[1].setTranslationX(x10 - avVarArr[0].getMeasuredWidth());
                    }
                    bvVar.e.j(Math.abs(x10) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, bvVar.v);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = this.f.getXVelocity();
                f10 = this.f.getYVelocity();
                if (!this.b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    b(motionEvent, f7 < 0.0f);
                }
            }
            if (this.b) {
                float x11 = avVarArr[0].getX();
                bvVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) avVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                bvVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (bvVar.r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], (Property<av, Float>) property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], (Property<av, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], (Property<av, Float>) property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], (Property<av, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = avVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (bvVar.r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], (Property<av, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], (Property<av, Float>) property, 0.0f));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], (Property<av, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], (Property<av, Float>) property, 0.0f));
                    }
                }
                bvVar.h.setInterpolator(bv.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                bvVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                bvVar.h.addListener(new org.telegram.ui.Components.n31(this, 21));
                bvVar.h.start();
                bvVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                kVar.setEnabled(true);
                bvVar.e.setEnabled(true);
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
