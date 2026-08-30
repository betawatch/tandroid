package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ w6(d7 d7Var, int i10) {
        this.a = i10;
        this.b = d7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d7.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                d7 d7Var = this.b;
                org.telegram.ui.Cells.i3 i3Var = d7Var.V;
                if (d7Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
