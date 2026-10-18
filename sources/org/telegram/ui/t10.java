package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class t10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tg.g c;

    public /* synthetic */ t10(Context context, tg.g gVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, gVar, 1);
                tg.o oVar = this.c.c;
                u8Var.e(oVar != null ? oVar.I : 0, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(u8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, gVar2, 2);
                tg.o oVar2 = this.c.c;
                u8Var2.e(oVar2 == null ? 0 : oVar2.H, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(u8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
