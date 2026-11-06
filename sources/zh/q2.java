package zh;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q2 extends an {
    public boolean rd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique sd;
    public final /* synthetic */ long td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
        cc O = hc.a0(this).O(this.sd.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(this.currentAccount, this.td)));
        O.r = false;
        O.j();
        jz jzVar = this.F9;
        if (jzVar != null) {
            jzVar.c(true);
        }
    }
}
