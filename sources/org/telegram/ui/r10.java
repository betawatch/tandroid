package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ag.a c;

    public /* synthetic */ r10(Context context, ag.a aVar, int i9) {
        this.a = i9;
        this.b = context;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(context, false, gVar, 1);
                ag.k kVar = this.c.c;
                m8Var.e(kVar != null ? kVar.C : 0, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(m8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, gVar2, 2);
                ag.k kVar2 = this.c.c;
                m8Var2.e(kVar2 == null ? 0 : kVar2.B, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(m8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
