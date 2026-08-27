package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bg.a c;

    public /* synthetic */ u10(Context context, bg.a aVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8(context, false, gVar, 1);
                bg.j jVar = this.c.c;
                l8Var.e(jVar != null ? jVar.C : 0, 0);
                l8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(l8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.l8 l8Var2 = new org.telegram.ui.Components.l8(context2, false, gVar2, 2);
                bg.j jVar2 = this.c.c;
                l8Var2.e(jVar2 == null ? 0 : jVar2.B, 0);
                l8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(l8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                break;
        }
    }
}
