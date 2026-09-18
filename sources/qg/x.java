package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class x extends zn {
    public final /* synthetic */ m0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.Pc = m0Var;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.bh, org.telegram.ui.Components.n50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final e6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.zn
    public final boolean x9() {
        return false;
    }
}
