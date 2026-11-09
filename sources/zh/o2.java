package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o2 extends cn {
    public boolean td;
    public final /* synthetic */ TL_stars.TL_starGiftUnique ud;
    public final /* synthetic */ long vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.ud = tL_starGiftUnique;
        this.vd = j3;
        this.td = false;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.td) {
            return;
        }
        this.td = true;
        cc O = hc.a0(this).O(this.ud.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.vd)));
        O.r = false;
        O.j();
        kz kzVar = this.H9;
        if (kzVar != null) {
            kzVar.c(true);
        }
    }
}
