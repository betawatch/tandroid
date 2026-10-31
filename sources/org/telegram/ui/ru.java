package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ru extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ su R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = suVar;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.i0.h3(new xs(this, hVar, i10), 250L);
        }
    }
}
