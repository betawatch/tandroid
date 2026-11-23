package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new f());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ah.c cVar = (ah.c) view;
        cVar.w = (TLRPC.TL_help_country) n41Var.H;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(n41Var.e, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.I(n41Var2);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        ah.c cVar = new ah.c(context, i6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.J(n41Var2);
    }
}
