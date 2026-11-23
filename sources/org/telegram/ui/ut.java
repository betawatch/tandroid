package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ut extends org.telegram.ui.Components.ap0 {
    public final /* synthetic */ vt V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(vt vtVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = vtVar;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.h3(new ss(this, hVar, i7), 250L);
        }
    }
}
