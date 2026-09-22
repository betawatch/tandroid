package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ yl0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                on0 on0Var = this.b;
                on0Var.S0 = 2;
                on0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                on0 on0Var2 = this.b;
                on0Var2.S0 = 3;
                on0Var2.D1();
                break;
            case 3:
                on0 on0Var3 = this.b;
                on0Var3.S0 = 1;
                on0Var3.D1();
                break;
            case 4:
                on0 on0Var4 = this.b;
                on0Var4.S0 = 4;
                on0Var4.D1();
                break;
            case 5:
                on0.e0(this.b);
                break;
            case 6:
                on0 on0Var5 = this.b;
                on0Var5.f = true;
                on0Var5.L.callOnClick();
                on0Var5.f = false;
                break;
            case 7:
                on0 on0Var6 = this.b;
                on0Var6.S0 = 0;
                on0Var6.D1();
                break;
            case 8:
                on0 on0Var7 = this.b;
                on0Var7.S0 = 4;
                on0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                on0.b0(this.b);
                break;
            case 11:
                on0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                on0 on0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var8.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new am0(on0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                on0Var8.showDialog(b2Var);
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
                on0.V(this.b);
                break;
            default:
                on0 on0Var9 = this.b;
                on0Var9.f = true;
                on0Var9.L.callOnClick();
                on0Var9.f = false;
                break;
        }
    }
}
