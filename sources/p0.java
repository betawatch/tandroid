// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p0 extends vz9 {
    public final /* synthetic */ mz9[] f2;
    public final /* synthetic */ r0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, Context context, Integer num, ylb ylbVar, mz9[] mz9VarArr) {
        super(null, context, true, num, 15, ylbVar);
        this.g2 = r0Var;
        this.f2 = mz9VarArr;
    }

    @Override // vz9
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || jva.v(this.g2.a, false).k(tL_starGiftUnique.id) == null || oc7.d1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        r0 r0Var = this.g2;
        r0Var.c2 = l;
        r0Var.a1();
        r0Var.Z0();
        mz9 mz9Var = this.f2[0];
        if (mz9Var != null) {
            r0Var.d2 = null;
            mz9Var.dismiss();
        }
    }
}
