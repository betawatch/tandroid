// default package

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class u96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w96 b;

    public /* synthetic */ u96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad8 ad8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                ad8 ad8Var2 = w96Var.a;
                if (ad8Var2 != null) {
                    ad8Var2.d();
                    break;
                }
                break;
            default:
                oab oabVar = w96Var.c;
                if (oabVar != null && w96Var.P() && (ad8Var = w96Var.a) != null && ad8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    oabVar.S();
                    break;
                }
                break;
        }
    }
}
