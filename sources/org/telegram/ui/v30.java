package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v30 implements org.telegram.ui.ActionBar.y2 {
    public final /* synthetic */ s50 a;

    public v30(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        s50 s50Var = this.a;
        if (s50Var.B1 == 6) {
            s50.B0(s50Var);
        }
    }
}
