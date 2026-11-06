package zh;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mo0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;

    public u(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.a = starGift;
        this.b = context;
        this.c = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                v.g1(context, starGift, this.c);
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
