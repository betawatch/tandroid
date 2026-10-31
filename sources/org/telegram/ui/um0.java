package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class um0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ um0(tn0 tn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var) {
        this.e = tn0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = tm0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                tn0.Z((tn0) this.e, this.b, this.c, this.d, (tm0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                ph.q3 q3Var = (ph.q3) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.x1) this.f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    rh.d3 d3Var = new rh.d3(this.b, tL_payments_paymentFormStarGift);
                    Context context = q3Var.getContext();
                    org.telegram.ui.ActionBar.p6 p6Var = q3Var.I0;
                    int i10 = q3Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String k10 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
                    long j10 = this.d;
                    new rh.g3(context, p6Var, tL_starGiftUnique, d3Var, i10, j10, k10, true, new org.telegram.ui.Components.q70(q3Var, tL_starGiftUnique, j10, 1)).b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ um0(ph.q3 q3Var, org.telegram.ui.ActionBar.x1 x1Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q3Var;
        this.f = x1Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }
}
