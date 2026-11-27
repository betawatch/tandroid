// default package

import java.util.TimerTask;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
