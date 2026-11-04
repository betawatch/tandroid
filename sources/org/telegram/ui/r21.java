package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c31 b;

    public /* synthetic */ r21(c31 c31Var, int i3) {
        this.a = i3;
        this.b = c31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        c31 c31Var = this.b;
        switch (i3) {
            case 0:
                sf.c.t(c31Var.getParentActivity(), c31Var.getMessagesController().L5);
                c31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                c31Var.getClass();
                c31Var.presentFragment(new g(3));
                break;
            case 2:
                c31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                c31Var.getClass();
                c31Var.presentFragment(new ra1(8, null));
                break;
            case 4:
                c31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                c31.a0(c31Var);
                break;
            default:
                int i10 = c31Var.R + 1;
                c31Var.R = i10;
                if (i10 >= 2) {
                    c31Var.presentFragment(new ot());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.r2.a;
                    try {
                        Toast.makeText(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131751626, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
