package tg;

import android.app.Activity;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w extends an {
    public final /* synthetic */ g0 rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var) {
        super(null);
        this.rd = g0Var;
    }

    @Override // org.telegram.ui.an
    public final boolean T9() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.kg, org.telegram.ui.Components.b40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.rd.getContext());
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final f6 getResourceProvider() {
        return this.rd.z1;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.kg
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
