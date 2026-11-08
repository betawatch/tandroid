package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ un(go goVar, int i7) {
        this.a = i7;
        this.b = goVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        go goVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(goVar.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                if (goVar.a0) {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlertChannel", null, 2131746024, goVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlert", null, 2131746025, goVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746027, null), new ni.c(18, goVar, currentChannel));
                goVar.showDialog(u1Var);
                break;
            case 1:
                if (!goVar.V) {
                    goVar.V = true;
                    goVar.h0();
                    break;
                }
                break;
            case 2:
                if (goVar.V) {
                    if (!goVar.c0) {
                        goVar.f0();
                        break;
                    } else {
                        goVar.V = false;
                        goVar.h0();
                        break;
                    }
                }
                break;
            case 3:
                cf0 cf0Var = new cf0(goVar.Z, 0, 0L);
                cf0Var.m0(goVar.Y, goVar.l0);
                goVar.presentFragment(cf0Var);
                break;
            default:
                boolean z9 = !goVar.b0;
                goVar.b0 = z9;
                ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                break;
        }
    }
}
