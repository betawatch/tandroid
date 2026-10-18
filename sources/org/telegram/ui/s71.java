package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
