package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ug(bo boVar, TLRPC.User user, int i10) {
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
