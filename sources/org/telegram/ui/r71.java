package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class r71 extends org.telegram.ui.Components.f61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new r71());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        ((s71) view).set(g61Var.z);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        return g61Var.z == g61Var2.z;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s71(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }
}
