package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ wn(io ioVar, int i7) {
        this.a = i7;
        this.b = ioVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        io ioVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                if (ioVar.a0) {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlertChannel", null, 2131746021, ioVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlert", null, 2131746022, ioVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new ni.c(18, ioVar, currentChannel));
                ioVar.showDialog(u1Var);
                break;
            case 1:
                if (!ioVar.V) {
                    ioVar.V = true;
                    ioVar.h0();
                    break;
                }
                break;
            case 2:
                if (ioVar.V) {
                    if (!ioVar.c0) {
                        ioVar.f0();
                        break;
                    } else {
                        ioVar.V = false;
                        ioVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                ff0 ff0Var = new ff0(ioVar.Z, 0, 0L);
                ff0Var.m0(ioVar.Y, ioVar.l0);
                ioVar.presentFragment(ff0Var);
                break;
            default:
                boolean z9 = !ioVar.b0;
                ioVar.b0 = z9;
                ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                break;
        }
    }
}
