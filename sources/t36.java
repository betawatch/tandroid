// default package

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t36 implements ee, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i46 b;

    public /* synthetic */ t36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        i46 i46Var = this.b;
        i46Var.n1.getOnItemClickListener().g(i, view);
        if (i46Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                i46Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                i46Var.dismiss();
                heVar.dismiss();
                break;
            default:
                heVar.dismiss();
                i46Var.Z0();
                break;
        }
    }
}
