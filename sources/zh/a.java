package zh;

import android.view.View;
import bi.dd;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                ((c0) this.b).dismiss();
                break;
            default:
                if (((h1) this.b).W1.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new dd(), d2Var);
                    break;
                }
                break;
        }
    }
}
