package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qd(int i10, ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ie ieVar = (ie) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ei.d dVar = ieVar.T0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new vc(1, ieVar, context));
                        break;
                    }
                }
                break;
            default:
                ei.d dVar2 = (ei.d) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.c0(i11, dVar2, h3Var, this.c));
                break;
        }
    }

    public /* synthetic */ qd(ie ieVar, int i10, long j10, Context context) {
        this.d = ieVar;
        this.b = i10;
        this.c = j10;
        this.e = context;
    }
}
