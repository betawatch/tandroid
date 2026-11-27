// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q0 extends n1a {
    public final /* synthetic */ d1a[] f2;
    public final /* synthetic */ s0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context, Integer num, vnb vnbVar, d1a[] d1aVarArr) {
        super(null, context, true, num, 15, vnbVar);
        this.g2 = s0Var;
        this.f2 = d1aVarArr;
    }

    @Override // n1a
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || jxa.v(this.g2.a, false).k(tL_starGiftUnique.id) == null || uc7.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s0 s0Var = this.g2;
        s0Var.c2 = l;
        s0Var.b1();
        s0Var.a1();
        d1a d1aVar = this.f2[0];
        if (d1aVar != null) {
            s0Var.d2 = null;
            d1aVar.dismiss();
        }
    }
}
