package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class y81 extends org.telegram.ui.Components.vq0 {
    public final /* synthetic */ f91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(f91 f91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = f91Var;
    }

    @Override // org.telegram.ui.Components.vq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new x81(this, iVar, i10), 250L);
        }
    }
}
