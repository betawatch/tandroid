// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p0 extends tx9 {
    public final /* synthetic */ kx9[] f2;
    public final /* synthetic */ r0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, Context context, Integer num, wjb wjbVar, kx9[] kx9VarArr) {
        super(null, context, true, num, 15, wjbVar);
        this.g2 = r0Var;
        this.f2 = kx9VarArr;
    }

    @Override // tx9
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || gta.v(this.g2.a, false).k(tL_starGiftUnique.id) == null || na7.c1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        r0 r0Var = this.g2;
        r0Var.c2 = l;
        r0Var.a1();
        r0Var.Z0();
        kx9 kx9Var = this.f2[0];
        if (kx9Var != null) {
            r0Var.d2 = null;
            kx9Var.dismiss();
        }
    }
}
