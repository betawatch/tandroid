package tg;

import android.app.Activity;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c0 extends bn {
    public final /* synthetic */ l0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l0 l0Var) {
        super(null);
        this.vd = l0Var;
    }

    @Override // org.telegram.ui.bn
    public final boolean V9() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.ah, org.telegram.ui.Components.m40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.vd.getContext());
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final i6 getResourceProvider() {
        return this.vd.A1;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.ah
    public final TLRPC.User j() {
        return i10.i(this.currentAccount).f();
    }
}
