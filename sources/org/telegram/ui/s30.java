package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s30 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ o50 a;

    public s30(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        o50 o50Var = this.a;
        if (o50Var.B1 == 6) {
            o50.A0(o50Var);
        }
    }
}
