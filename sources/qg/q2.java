package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ q2(u2 u2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                u2 u2Var = this.b;
                ai.y1 y1Var = u2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                break;
        }
    }
}
