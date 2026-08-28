package yf;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ o2(t2 t2Var, int i9) {
        this.a = i9;
        this.b = t2Var;
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
                t2 t2Var = this.b;
                bg.i iVar = t2Var.D;
                if (iVar != null) {
                    iVar.run(null);
                    t2Var.D = null;
                }
                t2Var.dismiss();
                break;
        }
    }
}
