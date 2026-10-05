package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sz0 extends org.telegram.ui.Components.br0 {
    public final /* synthetic */ ProfileActivity X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = profileActivity;
    }

    @Override // org.telegram.ui.Components.br0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new wx0(this, iVar, i10, 11), 250L);
        }
    }
}
