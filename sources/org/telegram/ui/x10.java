package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ug.g c;

    public /* synthetic */ x10(Context context, ug.g gVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f fVar = new f(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false, fVar, 1);
                ug.o oVar = this.c.c;
                w8Var.e(oVar != null ? oVar.I : 0, 0);
                w8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(context, false);
                k3Var.setCustomView(w8Var);
                k3Var.setDimBehind(false);
                k3Var.show();
                break;
            default:
                f fVar2 = new f(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8(context2, false, fVar2, 2);
                ug.o oVar2 = this.c.c;
                w8Var2.e(oVar2 == null ? 0 : oVar2.H, 0);
                w8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.k3 k3Var2 = new org.telegram.ui.ActionBar.k3(context2, false);
                k3Var2.setCustomView(w8Var2);
                k3Var2.setDimBehind(false);
                k3Var2.show();
                break;
        }
    }
}
