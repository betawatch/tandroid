package ph;

import android.content.Context;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.op0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p6 c;

    public v(Context context, TL_stars.StarGift starGift, p6 p6Var) {
        this.a = starGift;
        this.b = context;
        this.c = p6Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.g1(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = vp.r1(d20.s0).U2 + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            org.telegram.messenger.i0.g(str);
        } else {
            op0.N0(context, null, str, false, str).show();
        }
    }
}
