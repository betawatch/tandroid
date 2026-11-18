package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zu0 extends wv0 {
    public zu0(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fi.s2 s2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.o5 o5Var = this.e;
        if (o5Var == null || (s2Var = o5Var.k) == null) {
            return;
        }
        s2Var.P0(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754798, null));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747624, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.gd.M0(2131754818, null)));
    }
}
