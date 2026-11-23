package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ ti0(fk0 fk0Var, int i7) {
        this.a = i7;
        this.b = fk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        fk0 fk0Var = this.b;
        switch (i7) {
            case 0:
                fk0Var.T0 = 2;
                fk0Var.H1();
                break;
            case 1:
                fk0Var.h1();
                break;
            case 2:
                fk0Var.T0 = 3;
                fk0Var.H1();
                break;
            case 3:
                fk0Var.T0 = 1;
                fk0Var.H1();
                break;
            case 4:
                fk0Var.T0 = 4;
                fk0Var.H1();
                break;
            case 5:
                if (fk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    t9 t9Var = new t9(0);
                    t9Var.N = new fj0(fk0Var);
                    fk0Var.presentFragment(t9Var);
                    break;
                } else {
                    fk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                fk0Var.f = true;
                fk0Var.M.callOnClick();
                fk0Var.f = false;
                break;
            case 7:
                fk0Var.T0 = 0;
                fk0Var.H1();
                break;
            case 8:
                fk0Var.T0 = 4;
                fk0Var.H1();
                break;
            case 9:
                fk0Var.h1();
                break;
            case 10:
                fk0.g0(fk0Var);
                break;
            case 11:
                fk0.h0(fk0Var);
                break;
            case 12:
                fk0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743987, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131743988, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new vi0(fk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                fk0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                    break;
                }
                break;
            case 14:
                fk0Var.G1();
                break;
            case 15:
                fk0.a0(fk0Var);
                break;
            default:
                fk0Var.f = true;
                fk0Var.M.callOnClick();
                fk0Var.f = false;
                break;
        }
    }
}
