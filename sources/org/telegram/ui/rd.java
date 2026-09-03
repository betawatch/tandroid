package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;

    public /* synthetic */ rd(me meVar, int i10) {
        this.a = i10;
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze.d.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.g61 g61Var = this.b.X0;
                if (g61Var != null) {
                    g61Var.V2.N(true);
                    break;
                }
                break;
            case 2:
                me meVar = this.b;
                meVar.getClass();
                try {
                    org.telegram.ui.Components.rl0 currentListView = meVar.b1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                me meVar2 = this.b;
                int i10 = meVar2.v0;
                AndroidUtilities.cancelRunOnUIThread(meVar2.s1);
                if (meVar2.j1 != meVar2.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar2.w0);
                    tL_channels_restrictSponsoredMessages.restricted = meVar2.j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new xd(meVar2, 0));
                    break;
                }
                break;
            case 4:
                me meVar3 = this.b;
                meVar3.k1 = meVar3.j1;
                break;
            case 5:
                this.b.Q0.setLoading(false);
                break;
            case 6:
                this.b.Z0.setVisibility(8);
                break;
            case 7:
                this.b.Z0.setVisibility(8);
                break;
            default:
                ze.d.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
