package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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

    @Override // org.telegram.ui.fo, org.telegram.ui.Components.ch, org.telegram.ui.Components.b60
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
