package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.z9 a;
    public final org.telegram.ui.Components.pm0 b;
    public final org.telegram.ui.Cells.q8 c;
    public final int d;
    public final int e;
    public final TextPaint f;
    public int h;
    public int n;
    public final /* synthetic */ ThemeActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w51(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        this.r = themeActivity;
        this.d = 12;
        this.e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context);
        this.b = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setSeparatorsCount(19);
        pm0Var.setDelegate(new mr0(this, 4));
        pm0Var.setImportantForAccessibility(2);
        addView(pm0Var, b8.mf.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.c = q8Var;
        q8Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        q8Var.f(org.telegram.messenger.bd.M0(2131751832, null), org.telegram.messenger.az.H0, false);
        q8Var.setOnClickListener(new cy0(this, 7));
        q4Var = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 0);
        this.a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.az.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.h != size) {
            int i11 = org.telegram.messenger.az.W0;
            int i12 = this.d;
            this.b.setProgress((i11 - i12) / (this.e - i12));
            this.h = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return super.performAccessibilityAction(i3, bundle) || this.b.getSeekBarAccessibilityDelegate().g(this, i3, bundle);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.pm0 pm0Var = this.b;
        if (pm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
            if (x02 != this.n) {
                this.n = x02;
                pm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
