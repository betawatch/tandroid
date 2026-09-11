package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ sg(co coVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                coVar.getClass();
                coVar.presentFragment(co.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
