package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ qi0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        bk0 bk0Var = this.b;
        switch (i7) {
            case 0:
                bk0Var.S0 = 2;
                bk0Var.H1();
                break;
            case 1:
                bk0Var.h1();
                break;
            case 2:
                bk0Var.S0 = 3;
                bk0Var.H1();
                break;
            case 3:
                bk0Var.S0 = 1;
                bk0Var.H1();
                break;
            case 4:
                bk0Var.S0 = 4;
                bk0Var.H1();
                break;
            case 5:
                if (bk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    s9 s9Var = new s9(0);
                    s9Var.M = new bj0(bk0Var);
                    bk0Var.presentFragment(s9Var);
                    break;
                } else {
                    bk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                bk0Var.f = true;
                bk0Var.L.callOnClick();
                bk0Var.f = false;
                break;
            case 7:
                bk0Var.S0 = 0;
                bk0Var.H1();
                break;
            case 8:
                bk0Var.S0 = 4;
                bk0Var.H1();
                break;
            case 9:
                bk0Var.h1();
                break;
            case 10:
                bk0.g0(bk0Var);
                break;
            case 11:
                bk0.h0(bk0Var);
                break;
            case 12:
                bk0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131744233, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131744234, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new si0(bk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                bk0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    break;
                }
                break;
            case 14:
                bk0Var.G1();
                break;
            case 15:
                bk0.a0(bk0Var);
                break;
            default:
                bk0Var.f = true;
                bk0Var.L.callOnClick();
                bk0Var.f = false;
                break;
        }
    }
}
