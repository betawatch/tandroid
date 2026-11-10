package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        bc O = gc.a0(this).O(this.ud.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.vd)));
        O.r = false;
        O.j();
        jz jzVar = this.H9;
        if (jzVar != null) {
            jzVar.c(true);
        }
    }
}
