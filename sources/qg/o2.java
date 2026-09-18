package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ o2(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new o2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                s2 s2Var = this.b;
                ai.y1 y1Var = s2Var.H;
                if (y1Var != null) {
                    y1Var.run(null);
                    s2Var.H = null;
                }
                s2Var.dismiss();
                break;
        }
    }
}
