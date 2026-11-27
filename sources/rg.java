// default package

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ rg(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                nx0Var.dismiss();
                break;
            case 1:
                nx0Var.I(((Integer) view.getTag()).intValue());
                break;
            case 2:
                nx0Var.dismiss();
                break;
            case 3:
                nx0Var.dismiss();
                break;
            case 4:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    nx0Var.dismiss();
                    break;
                }
                break;
            case 5:
                nx0Var.dismiss();
                break;
            case 6:
                nx0Var.dismiss();
                break;
            case 7:
                nx0Var.dismiss();
                break;
            default:
                nx0Var.dismiss();
                break;
        }
    }
}
