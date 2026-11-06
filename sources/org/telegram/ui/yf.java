package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
