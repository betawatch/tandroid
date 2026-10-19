package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t30 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ q50 a;

    public t30(q50 q50Var) {
        this.a = q50Var;
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
        q50 q50Var = this.a;
        if (q50Var.F1 == 6) {
            q50.C0(q50Var);
        }
    }
}
