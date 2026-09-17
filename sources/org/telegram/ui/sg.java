package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
