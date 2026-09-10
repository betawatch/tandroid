package pg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ai.b bVar = t2Var.H;
                if (bVar != null) {
                    bVar.run(null);
                    t2Var.H = null;
                }
                t2Var.dismiss();
                break;
        }
    }
}
