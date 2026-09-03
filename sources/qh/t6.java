package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ t6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a7.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                a7 a7Var = this.b;
                org.telegram.ui.Cells.i3 i3Var = a7Var.V;
                if (a7Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
