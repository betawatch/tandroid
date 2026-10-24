package rg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ai.r0 r0Var = u2Var.H;
                if (r0Var != null) {
                    r0Var.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                break;
        }
    }
}
