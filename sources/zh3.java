// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zh3 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ uj3 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh3(uj3 uj3Var, Context context, uj3 uj3Var2, byte b) {
        super(context, uj3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = uj3Var;
                super(context, uj3Var2, false);
                break;
            default:
                this.Y0 = uj3Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        uj3 uj3Var = this.Y0;
        switch (b) {
            case 0:
                uj3Var.L1.j(uj3Var.I1, i == 0, true);
                break;
            default:
                uj3Var.L1.j(uj3Var.K1, i == 0, true);
                break;
        }
    }
}
