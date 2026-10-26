package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w71 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ d81 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(d81 d81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.a1 = d81Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new fy0(this, hVar, i10, 22), 250L);
        }
    }
}
