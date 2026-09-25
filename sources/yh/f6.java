package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ f6(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    R.showAsSheet(new w7(), k2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var2 = new org.telegram.ui.ActionBar.k2();
                    k2Var2.a = true;
                    R2.showAsSheet(new w7(), k2Var2);
                    break;
                }
                break;
        }
    }
}
