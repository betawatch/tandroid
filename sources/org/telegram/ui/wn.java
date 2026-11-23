package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                if (ioVar.b0) {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745825, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745826, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745828, null), new oi.f0(20, ioVar, currentChannel));
                ioVar.showDialog(t1Var);
                break;
            case 1:
                if (!ioVar.W) {
                    ioVar.W = true;
                    ioVar.h0();
                    break;
                }
                break;
            case 2:
                if (ioVar.W) {
                    if (!ioVar.d0) {
                        ioVar.f0();
                        break;
                    } else {
                        ioVar.W = false;
                        ioVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                ef0 ef0Var = new ef0(ioVar.a0, 0, 0L);
                ef0Var.m0(ioVar.Z, ioVar.m0);
                ioVar.presentFragment(ef0Var);
                break;
            default:
                boolean z10 = !ioVar.c0;
                ioVar.c0 = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                break;
        }
    }
}
