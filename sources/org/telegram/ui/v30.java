package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class v30 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ s50 a;

    public v30(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        s50 s50Var = this.a;
        if (s50Var.F1 == 6) {
            s50.C0(s50Var);
        }
    }
}
