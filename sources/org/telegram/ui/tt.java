package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tt extends org.telegram.ui.Components.zo0 {
    public final /* synthetic */ ut V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(ut utVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = utVar;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.o(this, hVar, i7), 250L);
        }
    }
}
