package zh;

import android.view.View;
import bi.dd;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ a(na naVar, int i7) {
        this.a = i7;
        this.b = naVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.a) {
            case 0:
                ((d) this.b).dismiss();
                break;
            case 1:
                ((b0) this.b).dismiss();
                break;
            default:
                if (((g1) this.b).W1.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new dd(), d2Var);
                    break;
                }
                break;
        }
    }
}
