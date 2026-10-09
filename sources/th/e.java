package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new e());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        xg.b bVar = (xg.b) view;
        bVar.v = (TLRPC.TL_help_country) p61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(p61Var.e, false);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return p61Var.H(p61Var2);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        xg.b bVar = new xg.b(context, e6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.I(p61Var2);
    }
}
