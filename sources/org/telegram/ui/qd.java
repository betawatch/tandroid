package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qd(int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10) {
        this.b = i10;
        this.d = dVar;
        this.e = z2Var;
        this.c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                le leVar = (le) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    vh.d dVar = leVar.J0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.vp.r1(i10).i1(this.c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ag.k0(14, leVar, context));
                        break;
                    }
                }
                break;
            default:
                vh.d dVar2 = (vh.d) this.d;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i11 = this.b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new org.telegram.ui.Components.o2(i11, dVar2, z2Var, this.c));
                break;
        }
    }

    public /* synthetic */ qd(le leVar, int i10, long j10, Context context) {
        this.d = leVar;
        this.b = i10;
        this.c = j10;
        this.e = context;
    }
}
