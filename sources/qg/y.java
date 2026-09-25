package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class y extends wn {
    public final /* synthetic */ n0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n0 n0Var) {
        super(null);
        this.Pc = n0Var;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.Components.ch, org.telegram.ui.Components.o50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final d6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.Components.ch
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.wn
    public final boolean x9() {
        return false;
    }
}
