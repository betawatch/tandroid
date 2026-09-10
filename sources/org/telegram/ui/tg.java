package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ tg(eo eoVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                eoVar.getClass();
                eoVar.presentFragment(eo.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
