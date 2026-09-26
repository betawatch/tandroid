package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                if (fpVar.a0) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(16, fpVar, currentChannel));
                fpVar.showDialog(a2Var);
                break;
            case 1:
                if (!fpVar.V) {
                    fpVar.V = true;
                    fpVar.b0();
                    break;
                }
                break;
            case 2:
                if (fpVar.V) {
                    if (!fpVar.c0) {
                        fpVar.Z();
                        break;
                    } else {
                        fpVar.V = false;
                        fpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                sh0 sh0Var = new sh0(fpVar.Z, 0L, 0);
                sh0Var.g0(fpVar.Y, fpVar.l0);
                fpVar.presentFragment(sh0Var);
                break;
            default:
                boolean z10 = !fpVar.b0;
                fpVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
