// default package

import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;
    public final /* synthetic */ jm7 c;

    public /* synthetic */ xl7(lm7 lm7Var, jm7 jm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
        this.c = jm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jm7 jm7Var = this.c;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.z0(jm7Var);
                break;
            default:
                jm7Var.t = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = jm7Var.s;
                lm7Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new wl7(lm7Var, (byte) 1));
                break;
        }
    }
}
