package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ zu0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(zu0 zu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = zu0Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new tn0(this, hVar, i7, 25), 250L);
        }
    }
}
