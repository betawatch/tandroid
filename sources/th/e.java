package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new e());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        xg.b bVar = (xg.b) view;
        bVar.s = (TLRPC.TL_help_country) y51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(y51Var.e, false);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return y51Var.H(y51Var2);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        xg.b bVar = new xg.b(context, f6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.I(y51Var2);
    }
}
