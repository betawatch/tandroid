// default package

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qk0 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ qk0(rk0 rk0Var) {
        this.b = rk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rk0 rk0Var = this.b;
        switch (b) {
            case 0:
                int i = rk0Var.w + 1;
                rk0Var.w = i;
                if (i >= 10) {
                    rk0Var.setVisibility(8);
                    gba.g1 = null;
                    gba.x();
                    break;
                }
                break;
            default:
                a.t();
                boolean z = w01.a;
                if (a.a.b(rk0Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = rk0Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            d01.t(rk0Var.getContext(), rk0Var.n.url);
                            break;
                        }
                    } else if (!a.a.u((Activity) rk0Var.getContext(), rk0Var.n.document)) {
                        ba4.G(rk0Var.s).X(rk0Var.n.document, "update", 3, 1);
                        rk0Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qk0(rk0 rk0Var, LaunchActivity launchActivity) {
        this.b = rk0Var;
    }
}
