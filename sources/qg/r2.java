package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
