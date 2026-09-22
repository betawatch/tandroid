package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ r2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new r2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                v2 v2Var = this.b;
                ai.y1 y1Var = v2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                break;
        }
    }
}
