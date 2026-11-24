// default package

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ox2 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ox2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((Timer) ((v22) this.c).h).cancel();
                    ((v22) this.c).h = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                Utilities.g.c(new gu2((v22) this.c, (String) this.b, (byte) 4));
                return;
            case 1:
                dq5 dq5Var = (dq5) this.c;
                try {
                    dq5Var.f.cancel();
                    dq5Var.f = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                gl.d3(new cq5(this, (String) this.b, (byte) 0));
                return;
            case 2:
                synchronized (((MediaController) this.c).x1) {
                    gl.d3(new oh6((Object) this, this.b, (byte) 6));
                }
                return;
            default:
                sr9 sr9Var = (sr9) this.c;
                try {
                    sr9Var.n.cancel();
                    sr9Var.n = null;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                String str = (String) this.b;
                sr9Var.getClass();
                gl.d3(new tj9(sr9Var, str, (byte) 11));
                return;
        }
    }
}
