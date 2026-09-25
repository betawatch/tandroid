package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ue(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.b = wnVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.g1(this.b, this.d, this.c, this.e);
                break;
            default:
                wn wnVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new ca.b(wnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.T = string2;
                wnVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ ue(wn wnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = wnVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
