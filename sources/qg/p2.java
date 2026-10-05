package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ p2(t2 t2Var, int i10) {
        this.a = i10;
        this.b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new p2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                t2 t2Var = this.b;
                ai.y1 y1Var = t2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    t2Var.H = null;
                }
                t2Var.dismiss();
                break;
        }
    }
}
