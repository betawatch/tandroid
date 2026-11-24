// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pe6 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe6 b;

    public /* synthetic */ pe6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gl.d3(new tp5(this, (byte) 23));
                break;
            default:
                if (this.b.U != null) {
                    gl.d3(new tp5(this, (byte) 24));
                    break;
                }
                break;
        }
    }
}
