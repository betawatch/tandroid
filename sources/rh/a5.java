package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ j20 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLObject i;
    public final /* synthetic */ TLObject j;

    public /* synthetic */ a5(e6 e6Var, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = e6Var;
        this.c = j20Var;
        this.d = context;
        this.e = p6Var;
        this.f = j10;
        this.g = str;
        this.h = j11;
        this.i = tLObject;
        this.j = tL_textWithEntities;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new c5(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, (TLRPC.TL_payments_paymentFormStarGift) this.i, (TL_stars.StarGift) this.j, this.h));
                break;
            default:
                org.telegram.messenger.i0.g3(new c5(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (TLRPC.TL_textWithEntities) this.j));
                break;
        }
    }

    public /* synthetic */ a5(e6 e6Var, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = e6Var;
        this.c = j20Var;
        this.d = context;
        this.e = p6Var;
        this.f = j10;
        this.g = str;
        this.i = tL_payments_paymentFormStarGift;
        this.j = starGift;
        this.h = j11;
    }
}
