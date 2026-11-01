package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xa1 extends org.telegram.ui.Components.m60 {
    public final /* synthetic */ long r2;
    public final /* synthetic */ za1 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(za1 za1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, long j11) {
        super(context, i10, hVar, j10, k2Var, null);
        this.s2 = za1Var;
        this.r2 = j11;
    }

    @Override // org.telegram.ui.Components.m60
    public final boolean R0() {
        TLRPC.Chat L0 = this.s2.b.getMessagesController().L0(Long.valueOf(this.r2));
        return L0 != null && org.telegram.messenger.w3.y(3, L0);
    }
}
