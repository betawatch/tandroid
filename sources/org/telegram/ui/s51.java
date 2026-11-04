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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s51 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s51(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                ai.a3 a3Var = (ai.a3) this.b;
                RectF rectF = a3Var.h;
                RectF rectF2 = a3Var.f;
                RectF rectF3 = a3Var.e;
                Paint paint = a3Var.n;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c6, false)));
                float e10 = a3Var.c.e(false, a3Var.b);
                double d = e10;
                int floor = (int) Math.floor(d);
                ArrayList arrayList = a3Var.d;
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
                org.telegram.messenger.g0.Z1(rectF3, rectF2, e10 - j10, rectF);
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                break;
            case 2:
                bi.r rVar = (bi.r) this.b;
                s51 s51Var = rVar.c;
                int i3 = rVar.e;
                if (i3 >= 0 && i3 < s51Var.getChildCount()) {
                    float width = (r2.getWidth() / 2.0f) + r2.getLeft();
                    if (s51Var.getChildAt(rVar.e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f)) {
                            rVar.f = width;
                        } else {
                            float f10 = rVar.f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f;
                                }
                                rVar.f = width;
                                s51Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f, s51Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 18:
                int width2 = getWidth() / 2;
                int height2 = getHeight() / 2;
                sb1 sb1Var = (sb1) this.b;
                Camera camera = sb1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = sb1Var.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f12 = -width2;
                float f13 = -height2;
                matrix.preTranslate(f12, f13);
                float f14 = width2;
                float f15 = height2;
                matrix.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = sb1Var.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f12, f13);
                matrix2.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
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
        int i3;
        View view;
        switch (this.a) {
            case 3:
                if (((ci.f6) this.b).b0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 4:
                if (((ci.wb) this.b).u0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 5:
                if (((hi.g) this.b).t0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.o0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            view = getChildAt(i10);
                            if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y9 < view.getY() || y9 > view.getY() + view.getHeight()) {
                                i10++;
                            }
                        } else {
                            view = null;
                        }
                    }
                    scrollSlidingTextTabStrip.d0 = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.d0));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.d0 = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.d0;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.d0);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.d0.getX();
                        int width2 = scrollSlidingTextTabStrip.d0.getWidth();
                        if (width < 0.0f) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            while (true) {
                                if (i3 < getChildCount()) {
                                    View childAt = getChildAt(i3);
                                    float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                        i3++;
                                    }
                                } else {
                                    i3 = getChildCount() - 1;
                                }
                            }
                        }
                        if (i3 != indexOfChild) {
                            org.telegram.ui.Components.yk0 yk0Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i3);
                            yk0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.d0;
                    if (view3 != null) {
                        final int i11 = 0;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.wk0
                            public final /* synthetic */ org.telegram.ui.s51 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        org.telegram.ui.s51 s51Var = this.b;
                                        s51Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) s51Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.s51 s51Var2 = this.b;
                                        s51Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) s51Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.d0;
                    if (view4 != null) {
                        final int i12 = 1;
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.wk0
                            public final /* synthetic */ org.telegram.ui.s51 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.s51 s51Var = this.b;
                                        s51Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) s51Var.b).invalidate();
                                        break;
                                    default:
                                        org.telegram.ui.s51 s51Var2 = this.b;
                                        s51Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) s51Var2.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                }
                return scrollSlidingTextTabStrip.d0 != null || super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 20:
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (getChildAt(i3).getVisibility() == 0) {
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
            case 9:
                if (!(view instanceof org.telegram.ui.ActionBar.c1) || ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).O == null) {
                    return super.drawChild(canvas, view, j10);
                }
                return false;
            case 11:
                if (view == ((org.telegram.ui.Components.r8) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.b;
                if (view instanceof org.telegram.ui.Components.ev0) {
                    ((org.telegram.ui.Components.ev0) view).a(vk0Var.j0);
                }
                if (view == vk0Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 19:
                boolean drawChild = super.drawChild(canvas, view, j10);
                y40 y40Var = (y40) this.b;
                if (view == y40Var.b && y40Var.y != null) {
                    int measuredHeight = y40Var.s.getMeasuredHeight();
                    y40Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), y40Var.y.getIntrinsicHeight() + measuredHeight);
                    y40Var.y.draw(canvas);
                }
                return drawChild;
            case 25:
                vg.h1 h1Var = (vg.h1) ((ci.r4) this.b).d;
                if (view == h1Var.k2 && h1Var.A2) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                int i3 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) this.b;
                    if (i3 >= v0VarArr.length) {
                        break;
                    } else {
                        v0VarArr[i3].invalidate();
                        i3++;
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
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((zb1) this.b).C0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 10:
                return org.telegram.ui.ActionBar.i4.b((org.telegram.ui.ActionBar.i4) this.b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 12:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.xu) this.b).s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.k5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 13:
                ((org.telegram.ui.Components.n00) this.b).c.a(getMeasuredWidth());
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 14:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 15:
                super.onLayout(z10, i3, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        Size size;
        int i11 = i10;
        int i12 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), TLObject.FLAG_30));
                break;
            case 7:
                int size2 = View.MeasureSpec.getSize(i3);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                mi.c2 c2Var = (mi.c2) this.b;
                LinearLayout linearLayout = c2Var.n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c2Var.n0.getLayoutParams();
                    paddingRight += c2Var.n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = c2Var.o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c2Var.o0.getLayoutParams();
                    paddingRight += c2Var.o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = c2Var.p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c2Var.p0.getLayoutParams();
                    paddingRight += c2Var.p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                c2Var.l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i3, i10);
                break;
            case 8:
                int size3 = View.MeasureSpec.getSize(i3);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                mi.y3 y3Var = (mi.y3) this.b;
                LinearLayout linearLayout4 = y3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) y3Var.M.getLayoutParams();
                    paddingRight2 += y3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = y3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) y3Var.N.getLayoutParams();
                    paddingRight2 += y3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = y3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) y3Var.O.getLayoutParams();
                    paddingRight2 += y3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                y3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i3, i10);
                break;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < childCount) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(R.id.width_tag);
                            Object tag2 = childAt.getTag(R.id.object_tag);
                            Object tag3 = childAt.getTag(R.id.fit_width_tag);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i3, 0, i11, 0);
                            if (tag3 == null) {
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i14 = Math.max(i14, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i15 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.F;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i13++;
                        i11 = i10;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i12 < size4) {
                            ((View) arrayList.get(i12)).getLayoutParams().width = Math.max(i14, i15);
                            i12++;
                        }
                    }
                }
                super.onMeasure(i3, i10);
                break;
            case 10:
                org.telegram.ui.ActionBar.i4 i4Var = (org.telegram.ui.ActionBar.i4) this.b;
                super.onMeasure((!org.telegram.ui.ActionBar.i4.b(i4Var) || (size = i4Var.J) == null) ? i3 : View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30), i11);
                break;
            case 12:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.xu) this.b).b.getChildCount() * 32), TLObject.FLAG_30)), i11);
                break;
            case 17:
                super.onMeasure(i3, i10);
                if (org.telegram.messenger.bd.a0) {
                    ((org.telegram.ui.Components.d21) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 20:
                int childCount2 = getChildCount();
                int i16 = 0;
                for (int i17 = 0; i17 < childCount2; i17++) {
                    if (getChildAt(i17).getVisibility() == 0) {
                        i16++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i11);
                if (i16 != 0) {
                    int min = Math.min(org.telegram.messenger.g0.L(56.0f), size5 / i16);
                    if (((PhotoViewer) this.b).k1.getVisibility() == 0) {
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(((PhotoViewer) this.b).Z7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).k1.setPadding(max, 0, max, 0);
                    }
                    while (i12 < childCount2) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                        }
                        i12++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i16), size6);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                    break;
                }
            case 22:
                super.onMeasure(i3, i10);
                ra1 ra1Var = (ra1) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) ra1Var.c.getLayoutParams();
                int L = org.telegram.messenger.g0.L(8.0f) + (ra1Var.a.getVisibility() == 8 ? org.telegram.messenger.g0.m : 0);
                if (ra1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x <= point.y) {
                        i12 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i12;
                break;
            case 24:
                super.onMeasure(i3, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.w5) this.b).B0) * getMeasuredHeight()));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 15:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 16:
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.b;
                org.telegram.ui.Components.k9 k9Var = zu0Var.b;
                if (getVisibility() == 8 && i3 == 0) {
                    zu0Var.c();
                    if (org.telegram.messenger.lc.e(3)) {
                        k9Var.getImageReceiver().P0(false);
                    }
                } else if (i3 == 8) {
                    k9Var.getImageReceiver().f();
                }
                super.setVisibility(i3);
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s51(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(ContextThemeWrapper contextThemeWrapper, final gn0 gn0Var) {
        super(contextThemeWrapper);
        this.a = 21;
        this.b = new org.telegram.ui.ActionBar.y0[]{r0, r0, r0, r0, r0};
        final int i3 = 1;
        setOrientation(1);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_speed_0_2, org.telegram.messenger.bd.M0(2131745273, null), false, null);
        c2.d(-328966, -328966);
        final int i10 = 0;
        c2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.d31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                gn0 gn0Var2 = gn0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c2.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_speed_slow, org.telegram.messenger.bd.M0(2131745276, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.d31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i3;
                gn0 gn0Var2 = gn0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_speed_normal, org.telegram.messenger.bd.M0(2131745277, null), false, null);
        c11.d(-328966, -328966);
        final int i11 = 2;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.d31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                gn0 gn0Var2 = gn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_speed_fast, org.telegram.messenger.bd.M0(2131745280, null), false, null);
        c12.d(-328966, -328966);
        final int i12 = 3;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.d31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                gn0 gn0Var2 = gn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_speed_superfast, org.telegram.messenger.bd.M0(2131745274, null), false, null);
        c13.d(-328966, -328966);
        final int i13 = 4;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.d31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                gn0 gn0Var2 = gn0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        View yg0Var = new yg0(contextThemeWrapper, 8);
        yg0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        yg0Var.setBackgroundColor(-15198184);
        addView(yg0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) yg0Var.getLayoutParams();
        if (org.telegram.messenger.bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        yg0Var.setLayoutParams(layoutParams);
    }
}
