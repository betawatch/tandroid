package zh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c3 extends un {
    public boolean kd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique ld;
    public final /* synthetic */ long md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.ld = tL_starGiftUnique;
        this.md = j10;
        this.kd = false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        qc O = wc.b0(this).O(this.ld.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.md)));
        O.s = false;
        O.j();
        z00 z00Var = this.y9;
        if (z00Var != null) {
            z00Var.c(true);
        }
    }
}
