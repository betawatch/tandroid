// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qx7 extends TimerTask {
    public final /* synthetic */ rx7 a;

    public qx7(rx7 rx7Var) {
        this.a = rx7Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        rx7 rx7Var = this.a;
        if (rx7Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        rx7Var.E = (int) (rx7Var.E - (currentTimeMillis - rx7Var.G));
        rx7Var.G = currentTimeMillis;
        gl.d3(new oq7(this, (byte) 10));
    }
}
