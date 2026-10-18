package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uy extends org.telegram.ui.Components.e61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new uy());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        vy vyVar = (vy) view;
        vyVar.b.setOnClickListener((View.OnClickListener) f61Var.G);
        vyVar.e.setOnClickListener((View.OnClickListener) f61Var.H);
        vyVar.a(f61Var.e, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new vy(context, d6Var);
    }
}
