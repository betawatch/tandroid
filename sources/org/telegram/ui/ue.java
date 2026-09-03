package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zn b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ue(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.b = znVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.k0(this.b, this.d, this.c, this.e);
                break;
            default:
                zn znVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ba);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new o9.b(znVar, messagesController, this.d, this.e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.Q = string2;
                znVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ ue(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.b = znVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z4;
    }
}
