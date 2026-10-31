package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y71 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.z9 a;
    public final org.telegram.ui.Components.nn0 b;
    public final org.telegram.ui.Cells.t8 c;
    public final int d;
    public final int e;
    public final TextPaint f;
    public int h;
    public int n;
    public final /* synthetic */ ThemeActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.z4 z4Var;
        this.r = themeActivity;
        this.d = 12;
        this.e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(context);
        this.b = nn0Var;
        nn0Var.setReportChanges(true);
        nn0Var.setSeparatorsCount(19);
        nn0Var.setDelegate(new z01(this, 3));
        nn0Var.setImportantForAccessibility(2);
        addView(nn0Var, w7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.v2.a;
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.c = t8Var;
        t8Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        t8Var.f(org.telegram.messenger.cd.L0(2131751832, null), org.telegram.messenger.tz.H0, false);
        t8Var.setOnClickListener(new a01(this, 7));
        z4Var = ((org.telegram.ui.ActionBar.k2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, z4Var, 0);
        this.a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.tz.W0, getMeasuredWidth() - org.telegram.messenger.i0.L(39.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.h != size) {
            int i12 = org.telegram.messenger.tz.W0;
            int i13 = this.d;
            this.b.setProgress((i12 - i13) / (this.e - i13));
            this.h = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.b.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.nn0 nn0Var = this.b;
        if (nn0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
            if (x02 != this.n) {
                this.n = x02;
                nn0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
