package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ te(bo boVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
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
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string2;
                boVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ te(bo boVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = boVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
