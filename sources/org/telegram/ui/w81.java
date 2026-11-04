package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w81 extends org.telegram.ui.Components.t50 {
    public final /* synthetic */ long s2;
    public final /* synthetic */ y81 t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(y81 y81Var, Context context, int i3, a0.h hVar, long j10, org.telegram.ui.ActionBar.d2 d2Var, long j11) {
        super(context, i3, hVar, j10, d2Var, null);
        this.t2 = y81Var;
        this.s2 = j11;
    }

    @Override // org.telegram.ui.Components.t50
    public final boolean R0() {
        TLRPC.Chat M0 = this.t2.b.getMessagesController().M0(Long.valueOf(this.s2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
