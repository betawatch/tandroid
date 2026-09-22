package pg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ b0(e0 e0Var, t0 t0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.b, this.c, 1));
                break;
            default:
                e0 e0Var = this.b;
                e0Var.getClass();
                e0Var.i = this.c.a;
                break;
        }
    }
}
