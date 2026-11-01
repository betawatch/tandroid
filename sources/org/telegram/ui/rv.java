package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements org.telegram.messenger.as, org.telegram.messenger.ds {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.vs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rv(org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, boolean z10) {
        this.d = x1Var;
        this.e = k2Var;
        this.a = i10;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.as
    public void i(boolean z10) {
        zx zxVar = (zx) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        zx.x0(this.a, this.b, chat, zxVar, this.c, z10);
    }

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
        x1Var.dismiss();
        if (j10 == 0) {
            return;
        }
        org.telegram.messenger.wp.r1(this.a).O2(-j10, this.b, false, this.c, new z70(k2Var, j10, 2));
    }

    public /* synthetic */ rv(zx zxVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = zxVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }
}
