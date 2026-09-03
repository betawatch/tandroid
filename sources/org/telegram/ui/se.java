package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xn b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ se(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.b = xnVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn.k0(this.b, this.d, this.c, this.e);
                break;
            default:
                xn xnVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ba);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new o9.b(xnVar, messagesController, this.d, this.e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.Q = string2;
                xnVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ se(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.b = xnVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z4;
    }
}
