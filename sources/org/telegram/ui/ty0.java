package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ty0 extends org.telegram.ui.Components.mq0 {
    public final /* synthetic */ uy0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(uy0 uy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = uy0Var;
    }

    @Override // org.telegram.ui.Components.mq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new br0(this, hVar, i10, 24), 250L);
        }
    }
}
