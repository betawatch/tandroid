package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ya1 extends FrameLayout {
    public final org.telegram.ui.Cells.fa a;
    public final org.telegram.ui.Components.pn0 b;
    public final int c;
    public final int d;
    public final TextPaint e;
    public int f;
    public final /* synthetic */ ThemeActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        this.h = themeActivity;
        this.c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context);
        this.b = pn0Var;
        pn0Var.setReportChanges(true);
        pn0Var.setSeparatorsCount(19);
        pn0Var.setDelegate(new fv0(this, 4));
        pn0Var.setImportantForAccessibility(2);
        addView(pn0Var, g7.e6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, b5Var, 0);
        this.a = faVar;
        faVar.setImportantForAccessibility(4);
        addView(faVar, g7.e6.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        if (this.f != size) {
            int i11 = SharedConfig.fontSize;
            int i12 = this.c;
            this.b.setProgress((i11 - i12) / (this.d - i12));
            this.f = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        return super.performAccessibilityAction(i9, bundle) || this.b.getSeekBarAccessibilityDelegate().g(this, i9, bundle);
    }
}
