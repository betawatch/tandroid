package rg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.ui.ActionBar.z1, ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.ol0
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

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                a2Var.dismiss();
                break;
            case 1:
                a2Var.dismiss();
                this.b.n1();
                break;
            default:
                this.b.dismiss();
                tg.m1.e0(0, null);
                break;
        }
    }
}
