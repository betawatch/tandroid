package tg;

import android.app.Activity;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w extends bn {
    public final /* synthetic */ g0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var) {
        super(null);
        this.vd = g0Var;
    }

    @Override // org.telegram.ui.bn
    public final boolean V9() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.zg, org.telegram.ui.Components.m40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.vd.getContext());
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final i6 getResourceProvider() {
        return this.vd.A1;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.zg
    public final TLRPC.User j() {
        return j10.i(this.currentAccount).f();
    }
}
