// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uq1 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ mu1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(mu1 mu1Var, Context context, mu1 mu1Var2, wjb wjbVar, byte b) {
        super(context, mu1Var2, null, true, wjbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = mu1Var;
                super(context, mu1Var2, null, false, wjbVar);
                break;
            default:
                this.Y0 = mu1Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        mu1 mu1Var = this.Y0;
        switch (b) {
            case 0:
                mu1Var.b1.j(mu1Var.p2, i == 0, true);
                break;
            default:
                mu1Var.b1.j(mu1Var.n2, i == 0, true);
                break;
        }
    }
}
