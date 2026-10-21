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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yu extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ av n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(av avVar, Context context) {
        super(context);
        this.n = avVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        av avVar = this.n;
        zu[] zuVarArr = avVar.f;
        if (!avVar.n) {
            return false;
        }
        if (!avVar.s) {
            if (Math.abs(zuVarArr[1].getTranslationX()) < 1.0f) {
                zuVarArr[0].setTranslationX(r2.getMeasuredWidth() * (avVar.r ? -1 : 1));
                zuVarArr[1].setTranslationX(0.0f);
                animatorSet = avVar.h;
                if (animatorSet != null) {
                }
                avVar.n = false;
            }
            return avVar.n;
        }
        if (Math.abs(zuVarArr[0].getTranslationX()) < 1.0f) {
            zuVarArr[0].setTranslationX(0.0f);
            zuVarArr[1].setTranslationX(zuVarArr[0].getMeasuredWidth() * (avVar.r ? 1 : -1));
            animatorSet = avVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                avVar.h = null;
            }
            avVar.n = false;
        }
        return avVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        av avVar = this.n;
        zu[] zuVarArr = avVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = avVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
        kVar.setEnabled(false);
        avVar.e.setEnabled(false);
        zu zuVar = zuVarArr[1];
        zuVar.f = i10;
        zuVar.setVisibility(0);
        avVar.r = z10;
        avVar.m0(true);
        if (z10) {
            zuVarArr[1].setTranslationX(zuVarArr[0].getMeasuredWidth());
            return true;
        }
        zuVarArr[1].setTranslationX(-zuVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        av avVar = this.n;
        d5Var = ((org.telegram.ui.ActionBar.n2) avVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) avVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        av avVar = this.n;
        Paint paint = avVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
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
        av avVar = this.n;
        zu[] zuVarArr = avVar.f;
        kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < zuVarArr.length; i12++) {
            zu zuVar = zuVarArr[i12];
            if (zuVar != null) {
                org.telegram.ui.Components.jm0 jm0Var = zuVar.d;
                if (jm0Var != null) {
                    jm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.u1 u1Var = zuVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
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
        av avVar = this.n;
        zu[] zuVarArr = avVar.f;
        d5Var = ((org.telegram.ui.ActionBar.n2) avVar).parentLayout;
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
            if (this.b && (((z10 = avVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    zuVarArr[0].setTranslationX(0.0f);
                    zuVarArr[1].setTranslationX(avVar.r ? zuVarArr[0].getMeasuredWidth() : -zuVarArr[0].getMeasuredWidth());
                    avVar.e.j(0.0f, zuVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    zuVarArr[0].setTranslationX(x10);
                    if (avVar.r) {
                        zuVarArr[1].setTranslationX(zuVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        zuVarArr[1].setTranslationX(x10 - zuVarArr[0].getMeasuredWidth());
                    }
                    avVar.e.j(Math.abs(x10) / zuVarArr[0].getMeasuredWidth(), zuVarArr[1].f);
                }
            } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, avVar.v);
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
                float x11 = zuVarArr[0].getX();
                avVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) zuVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                avVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (avVar.r) {
                        avVar.h.playTogether(ObjectAnimator.ofFloat(zuVarArr[0], (Property<zu, Float>) property, 0.0f), ObjectAnimator.ofFloat(zuVarArr[1], (Property<zu, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        avVar.h.playTogether(ObjectAnimator.ofFloat(zuVarArr[0], (Property<zu, Float>) property, 0.0f), ObjectAnimator.ofFloat(zuVarArr[1], (Property<zu, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = zuVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (avVar.r) {
                        avVar.h.playTogether(ObjectAnimator.ofFloat(zuVarArr[0], (Property<zu, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(zuVarArr[1], (Property<zu, Float>) property, 0.0f));
                    } else {
                        avVar.h.playTogether(ObjectAnimator.ofFloat(zuVarArr[0], (Property<zu, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(zuVarArr[1], (Property<zu, Float>) property, 0.0f));
                    }
                }
                avVar.h.setInterpolator(av.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                avVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                avVar.h.addListener(new org.telegram.ui.Components.p31(this, 21));
                avVar.h.start();
                avVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
                kVar.setEnabled(true);
                avVar.e.setEnabled(true);
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
