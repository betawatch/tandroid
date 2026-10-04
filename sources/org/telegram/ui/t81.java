package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t81 extends org.telegram.ui.Components.zq0 {
    public final /* synthetic */ a91 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(a91 a91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = a91Var;
    }

    @Override // org.telegram.ui.Components.zq0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new wx0(this, iVar, i10, 29), 250L);
        }
    }
}
