// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
