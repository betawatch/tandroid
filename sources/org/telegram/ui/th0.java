package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class th0 extends FrameLayout {
    public TextView a;
    public RadioButton b;
    public org.telegram.ui.Components.fp c;
    public boolean d;
    public sh0 e;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 60.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
