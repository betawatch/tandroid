package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d3 extends wn {
    public boolean Pc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Qc;
    public final /* synthetic */ long Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.Qc = tL_starGiftUnique;
        this.Rc = j3;
        this.Pc = false;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        qc O = yc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
        O.r = false;
        O.j();
        t00 t00Var = this.m9;
        if (t00Var != null) {
            t00Var.c(true);
        }
    }
}
