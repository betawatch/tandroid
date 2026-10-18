package rg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ai.r0 r0Var = s2Var.H;
                if (r0Var != null) {
                    r0Var.run(null);
                    s2Var.H = null;
                }
                s2Var.dismiss();
                break;
        }
    }
}
