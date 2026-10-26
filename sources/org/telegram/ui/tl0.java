package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ tl0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                in0 in0Var = this.b;
                in0Var.S0 = 2;
                in0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                in0 in0Var2 = this.b;
                in0Var2.S0 = 3;
                in0Var2.D1();
                break;
            case 3:
                in0 in0Var3 = this.b;
                in0Var3.S0 = 1;
                in0Var3.D1();
                break;
            case 4:
                in0 in0Var4 = this.b;
                in0Var4.S0 = 4;
                in0Var4.D1();
                break;
            case 5:
                in0 in0Var5 = this.b;
                if (in0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    y9 y9Var = new y9(0);
                    y9Var.M = new fm0(in0Var5);
                    in0Var5.presentFragment(y9Var);
                    break;
                } else {
                    in0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                in0 in0Var6 = this.b;
                in0Var6.f = true;
                in0Var6.L.callOnClick();
                in0Var6.f = false;
                break;
            case 7:
                in0 in0Var7 = this.b;
                in0Var7.S0 = 0;
                in0Var7.D1();
                break;
            case 8:
                in0 in0Var8 = this.b;
                in0Var8.S0 = 4;
                in0Var8.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                in0.c0(this.b);
                break;
            case 11:
                in0.d0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                in0 in0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(in0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                in0Var9.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                in0.W(this.b);
                break;
            default:
                in0 in0Var10 = this.b;
                in0Var10.f = true;
                in0Var10.L.callOnClick();
                in0Var10.f = false;
                break;
        }
    }
}
