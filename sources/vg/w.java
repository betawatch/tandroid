package vg;

import android.view.View;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.p1, hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ w(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        i0 i0Var = this.b;
        i0Var.l1.getOnItemClickListener().f(i3, view);
        if (i0Var.a2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.D2.presentFragment(new PremiumPreviewFragment(0, null));
                i0Var.dismiss();
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                this.b.i1();
                break;
        }
    }
}
