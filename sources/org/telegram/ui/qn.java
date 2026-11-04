package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ qn(bo boVar, int i3) {
        this.a = i3;
        this.b = boVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        bo boVar = this.b;
        switch (i3) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                if (boVar.b0) {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlertChannel", null, 2131746031, boVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlert", null, 2131746032, boVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new mi.d4(28, boVar, currentChannel));
                boVar.showDialog(s1Var);
                break;
            case 1:
                if (!boVar.W) {
                    boVar.W = true;
                    boVar.h0();
                    break;
                }
                break;
            case 2:
                if (boVar.W) {
                    if (!boVar.d0) {
                        boVar.f0();
                        break;
                    } else {
                        boVar.W = false;
                        boVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                xe0 xe0Var = new xe0(boVar.a0, 0, 0L);
                xe0Var.m0(boVar.Z, boVar.m0);
                boVar.presentFragment(xe0Var);
                break;
            default:
                boolean z10 = !boVar.c0;
                boVar.c0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                break;
        }
    }
}
