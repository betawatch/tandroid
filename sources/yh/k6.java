package yh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ k6(m7 m7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
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
                    R.showAsSheet(new z7(), l2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new z7(), l2Var2);
                    break;
                }
                break;
        }
    }
}
