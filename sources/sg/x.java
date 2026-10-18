package sg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements a2, yl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.yl0
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

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                this.b.o1();
                break;
            default:
                this.b.dismiss();
                ug.m1.f0(0, null);
                break;
        }
    }
}
