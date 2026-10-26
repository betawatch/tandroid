package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bg.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ro0(rp0 rp0Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var) {
        this.e = rp0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = qo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                rp0.W((rp0) this.e, this.b, this.c, this.d, (qo0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                zh.g4.U((zh.g4) this.e, (org.telegram.ui.ActionBar.e2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ ro0(zh.g4 g4Var, org.telegram.ui.ActionBar.e2 e2Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f = e2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }
}
