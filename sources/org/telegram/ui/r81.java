package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class r81 extends org.telegram.ui.Components.br0 {
    public final /* synthetic */ y81 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(y81 y81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = y81Var;
    }

    @Override // org.telegram.ui.Components.br0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new wx0(this, iVar, i10, 29), 250L);
        }
    }
}
