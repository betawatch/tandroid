package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zu0 extends wv0 {
    public zu0(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        di.z2 z2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.i5 i5Var = this.e;
        if (i5Var == null || (z2Var = i5Var.k) == null) {
            return;
        }
        z2Var.P0(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().L()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754798, null));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131747818, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.id.M0(2131754818, null)));
    }
}
