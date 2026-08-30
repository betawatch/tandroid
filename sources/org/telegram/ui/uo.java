package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ uo(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        dp dpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                if (dpVar.X) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, dpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, dpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(22, dpVar, currentChannel));
                dpVar.showDialog(d2Var);
                break;
            case 1:
                if (!dpVar.S) {
                    dpVar.S = true;
                    dpVar.b0();
                    break;
                }
                break;
            case 2:
                if (dpVar.S) {
                    if (!dpVar.Z) {
                        dpVar.Z();
                        break;
                    } else {
                        dpVar.S = false;
                        dpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                ph0 ph0Var = new ph0(dpVar.W, 0L, 0);
                ph0Var.g0(dpVar.V, dpVar.i0);
                dpVar.presentFragment(ph0Var);
                break;
            default:
                boolean z4 = !dpVar.Y;
                dpVar.Y = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                break;
        }
    }
}
