package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.qm0 a;
    public final int b;
    public final TextPaint c;
    public int d;
    public final /* synthetic */ ThemeActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context);
        this.a = qm0Var;
        qm0Var.setReportChanges(true);
        qm0Var.setSeparatorsCount(18);
        qm0Var.setDelegate(new ur0(this, 3));
        qm0Var.setImportantForAccessibility(2);
        addView(qm0Var, c8.ja.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.gz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
        this.a.setProgress(org.telegram.messenger.gz.Y0 / this.b);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle) || this.a.getSeekBarAccessibilityDelegate().g(this, i7, bundle);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.qm0 qm0Var = this.a;
        if (qm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
            if (x02 != this.d) {
                this.d = x02;
                qm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
