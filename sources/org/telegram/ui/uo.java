package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ uo(ep epVar, int i10) {
        this.a = i10;
        this.b = epVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ep epVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                if (epVar.X) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, epVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, epVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ng.w(22, epVar, currentChannel));
                epVar.showDialog(d2Var);
                break;
            case 1:
                if (!epVar.S) {
                    epVar.S = true;
                    epVar.b0();
                    break;
                }
                break;
            case 2:
                if (epVar.S) {
                    if (!epVar.Z) {
                        epVar.Z();
                        break;
                    } else {
                        epVar.S = false;
                        epVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                qh0 qh0Var = new qh0(epVar.W, 0L, 0);
                qh0Var.g0(epVar.V, epVar.i0);
                epVar.presentFragment(qh0Var);
                break;
            default:
                boolean z4 = !epVar.Y;
                epVar.Y = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                break;
        }
    }
}
