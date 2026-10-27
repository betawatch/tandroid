package tg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements b2, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        j0 j0Var = this.b;
        j0Var.d.getOnItemClickListener().c(i10, view);
        if (j0Var.h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                e2Var.dismiss();
                break;
            case 1:
                e2Var.dismiss();
                this.b.r1();
                break;
            default:
                this.b.dismiss();
                vg.n1.e0(0, null);
                break;
        }
    }
}
