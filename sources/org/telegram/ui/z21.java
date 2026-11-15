package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ z21(k31 k31Var, int i7) {
        this.a = i7;
        this.b = k31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        k31 k31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(k31Var.getParentActivity(), k31Var.getMessagesController().M5);
                k31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                k31Var.getClass();
                k31Var.presentFragment(new g(3));
                break;
            case 2:
                k31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                k31Var.getClass();
                k31Var.presentFragment(new xa1(8, null));
                break;
            case 4:
                k31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                k31.a0(k31Var);
                break;
            default:
                int i10 = k31Var.R + 1;
                k31Var.R = i10;
                if (i10 >= 2) {
                    k31Var.presentFragment(new tt());
                    break;
                } else {
                    boolean z10 = org.telegram.messenger.r2.a;
                    try {
                        Toast.makeText(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751625, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
