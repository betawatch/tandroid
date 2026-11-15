package tg;

import android.app.Activity;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w extends an {
    public final /* synthetic */ g0 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var) {
        super(null);
        this.ud = g0Var;
    }

    @Override // org.telegram.ui.an
    public final boolean V9() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.qg, org.telegram.ui.Components.e40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.ud.getContext());
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final e6 getResourceProvider() {
        return this.ud.A1;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.qg
    public final TLRPC.User j() {
        return m10.i(this.currentAccount).f();
    }
}
