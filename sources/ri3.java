// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ri3 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ nk3 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri3(nk3 nk3Var, Context context, nk3 nk3Var2, byte b) {
        super(context, nk3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = nk3Var;
                super(context, nk3Var2, false);
                break;
            default:
                this.Y0 = nk3Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        nk3 nk3Var = this.Y0;
        switch (b) {
            case 0:
                nk3Var.L1.j(nk3Var.I1, i == 0, true);
                break;
            default:
                nk3Var.L1.j(nk3Var.K1, i == 0, true);
                break;
        }
    }
}
