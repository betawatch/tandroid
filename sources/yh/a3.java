package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a3 extends sn {
    public boolean ed;
    public final /* synthetic */ TL_stars.TL_starGiftUnique fd;
    public final /* synthetic */ long gd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.fd = tL_starGiftUnique;
        this.gd = j10;
        this.ed = false;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ed) {
            return;
        }
        this.ed = true;
        qc O = xc.a0(this).O(this.fd.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.gd)));
        O.r = false;
        O.j();
        z00 z00Var = this.y9;
        if (z00Var != null) {
            z00Var.c(true);
        }
    }
}
