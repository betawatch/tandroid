package rg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                bi.o1 o1Var = v2Var.H;
                if (o1Var != null) {
                    o1Var.run(null);
                    v2Var.H = null;
                }
                v2Var.dismiss();
                break;
        }
    }
}
