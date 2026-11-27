// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w08 extends TimerTask {
    public final /* synthetic */ x08 a;

    public w08(x08 x08Var) {
        this.a = x08Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        x08 x08Var = this.a;
        if (x08Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        x08Var.E = (int) (x08Var.E - (currentTimeMillis - x08Var.G));
        x08Var.G = currentTimeMillis;
        hl.c3(new ge7(this, (byte) 25));
    }
}
