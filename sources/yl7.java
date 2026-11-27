// default package

import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;
    public final /* synthetic */ jm7 c;

    public /* synthetic */ yl7(lm7 lm7Var, jm7 jm7Var, byte b) {
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
                lm7Var.x0(jm7Var);
                break;
            default:
                jm7Var.t = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = jm7Var.s;
                lm7Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new xl7(lm7Var, (byte) 1));
                break;
        }
    }
}
