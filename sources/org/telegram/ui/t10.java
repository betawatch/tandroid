package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ dg.a c;

    public /* synthetic */ t10(Context context, dg.a aVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h hVar = new h(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(context, false, hVar, 1);
                dg.j jVar = this.c.c;
                r8Var.e(jVar != null ? jVar.C : 0, 0);
                r8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(r8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8(context2, false, hVar2, 2);
                dg.j jVar2 = this.c.c;
                r8Var2.e(jVar2 == null ? 0 : jVar2.B, 0);
                r8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(r8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
