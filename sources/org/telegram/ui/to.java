package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                if (cpVar.a0) {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlertChannel", null, 2131746038, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                } else {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlert", null, 2131746039, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746041, null), new ng.d(18, cpVar, currentChannel));
                cpVar.showDialog(x1Var);
                break;
            case 1:
                if (!cpVar.V) {
                    cpVar.V = true;
                    cpVar.h0();
                    break;
                }
                break;
            case 2:
                if (cpVar.V) {
                    if (!cpVar.c0) {
                        cpVar.f0();
                        break;
                    } else {
                        cpVar.V = false;
                        cpVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                ig0 ig0Var = new ig0(cpVar.Z, 0, 0L);
                ig0Var.m0(cpVar.Y, cpVar.l0);
                cpVar.presentFragment(ig0Var);
                break;
            default:
                boolean z10 = !cpVar.b0;
                cpVar.b0 = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                break;
        }
    }
}
