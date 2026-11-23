package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new f());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ah.c cVar = (ah.c) view;
        cVar.w = (TLRPC.TL_help_country) o41Var.H;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(o41Var.e, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.I(o41Var2);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        ah.c cVar = new ah.c(context, h6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.J(o41Var2);
    }
}
