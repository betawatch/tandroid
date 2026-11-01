package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.Components.vu0 {
    public boolean f0;
    public final Paint g0;
    public final /* synthetic */ nb1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(nb1 nb1Var, Context context) {
        super(context, null);
        this.h0 = nb1Var;
        setWillNotDraw(false);
        this.g0 = new Paint();
    }

    @Override // org.telegram.ui.Components.vu0
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.uz.f()) {
            nb1 nb1Var = this.h0;
            if (nb1Var.h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                nb1Var.h1.e(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(org.telegram.messenger.at.I2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vu0
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            nb1 nb1Var = this.h0;
            if (i10 >= nb1Var.N.getChildCount()) {
                return;
            }
            View childAt = nb1Var.N.getChildAt(i10);
            if (childAt.getY() < org.telegram.messenger.i0.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + nb1Var.N.getX(), childAt.getY() + nb1Var.N.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.su0)) {
                    arrayList.add((org.telegram.ui.Components.su0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        nb1 nb1Var = this.h0;
        hi.f fVar = nb1Var.i1;
        hi.f fVar2 = nb1Var.h1;
        tg.f fVar3 = nb1Var.g1;
        if (Build.VERSION.SDK_INT >= 31 && fVar3 != null) {
            nb1Var.B0();
            zx zxVar = nb1Var.M0;
            int measuredWidth = zxVar != null ? zxVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            zx zxVar2 = nb1Var.M0;
            int measuredHeight = zxVar2 != null ? zxVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (fVar2 != null && !fVar2.r && fVar2.k(measuredWidth, measuredHeight)) {
                fVar3.b(fVar2.i(measuredWidth, measuredHeight), -3);
                fVar2.j();
            }
            if (fVar != null && !fVar.r && fVar.k(measuredWidth, measuredHeight)) {
                fVar3.b(fVar.i(measuredWidth, measuredHeight), -2);
                fVar.j();
            }
        }
        super.dispatchDraw(canvas);
        if (nb1Var.isInPreviewMode()) {
            int themedColor = nb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6);
            Paint paint = this.g0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (nb1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.t6.k0);
        } else {
            canvas2 = canvas;
        }
        if (nb1Var.M0 == null) {
            org.telegram.messenger.i0.O(canvas2, this, nb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6), nb1Var.f1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        nb1 nb1Var = this.h0;
        lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
        if (view == lVar && !nb1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
            float y3 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.w71 w71Var = nb1Var.a1;
            int measuredHeight = (int) (y3 + ((int) ((((w71Var == null || w71Var.getVisibility() == 8) ? 0.0f : nb1Var.a1.getMeasuredHeight()) * nb1Var.W) + height)));
            ((ActionBarLayout) nb1Var.getParentLayout()).p(canvas, (int) ((1.0f - nb1Var.W) * 255.0f), measuredHeight);
            float f7 = nb1Var.W;
            if (f7 > 0.0f) {
                if (f7 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.t6.k0.getAlpha();
                    org.telegram.ui.ActionBar.t6.k0.setAlpha((int) (alpha * nb1Var.W));
                    float f10 = measuredHeight;
                    canvas.drawLine(0.0f, f10, getMeasuredWidth(), f10, org.telegram.ui.ActionBar.t6.k0);
                    org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha);
                } else {
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.t6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.vu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & org.telegram.messenger.at.x1;
                int i23 = absoluteGravity & 7;
                if (i23 == 1) {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = layoutParams.leftMargin + paddingLeft;
                    if (i22 != 16) {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i22 != 80) {
                        i19 = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof org.telegram.ui.ActionBar.l)) {
                            nb1 nb1Var = this.h0;
                            if (!nb1Var.isInPreviewMode()) {
                                lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                                int top = lVar.getTop();
                                lVar2 = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                                i19 += lVar2.getMeasuredHeight() + top;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = paddingBottom - measuredHeight;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i22 != 16) {
                }
                i19 = i17 - i18;
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        nb1 nb1Var = this.h0;
        bg0 bg0Var = nb1Var.o0;
        if (bg0Var != null) {
            this.f0 = true;
            ViewGroup.LayoutParams layoutParams = bg0Var.getLayoutParams();
            int L = org.telegram.messenger.i0.L(51.0f);
            int i13 = nb1Var.f1;
            layoutParams.height = L + i13;
            nb1Var.o0.setPadding(0, 0, 0, i13);
            this.f0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, 0);
                } else {
                    i12 = i14;
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                    i16++;
                    i14 = i12;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }
}
