// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v38 extends n1a {
    public final /* synthetic */ z38 f2;
    public final /* synthetic */ d1a[] g2;
    public final /* synthetic */ a48 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v38(a48 a48Var, e eVar, Context context, Integer num, int i, vnb vnbVar, int i2, int i3, z38 z38Var, d1a[] d1aVarArr) {
        super(eVar, context, true, num, i, true, vnbVar, i2, i3);
        this.h2 = a48Var;
        this.f2 = z38Var;
        this.g2 = d1aVarArr;
    }

    @Override // n1a
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a48 a48Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (a48Var.n0) {
                a48Var.s = null;
                a48Var.r = uc7.p0(tL_starGiftUnique);
            } else {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                a48Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                a48Var.r = null;
            }
            a48Var.J = null;
            a48Var.h = -1;
        } else {
            a48Var.n = l == null ? 0L : l.longValue();
            a48Var.r = null;
            a48Var.s = null;
            a48Var.J = null;
        }
        this.f2.b(true);
        a48Var.j(true);
        a48Var.i();
        a48Var.f(true);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            a48Var.p0 = null;
            d1aVar.dismiss();
        }
    }
}
