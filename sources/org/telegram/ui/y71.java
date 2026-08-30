package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ y71(z71 z71Var, int i10) {
        this.a = i10;
        this.b = z71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.a) {
            case 0:
                z71 z71Var = this.b;
                String str = z71Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(z71Var.b.text);
                    sb = sb2.toString();
                } else {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.z4.u0(z71Var.c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                break;
            default:
                org.telegram.ui.Components.z4.u0(this.b.c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
