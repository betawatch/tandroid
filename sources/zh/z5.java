package zh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ z5(d7 d7Var, int i10) {
        this.a = i10;
        this.b = d7Var;
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
                    R.showAsSheet(new p7(), k2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var2 = new org.telegram.ui.ActionBar.k2();
                    k2Var2.a = true;
                    R2.showAsSheet(new p7(), k2Var2);
                    break;
                }
                break;
        }
    }
}
