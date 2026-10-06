package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ sg(yn ynVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                ynVar.getClass();
                ynVar.presentFragment(yn.Q9(this.c.id));
                break;
            default:
                this.b.la(this.c);
                break;
        }
    }
}
