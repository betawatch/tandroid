package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rd(int i10, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    qh.d dVar = keVar.Q0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new eg.b3(24, keVar, context));
                        break;
                    }
                }
                break;
            default:
                qh.d dVar2 = (qh.d) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new mh.t(i11, dVar2, h3Var, this.c));
                break;
        }
    }

    public /* synthetic */ rd(ke keVar, int i10, long j10, Context context) {
        this.d = keVar;
        this.b = i10;
        this.c = j10;
        this.e = context;
    }
}
