package ph;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class r2 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ a3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(a3 a3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zVar, 0, 0, false, f6Var);
        this.s0 = a3Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.s0.y.getText());
    }
}
