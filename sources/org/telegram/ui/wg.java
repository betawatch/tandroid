package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ wg(wn wnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.getClass();
                wnVar.presentFragment(wn.ea(this.c.id));
                break;
            default:
                this.b.za(this.c);
                break;
        }
    }
}
