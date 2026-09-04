package sg;

import android.view.View;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements org.telegram.ui.ActionBar.a2, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ y(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        k0 k0Var = this.b;
        k0Var.d.getOnItemClickListener().a(i10, view);
        if (k0Var.h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                ug.n1.e0(0, null);
                break;
        }
    }
}
