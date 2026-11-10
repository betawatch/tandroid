package zh;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mo0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h6 c;

    public t(Context context, TL_stars.StarGift starGift, h6 h6Var) {
        this.a = starGift;
        this.b = context;
        this.c = h6Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                u.g1(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = qp.s1(p10.s0).U2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            mo0.N0(context, null, str, false, str).show();
        }
    }
}
