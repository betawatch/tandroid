package ug;

import android.view.View;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.r1, qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ w(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        l0 l0Var = this.b;
        l0Var.o1.getOnItemClickListener().c(i7, view);
        if (l0Var.d2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                l0Var.dismiss();
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                this.b.j1();
                break;
        }
    }
}
