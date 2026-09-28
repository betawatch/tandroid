package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class s81 extends org.telegram.ui.Components.wq0 {
    public final /* synthetic */ z81 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(z81 z81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = z81Var;
    }

    @Override // org.telegram.ui.Components.wq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new p81(this, iVar, i10), 250L);
        }
    }
}
