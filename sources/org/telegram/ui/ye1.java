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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ye1 extends org.telegram.ui.Components.pv0 {
    public boolean t0;
    public final Paint u0;
    public final /* synthetic */ sf1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye1(sf1 sf1Var, Context context) {
        super(context, null);
        this.v0 = sf1Var;
        setWillNotDraw(false);
        this.u0 = new Paint();
    }

    @Override // org.telegram.ui.Components.pv0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            sf1 sf1Var = this.v0;
            if (sf1Var.d1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                sf1Var.d1.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.pv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            sf1 sf1Var = this.v0;
            if (i10 >= sf1Var.K.getChildCount()) {
                return;
            }
            View childAt = sf1Var.K.getChildAt(i10);
            if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + sf1Var.K.getX(), childAt.getY() + sf1Var.K.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.mv0)) {
                    arrayList.add((org.telegram.ui.Components.mv0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        sf1 sf1Var = this.v0;
        tg.d dVar = sf1Var.e1;
        tg.d dVar2 = sf1Var.d1;
        og.e eVar = sf1Var.c1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            sf1Var.x0();
            py pyVar = sf1Var.J0;
            int measuredWidth = pyVar != null ? pyVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            py pyVar2 = sf1Var.J0;
            int measuredHeight = pyVar2 != null ? pyVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (dVar2 != null && !dVar2.n && dVar2.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.n && dVar.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (sf1Var.isInPreviewMode()) {
            int themedColor = sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            Paint paint = this.u0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (sf1Var.T * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.k0);
        } else {
            canvas2 = canvas;
        }
        if (sf1Var.J0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), sf1Var.b1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        sf1 sf1Var = this.v0;
        kVar = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
        if (view == kVar && !sf1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.k81 k81Var = sf1Var.X0;
            int measuredHeight = (int) (y10 + ((int) ((((k81Var == null || k81Var.getVisibility() == 8) ? 0.0f : sf1Var.X0.getMeasuredHeight()) * sf1Var.T) + height)));
            ((ActionBarLayout) sf1Var.getParentLayout()).p(canvas, (int) ((1.0f - sf1Var.T) * 255.0f), measuredHeight);
            float f10 = sf1Var.T;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (alpha * sf1Var.T));
                    float f11 = measuredHeight;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.k6.k0);
                    org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
                } else {
                    float f12 = measuredHeight;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.k6.k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
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
                int i22 = i21 & 112;
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
                        if (!(childAt instanceof org.telegram.ui.ActionBar.k)) {
                            sf1 sf1Var = this.v0;
                            if (!sf1Var.isInPreviewMode()) {
                                kVar = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
                                int top = kVar.getTop();
                                kVar2 = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
                                i19 += kVar2.getMeasuredHeight() + top;
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
        sf1 sf1Var = this.v0;
        h51 h51Var = sf1Var.l0;
        if (h51Var != null) {
            this.t0 = true;
            ViewGroup.LayoutParams layoutParams = h51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = sf1Var.b1;
            layoutParams.height = dp + i13;
            sf1Var.l0.setPadding(0, 0, 0, i13);
            this.t0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
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
        if (this.t0) {
            return;
        }
        super.requestLayout();
    }
}
