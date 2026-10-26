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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xu extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ zu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(zu zuVar, Context context) {
        super(context);
        this.n = zuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        zu zuVar = this.n;
        yu[] yuVarArr = zuVar.f;
        if (!zuVar.n) {
            return false;
        }
        if (!zuVar.s) {
            if (Math.abs(yuVarArr[1].getTranslationX()) < 1.0f) {
                yuVarArr[0].setTranslationX(r2.getMeasuredWidth() * (zuVar.r ? -1 : 1));
                yuVarArr[1].setTranslationX(0.0f);
                animatorSet = zuVar.h;
                if (animatorSet != null) {
                }
                zuVar.n = false;
            }
            return zuVar.n;
        }
        if (Math.abs(yuVarArr[0].getTranslationX()) < 1.0f) {
            yuVarArr[0].setTranslationX(0.0f);
            yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth() * (zuVar.r ? 1 : -1));
            animatorSet = zuVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                zuVar.h = null;
            }
            zuVar.n = false;
        }
        return zuVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        zu zuVar = this.n;
        yu[] yuVarArr = zuVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = zuVar.e;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        kVar.setEnabled(false);
        zuVar.e.setEnabled(false);
        yu yuVar = yuVarArr[1];
        yuVar.f = i10;
        yuVar.setVisibility(0);
        zuVar.r = z10;
        zuVar.n0(true);
        if (z10) {
            yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth());
            return true;
        }
        yuVarArr[1].setTranslationX(-yuVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        zu zuVar = this.n;
        j5Var = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
            ((ActionBarLayout) j5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zu zuVar = this.n;
        Paint paint = zuVar.d;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
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
        zu zuVar = this.n;
        yu[] yuVarArr = zuVar.f;
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < yuVarArr.length; i12++) {
            yu yuVar = yuVarArr[i12];
            if (yuVar != null) {
                org.telegram.ui.Components.mm0 mm0Var = yuVar.d;
                if (mm0Var != null) {
                    mm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.r1 r1Var = yuVarArr[i12].e;
                if (r1Var != null) {
                    r1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j5 j5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        zu zuVar = this.n;
        yu[] yuVarArr = zuVar.f;
        j5Var = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
        if (((ActionBarLayout) j5Var).i() || a()) {
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
            int x9 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (((z10 = zuVar.r) && x9 > 0) || (!z10 && x9 < 0))) {
                if (!b(motionEvent, x9 < 0)) {
                    this.c = true;
                    this.b = false;
                    yuVarArr[0].setTranslationX(0.0f);
                    yuVarArr[1].setTranslationX(zuVar.r ? yuVarArr[0].getMeasuredWidth() : -yuVarArr[0].getMeasuredWidth());
                    zuVar.e.i(0.0f, yuVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    yuVarArr[0].setTranslationX(x9);
                    if (zuVar.r) {
                        yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth() + x9);
                    } else {
                        yuVarArr[1].setTranslationX(x9 - yuVarArr[0].getMeasuredWidth());
                    }
                    zuVar.e.i(Math.abs(x9) / yuVarArr[0].getMeasuredWidth(), yuVarArr[1].f);
                }
            } else if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                b(motionEvent, x9 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, zuVar.v);
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
                float x10 = yuVarArr[0].getX();
                zuVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) yuVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                zuVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (zuVar.r) {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], (Property<yu, Float>) property, 0.0f), ObjectAnimator.ofFloat(yuVarArr[1], (Property<yu, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], (Property<yu, Float>) property, 0.0f), ObjectAnimator.ofFloat(yuVarArr[1], (Property<yu, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = yuVarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (zuVar.r) {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], (Property<yu, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(yuVarArr[1], (Property<yu, Float>) property, 0.0f));
                    } else {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], (Property<yu, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(yuVarArr[1], (Property<yu, Float>) property, 0.0f));
                    }
                }
                zuVar.h.setInterpolator(zu.x);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                zuVar.h.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                zuVar.h.addListener(new org.telegram.ui.Components.h31(this, 23));
                zuVar.h.start();
                zuVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
                kVar.setEnabled(true);
                zuVar.e.setEnabled(true);
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
