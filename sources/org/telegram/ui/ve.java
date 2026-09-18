package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ve(bo boVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.b = boVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo.k0(this.b, this.d, this.c, this.e);
                break;
            default:
                bo boVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new ca.b(boVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.T = string2;
                boVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ ve(bo boVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = boVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
