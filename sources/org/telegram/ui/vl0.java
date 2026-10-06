package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                kn0.e0(this.b);
                break;
            case 6:
                kn0 kn0Var5 = this.b;
                kn0Var5.f = true;
                kn0Var5.L.callOnClick();
                kn0Var5.f = false;
                break;
            case 7:
                kn0 kn0Var6 = this.b;
                kn0Var6.S0 = 0;
                kn0Var6.D1();
                break;
            case 8:
                kn0 kn0Var7 = this.b;
                kn0Var7.S0 = 4;
                kn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                kn0.b0(this.b);
                break;
            case 11:
                kn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                kn0 kn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xl0(kn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                kn0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                kn0.T(this.b);
                break;
            default:
                kn0 kn0Var9 = this.b;
                kn0Var9.f = true;
                kn0Var9.L.callOnClick();
                kn0Var9.f = false;
                break;
        }
    }
}
