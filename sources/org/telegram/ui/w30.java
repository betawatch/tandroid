package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w30 implements org.telegram.ui.ActionBar.a3 {
    public final /* synthetic */ u50 a;

    public w30(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // org.telegram.ui.ActionBar.a3
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a3
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        u50 u50Var = this.a;
        if (u50Var.F1 == 6) {
            u50.B0(u50Var);
        }
    }
}
