package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b3 extends fo {
    public boolean Qc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Rc;
    public final /* synthetic */ long Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Rc = tL_starGiftUnique;
        this.Sc = j10;
        this.Qc = false;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        sc O = zc.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
        O.r = false;
        O.j();
        d10 d10Var = this.m9;
        if (d10Var != null) {
            d10Var.c(true);
        }
    }
}
