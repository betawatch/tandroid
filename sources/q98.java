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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q98 extends wma {
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public VelocityTracker l0;
    public boolean m0;
    public final /* synthetic */ s98 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q98(s98 s98Var, Context context) {
        super(context, null);
        this.n0 = s98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        s98 s98Var = this.n0;
        r98[] r98VarArr = s98Var.n;
        if (!s98Var.s) {
            return false;
        }
        if (!s98Var.x) {
            if (Math.abs(r98VarArr[1].getTranslationX()) < 1.0f) {
                r98VarArr[0].setTranslationX(r1.getMeasuredWidth() * (s98Var.w ? -1 : 1));
                r98VarArr[1].setTranslationX(0.0f);
                animatorSet = s98Var.r;
                if (animatorSet != null) {
                }
                s98Var.s = false;
            }
            return s98Var.s;
        }
        if (Math.abs(r98VarArr[0].getTranslationX()) < 1.0f) {
            r98VarArr[0].setTranslationX(0.0f);
            r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth() * (s98Var.w ? 1 : -1));
            animatorSet = s98Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                s98Var.r = null;
            }
            s98Var.s = false;
        }
        return s98Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z) {
        a aVar;
        s98 s98Var = this.n0;
        r98[] r98VarArr = s98Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = s98Var.h;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.i0 = false;
        this.h0 = true;
        this.j0 = (int) motionEvent.getX();
        aVar = ((e) s98Var).actionBar;
        aVar.setEnabled(false);
        s98Var.h.setEnabled(false);
        r98 r98Var = r98VarArr[1];
        r98Var.b = i;
        r98Var.setVisibility(0);
        s98Var.w = z;
        s98Var.n0(true);
        if (z) {
            r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth());
            return true;
        }
        r98VarArr[1].setTranslationX(-r98VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        s98 s98Var = this.n0;
        aVar = ((e) s98Var).actionBar;
        int measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((e) s98Var).actionBar;
        float translationY = measuredHeight + ((int) aVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, aob.j0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        s98 s98Var = this.n0;
        Paint paint = s98Var.f;
        paint.setColor(aob.w0(null, aob.a7, false));
        aVar = ((e) s98Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((e) s98Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.n0.h.I || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        iu3 iu3Var;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = hl.L(20.0f);
        s98 s98Var = this.n0;
        int emojiPadding = (L < 0 || hl.E || hl.O1()) ? 0 : s98Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 51;
                }
                int i13 = i12 & jn7.w1;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i14 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i13 == 16) {
                        if (i13 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                        } else if (i13 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = qd4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        iu3Var = s98Var.d;
                        if (iu3Var != null && iu3Var.l(childAt)) {
                            if (hl.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    iu3Var = s98Var.d;
                    if (iu3Var != null) {
                        if (hl.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = ((i3 - i) - measuredWidth) - layoutParams.rightMargin;
                    i6 = getPaddingRight();
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                }
                i10 = i8 - i9;
                iu3Var = s98Var.d;
                if (iu3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[EDGE_INSN: B:18:0x0075->B:19:0x0075 BREAK  A[LOOP:0: B:7:0x004d->B:15:0x0072], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        a aVar;
        int i3;
        a aVar2;
        int i4;
        r98[] r98VarArr;
        int childCount;
        int i5;
        a aVar3;
        d79 d79Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        s98 s98Var = this.n0;
        aVar = ((e) s98Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        if (hl.L(20.0f) < 0) {
            this.m0 = true;
            s98Var.d.j();
            this.m0 = false;
        } else if (!hl.E) {
            size2 -= s98Var.d.getEmojiPadding();
            i3 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            aVar2 = ((e) s98Var).actionBar;
            int measuredHeight = aVar2.getMeasuredHeight();
            this.m0 = true;
            i4 = 0;
            while (true) {
                r98VarArr = s98Var.n;
                if (i4 < r98VarArr.length) {
                    break;
                }
                r98 r98Var = r98VarArr[i4];
                if (r98Var != null && (d79Var = (d79) r98Var.f) != null) {
                    d79Var.setPadding(hl.L(4.0f), hl.L(4.0f) + measuredHeight, hl.L(4.0f), hl.L(4.0f));
                }
                i4++;
            }
            this.m0 = false;
            childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    aVar3 = ((e) s98Var).actionBar;
                    if (childAt != aVar3) {
                        iu3 iu3Var = s98Var.d;
                        if (iu3Var == null || !iu3Var.l(childAt)) {
                            measureChildWithMargins(childAt, i, 0, i3, 0);
                        } else if (!hl.E && !hl.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (hl.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - hl.m)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - hl.m), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i3 = i2;
        aVar2 = ((e) s98Var).actionBar;
        int measuredHeight2 = aVar2.getMeasuredHeight();
        this.m0 = true;
        i4 = 0;
        while (true) {
            r98VarArr = s98Var.n;
            if (i4 < r98VarArr.length) {
            }
            i4++;
        }
        this.m0 = false;
        childCount = getChildCount();
        while (i5 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        s98 s98Var = this.n0;
        r98[] r98VarArr = s98Var.n;
        wk5Var = ((e) s98Var).parentLayout;
        if (((ActionBarLayout) wk5Var).h() || X()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.l0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.l0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.h0 && !this.i0) {
            this.g0 = motionEvent.getPointerId(0);
            this.i0 = true;
            this.j0 = (int) motionEvent.getX();
            this.k0 = (int) motionEvent.getY();
            this.l0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
            int x = (int) (motionEvent.getX() - this.j0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.k0);
            if (this.h0 && (!s98Var.w ? x < 0 : x > 0)) {
                if (!Y(motionEvent, x < 0)) {
                    this.i0 = true;
                    this.h0 = false;
                    r98VarArr[0].setTranslationX(0.0f);
                    r98VarArr[1].setTranslationX(s98Var.w ? r98VarArr[0].getMeasuredWidth() : -r98VarArr[0].getMeasuredWidth());
                    s98Var.h.i(0.0f, r98VarArr[1].b);
                }
            }
            if (!this.i0 || this.h0) {
                if (this.h0) {
                    r98VarArr[0].setTranslationX(x);
                    if (s98Var.w) {
                        r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth() + x);
                    } else {
                        r98VarArr[1].setTranslationX(x - r98VarArr[0].getMeasuredWidth());
                    }
                    s98Var.h.i(Math.abs(x) / r98VarArr[0].getMeasuredWidth(), r98VarArr[1].b);
                }
            } else if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                Y(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.l0.computeCurrentVelocity(1000, s98Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.l0.getXVelocity();
                f2 = this.l0.getYVelocity();
                if (!this.h0 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    Y(motionEvent, f < 0.0f);
                }
            }
            if (this.h0) {
                float x2 = r98VarArr[0].getX();
                s98Var.r = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) r98VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                s98Var.x = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = s98Var.w;
                    AnimatorSet animatorSet = s98Var.r;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], (Property<r98, Float>) property, 0.0f), ObjectAnimator.ofFloat(r98VarArr[1], (Property<r98, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], (Property<r98, Float>) property, 0.0f), ObjectAnimator.ofFloat(r98VarArr[1], (Property<r98, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = r98VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = s98Var.w;
                    AnimatorSet animatorSet2 = s98Var.r;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], (Property<r98, Float>) property, -r7.getMeasuredWidth()), ObjectAnimator.ofFloat(r98VarArr[1], (Property<r98, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], (Property<r98, Float>) property, r7.getMeasuredWidth()), ObjectAnimator.ofFloat(r98VarArr[1], (Property<r98, Float>) property, 0.0f));
                    }
                }
                s98Var.r.setInterpolator(s98.E);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                s98Var.r.setDuration(Math.max(jn7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                s98Var.r.addListener(new n88(this, (byte) 2));
                s98Var.r.start();
                s98Var.s = true;
                this.h0 = false;
            } else {
                this.i0 = false;
                aVar = ((e) s98Var).actionBar;
                aVar.setEnabled(true);
                s98Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.l0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.l0 = null;
            }
        }
        return this.h0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
