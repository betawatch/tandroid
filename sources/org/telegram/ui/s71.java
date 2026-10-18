package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s71 extends org.telegram.ui.Components.dr0 {
    public final /* synthetic */ z71 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(z71 z71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = z71Var;
    }

    @Override // org.telegram.ui.Components.dr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new m71(this, hVar, i10), 250L);
        }
    }
}
