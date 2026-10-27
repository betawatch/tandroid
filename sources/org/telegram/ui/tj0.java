package org.telegram.ui;

import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;
    public final /* synthetic */ xj0 c;

    public /* synthetic */ tj0(zj0 zj0Var, xj0 xj0Var, int i10) {
        this.a = i10;
        this.b = zj0Var;
        this.c = xj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(this.c);
                break;
            default:
                xj0 xj0Var = this.c;
                xj0Var.q = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = xj0Var.p;
                zj0 zj0Var = this.b;
                zj0Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new rj0(zj0Var, 1));
                break;
        }
    }
}
