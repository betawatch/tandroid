// default package

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tib extends FrameLayout {
    public TextView a;
    public sib b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        sib sibVar = this.b;
        int i = this.d;
        o16 o16Var = (o16) sibVar;
        o16Var.getClass();
        z8c.h(i).a0 = null;
        byte b = 0;
        z8c.h(i).u(false);
        LaunchActivity launchActivity = o16Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((d) b10.f(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(gm.G).withEndAction(new kg5(o16Var, (byte) 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new nf2(b));
    }

    public void setDelegate(sib sibVar) {
        this.b = sibVar;
    }
}
