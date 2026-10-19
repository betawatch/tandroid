package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class w extends qn {
    public final /* synthetic */ m0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m0 m0Var) {
        super(null);
        this.Rc = m0Var;
    }

    @Override // org.telegram.ui.qn
    public final boolean C9() {
        return false;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.Components.bh, org.telegram.ui.Components.y50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Rc.getContext());
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final d6 getResourceProvider() {
        return this.Rc.Q1;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }
}
