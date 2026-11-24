// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qg6 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;

    public /* synthetic */ qg6(rg6 rg6Var, byte b) {
        this.a = b;
        this.b = rg6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new pg6(this, (byte) 0));
                break;
            default:
                if (this.b.U != null) {
                    gm.c3(new pg6(this, (byte) 1));
                    break;
                }
                break;
        }
    }
}
