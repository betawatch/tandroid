package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d3 extends yn {
    public boolean Kc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Lc;
    public final /* synthetic */ long Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.Lc = tL_starGiftUnique;
        this.Mc = j3;
        this.Kc = false;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Kc) {
            return;
        }
        this.Kc = true;
        rc O = yc.a0(this).O(this.Lc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Mc)));
        O.r = false;
        O.j();
        u00 u00Var = this.k9;
        if (u00Var != null) {
            u00Var.c(true);
        }
    }
}
