package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ c81 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(c81 c81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.e1 = c81Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new o71(this, hVar, i10), 250L);
        }
    }
}
