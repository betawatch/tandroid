package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w extends sn {
    public final /* synthetic */ m0 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m0 m0Var) {
        super(null);
        this.Qc = m0Var;
    }

    @Override // org.telegram.ui.sn
    public final boolean C9() {
        return false;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.Components.bh, org.telegram.ui.Components.y50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final d6 getResourceProvider() {
        return this.Qc.Q1;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }
}
