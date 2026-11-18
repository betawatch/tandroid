package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new m());
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        wz wzVar = new wz(context, null);
        wzVar.setViewType(16);
        wzVar.setMinimumHeight(g0.L(48.0f));
        return wzVar;
    }
}
