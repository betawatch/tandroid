package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y30 implements org.telegram.ui.ActionBar.d3 {
    public final /* synthetic */ v50 a;

    public y30(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // org.telegram.ui.ActionBar.d3
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d3
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        v50 v50Var = this.a;
        if (v50Var.F1 == 6) {
            v50.B0(v50Var);
        }
    }
}
