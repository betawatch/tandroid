package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qz0 extends org.telegram.ui.Components.jr0 {
    public final /* synthetic */ rz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(rz0 rz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = rz0Var;
    }

    @Override // org.telegram.ui.Components.jr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new hz0(this, hVar, i10, 2), 250L);
        }
    }
}
