package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ xo(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        gp gpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (gpVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new u(15, gpVar, currentChannel));
                gpVar.showDialog(b2Var);
                break;
            case 1:
                if (!gpVar.V) {
                    gpVar.V = true;
                    gpVar.b0();
                    break;
                }
                break;
            case 2:
                if (gpVar.V) {
                    if (!gpVar.c0) {
                        gpVar.Z();
                        break;
                    } else {
                        gpVar.V = false;
                        gpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                th0 th0Var = new th0(gpVar.Z, 0L, 0);
                th0Var.g0(gpVar.Y, gpVar.l0);
                gpVar.presentFragment(th0Var);
                break;
            default:
                boolean z10 = !gpVar.b0;
                gpVar.b0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                break;
        }
    }
}
