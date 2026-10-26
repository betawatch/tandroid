package sg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ai.i iVar = v2Var.H;
                if (iVar != null) {
                    iVar.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                break;
        }
    }
}
