// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p08 extends tx9 {
    public final /* synthetic */ s08 f2;
    public final /* synthetic */ kx9[] g2;
    public final /* synthetic */ t08 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p08(t08 t08Var, d dVar, Context context, Integer num, int i, wjb wjbVar, int i2, int i3, s08 s08Var, kx9[] kx9VarArr) {
        super(dVar, context, true, num, i, true, wjbVar, i2, i3);
        this.h2 = t08Var;
        this.f2 = s08Var;
        this.g2 = kx9VarArr;
    }

    @Override // tx9
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        t08 t08Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (t08Var.n0) {
                t08Var.s = null;
                t08Var.r = na7.n0(tL_starGiftUnique);
            } else {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                t08Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                t08Var.r = null;
            }
            t08Var.J = null;
            t08Var.h = -1;
        } else {
            t08Var.n = l == null ? 0L : l.longValue();
            t08Var.r = null;
            t08Var.s = null;
            t08Var.J = null;
        }
        this.f2.b(true);
        t08Var.j(true);
        t08Var.i();
        t08Var.f(true);
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            t08Var.p0 = null;
            kx9Var.dismiss();
        }
    }
}
