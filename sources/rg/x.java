package rg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements b2, cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        j0 j0Var = this.b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                c2Var.dismiss();
                break;
            case 1:
                c2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                tg.n1.e0(0, null);
                break;
        }
    }
}
