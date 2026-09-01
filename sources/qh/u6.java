package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ u6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b7.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                b7 b7Var = this.b;
                org.telegram.ui.Cells.i3 i3Var = b7Var.V;
                if (b7Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
