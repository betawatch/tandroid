package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ta1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.mp0 a;
    public final int b;
    public final TextPaint c;
    public int d;
    public final /* synthetic */ ThemeActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(context);
        this.a = mp0Var;
        mp0Var.setReportChanges(true);
        mp0Var.setSeparatorsCount(18);
        mp0Var.setDelegate(new wv0(this, 3));
        mp0Var.setImportantForAccessibility(2);
        addView(mp0Var, org.telegram.ui.Components.kb1.h(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false);
        TextPaint textPaint = this.c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
        this.a.setProgress(SharedConfig.bubbleRadius / this.b);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.a.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.mp0 mp0Var = this.a;
        if (mp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
            if (x02 != this.d) {
                this.d = x02;
                mp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
