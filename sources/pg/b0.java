package pg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ b0(d0 d0Var, r0 r0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.b, this.c, 1));
                break;
            default:
                d0 d0Var = this.b;
                d0Var.getClass();
                d0Var.i = this.c.a;
                break;
        }
    }
}
