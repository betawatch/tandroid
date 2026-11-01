package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.Components.pp0 {
    public final /* synthetic */ z81 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(z81 z81Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = z81Var;
    }

    @Override // org.telegram.ui.Components.pp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            z81 z81Var = this.R2;
            if (m10 == 1) {
                z81Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                z81Var.a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
