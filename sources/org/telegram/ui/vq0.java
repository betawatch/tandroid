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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vq0 extends org.telegram.ui.Components.ww0 {
    public int l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public VelocityTracker q0;
    public boolean r0;
    public final /* synthetic */ xq0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(xq0 xq0Var, Context context) {
        super(context, null);
        this.s0 = xq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        xq0 xq0Var = this.s0;
        org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.n;
        if (!xq0Var.s) {
            return false;
        }
        if (!xq0Var.w) {
            if (Math.abs(q5VarArr[1].getTranslationX()) < 1.0f) {
                q5VarArr[0].setTranslationX(r2.getMeasuredWidth() * (xq0Var.v ? -1 : 1));
                q5VarArr[1].setTranslationX(0.0f);
                animatorSet = xq0Var.r;
                if (animatorSet != null) {
                }
                xq0Var.s = false;
            }
            return xq0Var.s;
        }
        if (Math.abs(q5VarArr[0].getTranslationX()) < 1.0f) {
            q5VarArr[0].setTranslationX(0.0f);
            q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth() * (xq0Var.v ? 1 : -1));
            animatorSet = xq0Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                xq0Var.r = null;
            }
            xq0Var.s = false;
        }
        return xq0Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        xq0 xq0Var = this.s0;
        org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = xq0Var.h;
        int i10 = scrollSlidingTextTabStrip.O.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.n0 = false;
        this.m0 = true;
        this.o0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        kVar.setEnabled(false);
        xq0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[1];
        q5Var.b = i10;
        q5Var.setVisibility(0);
        xq0Var.v = z10;
        xq0Var.k0(true);
        if (z10) {
            q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth());
            return true;
        }
        q5VarArr[1].setTranslationX(-q5VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        xq0 xq0Var = this.s0;
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.y6.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xq0 xq0Var = this.s0;
        Paint paint = xq0Var.f;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false));
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.s0.h.H || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.ru ruVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int dp = AndroidUtilities.dp(20.0f);
        xq0 xq0Var = this.s0;
        int emojiPadding = (dp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : xq0Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        ruVar = xq0Var.d;
                        if (ruVar != null && ruVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    ruVar = xq0Var.d;
                    if (ruVar != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = ((i12 - i10) - measuredWidth) - layoutParams.rightMargin;
                    i15 = getPaddingRight();
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                ruVar = xq0Var.d;
                if (ruVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[EDGE_INSN: B:18:0x0076->B:19:0x0076 BREAK  A[LOOP:0: B:7:0x004d->B:15:0x0073], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        org.telegram.ui.ActionBar.q5[] q5VarArr;
        int childCount;
        int i14;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.Components.nm0 nm0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        xq0 xq0Var = this.s0;
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        if (AndroidUtilities.dp(20.0f) < 0) {
            this.r0 = true;
            xq0Var.d.j();
            this.r0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= xq0Var.d.getEmojiPadding();
            i12 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
            int measuredHeight = kVar2.getMeasuredHeight();
            this.r0 = true;
            i13 = 0;
            while (true) {
                q5VarArr = xq0Var.n;
                if (i13 < q5VarArr.length) {
                    break;
                }
                org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[i13];
                if (q5Var != null && (nm0Var = (org.telegram.ui.Components.nm0) q5Var.f) != null) {
                    nm0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i13++;
            }
            this.r0 = false;
            childCount = getChildCount();
            for (i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kVar3 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
                    if (childAt != kVar3) {
                        org.telegram.ui.Components.ru ruVar = xq0Var.d;
                        if (ruVar == null || !ruVar.l(childAt)) {
                            measureChildWithMargins(childAt, i10, 0, i12, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i12 = i11;
        kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        int measuredHeight2 = kVar2.getMeasuredHeight();
        this.r0 = true;
        i13 = 0;
        while (true) {
            q5VarArr = xq0Var.n;
            if (i13 < q5VarArr.length) {
            }
            i13++;
        }
        this.r0 = false;
        childCount = getChildCount();
        while (i14 < childCount) {
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
        xq0 xq0Var = this.s0;
        org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.n;
        j5Var = ((org.telegram.ui.ActionBar.r2) xq0Var).parentLayout;
        if (((ActionBarLayout) j5Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.q0 == null) {
                this.q0 = VelocityTracker.obtain();
            }
            this.q0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.m0 && !this.n0) {
            this.l0 = motionEvent.getPointerId(0);
            this.n0 = true;
            this.o0 = (int) motionEvent.getX();
            this.p0 = (int) motionEvent.getY();
            this.q0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.l0) {
            int x9 = (int) (motionEvent.getX() - this.o0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.p0);
            if (this.m0 && (((z10 = xq0Var.v) && x9 > 0) || (!z10 && x9 < 0))) {
                if (!Y(motionEvent, x9 < 0)) {
                    this.n0 = true;
                    this.m0 = false;
                    q5VarArr[0].setTranslationX(0.0f);
                    q5VarArr[1].setTranslationX(xq0Var.v ? q5VarArr[0].getMeasuredWidth() : -q5VarArr[0].getMeasuredWidth());
                    xq0Var.h.i(0.0f, q5VarArr[1].b);
                }
            }
            if (!this.n0 || this.m0) {
                if (this.m0) {
                    q5VarArr[0].setTranslationX(x9);
                    if (xq0Var.v) {
                        q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth() + x9);
                    } else {
                        q5VarArr[1].setTranslationX(x9 - q5VarArr[0].getMeasuredWidth());
                    }
                    xq0Var.h.i(Math.abs(x9) / q5VarArr[0].getMeasuredWidth(), q5VarArr[1].b);
                }
            } else if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                Y(motionEvent, x9 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.l0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.q0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, xq0Var.x);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = this.q0.getXVelocity();
                f10 = this.q0.getYVelocity();
                if (!this.m0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    Y(motionEvent, f7 < 0.0f);
                }
            }
            if (this.m0) {
                float x10 = q5VarArr[0].getX();
                xq0Var.r = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) q5VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                xq0Var.w = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (xq0Var.v) {
                        xq0Var.r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], (Property<org.telegram.ui.ActionBar.q5, Float>) property, 0.0f), ObjectAnimator.ofFloat(q5VarArr[1], (Property<org.telegram.ui.ActionBar.q5, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        xq0Var.r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], (Property<org.telegram.ui.ActionBar.q5, Float>) property, 0.0f), ObjectAnimator.ofFloat(q5VarArr[1], (Property<org.telegram.ui.ActionBar.q5, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = q5VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (xq0Var.v) {
                        xq0Var.r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], (Property<org.telegram.ui.ActionBar.q5, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(q5VarArr[1], (Property<org.telegram.ui.ActionBar.q5, Float>) property, 0.0f));
                    } else {
                        xq0Var.r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], (Property<org.telegram.ui.ActionBar.q5, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(q5VarArr[1], (Property<org.telegram.ui.ActionBar.q5, Float>) property, 0.0f));
                    }
                }
                xq0Var.r.setInterpolator(xq0.y);
                int measuredWidth2 = getMeasuredWidth();
                float f11 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                xq0Var.r.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                xq0Var.r.addListener(new k50(this, 9));
                xq0Var.r.start();
                xq0Var.s = true;
                this.m0 = false;
            } else {
                this.n0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
                kVar.setEnabled(true);
                xq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.q0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.q0 = null;
            }
        }
        return this.m0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }
}
