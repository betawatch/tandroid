package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ co b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ue(co coVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.b = coVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co.k0(this.b, this.d, this.c, this.e);
                break;
            default:
                co coVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new ca.b(coVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string2;
                coVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ ue(co coVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = coVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
