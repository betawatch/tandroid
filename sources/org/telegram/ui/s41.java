package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ s41(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        e51 e51Var = this.b;
        switch (i10) {
            case 0:
                gf.f.r(e51Var.getParentActivity(), e51Var.getMessagesController().M5);
                e51Var.getMessagesController().h4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                e51Var.getClass();
                e51Var.presentFragment(new f(3));
                break;
            case 2:
                e51Var.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                e51Var.getClass();
                e51Var.presentFragment(new tc1(8, null));
                break;
            case 4:
                e51Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                e51.Z(e51Var);
                break;
            default:
                int i11 = e51Var.Q + 1;
                e51Var.Q = i11;
                if (i11 >= 2) {
                    e51Var.presentFragment(new su());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.v2.a;
                    try {
                        Toast.makeText(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131751626, null), 0).show();
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
        }
    }
}
