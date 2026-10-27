package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uy extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new uy());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        vy vyVar = (vy) view;
        vyVar.b.setOnClickListener((View.OnClickListener) u61Var.G);
        vyVar.e.setOnClickListener((View.OnClickListener) u61Var.H);
        vyVar.a(u61Var.e, false);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new vy(context, u6Var);
    }
}
