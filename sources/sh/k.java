package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new k());
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        pz pzVar = new pz(context, null);
        pzVar.setViewType(16);
        pzVar.setMinimumHeight(g0.L(48.0f));
        return pzVar;
    }
}
