package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ xn(jo joVar, int i7) {
        this.a = i7;
        this.b = joVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        jo joVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(joVar.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                if (joVar.b0) {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745826, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745827, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new oi.e0(20, joVar, currentChannel));
                joVar.showDialog(u1Var);
                break;
            case 1:
                if (!joVar.W) {
                    joVar.W = true;
                    joVar.h0();
                    break;
                }
                break;
            case 2:
                if (joVar.W) {
                    if (!joVar.d0) {
                        joVar.f0();
                        break;
                    } else {
                        joVar.W = false;
                        joVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                ff0 ff0Var = new ff0(joVar.a0, 0, 0L);
                ff0Var.m0(joVar.Z, joVar.m0);
                joVar.presentFragment(ff0Var);
                break;
            default:
                boolean z10 = !joVar.c0;
                joVar.c0 = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                break;
        }
    }
}
