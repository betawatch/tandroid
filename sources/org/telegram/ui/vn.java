package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ vn(ho hoVar, int i7) {
        this.a = i7;
        this.b = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ho hoVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hoVar.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                if (hoVar.b0) {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131746021, hoVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131746022, hoVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new m2.d(22, hoVar, currentChannel));
                hoVar.showDialog(t1Var);
                break;
            case 1:
                if (!hoVar.W) {
                    hoVar.W = true;
                    hoVar.h0();
                    break;
                }
                break;
            case 2:
                if (hoVar.W) {
                    if (!hoVar.d0) {
                        hoVar.f0();
                        break;
                    } else {
                        hoVar.W = false;
                        hoVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                cf0 cf0Var = new cf0(hoVar.a0, 0, 0L);
                cf0Var.m0(hoVar.Z, hoVar.m0);
                hoVar.presentFragment(cf0Var);
                break;
            default:
                boolean z10 = !hoVar.c0;
                hoVar.c0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                break;
        }
    }
}
