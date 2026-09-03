package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ v6(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c7.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                c7 c7Var = this.b;
                org.telegram.ui.Cells.h3 h3Var = c7Var.V;
                if (c7Var.isShowing()) {
                    h3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(h3Var.b);
                    break;
                }
                break;
        }
    }
}
