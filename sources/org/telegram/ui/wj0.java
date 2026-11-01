package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ wj0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        jl0 jl0Var = this.b;
        switch (i10) {
            case 0:
                jl0Var.S0 = 2;
                jl0Var.H1();
                break;
            case 1:
                jl0Var.h1();
                break;
            case 2:
                jl0Var.S0 = 3;
                jl0Var.H1();
                break;
            case 3:
                jl0Var.S0 = 1;
                jl0Var.H1();
                break;
            case 4:
                jl0Var.S0 = 4;
                jl0Var.H1();
                break;
            case 5:
                if (jl0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    u9 u9Var = new u9(0);
                    u9Var.M = new ik0(jl0Var);
                    jl0Var.presentFragment(u9Var);
                    break;
                } else {
                    jl0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                jl0Var.f = true;
                jl0Var.L.callOnClick();
                jl0Var.f = false;
                break;
            case 7:
                jl0Var.S0 = 0;
                jl0Var.H1();
                break;
            case 8:
                jl0Var.S0 = 4;
                jl0Var.H1();
                break;
            case 9:
                jl0Var.h1();
                break;
            case 10:
                jl0.g0(jl0Var);
                break;
            case 11:
                jl0.h0(jl0Var);
                break;
            case 12:
                jl0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131744257, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131744258, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new yj0(jl0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                jl0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    break;
                }
                break;
            case 14:
                jl0Var.G1();
                break;
            case 15:
                jl0.a0(jl0Var);
                break;
            default:
                jl0Var.f = true;
                jl0Var.L.callOnClick();
                jl0Var.f = false;
                break;
        }
    }
}
