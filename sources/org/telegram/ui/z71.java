package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a81 b;

    public /* synthetic */ z71(a81 a81Var, int i10) {
        this.a = i10;
        this.b = a81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.a) {
            case 0:
                a81 a81Var = this.b;
                String str = a81Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(a81Var.b.text);
                    sb = sb2.toString();
                } else {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.z4.u0(a81Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                break;
            default:
                org.telegram.ui.Components.z4.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
