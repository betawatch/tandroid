// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q42 extends wc6 {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ fn7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q42(uc6 uc6Var, Context context, vnb vnbVar, boolean z) {
        super(vnbVar, context, false, z);
        this.F = uc6Var;
    }

    @Override // j79
    public final void f() {
        byte b = this.E;
        fn7 fn7Var = this.F;
        switch (b) {
            case 0:
                s42 s42Var = (s42) fn7Var;
                q42 q42Var = s42Var.O;
                s7 s7Var = s42Var.x;
                if (s7Var != null) {
                    s7Var.setShowSearchProgress(q42Var.w);
                }
                TextView textView = s42Var.w;
                if (textView != null) {
                    textView.setText(ob6.a0(null, null, 2131747896, q42Var.h));
                }
                super.f();
                break;
            default:
                uc6 uc6Var = (uc6) fn7Var;
                sla slaVar = uc6Var.r;
                if (slaVar != null) {
                    slaVar.setShowSearchProgress(uc6Var.T.w);
                }
                TextView textView2 = uc6Var.n;
                if (textView2 != null) {
                    textView2.setText(ob6.a0(null, null, 2131747896, uc6Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q42(s42 s42Var, Context context, vnb vnbVar, boolean z) {
        super(vnbVar, context, z, false);
        this.F = s42Var;
    }
}
