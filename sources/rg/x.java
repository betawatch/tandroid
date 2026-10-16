package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x extends fo {
    public final /* synthetic */ o0 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o0 o0Var) {
        super(null);
        this.Qc = o0Var;
    }

    @Override // org.telegram.ui.fo
    public final boolean C9() {
        return false;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.Components.ch, org.telegram.ui.Components.c60
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final c6 getResourceProvider() {
        return this.Qc.Q1;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.Components.ch
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        return false;
    }
}
