package ug;

import android.view.View;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.q1, sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ w(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        k0 k0Var = this.b;
        k0Var.o1.getOnItemClickListener().c(i7, view);
        if (k0Var.d2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                k0Var.dismiss();
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                this.b.j1();
                break;
        }
    }
}
