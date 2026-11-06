package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ yf(an anVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.getClass();
                anVar.presentFragment(an.ra(this.c.id));
                break;
            default:
                this.b.Ma(this.c);
                break;
        }
    }
}
