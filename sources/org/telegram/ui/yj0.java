package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ yj0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ll0 ll0Var = this.b;
        switch (i10) {
            case 0:
                ll0Var.S0 = 2;
                ll0Var.G1();
                break;
            case 1:
                ll0Var.g1();
                break;
            case 2:
                ll0Var.S0 = 3;
                ll0Var.G1();
                break;
            case 3:
                ll0Var.S0 = 1;
                ll0Var.G1();
                break;
            case 4:
                ll0Var.S0 = 4;
                ll0Var.G1();
                break;
            case 5:
                if (ll0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    u9 u9Var = new u9(0);
                    u9Var.M = new kk0(ll0Var);
                    ll0Var.presentFragment(u9Var);
                    break;
                } else {
                    ll0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                ll0Var.f = true;
                ll0Var.L.callOnClick();
                ll0Var.f = false;
                break;
            case 7:
                ll0Var.S0 = 0;
                ll0Var.G1();
                break;
            case 8:
                ll0Var.S0 = 4;
                ll0Var.G1();
                break;
            case 9:
                ll0Var.g1();
                break;
            case 10:
                ll0.f0(ll0Var);
                break;
            case 11:
                ll0.g0(ll0Var);
                break;
            case 12:
                ll0Var.F1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131744257, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131744258, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ak0(ll0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                ll0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    break;
                }
                break;
            case 14:
                ll0Var.F1();
                break;
            case 15:
                ll0.Z(ll0Var);
                break;
            default:
                ll0Var.f = true;
                ll0Var.L.callOnClick();
                ll0Var.f = false;
                break;
        }
    }
}
