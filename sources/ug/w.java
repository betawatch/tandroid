package ug;

import android.view.View;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.r1, dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ w(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        i0 i0Var = this.b;
        i0Var.k1.getOnItemClickListener().c(i7, view);
        if (i0Var.Z1 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.C2.presentFragment(new PremiumPreviewFragment(0, null));
                i0Var.dismiss();
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                this.b.i1();
                break;
        }
    }
}
