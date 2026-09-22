package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ sg(bo boVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                boVar.getClass();
                boVar.presentFragment(bo.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
