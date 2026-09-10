package qg;

import android.view.View;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements c2, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ y(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        k0 k0Var = this.b;
        k0Var.d.getOnItemClickListener().d(i10, view);
        if (k0Var.h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                d2Var.dismiss();
                break;
            case 1:
                d2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                sg.p1.e0(0, null);
                break;
        }
    }
}
