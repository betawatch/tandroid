package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ sl0(in0 in0Var, int i10) {
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
                in0.e0(this.b);
                break;
            case 6:
                in0 in0Var5 = this.b;
                in0Var5.f = true;
                in0Var5.L.callOnClick();
                in0Var5.f = false;
                break;
            case 7:
                in0 in0Var6 = this.b;
                in0Var6.S0 = 0;
                in0Var6.D1();
                break;
            case 8:
                in0 in0Var7 = this.b;
                in0Var7.S0 = 4;
                in0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                in0.b0(this.b);
                break;
            case 11:
                in0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                in0 in0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ul0(in0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                in0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                in0.V(this.b);
                break;
            default:
                in0 in0Var9 = this.b;
                in0Var9.f = true;
                in0Var9.L.callOnClick();
                in0Var9.f = false;
                break;
        }
    }
}
