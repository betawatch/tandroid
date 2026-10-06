package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
