package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new l());
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        pz pzVar = new pz(context, null);
        pzVar.setViewType(16);
        pzVar.setMinimumHeight(g0.L(48.0f));
        return pzVar;
    }
}
