package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ti0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ek0 ek0Var = this.b;
        switch (i7) {
            case 0:
                ek0Var.S0 = 2;
                ek0Var.H1();
                break;
            case 1:
                ek0Var.h1();
                break;
            case 2:
                ek0Var.S0 = 3;
                ek0Var.H1();
                break;
            case 3:
                ek0Var.S0 = 1;
                ek0Var.H1();
                break;
            case 4:
                ek0Var.S0 = 4;
                ek0Var.H1();
                break;
            case 5:
                if (ek0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    s9 s9Var = new s9(0);
                    s9Var.M = new ej0(ek0Var);
                    ek0Var.presentFragment(s9Var);
                    break;
                } else {
                    ek0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                ek0Var.f = true;
                ek0Var.L.callOnClick();
                ek0Var.f = false;
                break;
            case 7:
                ek0Var.S0 = 0;
                ek0Var.H1();
                break;
            case 8:
                ek0Var.S0 = 4;
                ek0Var.H1();
                break;
            case 9:
                ek0Var.h1();
                break;
            case 10:
                ek0.g0(ek0Var);
                break;
            case 11:
                ek0.h0(ek0Var);
                break;
            case 12:
                ek0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744232, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131744233, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new vi0(ek0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                ek0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    break;
                }
                break;
            case 14:
                ek0Var.G1();
                break;
            case 15:
                ek0.a0(ek0Var);
                break;
            default:
                ek0Var.f = true;
                ek0Var.L.callOnClick();
                ek0Var.f = false;
                break;
        }
    }
}
