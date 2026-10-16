package sg;

import android.view.View;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.ui.ActionBar.z1, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        j0 j0Var = this.b;
        j0Var.d.getOnItemClickListener().a(i10, view);
        if (j0Var.h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                a2Var.dismiss();
                break;
            case 1:
                a2Var.dismiss();
                this.b.o1();
                break;
            default:
                this.b.dismiss();
                ug.m1.f0(0, null);
                break;
        }
    }
}
