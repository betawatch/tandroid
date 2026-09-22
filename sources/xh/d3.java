package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d3 extends zn {
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

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        pc O = xc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
        O.r = false;
        O.j();
        r00 r00Var = this.m9;
        if (r00Var != null) {
            r00Var.c(true);
        }
    }
}
