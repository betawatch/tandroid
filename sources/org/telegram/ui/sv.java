package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements org.telegram.messenger.zr, org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.us d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sv(org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, boolean z10) {
        this.d = x1Var;
        this.e = k2Var;
        this.a = i10;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        ay ayVar = (ay) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        ay.w0(this.a, this.b, chat, ayVar, this.c, z10);
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
        x1Var.dismiss();
        if (j10 == 0) {
            return;
        }
        org.telegram.messenger.vp.r1(this.a).O2(-j10, this.b, false, this.c, new a80(k2Var, j10, 2));
    }

    public /* synthetic */ sv(ay ayVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = ayVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }
}
