package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ w7(n8 n8Var, int i10) {
        this.a = i10;
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n8 n8Var = this.b;
                n8Var.R = true;
                n8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                b8 b8Var = this.b.r;
                b8Var.F = false;
                b8Var.invalidate();
                break;
        }
    }
}
