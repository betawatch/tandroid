package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sy extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new sy());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        ty tyVar = (ty) view;
        tyVar.b.setOnClickListener((View.OnClickListener) t61Var.G);
        tyVar.e.setOnClickListener((View.OnClickListener) t61Var.H);
        tyVar.a(t61Var.e, false);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ty(context, u6Var);
    }
}
