package sg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ u(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                break;
            case 1:
                a0 a0Var = this.b.E0;
                if (!a0Var.h) {
                    a0Var.r.performClick();
                    break;
                } else {
                    a0Var.e.performClick();
                    break;
                }
            case 2:
                a0 a0Var2 = this.b.E0;
                if (!a0Var2.h) {
                    a0Var2.r.performClick();
                    break;
                } else {
                    a0Var2.e.performClick();
                    break;
                }
            default:
                k0.S(this.b);
                break;
        }
    }
}
