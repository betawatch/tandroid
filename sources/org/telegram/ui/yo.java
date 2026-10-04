package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ yo(hp hpVar, int i10) {
        this.a = i10;
        this.b = hpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        hp hpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (hpVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, hpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, hpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(17, hpVar, currentChannel));
                hpVar.showDialog(b2Var);
                break;
            case 1:
                if (!hpVar.V) {
                    hpVar.V = true;
                    hpVar.b0();
                    break;
                }
                break;
            case 2:
                if (hpVar.V) {
                    if (!hpVar.c0) {
                        hpVar.Y();
                        break;
                    } else {
                        hpVar.V = false;
                        hpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                wh0 wh0Var = new wh0(hpVar.Z, 0L, 0);
                wh0Var.g0(hpVar.Y, hpVar.l0);
                hpVar.presentFragment(wh0Var);
                break;
            default:
                boolean z10 = !hpVar.b0;
                hpVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
