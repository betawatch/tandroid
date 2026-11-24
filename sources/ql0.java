// default package

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql0 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rl0 b;

    public /* synthetic */ ql0(rl0 rl0Var) {
        this.b = rl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rl0 rl0Var = this.b;
        switch (b) {
            case 0:
                int i = rl0Var.w + 1;
                rl0Var.w = i;
                if (i >= 10) {
                    rl0Var.setVisibility(8);
                    gda.f1 = null;
                    gda.x();
                    break;
                }
                break;
            default:
                a.t();
                boolean z = e21.a;
                if (a.a.b(rl0Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = rl0Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            l11.u(rl0Var.getContext(), rl0Var.n.url);
                            break;
                        }
                    } else if (!a.a.u((Activity) rl0Var.getContext(), rl0Var.n.document)) {
                        bc4.G(rl0Var.s).X(rl0Var.n.document, "update", 3, 1);
                        rl0Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ql0(rl0 rl0Var, LaunchActivity launchActivity) {
        this.b = rl0Var;
    }
}
