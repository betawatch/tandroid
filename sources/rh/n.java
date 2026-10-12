package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.ki0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new n());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ki0 ki0Var = (ki0) view;
        ki0Var.a((TLObject) l61Var.G, true, l61Var.z);
        ki0Var.setOnClickListener(l61Var.D);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return l61Var.B == l61Var2.B;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        ki0 ki0Var = new ki0(context);
        ki0Var.setBackground(g6.L0(false));
        return ki0Var;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.B == l61Var2.B;
    }
}
