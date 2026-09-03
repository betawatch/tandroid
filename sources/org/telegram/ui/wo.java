package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp b;

    public /* synthetic */ wo(fp fpVar, int i10) {
        this.a = i10;
        this.b = fpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        fp fpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                if (fpVar.X) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(22, fpVar, currentChannel));
                fpVar.showDialog(d2Var);
                break;
            case 1:
                if (!fpVar.S) {
                    fpVar.S = true;
                    fpVar.b0();
                    break;
                }
                break;
            case 2:
                if (fpVar.S) {
                    if (!fpVar.Z) {
                        fpVar.Z();
                        break;
                    } else {
                        fpVar.S = false;
                        fpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                rh0 rh0Var = new rh0(fpVar.W, 0L, 0);
                rh0Var.g0(fpVar.V, fpVar.i0);
                fpVar.presentFragment(rh0Var);
                break;
            default:
                boolean z4 = !fpVar.Y;
                fpVar.Y = z4;
                ((org.telegram.ui.Cells.r8) view).setChecked(z4);
                break;
        }
    }
}
