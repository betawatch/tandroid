package rh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ d7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        org.telegram.ui.ActionBar.k2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    Q.showAsSheet(new h8(), i2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2();
                    i2Var2.a = true;
                    Q2.showAsSheet(new h8(), i2Var2);
                    break;
                }
                break;
        }
    }
}
