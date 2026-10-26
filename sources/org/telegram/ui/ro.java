package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ ro(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ap apVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(apVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                if (apVar.a0) {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, apVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, apVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(23, apVar, currentChannel));
                apVar.showDialog(e2Var);
                break;
            case 1:
                if (!apVar.V) {
                    apVar.V = true;
                    apVar.d0();
                    break;
                }
                break;
            case 2:
                if (apVar.V) {
                    if (!apVar.c0) {
                        apVar.b0();
                        break;
                    } else {
                        apVar.V = false;
                        apVar.d0();
                        break;
                    }
                }
                break;
            case 3:
                jh0 jh0Var = new jh0(apVar.Z, 0L, 0);
                jh0Var.i0(apVar.Y, apVar.l0);
                apVar.presentFragment(jh0Var);
                break;
            default:
                boolean z10 = !apVar.b0;
                apVar.b0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                break;
        }
    }
}
