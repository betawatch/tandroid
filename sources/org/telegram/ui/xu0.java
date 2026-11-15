package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xu0 extends vv0 {
    public xu0(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fi.u2 u2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.g5 g5Var = this.e;
        if (g5Var == null || (u2Var = g5Var.k) == null) {
            return;
        }
        u2Var.P0(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754798, null));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747817, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.M0(2131754818, null)));
    }
}
