// default package

import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xm8 extends wn8 {
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ml mlVar;
        super.dispatchDraw(canvas);
        vl vlVar = this.e;
        if (vlVar == null || (mlVar = vlVar.k) == null) {
            return;
        }
        mlVar.w0(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().E()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(k96.M0(2131754797, null));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131747624, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754817, null)));
    }
}
