package sg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ai.i iVar = u2Var.H;
                if (iVar != null) {
                    iVar.run(null);
                    u2Var.H = null;
                }
                u2Var.dismiss();
                break;
        }
    }
}
