package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ rl0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.b;
                gn0Var.S0 = 2;
                gn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                gn0 gn0Var2 = this.b;
                gn0Var2.S0 = 3;
                gn0Var2.D1();
                break;
            case 3:
                gn0 gn0Var3 = this.b;
                gn0Var3.S0 = 1;
                gn0Var3.D1();
                break;
            case 4:
                gn0 gn0Var4 = this.b;
                gn0Var4.S0 = 4;
                gn0Var4.D1();
                break;
            case 5:
                gn0.e0(this.b);
                break;
            case 6:
                gn0 gn0Var5 = this.b;
                gn0Var5.f = true;
                gn0Var5.L.callOnClick();
                gn0Var5.f = false;
                break;
            case 7:
                gn0 gn0Var6 = this.b;
                gn0Var6.S0 = 0;
                gn0Var6.D1();
                break;
            case 8:
                gn0 gn0Var7 = this.b;
                gn0Var7.S0 = 4;
                gn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                gn0.b0(this.b);
                break;
            case 11:
                gn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                gn0 gn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tl0(gn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                gn0Var8.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                gn0.V(this.b);
                break;
            default:
                gn0 gn0Var9 = this.b;
                gn0Var9.f = true;
                gn0Var9.L.callOnClick();
                gn0Var9.f = false;
                break;
        }
    }
}
