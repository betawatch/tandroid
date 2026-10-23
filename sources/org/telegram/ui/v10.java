package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tg.g c;

    public /* synthetic */ v10(Context context, tg.g gVar, int i10) {
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
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, fVar, 1);
                tg.o oVar = this.c.c;
                u8Var.e(oVar != null ? oVar.I : 0, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(u8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                break;
            default:
                f fVar2 = new f(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, fVar2, 2);
                tg.o oVar2 = this.c.c;
                u8Var2.e(oVar2 == null ? 0 : oVar2.H, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(u8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                break;
        }
    }
}
