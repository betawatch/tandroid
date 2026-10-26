package org.telegram.ui;

import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;
    public final /* synthetic */ vj0 c;

    public /* synthetic */ rj0(xj0 xj0Var, vj0 vj0Var, int i10) {
        this.a = i10;
        this.b = xj0Var;
        this.c = vj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(this.c);
                break;
            default:
                vj0 vj0Var = this.c;
                vj0Var.q = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = vj0Var.p;
                xj0 xj0Var = this.b;
                xj0Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new pj0(xj0Var, 1));
                break;
        }
    }
}
