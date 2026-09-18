package qg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
