package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z81 extends org.telegram.ui.Components.iq0 {
    public final /* synthetic */ g91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(g91 g91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = g91Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ky0(this, iVar, i10, 26), 250L);
        }
    }
}
