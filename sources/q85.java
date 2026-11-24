// default package

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q85 extends FrameLayout {
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !hc2.W(sharedInstance.getChat())) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131743108, null)));
        } else {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131743225, null)));
        }
    }
}
