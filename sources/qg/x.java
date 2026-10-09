package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x extends zn {
    public final /* synthetic */ m0 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.Qc = m0Var;
    }

    @Override // org.telegram.ui.zn
    public final boolean C9() {
        return false;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.eh, org.telegram.ui.Components.f60
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final e6 getResourceProvider() {
        return this.Qc.Q1;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.eh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }
}
