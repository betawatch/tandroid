package zh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7 b;

    public /* synthetic */ e6(j7 j7Var, int i10) {
        this.a = i10;
        this.b = j7Var;
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
                    R.showAsSheet(new v7(), l2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new v7(), l2Var2);
                    break;
                }
                break;
        }
    }
}
