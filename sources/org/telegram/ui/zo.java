package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;

    public /* synthetic */ zo(ip ipVar, int i10) {
        this.a = i10;
        this.b = ipVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ip ipVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (ipVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, ipVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, ipVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new l4(14, ipVar, currentChannel));
                ipVar.showDialog(b2Var);
                break;
            case 1:
                if (!ipVar.V) {
                    ipVar.V = true;
                    ipVar.b0();
                    break;
                }
                break;
            case 2:
                if (ipVar.V) {
                    if (!ipVar.c0) {
                        ipVar.Z();
                        break;
                    } else {
                        ipVar.V = false;
                        ipVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                zh0 zh0Var = new zh0(ipVar.Z, 0L, 0);
                zh0Var.g0(ipVar.Y, ipVar.l0);
                ipVar.presentFragment(zh0Var);
                break;
            default:
                boolean z10 = !ipVar.b0;
                ipVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
