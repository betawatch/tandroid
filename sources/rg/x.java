package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class x extends sn {
    public final /* synthetic */ m0 ed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.ed = m0Var;
    }

    @Override // org.telegram.ui.sn
    public final boolean C9() {
        return false;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.Components.bh, org.telegram.ui.Components.y50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.ed.getContext());
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final g6 getResourceProvider() {
        return this.ed.Q1;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return false;
    }
}
