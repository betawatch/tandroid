package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ry0 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ sy0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(sy0 sy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = sy0Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new zq0(this, hVar, i10, 25), 250L);
        }
    }
}
