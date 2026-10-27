package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wy0 extends org.telegram.ui.Components.nr0 {
    public final /* synthetic */ xy0 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(xy0 xy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.a1 = xy0Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new by0(this, hVar, i10, 6), 250L);
        }
    }
}
