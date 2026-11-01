package ph;

import android.os.Bundle;
import org.telegram.messenger.dd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u2 extends un {
    public boolean kd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique ld;
    public final /* synthetic */ long md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.ld = tL_starGiftUnique;
        this.md = j10;
        this.kd = false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        wb O = cc.a0(this).O(this.ld.getDocument(), dd.L0(2131752885, null), dd.a0(null, null, 2131752886, o5.s(this.currentAccount, this.md)));
        O.r = false;
        O.j();
        xz xzVar = this.F9;
        if (xzVar != null) {
            xzVar.c(true);
        }
    }
}
