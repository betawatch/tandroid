package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ x7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                c8 c8Var = this.b.r;
                c8Var.F = false;
                c8Var.invalidate();
                break;
        }
    }
}
