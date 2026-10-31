package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u71 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u71(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 13:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                ud1 ud1Var = (ud1) this.b;
                Camera camera = ud1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = ud1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f7 = -width;
                float f10 = -height;
                matrix.preTranslate(f7, f10);
                float f11 = width;
                float f12 = height;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = ud1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f7, f10);
                matrix2.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 20:
                ph.k1 k1Var = (ph.k1) this.b;
                RectF rectF = k1Var.h;
                RectF rectF2 = k1Var.f;
                RectF rectF3 = k1Var.e;
                Paint paint = k1Var.n;
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.c6, false)));
                float e = k1Var.c.e(false, k1Var.b);
                double d = e;
                int floor = (int) Math.floor(d);
                ArrayList arrayList = k1Var.d;
                int j10 = Utilities.j(floor, arrayList.size() - 1, 0);
                int j11 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (j10 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j10));
                } else if (j11 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j11));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (j11 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j11));
                } else if (j10 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j10));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                org.telegram.messenger.i0.Z1(rectF3, rectF2, e - j10, rectF);
                float height2 = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height2, height2, paint);
                super.dispatchDraw(canvas);
                break;
            case 21:
                qh.q qVar = (qh.q) this.b;
                u71 u71Var = qVar.c;
                int i10 = qVar.e;
                if (i10 >= 0 && i10 < u71Var.getChildCount()) {
                    float width2 = (r2.getWidth() / 2.0f) + r2.getLeft();
                    if (u71Var.getChildAt(qVar.e).getWidth() != 0) {
                        if (Float.isNaN(qVar.f)) {
                            qVar.f = width2;
                        } else {
                            float f13 = qVar.f;
                            if (f13 != width2) {
                                float f14 = width2 - f13;
                                if (Math.abs(f14) >= 0.5f) {
                                    width2 = (f14 * 0.3f) + qVar.f;
                                }
                                qVar.f = width2;
                                u71Var.invalidate();
                            }
                        }
                        canvas.drawCircle(qVar.f, u71Var.getHeight() / 2.0f, (qVar.getHeight() - org.telegram.messenger.i0.L(6.0f)) / 2.0f, qVar.d);
                    }
                }
                super.dispatchDraw(canvas);
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
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.n0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            view = getChildAt(i11);
                            if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y3 < view.getY() || y3 > view.getY() + view.getHeight()) {
                                i11++;
                            }
                        } else {
                            view = null;
                        }
                    }
                    scrollSlidingTextTabStrip.c0 = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.c0));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.c0 = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.c0;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.c0);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < org.telegram.messenger.i0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.i0.L(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.i0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.i0.L(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.c0.getX();
                        int width2 = scrollSlidingTextTabStrip.c0.getWidth();
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
                            org.telegram.ui.Components.xl0 xl0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i10);
                            xl0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.c0;
                    if (view3 != null) {
                        final int i12 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.vl0
                            public final /* synthetic */ org.telegram.ui.u71 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.u71 u71Var = this.b;
                                        u71Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) u71Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.u71 u71Var2 = this.b;
                                        u71Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) u71Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.c0;
                    if (view4 != null) {
                        final int i13 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.vl0
                            public final /* synthetic */ org.telegram.ui.u71 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        org.telegram.ui.u71 u71Var = this.b;
                                        u71Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) u71Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.u71 u71Var2 = this.b;
                                        u71Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) u71Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                    }
                    scrollSlidingTextTabStrip.c0 = null;
                }
                return scrollSlidingTextTabStrip.c0 != null || super.dispatchTouchEvent(motionEvent);
            case 22:
                if (((rh.y3) this.b).a0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 23:
                if (((rh.h8) this.b).t0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 24:
                if (((wh.g) this.b).s0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 15:
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
            case 3:
                kg.v1 v1Var = (kg.v1) ((kg.f) this.b).d;
                if (view == v1Var.j2 && v1Var.z2) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                if (!(view instanceof org.telegram.ui.ActionBar.h1) || ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).N == null) {
                    return super.drawChild(canvas, view, j10);
                }
                return false;
            case 6:
                if (view == ((org.telegram.ui.Components.o8) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 9:
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) this.b;
                if (view instanceof org.telegram.ui.Components.jw0) {
                    ((org.telegram.ui.Components.jw0) view).a(ul0Var.i0);
                }
                if (view == ul0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                boolean drawChild = super.drawChild(canvas, view, j10);
                c60 c60Var = (c60) this.b;
                if (view == c60Var.b && c60Var.y != null) {
                    int measuredHeight = c60Var.s.getMeasuredHeight();
                    c60Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), c60Var.y.getIntrinsicHeight() + measuredHeight);
                    c60Var.y.draw(canvas);
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
                    org.telegram.ui.Cells.u0[] u0VarArr = (org.telegram.ui.Cells.u0[]) this.b;
                    if (i10 >= u0VarArr.length) {
                        break;
                    } else {
                        u0VarArr[i10].invalidate();
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
                accessibilityNodeInfo.setVisibleToUser(((be1) this.b).B0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return org.telegram.ui.ActionBar.q4.b((org.telegram.ui.ActionBar.q4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 7:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.kv) this.b).s.F && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.m5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Components.h10) this.b).c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 9:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.l0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Size size;
        int i12 = i11;
        int i13 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(123.0f), TLObject.FLAG_30));
                break;
            case 1:
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                bi.k2 k2Var = (bi.k2) this.b;
                LinearLayout linearLayout = k2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k2Var.m0.getLayoutParams();
                    paddingRight += k2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = k2Var.n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k2Var.n0.getLayoutParams();
                    paddingRight += k2Var.n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = k2Var.o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) k2Var.o0.getLayoutParams();
                    paddingRight += k2Var.o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                k2Var.k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i10, i11);
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                bi.i4 i4Var = (bi.i4) this.b;
                LinearLayout linearLayout4 = i4Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) i4Var.L.getLayoutParams();
                    paddingRight2 += i4Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = i4Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) i4Var.M.getLayoutParams();
                    paddingRight2 += i4Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = i4Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) i4Var.N.getLayoutParams();
                    paddingRight2 += i4Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                i4Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i10, i11);
                break;
            case 4:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.O) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    while (i14 < childCount) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(R.id.width_tag);
                            Object tag2 = childAt.getTag(R.id.object_tag);
                            Object tag3 = childAt.getTag(R.id.fit_width_tag);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i10, 0, i12, 0);
                            if (tag3 == null) {
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i15 = Math.max(i15, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i16 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = org.telegram.messenger.i0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.E;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i14++;
                        i12 = i11;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i13 < size4) {
                            ((View) arrayList.get(i13)).getLayoutParams().width = Math.max(i15, i16);
                            i13++;
                        }
                    }
                }
                super.onMeasure(i10, i11);
                break;
            case 5:
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.b;
                super.onMeasure((!org.telegram.ui.ActionBar.q4.b(q4Var) || (size = q4Var.J) == null) ? i10 : View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30), i12);
                break;
            case 7:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(((org.telegram.ui.Components.kv) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i12);
                break;
            case 12:
                super.onMeasure(i10, i11);
                if (org.telegram.messenger.cd.X) {
                    ((org.telegram.ui.Components.k31) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 15:
                int childCount2 = getChildCount();
                int i17 = 0;
                for (int i18 = 0; i18 < childCount2; i18++) {
                    if (getChildAt(i18).getVisibility() == 0) {
                        i17++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i12);
                if (i17 != 0) {
                    int min = Math.min(org.telegram.messenger.i0.L(56.0f), size5 / i17);
                    if (((PhotoViewer) this.b).j1.getVisibility() == 0) {
                        int max = Math.max(0, (min - org.telegram.messenger.i0.L(((PhotoViewer) this.b).Y7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).j1.setPadding(max, 0, max, 0);
                    }
                    while (i13 < childCount2) {
                        View childAt2 = getChildAt(i13);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                        }
                        i13++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i17), size6);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                    break;
                }
            case 17:
                super.onMeasure(i10, i11);
                tc1 tc1Var = (tc1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) tc1Var.c.getLayoutParams();
                int L = org.telegram.messenger.i0.L(8.0f) + (tc1Var.a.getVisibility() == 8 ? org.telegram.messenger.i0.m : 0);
                if (tc1Var.O == 2 && org.telegram.messenger.i0.O1()) {
                    Point point = org.telegram.messenger.i0.q;
                    if (point.x <= point.y) {
                        i13 = org.telegram.messenger.i0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i13;
                break;
            case 19:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.b6) this.b).A0) * getMeasuredHeight()));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 10:
                super.setAlpha(f7);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 11:
                org.telegram.ui.Components.dw0 dw0Var = (org.telegram.ui.Components.dw0) this.b;
                org.telegram.ui.Components.g9 g9Var = dw0Var.b;
                if (getVisibility() == 8 && i10 == 0) {
                    dw0Var.c();
                    if (org.telegram.messenger.sc.e(3)) {
                        g9Var.getImageReceiver().P0(false);
                    }
                } else if (i10 == 8) {
                    g9Var.getImageReceiver().f();
                }
                super.setVisibility(i10);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u71(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(ContextThemeWrapper contextThemeWrapper, final yo0 yo0Var) {
        super(contextThemeWrapper);
        this.a = 16;
        this.b = new org.telegram.ui.ActionBar.b1[]{r0, r0, r0, r0, r0};
        final int i10 = 1;
        setOrientation(1);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_speed_0_2, org.telegram.messenger.cd.L0(2131745281, null), false, null);
        c10.d(-328966, -328966);
        final int i11 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                yo0 yo0Var2 = yo0Var;
                switch (i12) {
                    case 0:
                        PhotoViewer photoViewer = yo0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = yo0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = yo0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = yo0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = yo0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_speed_slow, org.telegram.messenger.cd.L0(2131745284, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                yo0 yo0Var2 = yo0Var;
                switch (i12) {
                    case 0:
                        PhotoViewer photoViewer = yo0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = yo0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = yo0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = yo0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = yo0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_speed_normal, org.telegram.messenger.cd.L0(2131745285, null), false, null);
        c12.d(-328966, -328966);
        final int i12 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                yo0 yo0Var2 = yo0Var;
                switch (i122) {
                    case 0:
                        PhotoViewer photoViewer = yo0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = yo0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = yo0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = yo0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = yo0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_speed_fast, org.telegram.messenger.cd.L0(2131745288, null), false, null);
        c13.d(-328966, -328966);
        final int i13 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i13;
                yo0 yo0Var2 = yo0Var;
                switch (i122) {
                    case 0:
                        PhotoViewer photoViewer = yo0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = yo0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = yo0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = yo0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = yo0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_speed_superfast, org.telegram.messenger.cd.L0(2131745282, null), false, null);
        c14.d(-328966, -328966);
        final int i14 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i14;
                yo0 yo0Var2 = yo0Var;
                switch (i122) {
                    case 0:
                        PhotoViewer photoViewer = yo0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = yo0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = yo0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = yo0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = yo0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        View dg0Var = new dg0(contextThemeWrapper, 9);
        dg0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        dg0Var.setBackgroundColor(-15198184);
        addView(dg0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dg0Var.getLayoutParams();
        if (org.telegram.messenger.cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(8.0f);
        dg0Var.setLayoutParams(layoutParams);
    }
}
