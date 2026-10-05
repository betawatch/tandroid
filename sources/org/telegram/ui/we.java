package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yn b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ we(yn ynVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.b = ynVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn.m0(this.b, this.d, this.c, this.e);
                break;
            default:
                yn ynVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.ca);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new ca.b(ynVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string2;
                ynVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ we(yn ynVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = ynVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
