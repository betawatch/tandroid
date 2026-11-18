package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vu0 extends org.telegram.ui.Components.yo0 {
    public final /* synthetic */ wu0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(wu0 wu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = wu0Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.h3(new tr0(this, hVar, i7, 15), 250L);
        }
    }
}
