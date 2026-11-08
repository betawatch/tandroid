package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o2 extends an {
    public boolean rd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique sd;
    public final /* synthetic */ long td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.sd = tL_starGiftUnique;
        this.td = j3;
        this.rd = false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.rd) {
            return;
        }
        this.rd = true;
        cc O = hc.a0(this).O(this.sd.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.td)));
        O.r = false;
        O.j();
        kz kzVar = this.F9;
        if (kzVar != null) {
            kzVar.c(true);
        }
    }
}
