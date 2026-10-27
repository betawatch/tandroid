package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ vl0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.b;
                kn0Var.S0 = 2;
                kn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                kn0 kn0Var2 = this.b;
                kn0Var2.S0 = 3;
                kn0Var2.D1();
                break;
            case 3:
                kn0 kn0Var3 = this.b;
                kn0Var3.S0 = 1;
                kn0Var3.D1();
                break;
            case 4:
                kn0 kn0Var4 = this.b;
                kn0Var4.S0 = 4;
                kn0Var4.D1();
                break;
            case 5:
                kn0 kn0Var5 = this.b;
                if (kn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    y9 y9Var = new y9(0);
                    y9Var.M = new hm0(kn0Var5);
                    kn0Var5.presentFragment(y9Var);
                    break;
                } else {
                    kn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                kn0 kn0Var6 = this.b;
                kn0Var6.f = true;
                kn0Var6.L.callOnClick();
                kn0Var6.f = false;
                break;
            case 7:
                kn0 kn0Var7 = this.b;
                kn0Var7.S0 = 0;
                kn0Var7.D1();
                break;
            case 8:
                kn0 kn0Var8 = this.b;
                kn0Var8.S0 = 4;
                kn0Var8.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                kn0.c0(this.b);
                break;
            case 11:
                kn0.d0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                kn0 kn0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xl0(kn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                kn0Var9.showDialog(e2Var);
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
                kn0.W(this.b);
                break;
            default:
                kn0 kn0Var10 = this.b;
                kn0Var10.f = true;
                kn0Var10.L.callOnClick();
                kn0Var10.f = false;
                break;
        }
    }
}
