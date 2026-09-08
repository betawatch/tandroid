package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
