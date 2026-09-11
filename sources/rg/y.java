package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y extends co {
    public final /* synthetic */ o0 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o0 o0Var) {
        super(null);
        this.Qc = o0Var;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.Components.ch, org.telegram.ui.Components.o50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final f6 getResourceProvider() {
        return this.Qc.Q1;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.Components.ch
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.co
    public final boolean x9() {
        return false;
    }
}
