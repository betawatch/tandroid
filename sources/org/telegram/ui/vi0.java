package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ vi0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        hk0 hk0Var = this.b;
        switch (i7) {
            case 0:
                hk0Var.T0 = 2;
                hk0Var.H1();
                break;
            case 1:
                hk0Var.h1();
                break;
            case 2:
                hk0Var.T0 = 3;
                hk0Var.H1();
                break;
            case 3:
                hk0Var.T0 = 1;
                hk0Var.H1();
                break;
            case 4:
                hk0Var.T0 = 4;
                hk0Var.H1();
                break;
            case 5:
                if (hk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    t9 t9Var = new t9(0);
                    t9Var.N = new hj0(hk0Var);
                    hk0Var.presentFragment(t9Var);
                    break;
                } else {
                    hk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                hk0Var.f = true;
                hk0Var.M.callOnClick();
                hk0Var.f = false;
                break;
            case 7:
                hk0Var.T0 = 0;
                hk0Var.H1();
                break;
            case 8:
                hk0Var.T0 = 4;
                hk0Var.H1();
                break;
            case 9:
                hk0Var.h1();
                break;
            case 10:
                hk0.g0(hk0Var);
                break;
            case 11:
                hk0.h0(hk0Var);
                break;
            case 12:
                hk0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743991, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131743992, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new xi0(hk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                hk0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    break;
                }
                break;
            case 14:
                hk0Var.G1();
                break;
            case 15:
                hk0.a0(hk0Var);
                break;
            default:
                hk0Var.f = true;
                hk0Var.M.callOnClick();
                hk0Var.f = false;
                break;
        }
    }
}
