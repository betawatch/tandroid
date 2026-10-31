package ph;

import android.os.Bundle;
import org.telegram.messenger.cd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u2 extends un {
    public boolean jd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique kd;
    public final /* synthetic */ long ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.kd = tL_starGiftUnique;
        this.ld = j10;
        this.jd = false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.jd) {
            return;
        }
        this.jd = true;
        wb O = cc.a0(this).O(this.kd.getDocument(), cd.L0(2131752885, null), cd.a0(null, null, 2131752886, o5.s(this.currentAccount, this.ld)));
        O.r = false;
        O.j();
        xz xzVar = this.F9;
        if (xzVar != null) {
            xzVar.c(true);
        }
    }
}
