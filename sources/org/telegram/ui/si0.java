package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class si0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ si0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        dk0 dk0Var = this.b;
        switch (i7) {
            case 0:
                dk0Var.S0 = 2;
                dk0Var.H1();
                break;
            case 1:
                dk0Var.h1();
                break;
            case 2:
                dk0Var.S0 = 3;
                dk0Var.H1();
                break;
            case 3:
                dk0Var.S0 = 1;
                dk0Var.H1();
                break;
            case 4:
                dk0Var.S0 = 4;
                dk0Var.H1();
                break;
            case 5:
                if (dk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    s9 s9Var = new s9(0);
                    s9Var.M = new dj0(dk0Var);
                    dk0Var.presentFragment(s9Var);
                    break;
                } else {
                    dk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                dk0Var.f = true;
                dk0Var.L.callOnClick();
                dk0Var.f = false;
                break;
            case 7:
                dk0Var.S0 = 0;
                dk0Var.H1();
                break;
            case 8:
                dk0Var.S0 = 4;
                dk0Var.H1();
                break;
            case 9:
                dk0Var.h1();
                break;
            case 10:
                dk0.g0(dk0Var);
                break;
            case 11:
                dk0.h0(dk0Var);
                break;
            case 12:
                dk0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744232, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131744233, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ui0(dk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                dk0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                    break;
                }
                break;
            case 14:
                dk0Var.G1();
                break;
            case 15:
                dk0.a0(dk0Var);
                break;
            default:
                dk0Var.f = true;
                dk0Var.L.callOnClick();
                dk0Var.f = false;
                break;
        }
    }
}
