package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tw0 extends org.telegram.ui.Components.pp0 {
    public final /* synthetic */ ProfileActivity R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.pp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.i0.h3(new hr0(this, hVar, i10, 18), 250L);
        }
    }
}
