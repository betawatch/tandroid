package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public /* synthetic */ zl0(nn0 nn0Var, int i10) {
        this.a = i10;
        this.b = nn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nn0 nn0Var = this.b;
                nn0Var.S0 = 2;
                nn0Var.C1();
                break;
            case 1:
                this.b.c1();
                break;
            case 2:
                nn0 nn0Var2 = this.b;
                nn0Var2.S0 = 3;
                nn0Var2.C1();
                break;
            case 3:
                nn0 nn0Var3 = this.b;
                nn0Var3.S0 = 1;
                nn0Var3.C1();
                break;
            case 4:
                nn0 nn0Var4 = this.b;
                nn0Var4.S0 = 4;
                nn0Var4.C1();
                break;
            case 5:
                nn0 nn0Var5 = this.b;
                if (nn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    v9 v9Var = new v9(0);
                    v9Var.M = new km0(nn0Var5);
                    nn0Var5.presentFragment(v9Var);
                    break;
                } else {
                    nn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                nn0 nn0Var6 = this.b;
                nn0Var6.f = true;
                nn0Var6.L.callOnClick();
                nn0Var6.f = false;
                break;
            case 7:
                nn0 nn0Var7 = this.b;
                nn0Var7.S0 = 0;
                nn0Var7.C1();
                break;
            case 8:
                nn0 nn0Var8 = this.b;
                nn0Var8.S0 = 4;
                nn0Var8.C1();
                break;
            case 9:
                this.b.c1();
                break;
            case 10:
                nn0.b0(this.b);
                break;
            case 11:
                nn0.c0(this.b);
                break;
            case 12:
                this.b.B1();
                break;
            case 13:
                nn0 nn0Var9 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var9.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bm0(nn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                nn0Var9.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    break;
                }
                break;
            case 14:
                this.b.B1();
                break;
            case 15:
                nn0.V(this.b);
                break;
            default:
                nn0 nn0Var10 = this.b;
                nn0Var10.f = true;
                nn0Var10.L.callOnClick();
                nn0Var10.f = false;
                break;
        }
    }
}
