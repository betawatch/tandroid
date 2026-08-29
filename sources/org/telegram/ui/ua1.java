package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ua1 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua1(Context context) {
        super(context);
        this.a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                ih.g2 g2Var = (ih.g2) this.b;
                RectF rectF = g2Var.h;
                RectF rectF2 = g2Var.f;
                RectF rectF3 = g2Var.e;
                Paint paint = g2Var.n;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.c6, false)));
                float d = g2Var.c.d(g2Var.b, false);
                double d10 = d;
                int floor = (int) Math.floor(d10);
                ArrayList arrayList = g2Var.d;
                int clamp = Utilities.clamp(floor, arrayList.size() - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                if (clamp < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp));
                } else if (clamp2 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp2));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (clamp2 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp2));
                } else if (clamp < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                break;
            case 14:
                int width = getWidth() / 2;
                int height2 = getHeight() / 2;
                hh1 hh1Var = (hh1) this.b;
                Camera camera = hh1Var.H;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = hh1Var.I;
                camera.getMatrix(matrix);
                camera.restore();
                float f9 = -width;
                float f10 = -height2;
                matrix.preTranslate(f9, f10);
                float f11 = width;
                float f12 = height2;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = hh1Var.J;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f9, f10);
                matrix2.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        View view;
        switch (this.a) {
            case 3:
                if (((jh.d5) this.b).Q.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 4:
                if (((jh.ia) this.b).b0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 5:
                if (((oh.g) this.b).a0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 11:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.j0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            view = getChildAt(i11);
                            if (x4 < view.getX() || x4 > view.getX() + view.getWidth() || y8 < view.getY() || y8 > view.getY() + view.getHeight()) {
                                i11++;
                            }
                        } else {
                            view = null;
                        }
                    }
                    scrollSlidingTextTabStrip.V = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.V));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.V = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.V;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.V);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.V.getWidth() / 2.0f) + scrollSlidingTextTabStrip.V.getX();
                        int width2 = scrollSlidingTextTabStrip.V.getWidth();
                        if (width < 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            while (true) {
                                if (i10 < getChildCount()) {
                                    View childAt = getChildAt(i10);
                                    float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                        i10++;
                                    }
                                } else {
                                    i10 = getChildCount() - 1;
                                }
                            }
                        }
                        if (i10 != indexOfChild) {
                            org.telegram.ui.Components.jm0 jm0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i10);
                            jm0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.V;
                    if (view3 != null) {
                        final int i12 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.hm0
                            public final /* synthetic */ ua1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        ua1 ua1Var = this.b;
                                        ua1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) ua1Var.b).invalidate();
                                        break;
                                    default:
                                        ua1 ua1Var2 = this.b;
                                        ua1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) ua1Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.jr.h).start();
                    }
                    scrollSlidingTextTabStrip.V = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.V;
                    if (view4 != null) {
                        final int i13 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.hm0
                            public final /* synthetic */ ua1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        ua1 ua1Var = this.b;
                                        ua1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) ua1Var.b).invalidate();
                                        break;
                                    default:
                                        ua1 ua1Var2 = this.b;
                                        ua1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) ua1Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.jr.h).start();
                    }
                    scrollSlidingTextTabStrip.V = null;
                }
                return scrollSlidingTextTabStrip.V != null || super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 16:
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (getChildAt(i10).getVisibility() == 0) {
                        super.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                cg.f2 f2Var = ((cg.e2) this.b).c;
                if (view == f2Var.n0 && f2Var.D0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 7:
                if (view == ((org.telegram.ui.Components.b9) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                org.telegram.ui.Components.fm0 fm0Var = (org.telegram.ui.Components.fm0) this.b;
                if (view instanceof org.telegram.ui.Components.vw0) {
                    ((org.telegram.ui.Components.vw0) view).a(fm0Var.e0);
                }
                if (view == fm0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 15:
                boolean drawChild = super.drawChild(canvas, view, j10);
                t60 t60Var = (t60) this.b;
                if (view == t60Var.b && t60Var.x != null) {
                    int measuredHeight = t60Var.s.getMeasuredHeight();
                    t60Var.x.setBounds(0, measuredHeight, getMeasuredWidth(), t60Var.x.getIntrinsicHeight() + measuredHeight);
                    t60Var.x.draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.b;
                    if (i10 >= x0VarArr.length) {
                        break;
                    } else {
                        x0VarArr[i10].invalidate();
                        i10++;
                    }
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((oh1) this.b).x0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                return org.telegram.ui.ActionBar.t4.b((org.telegram.ui.ActionBar.t4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 8:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.rv) this.b).s.B && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.x3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Components.x10) this.b).c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 10:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
                if (scrollSlidingTextTabStrip.h0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.h0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Size size;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), TLObject.FLAG_30));
                break;
            case 6:
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) this.b;
                if (org.telegram.ui.ActionBar.t4.b(t4Var) && (size = t4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30);
                }
                super.onMeasure(i10, i11);
                break;
            case 8:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.rv) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i11);
                break;
            case 13:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.i31) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 16:
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i12++;
                    }
                }
                int size2 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size3 = View.MeasureSpec.getSize(i11);
                if (i12 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size2 / i12);
                    if (((PhotoViewer) this.b).f1.getVisibility() == 0) {
                        int max = Math.max(0, (min - AndroidUtilities.dp(((PhotoViewer) this.b).T7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).f1.setPadding(max, 0, max, 0);
                    }
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i12), size3);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size2, size3);
                    break;
                }
            case 17:
                super.onMeasure(i10, i11);
                cg1 cg1Var = (cg1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cg1Var.c.getLayoutParams();
                int i15 = 0;
                int dp = AndroidUtilities.dp(8.0f) + (cg1Var.a.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0);
                if (cg1Var.K == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i15 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams.topMargin = dp + i15;
                break;
            case 19:
                int size4 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                th.x1 x1Var = (th.x1) this.b;
                LinearLayout linearLayout = x1Var.i0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x1Var.i0.getLayoutParams();
                    paddingRight += x1Var.i0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout2 = x1Var.j0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) x1Var.j0.getLayoutParams();
                    paddingRight += x1Var.j0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                LinearLayout linearLayout3 = x1Var.k0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x1Var.k0.getLayoutParams();
                    paddingRight += x1Var.k0.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                x1Var.g0 = Math.max(0, size4 - paddingRight);
                super.onMeasure(i10, i11);
                break;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                th.t3 t3Var = (th.t3) this.b;
                LinearLayout linearLayout4 = t3Var.H;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) t3Var.H.getLayoutParams();
                    paddingRight2 += t3Var.H.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout5 = t3Var.I;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) t3Var.I.getLayoutParams();
                    paddingRight2 += t3Var.I.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                LinearLayout linearLayout6 = t3Var.J;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) t3Var.J.getLayoutParams();
                    paddingRight2 += t3Var.J.getMeasuredWidth() + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
                }
                t3Var.G = Math.max(0, size5 - paddingRight2);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 11:
                super.setAlpha(f9);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 12:
                org.telegram.ui.Components.qw0 qw0Var = (org.telegram.ui.Components.qw0) this.b;
                org.telegram.ui.Components.t9 t9Var = qw0Var.b;
                if (getVisibility() == 8 && i10 == 0) {
                    qw0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        t9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    t9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }
}
