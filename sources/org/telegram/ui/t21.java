package org.telegram.ui;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t21 extends org.telegram.ui.Components.lj0 {
    public final /* synthetic */ v21 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(v21 v21Var, Activity activity) {
        super(activity);
        this.r = v21Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.r.S.K) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
        }
    }
}
