package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new e());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        yg.b bVar = (yg.b) view;
        bVar.v = (TLRPC.TL_help_country) f61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(f61Var.e, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return f61Var.H(f61Var2);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        yg.b bVar = new yg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return f61Var.I(f61Var2);
    }
}
