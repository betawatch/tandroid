package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
