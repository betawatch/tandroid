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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.qt0 {
    public boolean g0;
    public final Paint h0;
    public final /* synthetic */ m91 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(m91 m91Var, Context context) {
        super(context, null);
        this.i0 = m91Var;
        setWillNotDraw(false);
        this.h0 = new Paint();
    }

    @Override // org.telegram.ui.Components.qt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.az.f()) {
            m91 m91Var = this.i0;
            if (m91Var.i1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                m91Var.i1.l(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(org.telegram.messenger.hs.I2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.qt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            m91 m91Var = this.i0;
            if (i3 >= m91Var.O.getChildCount()) {
                return;
            }
            View childAt = m91Var.O.getChildAt(i3);
            if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + m91Var.O.getX(), childAt.getY() + m91Var.O.getY() + getY());
                if (arrayList != null && (childAt instanceof org.telegram.ui.Components.nt0)) {
                    arrayList.add((org.telegram.ui.Components.nt0) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        m91 m91Var = this.i0;
        si.f fVar = m91Var.j1;
        si.f fVar2 = m91Var.i1;
        eh.g gVar = m91Var.h1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            m91Var.B0();
            uw uwVar = m91Var.N0;
            int measuredWidth = uwVar != null ? uwVar.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            uw uwVar2 = m91Var.N0;
            int measuredHeight = uwVar2 != null ? uwVar2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (fVar2 != null && !fVar2.r && fVar2.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.h(measuredWidth, measuredHeight), -3);
                fVar2.i();
            }
            if (fVar != null && !fVar.r && fVar.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar.h(measuredWidth, measuredHeight), -2);
                fVar.i();
            }
        }
        super.dispatchDraw(canvas);
        if (m91Var.isInPreviewMode()) {
            int themedColor = m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            Paint paint = this.h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (m91Var.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.k0);
        } else {
            canvas2 = canvas;
        }
        if (m91Var.N0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), m91Var.g1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        m91 m91Var = this.i0;
        kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
        if (view == kVar && !m91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
            float y9 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.m61 m61Var = m91Var.b1;
            int measuredHeight = (int) (y9 + ((int) ((((m61Var == null || m61Var.getVisibility() == 8) ? 0.0f : m91Var.b1.getMeasuredHeight()) * m91Var.X) + height)));
            ((ActionBarLayout) m91Var.getParentLayout()).p(canvas, (int) ((1.0f - m91Var.X) * 255.0f), measuredHeight);
            float f10 = m91Var.X;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (alpha * m91Var.X));
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
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i11 - i3) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection());
                int i21 = i20 & org.telegram.messenger.hs.x1;
                int i22 = absoluteGravity & 7;
                if (i22 == 1) {
                    i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = layoutParams.leftMargin + paddingLeft;
                    if (i21 != 16) {
                        i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i21 != 80) {
                        i18 = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof org.telegram.ui.ActionBar.k)) {
                            m91 m91Var = this.i0;
                            if (!m91Var.isInPreviewMode()) {
                                kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                                int top = kVar.getTop();
                                kVar2 = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                                i18 += kVar2.getMeasuredHeight() + top;
                            }
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = paddingBottom - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                } else {
                    i13 = paddingRight - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i21 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        m91 m91Var = this.i0;
        yg0 yg0Var = m91Var.p0;
        if (yg0Var != null) {
            this.g0 = true;
            ViewGroup.LayoutParams layoutParams = yg0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = m91Var.g1;
            layoutParams.height = L + i12;
            m91Var.p0.setPadding(0, 0, 0, i12);
            this.g0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i3, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i3, 0, i10, i11);
                    i15++;
                    i13 = i11;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
