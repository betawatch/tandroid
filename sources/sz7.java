// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sz7 extends TimerTask {
    public final /* synthetic */ tz7 a;

    public sz7(tz7 tz7Var) {
        this.a = tz7Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        tz7 tz7Var = this.a;
        if (tz7Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tz7Var.E = (int) (tz7Var.E - (currentTimeMillis - tz7Var.G));
        tz7Var.G = currentTimeMillis;
        gm.c3(new kl7(this, (byte) 17));
    }
}
