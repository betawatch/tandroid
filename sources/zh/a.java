package zh;

import android.view.KeyEvent;
import android.view.View;
import bi.dd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
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
            case 2:
                if (((g1) this.b).Z1.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new dd(), d2Var);
                    break;
                }
                break;
            default:
                ((u2) this.b).performClick();
                break;
        }
    }
}
