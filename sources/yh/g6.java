package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ g6(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new x7(), l2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new x7(), l2Var2);
                    break;
                }
                break;
        }
    }
}
