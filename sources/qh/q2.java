package qh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q2 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ z2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(z2 z2Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, zVar, 0, 0, false, g6Var);
        this.s0 = z2Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.s0.y.getText());
    }
}
