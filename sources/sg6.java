// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sg6 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg6 b;

    public /* synthetic */ sg6(tg6 tg6Var, byte b) {
        this.a = b;
        this.b = tg6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new z96(this, (byte) 8));
                break;
            default:
                if (this.b.U != null) {
                    hl.c3(new z96(this, (byte) 9));
                    break;
                }
                break;
        }
    }
}
