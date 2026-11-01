package ph;

import android.content.Context;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.pp0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        String str = wp.r1(e20.s0).U2 + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            org.telegram.messenger.i0.g(str);
        } else {
            pp0.N0(context, null, str, false, str).show();
        }
    }
}
