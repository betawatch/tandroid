package zh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c3 extends wn {
    public boolean od;
    public final /* synthetic */ TL_stars.TL_starGiftUnique pd;
    public final /* synthetic */ long qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.pd = tL_starGiftUnique;
        this.qd = j10;
        this.od = false;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.od) {
            return;
        }
        this.od = true;
        qc O = wc.b0(this).O(this.pd.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.qd)));
        O.s = false;
        O.j();
        z00 z00Var = this.C9;
        if (z00Var != null) {
            z00Var.c(true);
        }
    }
}
