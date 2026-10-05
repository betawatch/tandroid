package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
