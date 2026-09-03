package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ ql0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.b;
                fn0Var.P0 = 2;
                fn0Var.D1();
                break;
            case 1:
                this.b.d1();
                break;
            case 2:
                fn0 fn0Var2 = this.b;
                fn0Var2.P0 = 3;
                fn0Var2.D1();
                break;
            case 3:
                fn0 fn0Var3 = this.b;
                fn0Var3.P0 = 1;
                fn0Var3.D1();
                break;
            case 4:
                fn0 fn0Var4 = this.b;
                fn0Var4.P0 = 4;
                fn0Var4.D1();
                break;
            case 5:
                fn0.e0(this.b);
                break;
            case 6:
                fn0 fn0Var5 = this.b;
                fn0Var5.f = true;
                fn0Var5.I.callOnClick();
                fn0Var5.f = false;
                break;
            case 7:
                fn0 fn0Var6 = this.b;
                fn0Var6.P0 = 0;
                fn0Var6.D1();
                break;
            case 8:
                fn0 fn0Var7 = this.b;
                fn0Var7.P0 = 4;
                fn0Var7.D1();
                break;
            case 9:
                this.b.d1();
                break;
            case 10:
                fn0.b0(this.b);
                break;
            case 11:
                fn0.c0(this.b);
                break;
            case 12:
                this.b.C1();
                break;
            case 13:
                fn0 fn0Var8 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var8.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sl0(fn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                fn0Var8.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.C1();
                break;
            case 15:
                fn0.V(this.b);
                break;
            default:
                fn0 fn0Var9 = this.b;
                fn0Var9.f = true;
                fn0Var9.I.callOnClick();
                fn0Var9.f = false;
                break;
        }
    }
}
