package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ to(cp cpVar, int i10) {
        this.a = i10;
        this.b = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        cp cpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                if (cpVar.a0) {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, cpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, cpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(23, cpVar, currentChannel));
                cpVar.showDialog(e2Var);
                break;
            case 1:
                if (!cpVar.V) {
                    cpVar.V = true;
                    cpVar.d0();
                    break;
                }
                break;
            case 2:
                if (cpVar.V) {
                    if (!cpVar.c0) {
                        cpVar.b0();
                        break;
                    } else {
                        cpVar.V = false;
                        cpVar.d0();
                        break;
                    }
                }
                break;
            case 3:
                lh0 lh0Var = new lh0(cpVar.Z, 0L, 0);
                lh0Var.i0(cpVar.Y, cpVar.l0);
                cpVar.presentFragment(lh0Var);
                break;
            default:
                boolean z10 = !cpVar.b0;
                cpVar.b0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                break;
        }
    }
}
