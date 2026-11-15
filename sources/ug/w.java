package ug;

import android.view.View;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.q1, ij0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ w(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        j0 j0Var = this.b;
        j0Var.o1.getOnItemClickListener().b(i7, view);
        if (j0Var.d2 != 19) {
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
                j0 j0Var = this.b;
                j0Var.G2.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                this.b.i1();
                break;
        }
    }
}
