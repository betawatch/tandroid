package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.hq0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e6 c;

    public u(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        this.a = starGift;
        this.b = context;
        this.c = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            hq0.N0(context, null, str, false, str).show();
        }
    }
}
