package pg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x extends eo {
    public final /* synthetic */ m0 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.Qc = m0Var;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.Components.eh, org.telegram.ui.Components.y50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final f6 getResourceProvider() {
        return this.Qc.Q1;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.Components.eh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.eo
    public final boolean x9() {
        return false;
    }
}
