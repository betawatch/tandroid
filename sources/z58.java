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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z58 extends cja {
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public VelocityTracker r0;
    public boolean s0;
    public final /* synthetic */ b68 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z58(b68 b68Var, Context context) {
        super(context, null);
        this.t0 = b68Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        b68 b68Var = this.t0;
        a68[] a68VarArr = b68Var.n;
        if (!b68Var.s) {
            return false;
        }
        if (!b68Var.x) {
            if (Math.abs(a68VarArr[1].getTranslationX()) < 1.0f) {
                a68VarArr[0].setTranslationX(r1.getMeasuredWidth() * (b68Var.w ? -1 : 1));
                a68VarArr[1].setTranslationX(0.0f);
                animatorSet = b68Var.r;
                if (animatorSet != null) {
                }
                b68Var.s = false;
            }
            return b68Var.s;
        }
        if (Math.abs(a68VarArr[0].getTranslationX()) < 1.0f) {
            a68VarArr[0].setTranslationX(0.0f);
            a68VarArr[1].setTranslationX(a68VarArr[0].getMeasuredWidth() * (b68Var.w ? 1 : -1));
            animatorSet = b68Var.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                b68Var.r = null;
            }
            b68Var.s = false;
        }
        return b68Var.s;
    }

    public final boolean Y(MotionEvent motionEvent, boolean z) {
        a aVar;
        b68 b68Var = this.t0;
        a68[] a68VarArr = b68Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = b68Var.h;
        int i = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.o0 = false;
        this.n0 = true;
        this.p0 = (int) motionEvent.getX();
        aVar = ((d) b68Var).actionBar;
        aVar.setEnabled(false);
        b68Var.h.setEnabled(false);
        a68 a68Var = a68VarArr[1];
        a68Var.b = i;
        a68Var.setVisibility(0);
        b68Var.w = z;
        b68Var.n0(true);
        if (z) {
            a68VarArr[1].setTranslationX(a68VarArr[0].getMeasuredWidth());
            return true;
        }
        a68VarArr[1].setTranslationX(-a68VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        b68 b68Var = this.t0;
        aVar = ((d) b68Var).actionBar;
        int measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) b68Var).actionBar;
        float translationY = measuredHeight + ((int) aVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, bkb.j0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        b68 b68Var = this.t0;
        Paint paint = b68Var.f;
        paint.setColor(bkb.w0(null, bkb.Z6, false));
        aVar = ((d) b68Var).actionBar;
        float measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) b68Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return X() || this.t0.h.I || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        rt3 rt3Var;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int L = gl.L(20.0f);
        b68 b68Var = this.t0;
        int emojiPadding = (L < 0 || gl.E || gl.O1()) ? 0 : b68Var.d.getEmojiPadding();
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
                int i13 = i12 & kk7.w1;
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
                            i8 = tb4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        rt3Var = b68Var.d;
                        if (rt3Var != null && rt3Var.l(childAt)) {
                            if (gl.O1()) {
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
                    rt3Var = b68Var.d;
                    if (rt3Var != null) {
                        if (gl.O1()) {
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
                rt3Var = b68Var.d;
                if (rt3Var != null) {
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
        a68[] a68VarArr;
        int childCount;
        int i5;
        a aVar3;
        o39 o39Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        b68 b68Var = this.t0;
        aVar = ((d) b68Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        if (gl.L(20.0f) < 0) {
            this.s0 = true;
            b68Var.d.j();
            this.s0 = false;
        } else if (!gl.E) {
            size2 -= b68Var.d.getEmojiPadding();
            i3 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
            aVar2 = ((d) b68Var).actionBar;
            int measuredHeight = aVar2.getMeasuredHeight();
            this.s0 = true;
            i4 = 0;
            while (true) {
                a68VarArr = b68Var.n;
                if (i4 < a68VarArr.length) {
                    break;
                }
                a68 a68Var = a68VarArr[i4];
                if (a68Var != null && (o39Var = (o39) a68Var.f) != null) {
                    o39Var.setPadding(gl.L(4.0f), gl.L(4.0f) + measuredHeight, gl.L(4.0f), gl.L(4.0f));
                }
                i4++;
            }
            this.s0 = false;
            childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8) {
                    aVar3 = ((d) b68Var).actionBar;
                    if (childAt != aVar3) {
                        rt3 rt3Var = b68Var.d;
                        if (rt3Var == null || !rt3Var.l(childAt)) {
                            measureChildWithMargins(childAt, i, 0, i3, 0);
                        } else if (!gl.E && !gl.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (gl.O1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(gl.O1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - gl.m)), TLObject.FLAG_30));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gl.m), TLObject.FLAG_30));
                        }
                    }
                }
            }
        }
        i3 = i2;
        aVar2 = ((d) b68Var).actionBar;
        int measuredHeight2 = aVar2.getMeasuredHeight();
        this.s0 = true;
        i4 = 0;
        while (true) {
            a68VarArr = b68Var.n;
            if (i4 < a68VarArr.length) {
            }
            i4++;
        }
        this.s0 = false;
        childCount = getChildCount();
        while (i5 < childCount) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui5 ui5Var;
        float f;
        float f2;
        a aVar;
        float measuredWidth;
        b68 b68Var = this.t0;
        a68[] a68VarArr = b68Var.n;
        ui5Var = ((d) b68Var).parentLayout;
        if (((ActionBarLayout) ui5Var).h() || X()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.r0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.r0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.n0 && !this.o0) {
            this.m0 = motionEvent.getPointerId(0);
            this.o0 = true;
            this.p0 = (int) motionEvent.getX();
            this.q0 = (int) motionEvent.getY();
            this.r0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.m0) {
            int x = (int) (motionEvent.getX() - this.p0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.q0);
            if (this.n0 && (!b68Var.w ? x < 0 : x > 0)) {
                if (!Y(motionEvent, x < 0)) {
                    this.o0 = true;
                    this.n0 = false;
                    a68VarArr[0].setTranslationX(0.0f);
                    a68VarArr[1].setTranslationX(b68Var.w ? a68VarArr[0].getMeasuredWidth() : -a68VarArr[0].getMeasuredWidth());
                    b68Var.h.i(0.0f, a68VarArr[1].b);
                }
            }
            if (!this.o0 || this.n0) {
                if (this.n0) {
                    a68VarArr[0].setTranslationX(x);
                    if (b68Var.w) {
                        a68VarArr[1].setTranslationX(a68VarArr[0].getMeasuredWidth() + x);
                    } else {
                        a68VarArr[1].setTranslationX(x - a68VarArr[0].getMeasuredWidth());
                    }
                    b68Var.h.i(Math.abs(x) / a68VarArr[0].getMeasuredWidth(), a68VarArr[1].b);
                }
            } else if (Math.abs(x) >= gl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                Y(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.m0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.r0.computeCurrentVelocity(1000, b68Var.y);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.r0.getXVelocity();
                f2 = this.r0.getYVelocity();
                if (!this.n0 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    Y(motionEvent, f < 0.0f);
                }
            }
            if (this.n0) {
                float x2 = a68VarArr[0].getX();
                b68Var.r = new AnimatorSet();
                boolean z = Math.abs(x2) < ((float) a68VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                b68Var.x = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z2 = b68Var.w;
                    AnimatorSet animatorSet = b68Var.r;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(a68VarArr[0], (Property<a68, Float>) property, 0.0f), ObjectAnimator.ofFloat(a68VarArr[1], (Property<a68, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(a68VarArr[0], (Property<a68, Float>) property, 0.0f), ObjectAnimator.ofFloat(a68VarArr[1], (Property<a68, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = a68VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z3 = b68Var.w;
                    AnimatorSet animatorSet2 = b68Var.r;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(a68VarArr[0], (Property<a68, Float>) property, -r8.getMeasuredWidth()), ObjectAnimator.ofFloat(a68VarArr[1], (Property<a68, Float>) property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(a68VarArr[0], (Property<a68, Float>) property, r8.getMeasuredWidth()), ObjectAnimator.ofFloat(a68VarArr[1], (Property<a68, Float>) property, 0.0f));
                    }
                }
                b68Var.r.setInterpolator(b68.E);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                b68Var.r.setDuration(Math.max(kk7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r7) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                b68Var.r.addListener(new l48(this, (byte) 3));
                b68Var.r.start();
                b68Var.s = true;
                this.n0 = false;
            } else {
                this.o0 = false;
                aVar = ((d) b68Var).actionBar;
                aVar.setEnabled(true);
                b68Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.r0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.r0 = null;
            }
        }
        return this.n0;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
